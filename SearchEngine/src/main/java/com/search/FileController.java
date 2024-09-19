package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@GetMapping("/file")
	public String showFile()
	{
		System.out.println("file is working");
		return "File";
	}
	
	 @RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String uploadfile(@RequestParam ("profile") CommonsMultipartFile file)
	{
		 
		 
		System.out.println("uploaded...");
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		
		return "File";
	}
}
