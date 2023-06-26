package com.application.packersmovers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseHoldItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long hsHldItmId;

	private String itemName;

	private Long price;

	public Long getHsHldItmId() {
		return hsHldItmId;
	}

	public void setHsHldItmId(Long hsHldItmId) {
		this.hsHldItmId = hsHldItmId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}
