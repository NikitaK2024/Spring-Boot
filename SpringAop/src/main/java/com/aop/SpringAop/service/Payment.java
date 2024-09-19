package com.aop.SpringAop.service;

import org.springframework.stereotype.Service;

@Service
public class Payment implements PaymentService{

	@Override
	public void makePaymet() {
		System.out.println("Amount debited");
		
	}

}
