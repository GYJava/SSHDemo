package com.servlet;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.validation.constraints.Null;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.entity.Students;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StudentsService;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tools.TokenProcessor;

//这里@Path定义了类的层次路径。 
//指定了资源类提供服务的URI路径。
@Path("UserInfoService")
@Component
public class UserInfo {
	
	//此处要使用service层
	
	@Autowired
	private StudentsService studentsService;
	
//	private List<Students> studentsList;
	@GET
	@Path("/FindStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Students> FindStudents() {
		
//	GYBaseDao baseDao = new GYBaseDao();
//		
//		ArrayList<OznerUser> userList = new ArrayList<OznerUser>();
//		userList = baseDao.SearchOznerUser();
//		
//		for (OznerUser oznerUser : userList) {
//			System.out.println(oznerUser.getUserName());
//		}
//		System.out.println("==========================");
//		studentsList = studentsService.getAllStudents();

		List<Students> studentsList = new ArrayList<Students>();
		studentsList =	studentsService.getAllStudents();
		System.out.println("==========================studentsList" + studentsList);
	

//		ServletContext servletContext = this.getServletContext();    
//  
//		WebApplicationContext wac = null;     
//		wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);    
//          
//		this.userService = (UserService) wac.getBean("userService");
		
		return studentsList;
		
	}
	
	
	
	public void setStudentsService(StudentsService studentsService) {
		this.studentsService = studentsService;
	}
	
//	public List<Students> getStudentsList() {
//		return studentsList;
//	}
//	
//	public void setStudentsList(List<Students> studentsList) {
//		this.studentsList = studentsList;
//	}
//	
	
	// @GET表示方法会处理HTTP GET请求
	@GET
	// 这里@Path定义了类的层次路径。指定了资源类提供服务的URI路径。
	@Path("/name/{i}")
	public String userName(@PathParam("i") String i) {
		 System.out.println("你是最好的");
		String name = i;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}
	
	@GET
	@Path("/age/{j}") 
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j") int j) {
	 
	int age = j;
	return "<User>" + "<Age>" + age + "</Age>" + "</User>";
	}
	
	@GET
	@Path("/getUserJson")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserJson() {
		System.out.println("出错了");
		User user = new User();
		user.setAge("23");
		user.setName("zgy");
		user.setSex("男");
		
		return user;
	}
	
	@GET
	@Path("/getUserListJson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUserListJson() {
	
		List<User> users = new ArrayList<User>() ;
		
		User user = new User();
		user.setAge("23");
		user.setName("zgy");
		user.setSex("男");
		users.add(user);
		users.add(user);
		users.add(user);
		
		return users;
	}
	
	//同时支持POST和GET接口
	@GET
	@Path("/getUserInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Object> getUserInfo(@QueryParam("name") String name) {
		System.out.println(name);
		HashMap map = new HashMap();

		List<User> users = new ArrayList<User>() ;
		
		User user = new User();
		user.setAge("23");
		user.setName("zgy");
		user.setSex("男");
		users.add(user);
		users.add(user);
		users.add(user);
		map.put("data", users);
		map.put("success", "1");
		
		return map;
	}
	
	@POST
	@Path("/getUserInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Object> getUserInfopost(@QueryParam("name") String name) {
		System.out.println(name);
		HashMap map = new HashMap();

		
		List<User> users = new ArrayList<User>() ;
		
		User user = new User();
		user.setAge("23");
		user.setName("zgy");
		user.setSex("男");
		users.add(user);
		users.add(user);
		users.add(user);
		map.put("data", users);
		map.put("success", "1");
		
		return map;
	}
	
	@POST
	@Path("/getUserInfo1")
//	@PathParam("name")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Object> getUserInfo1(@QueryParam("name") String name) {
		System.out.println(name);
		HashMap map = new HashMap();

		if (name == null) {
			map.put("data", new ArrayList<User>() );
			map.put("success", "-100");
			return map;
		}
		
		List<User> users = new ArrayList<User>() ;
		
		User user = new User();
		user.setAge("23");
		user.setName("zgy");
		user.setSex("男");
		users.add(user);
		users.add(user);
		users.add(user);
		map.put("data", users);
		map.put("success", "1");
		
		return map;
	}
	
}

