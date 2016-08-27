package com.hand.hap.attachment.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;
@MultiLanguage
@Table(name = "hap_om_order_headers")
public class Headers extends BaseDTO{
	@Id
    @Column
    //标识主键，主键不自增
    @GeneratedValue(generator = GENERATOR_TYPE)
	private  Long headerId;
	
	
	@Column
    @NotEmpty
	private  String orderNumber;
	
	@Column
	@NotEmpty
	private  Long companyId;
	
	@Column
	@NotNull
	private  Date orderDate;
	
	
	// 非数据库字段
	@Transient
	private String companyName;

	@Transient
	private String customerName;

	
	@Transient
	private Long orderMoney;
	
	@Transient
	private Long inventoryItemId;
	
	
	@Column
	@NotEmpty
	private  String orderStatus;	
	
	@Column
	@NotEmpty
	private  Long customerId;
	

	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Long getOrderMoney() {
		return orderMoney;
	}


	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}


	public Long getInventoryItemId() {
		return inventoryItemId;
	}


	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	
	public Long getHeaderId() {
		return headerId;
	}


	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}


	public String getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}


	public Long getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}




	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}



}
