package com.example.model;

public class County {
	
	//其中id是自增长主键，countyName表示县名，countyCode表示县级代号，cityId是表County关联表City的外键
	
	private int id; 
	
	private String countyName;
	
	private String countyCode;
	
	private int cityId;
	
	public int getId() {
		return id;
	} 
	
	public void setId(int id) {
		this.id = id; 
	} 
	
	public String getCountyName() {
		return countyName;
	} 
	
	public void setCountyName(String countyName) {
		this.countyName = countyName; 
	} 
	
	public String getCountyCode() {
		return countyCode; 
	} 
	
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	
	public int getCityId() {
		return cityId; 
	} 
	
	public void setCityId(int cityId) {
		this.cityId = cityId;
	} 
	
}
