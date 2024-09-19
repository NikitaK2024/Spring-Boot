package com.demo.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import com.demo.Demo.Employee;

public class SqlQueriesDemo {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		String query="select * from Employee";
		
		NativeQuery nq=session.createSQLQuery(query);
		
		List<Object []> list=nq.list();
		
		for(Object [] obj:list) {
			System.out.println(obj[1]);
		}
		
		session.close();
		factory.close();
		
	}

}
