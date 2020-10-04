package com.syne;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Engine implements WebApplicationInitializer{

	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("inside onStartup()...!!");
		
		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		appContext.setConfigLocation("classpath:config.xml");
		appContext.setServletContext(sc);
		
		DispatcherServlet ds = new DispatcherServlet(appContext);
		ServletRegistration.Dynamic dyna = sc.addServlet("DispacterServlet",ds);
		
		dyna.addMapping("/myproject/*");		
		dyna.setAsyncSupported(true);
		dyna.setLoadOnStartup(1);
		
	}

}

//This is NOT a DynamicWebProject
//It's MAVEN project
//It DOESN'T having web.xml file
//it having config.xml file

// Note: In this example we have replace the web.xml file with Engine.java file and whatever content should be inside 
// web.xml thats inside the Engine.java file
// but we are not replacing config.xml file and its content. In next project i will also replace the content of config.xml file

// NOTE#NOTE#NOTE: webapp and all it sub folder/files are manually created.

