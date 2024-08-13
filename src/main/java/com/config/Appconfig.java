package com.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Employee;
import com.bean.Product;
import com.bean.Student;

@Configuration
public class Appconfig {
	@Bean
	public Employee getdata() {
		Employee emp=new Employee();
		emp.setEmpid(101);
		emp.setEmp_name("vivek");
		emp.setSalary(45000.6);
		return emp;
		}
	@Bean
	public Student getData() {
		Student std=new Student();
		std.setId(1);
		std.setName("vivek");
		std.setMarks(96.6);
		return std;
	}
	
	@Bean
	public Product pdtobj() {
		Product p=new Product();
		p.setData(listdata());
		p.setModels(setdata());
		p.setModes(mapdata());
		p.setContext(propsdata());
		return p;
	}
	 public List<String> listdata(){
		 List<String> lst=new LinkedList<String>();
		 lst.add("vivek");
		 return lst;
		 }
	
	 public Set<String> setdata(){
		 Set<String> setd=new HashSet<String>();
		 setd.add("demo");
		 return setd;
	 }
	 
	 public Map<Integer, String> mapdata(){
		 Map<Integer,String> ms=new HashMap<Integer, String>();
		 ms.put(45, "frji");
		 return ms;
	 }
	 
	 public Properties propsdata() {
		 Properties d=new Properties();
		 d.put(1, "Ac");
		 return d;
	 }
	 @Bean
	 public Student std() {
		 return new Student(102,"vicky",86.3);
	 }
	 @Bean
	 public Employee getvalue() {
		 Address ad1=add();
		 Employee e1=new Employee(102,"vicky",88600.3,ad1);
		 
		 return e1;
	 }
	  
	 public Address add() {
		 Address ad=new Address("indore");
		 return ad;
	 }
}
