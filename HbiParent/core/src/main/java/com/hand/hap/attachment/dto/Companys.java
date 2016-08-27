package com.hand.hap.attachment.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

@MultiLanguage
@Table(name = "hap_org_companys")
public class Companys extends BaseDTO{
	@Id
	@Column	
	//标识主键，但是主键自增
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long companyId;

	@Column
	@NotEmpty
	private String companyNumber;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	@Column
	@NotEmpty
	private String companyName;

	@Column
	@NotEmpty
	@Condition(exclude = true)
	private String enabledFlag;
}
