package com.tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	
//	public MyConnection() {
//		
//		
//		
//	}
	
	public Connection getConnection() {
		Connection coon = null;
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root" ;   
	    String password = "zgy666666";  
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
	

	

}
