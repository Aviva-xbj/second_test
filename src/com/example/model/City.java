package com.example.model;

//�е�ʵ����
public class City {
	
	//����id��������������cityName��ʾ��������cityCode��ʾ�м����ţ�provinceId�Ǳ�City������Province�����
	
	private int id;
	
	private String cityName; 
	
	private String cityCode; 
	
	private int provinceId;  //City����Ҫ����Province����������룩
	
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
