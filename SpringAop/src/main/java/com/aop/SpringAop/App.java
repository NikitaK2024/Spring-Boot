package com.aop.SpringAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.SpringAop.service.Payment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/aop/SpringAop/annot_config.xml");
        Payment pay=context.getBean(Payment.class);
        
        pay.makePaymet();
        
    }
}
