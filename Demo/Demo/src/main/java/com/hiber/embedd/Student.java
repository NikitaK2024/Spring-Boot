package com.hiber.embedd;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int id;
	String name;
	
	@Embedded
	Certificate certi;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
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


	public Certificate getCerti() {
		return certi;
	}


	public void setCerti(Certificate certi) {
		this.certi = certi;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
	
	
		
}
