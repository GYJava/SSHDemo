package com.eviac.blog.restws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//这里@Path定义了类的层次路径。 
//指定了资源类提供服务的URI路径。
@Path("UserInfoService")
public class UserInfo {
	
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
		System.out.println("出错了");
		
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
}

