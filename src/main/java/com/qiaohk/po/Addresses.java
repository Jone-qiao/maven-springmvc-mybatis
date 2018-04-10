package com.qiaohk.po;

import javax.validation.constraints.NotEmpty;

public class Addresses {
	private Integer id;

	private Integer user_id;

	@NotEmpty(message="{address.sendeeName.noNull}")
	private String sendeeName;

	@NotEmpty(message="{address.sendeeTel.noNull}")
	private String sendeeTel;

	@NotEmpty(message="{address.addressProvince.noNull}")
	private String addressProvince;

	@NotEmpty(message="{address.addressCity.noNull}")
	private String addressCity;

	@NotEmpty(message="{address.addressArea.noNull}")
	private String addressArea;

	@NotEmpty(message="{address.address.noNull}")
	private String address;

	private Integer ifDefault;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getSendeeName() {
		return sendeeName;
	}

	public void setSendeeName(String sendeeName) {
		this.sendeeName = sendeeName;
	}

	public String getSendeeTel() {
		return sendeeTel;
	}

	public void setSendeeTel(String sendeeTel) {
		this.sendeeTel = sendeeTel;
	}

	public String getAddressProvince() {
		return addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressArea() {
		return addressArea;
	}

	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIfDefault() {
		return ifDefault;
	}

	public void setIfDefault(Integer ifDefault) {
		this.ifDefault = ifDefault;
	}

}
