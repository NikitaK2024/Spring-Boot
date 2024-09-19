package com.mvc.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mvc.entities.ToDo;

public class MyListener  implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context created..");
		List<ToDo> list=new ArrayList<ToDo>();
		ServletContext context=sce.getServletContext();
		context.setAttribute("list", list);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
