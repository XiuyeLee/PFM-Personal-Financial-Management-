package com.pfm.bean;

import java.util.Date;

public class ConsumePurchase {

	public ConsumePurchase() {
	}
	
	private String uuid;
	
	private int consumptionId;
	
	private int cost;
	
	private Date consumeDate;
	
	private String consumePlace;

	private String additionContent;
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getConsumptionId() {
		return consumptionId;
	}

	public void setConsumptionId(int consumptionId) {
		this.consumptionId = consumptionId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getConsumeDate() {
		return consumeDate;
	}

	public void setConsumeDate(Date consumeDate) {
		this.consumeDate = consumeDate;
	}

	public String getConsumePlace() {
		return consumePlace;
	}

	public void setConsumePlace(String consumePlace) {
		this.consumePlace = consumePlace;
	}

	public String getAdditionContent() {
		return additionContent;
	}

	public void setAdditionContent(String additionContent) {
		this.additionContent = additionContent;
	}
	

}
