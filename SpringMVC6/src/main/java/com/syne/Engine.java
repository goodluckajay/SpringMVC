package com.syne;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Engine implements WebApplicationInitializer{

	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("inside onStartup()...!!###!!!");
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MyConfig.class);
	
		
		DispatcherServlet ds = new DispatcherServlet(context);
		ServletRegistration.Dynamic dyna = sc.addServlet("DispacterServlet",ds);
		dyna.setLoadOnStartup(1); 
		dyna.addMapping("/myproject/*");
		
		
	}

}

//This is NOT a DynamicWebProject
//It's MAVEN project
//It DOESN'T having web.xml file
//it DOESN'T having config.xml file

//NOTE#NOTE#NOTE: webapp and all it sub folder/files are manually created.

// Note: In this example we have replace the config.xml file with MyConfig.java file and whatever content should be inside 
// config.xml thats inside the MyConfig.java file
