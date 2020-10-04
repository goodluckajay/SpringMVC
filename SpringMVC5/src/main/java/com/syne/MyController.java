package com.syne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String getInformation()
	{
		System.out.println("testing...");
		return "Hello World";
	}

}
