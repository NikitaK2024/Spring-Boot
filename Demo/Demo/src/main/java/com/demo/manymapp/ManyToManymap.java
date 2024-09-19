package com.demo.manymapp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManymap {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session  session=factory.getCurrentSession();
		
		Student st=new Student();
		Student st2=new Student();
		
		st.setS_id(4);
		st.setS_name("Virat");
		
		st2.setS_id(2);
		st2.setS_name("Ram");
		
		Course course1=new Course();
		Course course2=new Course();
		
		course1.setC_id(101);
		course1.setCourse_name("Java");
		
		course2.setC_id(102);
		course2.setCourse_name("python");
		
		
		List<Course> list_course=new ArrayList<>();
		
		List<Student> list_student=new ArrayList<>();
		
		list_student.add(st);
		list_student.add(st2);
		
		list_course.add(course1);
		list_course.add(course2);
		
		
		st.setCourse(list_course);
		
		course2.setStudent(list_student);
		
		session.beginTransaction();
		session.save(st);
		session.save(st2);
		session.save(course1);
		session.save(course2);
		
		
		session.getTransaction().commit();
		
		
		session.close();
		factory.close();
		
	}

}
