package com.syne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	//@ResponseBody  // enabled - in case when you want to send the string back to browser. otherwise send resource back to browser
	@RequestMapping("/hello")
	public String getInformation()
	{
		return "home";
		
	}

}
