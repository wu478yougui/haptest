package com.hand.hap.attachment.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.system.dto.BaseDTO;
@MultiLanguage
@Table(name = "hap_om_order_lines")
public class Lines extends BaseDTO{
	@Id
    @Column
    //标识主键，主键不自增
    @GeneratedValue(generator = GENERATOR_TYPE)
	private  Long lineId;
	
	@Column
	@NotEmpty
	private  Long headerId;
	
	@Column
	@NotEmpty
	private String 	itemCode;
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Long getOrderSummary() {
		return orderSummary;
	}
	public void setOrderSummary(Long orderSummary) {
		this.orderSummary = orderSummary;
	}
	@Column
	@NotEmpty
	private  Long lineNumber;
	@Column
	@NotEmpty
	private  Long inventoryItemId;
	@Column
	@NotEmpty
	private  Long orderdQuantity;
	@Column
	@NotEmpty
	private  String orderQuantityUom;
	
	@Column
	@NotEmpty
	private String itemDescription;
	
	@Column
	@NotEmpty
	private  Long unitSellingPrice;
	
	@Column
	@NotEmpty
	private  String description;
	
	@Column
	@NotEmpty
	private  Long companyId;
	
	@Column
	@NotEmpty
	private Long orderSummary;
	@Column
	private  String  addition1;
	@Override
	public String toString() {
		return "Lines [lineId=" + lineId + ", headerId=" + headerId + ", lineNumber=" + lineNumber
				+ ", inventoryItemId=" + inventoryItemId + ", orderdQuantity=" + orderdQuantity + ", orderQuantityUom="
				+ orderQuantityUom + ", unitSellingPrice=" + unitSellingPrice + ", description=" + description
				+ ", companyId=" + companyId + ", addition1=" + addition1 + ", addition2=" + addition2 + ", addition3="
				+ addition3 + ", addition4=" + addition4 + ", addition5=" + addition5 + "]";
	}
	@Column
	private  String  addition2;
	@Column
	private  String  addition3;
	@Column
	private  String  addition4;
	@Column
	private  String  addition5;
	public Long getLineId() {
		return lineId;
	}
	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}
	public Long getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}
	public Long getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}
	public Long getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public Long getOrderdQuantity() {
		return orderdQuantity;
	}
	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}
	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}
	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}
	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}
	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getAddition1() {
		return addition1;
	}
	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}
	public String getAddition2() {
		return addition2;
	}
	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}
	public String getAddition3() {
		return addition3;
	}
	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}
	public String getAddition4() {
		return addition4;
	}
	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}
	public String getAddition5() {
		return addition5;
	}
	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}
}
