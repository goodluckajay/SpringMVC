package com.syne;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//This is DynamicWebProject
//It's not Maven project
//It having web.xml file
//it having myservlet-servlet.xml file
// DispatcherServlet-servlet.xml must be inside same folder where web.xml is and its name must be <ServletName-servlet>.xml
// if you want to change the name and locaiton of this file please check SpringMVC2
@Controller
public class Test {
	
	@ResponseBody
	@RequestMapping("/hello")	
	public String getData()
	{
		return "Hello World!";
	}

}
