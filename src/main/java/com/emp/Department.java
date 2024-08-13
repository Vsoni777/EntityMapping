package com.emp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department {

	
	@Id

	private int id;
	@Column(name = "dep_name", length = 30)
	private String name;
	@OneToMany
	private Set<Employee> emp = new HashSet<Employee>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, Set<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}

}
