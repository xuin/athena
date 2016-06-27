package com.winterfell.athena.entity;

import javax.persistence.Entity;

/**
 * 实体：配送地址
 * 
 * @author J
 */
@Entity
public class DistributionAddress extends AbstractEntity {
	private static final long serialVersionUID = -8158092708263606919L;
	/** 省份 eg：湖北  */
	private String province;
	/** 城市 eg：武汉*/
	private String city;
	/** 区 eg：武昌 */
	private String district;
	/** 详细地址 eg：武珞路黄鹤楼 */
	private String fullAddress;
	private String state;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public final static String STATE_DISABLED = "禁用";
	public final static String STATE_ENABLED = "启用";
}
