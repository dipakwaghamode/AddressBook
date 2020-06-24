package com.addressbook.model;
class Person{
	String emailid;
	String name;
	double mobileNo;
	String city;
	String zipcode;
	String state;
	public String getEmailId(){
	return this.emailid;
	}
	public String getName(){
	return this.name;
	}
	public double getMobileNo(){
	return this.mobileNo;

	}

	public String getCity(){
	return this.city;

	}

	public String getZipCode(){
	return this.zipcode;

	}
	public String getState(){
	return this.state;
	}

	public void setemailId(String emailid){
	this.emailid=emailid;

	}
	public void setname(String name){
	this.name=name;

	}
	public void setcity(String city){
	this.city=city;

	}
	public void setstate(String state){
	this.state=state;
	}
	public void setmobileNo(double mobileNo){
	this.mobileNo=mobileNo;
	}
	
}
