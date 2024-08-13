package com.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Employee;
import com.bean.Product;
import com.bean.Student;
import com.config.Appconfig;


public class App {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);//pass class name without""
		System.out.println("EMployee primitive type injection");
		Employee std=(Employee) ac.getBean("getdata");//getBean factory object
		System.out.println(std);
		
		System.out.println("Student primitive type injection");
		Student s=(Student)ac.getBean("getData");
		System.out.println(s);

		System.out.println("collection type injection");
		Product p=(Product) ac.getBean("pdtobj");
		System.out.println(p);
		
		System.out.println("Constructor type injection");
		Student st=(Student)ac.getBean("std");
		System.out.println(st);
	
		
		System.out.println("Employee reference type injection");
		Employee emp=(Employee)ac.getBean("getvalue");
		System.out.println("Employee and address value"+emp);
	}
}
