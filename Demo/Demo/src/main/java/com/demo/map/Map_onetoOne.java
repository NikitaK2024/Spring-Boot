package com.demo.map;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map_onetoOne {

	public static void main(String[] args) {

		SessionFactory factory;

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(Employee.class);
		factory = cfg.buildSessionFactory();

		// Transaction tx=session.beginTransaction();

		Question question = new Question();
		question.setQues_id(1);
		question.setQues("What is Java");

		Answer answer = new Answer();

		answer.setAns_id(101);
		answer.setAns("Java is Programming language");
		
		Answer answer1 = new Answer();

		answer1.setAns_id(101);
		answer1.setAns("Java is OOP");
		
		ArrayList<Answer> list=new ArrayList<>();
	
		list.add(answer);
		list.add(answer1);
		
		question.setAnswer(list);

		//question.setAnswer(answer);

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		// Transaction tx=(Transaction) session.beginTransaction();

		session.save(question);

		session.save(answer);
		session.save(answer1);
		Question que=(Question)session.get(Question.class, 1);
		System.out.println(que.getQues());
		for (Answer answer2 :que.getAnswer()) {
			System.out.println(answer2.getAns());
		}
	//	System.out.println(que.getAnswer().getAns());
		
		session.getTransaction().commit();
		
		

		session.close();
		factory.close();

	}

}
