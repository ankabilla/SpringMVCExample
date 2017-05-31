package com.spring.learning;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
   @Pattern(regexp="[^0-9]*")
   @Size(min=5)
   private String name;
   
   @Size(min=2,max=30) @IsValidHobby(listOfValidHobbies="Music|cricket|football")
   private String hobbies;
   
   @Past
   private Date dob;
   private List skills;
   private long phone;
   private Address address;
   
   
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
}
