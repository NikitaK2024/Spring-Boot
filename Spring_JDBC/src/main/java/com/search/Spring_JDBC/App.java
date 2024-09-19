package com.search.Spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/demo/jdbc/config.xml");
      JdbcTemplate template= context.getBean("jdbcTemplate", JdbcTemplate.class);
      
      String query=" insert into Student (roll_no, name, city) values (?,?,?)";
      
      int result = template.update(query,2,"kkk","Nashik");
      System.out.println("Number of record inserted "+result);
      
     
    }
}
