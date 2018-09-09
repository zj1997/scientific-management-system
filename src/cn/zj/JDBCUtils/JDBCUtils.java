package cn.zj.JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {
    

     static Connection con=null;
	
     static PreparedStatement ps=null;
    
     static ResultSet rs=null;

    public static Connection getConnection(String url,String username,String password) throws ClassNotFoundException, SQLException
	{
		
		//注册驱动
	    Class.forName("com.mysql.jdbc.Driver");
		
	    //获得连接
	    con = DriverManager.getConnection(url, username, password);
	    
		return con;
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		
		//注册驱动
	    Class.forName("com.mysql.jdbc.Driver");
		
	    //获得连接
	    con = DriverManager.getConnection("jdbc:mysql://localhost/scientistproject", "root", "199715");
	    
		return con;
	}
	
	
}