package com.qiaohk.po;

public class Products {

	private Integer id;

	private String name;

	private Float price;
	
	private String sm_img;

	public String getSm_img() {
		return sm_img;
	}

	public void setSm_img(String sm_img) {
		this.sm_img = sm_img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
