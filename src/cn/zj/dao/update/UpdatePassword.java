package cn.zj.dao.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.zj.JDBCUtils.JDBCUtils;
import cn.zj.domain.Project;

public class UpdatePassword {


	Connection con=null;
	PreparedStatement ps=null;
	
	public void updatepassword(String p) throws ClassNotFoundException, SQLException {
		//获得连接
		con= JDBCUtils.getConnection();
		
		String sql="update admin set password=? where id=?";
		
		//获得预编译对象
		ps = con.prepareStatement(sql);
		
	    ps.setString(1, p);
		ps.setInt(2, 1);
		
		ps.executeUpdate();
		//关闭连接
		con.close();
		ps.close();
		
	}

}
