package cn.zj.dao.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import cn.zj.JDBCUtils.JDBCUtils;
import cn.zj.domain.Project;

public class projectDao {

	Connection con=null;
	PreparedStatement ps=null;
	public void insertperson(Project p) throws ClassNotFoundException, SQLException
	{
		//获得连接
		con= JDBCUtils.getConnection();
		
		String sql="insert into project values(?,?,?,?,?,?)";
		
	    //获得预编译对象
		ps = con.prepareStatement(sql);
		
		ps.setString(2,p.getPname());
		ps.setString(3, p.getPresource());
		ps.setString(5, p.getPtime());
		ps.setString(6, p.getProle());
	    ps.setInt(1,p.getProject_id());
	    ps.setDouble(4, p.getPfee());
	    
	    ps.executeUpdate();
	    //关闭连接
	    con.close();
	    ps.close();
	}
	
               @Test
	public List<Project> selectperson() throws SQLException, ClassNotFoundException {
		       //获得连接
				con= JDBCUtils.getConnection();
			    
				List<Project> list=new LinkedList<Project>();
				
				String sql="select * from project";
				
			    //获得预编译对象
				ps = con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
			    
				while(rs.next())
				{
					Project p=new Project();
					p.setPname(rs.getString(2));
					p.setPresource(rs.getString(3));
					p.setPtime(rs.getString(5));
					p.setProle(rs.getString(6));
				    p.setProject_id(rs.getInt(1));
				    p.setPfee(rs.getDouble(4));
				    list.add(p);
					
				}
				
				
				System.out.println(list);
				
			    //关闭连接
			    con.close();
			    ps.close();
			    
				return list;
		
	}
               
       public void delete(String id) throws ClassNotFoundException, SQLException {
           		// TODO Auto-generated method stub
           		//获得连接
           		con= JDBCUtils.getConnection();
           		
           		String sql="delete from project where project_id=?";
           		
           	    //获得预编译对象
           		ps = con.prepareStatement(sql);
           		
           		ps.setInt(1, Integer.parseInt(id));
           		
           	    ps.executeUpdate();
           	    //关闭连接
           	    con.close();
           	    ps.close();
           	}
}
