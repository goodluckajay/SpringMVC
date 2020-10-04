package com.syne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Note:
// This file is equivalent to dispatcher-servlet.xml file
// @Bean tag is equivalent to <bean> tag
// configureDefaultServletHandling() is not necessary
// @Configuration tell that is configuration file
// @EnableWebMvc tell that to <context:annotation-config>
// @ComponentScan tell taht to enable the <context:component-scan>

@Configuration
@EnableWebMvc
@ComponentScan("com.syne")
public class SpringConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	{
		configurer.enable();
	}
	

}
