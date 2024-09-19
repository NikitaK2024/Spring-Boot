package com.demo.Demo;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	
	String course_name;
	
	String duration;

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Course(String course_name, String duration) {
		super();
		this.course_name = course_name;
		this.duration = duration;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [course_name=" + course_name + ", duration=" + duration + "]";
	}
	
	

}
