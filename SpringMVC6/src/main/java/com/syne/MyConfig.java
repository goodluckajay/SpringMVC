package com.syne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc // its good to add this annotation
@Configuration
@ComponentScan(basePackages="com.syne")
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		System.out.println("View Resolver");
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/"); // pay attention here i.e [/WEB-INF/view/] NOT [WEB-INF/view/]
		vr.setSuffix(".jsp");
		return vr;
		
	}

}
