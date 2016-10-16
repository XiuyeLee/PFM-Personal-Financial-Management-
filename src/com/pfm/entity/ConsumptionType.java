package com.pfm.entity;
/**
 * 
 * 支出分类:
 * 食品，酒水，交际支出，医药费，餐费，物业费，交通，衣服，裤子，鞋，袜子，
 * 水电，网费，话费，路费，保险，家用损耗维修，日常用品，文化教育，学费，其他
 * 
 * @author xiuye
 *
 */
public class ConsumptionType {

	public ConsumptionType() {
		
	}
	private int id;

	private String type;
	
	public int getParentTypeId() {
		return parentTypeId;
	}

	public void setParentTypeId(int parentTypeId) {
		this.parentTypeId = parentTypeId;
	}
	private int parentTypeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	


}
