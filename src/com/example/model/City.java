package com.example.model;

//市的实体类
public class City {
	
	//其中id是自增长主键，cityName表示城市名，cityCode表示市级代号，provinceId是表City关联表Province的外键
	
	private int id;
	
	private String cityName; 
	
	private String cityCode; 
	
	private int provinceId;  //City表需要关联Province表（表关联外码）
	
	public int getId() {
		return id; 
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	public String getCityName() { 
		return cityName;
	}
	
	public void setCityName(String cityName) { 
		this.cityName = cityName; 
	} 
	
	public String getCityCode() {
		return cityCode;
	} 
	
	public void setCityCode(String cityCode) { 
		this.cityCode = cityCode;
	} 
	
	public int getProvinceId() { 
		return provinceId; 
	}
	
	public void setProvinceId(int provinceId) { 
		this.provinceId = provinceId;
	} 
	
}
