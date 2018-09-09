package cn.zj.dao.person;

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
import cn.zj.domain.Person;
import cn.zj.domain.Project;

public class personDao {

	Connection con=null;
	PreparedStatement ps=null;
	public void insertperson(Person p) throws ClassNotFoundException, SQLException
	{
		//获得连接
		con= JDBCUtils.getConnection();
		
		String sql="insert into person values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
	    //获得预编译对象
		ps = con.prepareStatement(sql);
		
		ps.setInt(1,p.getPeron_id());
		ps.setString(2, p.getName());
		ps.setString(3, p.getGender());
		ps.setString(4, p.getBirthday());
	    ps.setString(5,p.getNationality());
	    ps.setString(6, p.getEducation());
	    ps.setString(7,p.getDepartment());
	    ps.setString(8, p.getTime());
	    ps.setString(9, p.getTitle());
	    ps.setDouble(10, p.getWage());
	    ps.setDouble(11, p.getSalary());
	    ps.setDouble(12, p.getBonus());
	    ps.setInt(13,p.getProject_id());
	    ps.executeUpdate();
	    //关闭连接
	    con.close();
	    ps.close();
	}
	
            
	public List<Person> selectperson() throws SQLException, ClassNotFoundException {
		       //获得连接
				con= JDBCUtils.getConnection();
			    
				List<Person> list=new LinkedList<Person>();
				
				String sql="select * from person";
				
			    //获得预编译对象
				ps = con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					Person p=new Person();
			        p.setPeron_id(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setGender(rs.getString(3));
					p.setBirthday(rs.getString(4));
					p.setNationality(rs.getString(5));
					p.setEducation(rs.getString(6));
					p.setDepartment(rs.getString(7));
					p.setTime(rs.getString(8));
					p.setTitle(rs.getString(9));
					p.setWage(rs.getDouble(10));
					p.setSalary(rs.getDouble(11));
					p.setBonus(rs.getDouble(12));
					p.setProject_id(rs.getInt(13));
				    list.add(p);
				}
			    //关闭连接
			    con.close();
			    ps.close();
			    
				return list;
		
	}
	
	public void delete(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//获得连接
		con= JDBCUtils.getConnection();
		
		String sql="delete from person where peron_id=?";
		
	    //获得预编译对象
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, Integer.parseInt(id));
		
	    ps.executeUpdate();
	    //关闭连接
	    con.close();
	    ps.close();
	}
}