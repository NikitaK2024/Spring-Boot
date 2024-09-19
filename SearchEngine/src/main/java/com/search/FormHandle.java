package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormHandle {
	
	@GetMapping("/process")
	public String process_Form(@ModelAttribute ("student") Student student, BindingResult result)
	{
		/*
		 * System.out.println(name); System.out.println(id);
		 * System.out.println("Form is working");
		 */
		
		if(result.hasErrors())
		{
			return "Form";
		}
		System.out.println(student);
		return "Form";
	}
	
	
	
	/*
	@GetMapping("/form")
	public String display_Form()
	{
		
		System.out.println("Form is working");
		return "Form";
	}
*/
}
