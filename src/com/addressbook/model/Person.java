package com.addressbook.model;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Person implements Comparable<Person>
{
	String FirstName;
	String LastName;
	String EmailId;
	String State;
	String City;
	int ZipCode;
	long MobileNumber;
	public Person(){}

	public Person(String FirstName,String LastName,String EmailId,String State,String City,int ZipCode,long MobileNumber){
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.EmailId=EmailId;
		this.State=State;
		this.City=City;
		this.ZipCode=ZipCode;
		this.MobileNumber=MobileNumber;
	}

	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	}
        public void setLastName(String LastName){
                this.LastName=LastName;
        }
        public void setEmailId(String EmailId){
                this.EmailId=EmailId;
        }
        public void setState(String State){
                this.State=State;
        }
        public void setCity(String City){
                this.City=City;
        }
        public void setZipCode(int ZipCode){
                this.ZipCode=ZipCode;
        }
        public void setMobileNumber(long MobileNumber){
                this.MobileNumber=MobileNumber;
        }

	public String getFirstName(){
		return this.FirstName;
	}

	public String getLastName(){
		return this.LastName;
	}

	public String getEmailId(){
		return this.EmailId;
	}

	public String getState(){
		return this.State;
	}

	public String getCity(){
		return this.City;
	}

	public int getZipCode(){
		return this.ZipCode;
	}


	public long getMobileNumber(){
		return this.MobileNumber;
	}

	public String toString(){
		return this.FirstName+" "+this.LastName+" "+this.EmailId+" "+this.State+" "+this.City+" "+this.ZipCode+" "+this.MobileNumber;
	}

	public int compareTo(Person person)
        {
                        if(this.getZipCode() > person.getZipCode())
                        {
                                return 1;
                        }
                        if(this.getZipCode() < person.getZipCode())
                        {
                                return -1;
                        }
                        return 0;

        }

}
