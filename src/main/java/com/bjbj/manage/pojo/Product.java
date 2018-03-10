package com.bjbj.manage.pojo;

import com.bjbj.common.po.BasePojo;

public class Product extends BasePojo{

	private static final long serialVersionUID = -8485970735401727213L;
	
	private Long id;
	private String name;
	private Long price;
	private String image;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


}
