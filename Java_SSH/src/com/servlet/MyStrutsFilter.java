package com.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class MyStrutsFilter extends StrutsPrepareAndExecuteFilter{
    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MyStrutsFilter.class);

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		 HttpServletRequest req = (HttpServletRequest) arg0;
         String path = req.getRequestURI();
         if(path.contains("/rest/*")) {
        	 log.debug("跳过struts");
        	 arg2.doFilter(arg0, arg1);
         } else {
        	 log.debug("进入struts");
        	 super.doFilter(arg0, arg1, arg2);
         }
		
		super.doFilter(arg0, arg1, arg2);
	}
	
}
