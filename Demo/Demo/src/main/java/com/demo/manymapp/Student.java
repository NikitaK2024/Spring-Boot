package com.demo.manymapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;
	
	private String s_name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Course> course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int s_id, String s_name) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
	}

	
	
	public Student(int s_id, String s_name, List<Course> course) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.course = course;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", course=" + course + "]";
	}
	
	
	
	

}
