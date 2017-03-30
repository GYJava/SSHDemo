package com.servlet;

import javax.ws.rs.ApplicationPath;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;
@ApplicationPath("rest")
public class APIApplication extends ResourceConfig{
	
	public APIApplication() {
		  //加载Resource
		  register(UserInfo.class);
		  packages("com.servlet");
		  register(RequestContextFilter.class);
		  //注册数据转换器
		  register(JacksonJsonProvider.class);
//		  register(SpringRequestResource.class);
//		  register(Spring)
		  
		  // Logging.
		  register(LoggingFilter.class);
		    }

}
