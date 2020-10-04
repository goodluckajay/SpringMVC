package com.syne;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//This is DynamicWebProject
//It's not Maven project
//It having web.xml file
//it having myservlet-servlet.xml file
// Here, location of config.xml file is different (see web.xml)
@Controller
public class Test {
	
	@ResponseBody
	@RequestMapping("/hello")	
	public String getData()
	{
		return "Hello World!";
	}

}
