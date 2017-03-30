package com.servlet;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * 获取与数据库的连接的共通
 * @author 
 *
 */
public class GYBaseDao {
	
	/**
	 * 
	 * @return
	 */
	public Connection getConnection() {
		Connection coon = null;
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root" ;   
	    String password = "zgy666666" ;  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			coon = DriverManager.getConnection(url, username, password);
			//判断数据库是否连接成功 
			if(coon!=null) { 
				System.out.println("MySql数据库连接成功"); 
				}else{
				System.out.println("MySql数据库连接失败");
			}

		} catch (Exception e) {
			System.out.println("找不到驱动程序类，加载驱动失败");
			e.printStackTrace();
		}
		
		return coon;
	}
	
	public ArrayList<OznerUser> SearchOznerUser() {
		
		Connection connection = getConnection();
		
		ArrayList<OznerUser> userList = new ArrayList<OznerUser>();
		
		try {
			
			Statement statement = (Statement) connection.createStatement();
			ResultSet rs = ((java.sql.Statement) statement).executeQuery("select * from OznerUser");
			
			OznerUser user;
			while (rs.next()) {
				user = new OznerUser();
				String OzneUser = rs.getString("OzneUser");
				user.setOzneUser(OzneUser);
				String UserName = rs.getString("UserName");
				user.setUserName(UserName);
				String id = rs.getString("id");
				user.setId(id);
				String pwd = rs.getString("pwd");
				user.setPwd(pwd);
				
				userList.add(user);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("搜索数据出错");
			e.printStackTrace();
		}
		return userList;
		
		
	}

}


