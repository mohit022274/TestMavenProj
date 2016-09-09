package com.psl.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="addr")
public class Address {			//POJO class
	
	@Value(value="Nagpur")
	private String city;
	
	@Value(value="S.B. Road")
	private String street;
	
	@Value(value="425108")
	private String zip;
	
	
	public Address(String city, String street, String zip) {
		System.out.println("In param construcotr of address");
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	public Address() {
		System.out.println("In default construcotr of address");
	}	
	public String getCity() {
		
		return city;
	}
	public void setCity(String city) {
		System.out.println("In set city");
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("In set street");
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		System.out.println("In set zip");
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zip=" + zip
				+ "]";
	}	
}
