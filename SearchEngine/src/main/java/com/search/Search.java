package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Search {
	
	
	@GetMapping("/home")
	public String display()
	{
		System.out.println("Home is working");
		return "Home";
	}
	
	@GetMapping("/search")
	public RedirectView search(@RequestParam ("query") String query)
	{
		
		String url="https://www.google.com/search?q="+query;
		RedirectView view= new RedirectView();
		view.setUrl(url);
		return view;
	}
	
	
	@GetMapping("/searching")
	public String display1()
	{
		
		return "redirect:https://www.google.com";
	}
	
	@GetMapping("/map/{username}")
	public String handler(@PathVariable("username") String name)
	{
		System.out.println("Name is: "+ name);
		return "Home n";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handle_error()
	{
		return "Form";
	}

}
