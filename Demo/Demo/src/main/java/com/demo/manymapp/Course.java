package com.demo.manymapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	
	private String course_name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Student> student;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int c_id, String course_name) {
		super();
		this.c_id = c_id;
		this.course_name = course_name;
	}

	
	
	
	public Course(int c_id, String course_name, List<Student> student) {
		super();
		this.c_id = c_id;
		this.course_name = course_name;
		this.student = student;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", course_name=" + course_name + ", student=" + student + "]";
	}
	
	
	
	

}
