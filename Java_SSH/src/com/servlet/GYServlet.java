package com.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GYServlet
 */
@WebServlet("/GYServlet")
public class GYServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//		super.init(config);
		this.config = config;
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GYServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("dwajidjawidjwaidiwja").append(request.getContentType());
//		response.getWriter().write(2);
		//获取在web.xml中配置的初始化参数
		String paramVal = this.config.getInitParameter("name");//获取指定的初始化参数
		System.out.println("paramVal" + paramVal);
		response.getWriter().print(paramVal);
		
		response.getWriter().print("<hr/>");
		
		//获取所有的初始化参数
		Enumeration<String> e = config.getInitParameterNames();
		
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			String value = config.getInitParameter(name);
			response.getWriter().print(name+ "=" + value + "<br/>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
