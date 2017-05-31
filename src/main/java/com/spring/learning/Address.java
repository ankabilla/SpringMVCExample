package com.spring.learning;

public class Address {
   
	private String country;
	private String city;
	private String state;
	private int pincode;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	public static void main(String[] args) {
		
		int a =10;
		long b = 13;
		float c = 12;
		double d = 14.0;
		Float f = new Float(3.0);
		int x = f.intValue();
		double d1 = f.doubleValue();
		byte y = f.byteValue();
		System.out.println(x+y+d1);
		
		System.out.println(((a+b)*(c+d)));
		
	}
	
}
