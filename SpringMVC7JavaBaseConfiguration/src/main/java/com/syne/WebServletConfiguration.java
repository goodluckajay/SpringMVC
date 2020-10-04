package com.syne;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Note: in this example we have add <artifactId>maven-war-plugin</artifactId> in pom.xml and servlet-api dependency

// This class is EQUIVALENT to web.xml
// Its necessary to extend this class to WebApplicationInitializer Interface
// line 29,30,31 equivalent to <servlet>&<servlet-mapping> in web.xml, loadOnStartup and mapping of request
// line 26,27 equivalent to give reference to our dispatcher-servlet.xml file.




public class WebServletConfiguration implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {	
		
		AnnotationConfigWebApplicationContext  webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(SpringConfig.class);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		

		
		
	}

}
