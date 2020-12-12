package com.bridgelabz.employeepayrollapp.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bridgelabz.employeepayrollapp.interceptors.MyCustomInterceptor;

@Component
public class CustomConfig extends WebMvcConfigurerAdapter{

	@Autowired
	MyCustomInterceptor myCustomeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myCustomeInterceptor);
	}
	
}
