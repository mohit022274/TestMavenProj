package com.psl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")			//bean id
public class Employee {
	
	@Value(value="21")
	private int id;
	
	@Value(value="Mohit")
	private String name;
	
//	@Autowired
//	private Address addr;
	
	public Employee() {
		System.out.println("In default construcotr of employee");
	}
	
	public Employee(int id, String name, Address addr) {
		System.out.println("In param construcotr of employee");
		this.id = id;
		this.name = name;
//		this.addr = addr;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("In set id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("In set name");
		this.name = name;
	}
//	public Address getAddr() {
//		return addr;
//	}
//	
//	public void setAddr(Address addr) {
//		System.out.println("In set adress");
//		this.addr = addr;
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void abc(){
		System.out.println("Init abc");
	}
	public void pqr(){
		System.out.println("destroy pqr");
	}
}
