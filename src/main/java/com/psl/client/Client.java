package com.psl.client;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;
import com.psl.entity.Employee;
import com.psl.service.EmployeeService;

public class Client {
	private static EmployeeService service;
	public EmployeeService getService() {
		return service;
	}
	public void setService(EmployeeService service) {
		this.service = service;
	}
	public static void main(String[] args) throws Exception {
		
		//Spring container instantiation/initialization
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		//get beans
///		Employee employee=(Employee)context.getBean("emp");
		
		//invoking business logic
	//	System.out.println(employee.toString());
		//context.
	//	context.registerShutdownHook();
		//System.out.println("In client add employee flow");
		///service.addEmployee(employee);
		//System.out.println("Done adding employee");
		
//		System.out.println("In get employees");
//		List<Employee> list=service.getAllEmployee();
//		
//		for (Employee employee2 : list) {
//			//System.out.println(employee2);
//			System.out.println("~"+employee2.getId()+" ~ "+employee2.getName());
//		}
//		System.out.println("Done retrieving employees");
//		
//		
		System.out.println("Demo jenkins");
		
		Performer p=(Performer)context.getBean("performer");
		p.perform();   	//primary 
	}
}
