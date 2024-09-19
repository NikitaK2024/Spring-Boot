package com.demo.Demo;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 

{
	 public static void main(String[] args) throws Exception {
      System.out.println("Hello World!");
       
   
      SessionFactory factory;
      
     
        Configuration cfg=new Configuration();
       cfg.configure();
      //  cfg.addAnnotatedClass(Employee.class);
        factory=cfg.buildSessionFactory();
      //  System.out.println(factory);
        Employee emp=new Employee();
        
        emp.setId(1);
        emp.setName("Virat");
        emp.setSalary(10000);
     
        System.out.println(emp);
        
        
        Address add=new Address( );
        add.setStreet("SB Road");
        add.setCity("pune");
        add.setIsopen(true);
        add.setAdded_date(new Date());
        add.setX(222);
        
        
        //image
        FileInputStream fis=new FileInputStream("src/main/java/download.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        add.setAddimage(data);
        
        
        Session session=factory.getCurrentSession();
        
        session.beginTransaction();
      //  Transaction tx=(Transaction) session.beginTransaction();
        
        
        
        session.save(emp);
        session.save(add);
        
        
        Employee emp1=(Employee)session.get(Employee.class, 1);
        System.out.println(emp);
        
        //tx.commit();
        session.getTransaction().commit();
        
        session.close();
  
	
}
}
