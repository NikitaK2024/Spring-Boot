package com.demo.hql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.demo.Demo.Employee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlQuery {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		String query="from Employee as E where E.name=:x ";
		
		Query q=session.createQuery(query);
		q.setParameter("x", "virat");
		//q.setParameter('s', 1000.0);
		
	List<Employee> employee=q.list();
	
		
		for(Employee emp: employee)
		{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		
		session.beginTransaction();
		//Query q2=session.createQuery("delete from Employee e where e.id =:i");
		
		Query q2=session.createQuery("update Employee set name =:s where id =:i");
		q2.setParameter("i", 2);
		q2.setParameter("s", "virat Kohli");
		
		int r=q2.executeUpdate();
		System.out.println(r);
		
		
		Query q3=session.createQuery("select S.name, s from Employee as E INNER JOIN E.address as a");
		
		List<Object []> list=q3.list();
		for(Object[] obj:list) {
			System.out.println(Arrays.toString(obj));
		}
		session.close();
		factory.close();
	}

}
