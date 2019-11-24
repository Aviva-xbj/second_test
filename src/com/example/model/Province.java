package com.example.model;

public class Province {
	
	//创建三个成员变量（变量方法），其中id是自增长主键，provinceName表示省名，provinceCode表示省级代号。
	private int id;
	private String provinceName;
	private String provinceCode;  
	
	public int getId() {
		return id; 
	}
	
	public void setId(int id) {
		this.id = id; 
	} 
	
	public String getProvinceName() {
		return provinceName;
	} 
	
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName; 
	}
	
	public String getProvinceCode() { 
		return provinceCode;
	} 
	
	public void setProvinceCode(String provinceCode) { 
		this.provinceCode = provinceCode; 
	} 
	
}
