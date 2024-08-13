package com.emp;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	@Id
	private int pid;
	private String Pro_name;
	@ManyToMany
	private List<Employee> emp;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String pro_name, List<Employee> emp) {
		super();
		this.pid = pid;
		Pro_name = pro_name;
		this.emp = emp;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPro_name() {
		return Pro_name;
	}
	public void setPro_name(String pro_name) {
		Pro_name = pro_name;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", Pro_name=" + Pro_name + ", emp=" + emp + "]";
	}
	

	
}
