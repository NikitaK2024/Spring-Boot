package com.hiber.embedd;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoEmbedd {
	
	public static void main(String[] args) {
		
		
			Certificate certi=new Certificate("java","3 months");
			Student st=new Student(1,"virat",certi);
			
			 SessionFactory factory;
		      
		     
		        Configuration cfg=new Configuration();
		       cfg.configure();
		      //  cfg.addAnnotatedClass(Employee.class);
		        factory=cfg.buildSessionFactory();
			
			
		        Session session=factory.getCurrentSession();
		        
		        session.beginTransaction();
		     
		        
		        
		        session.save(st);
		        session.getTransaction().commit();
		        
		        session.close();
		  
		        
	}

}
