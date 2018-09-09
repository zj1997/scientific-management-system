package cn.zj.dao.rank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import cn.zj.JDBCUtils.JDBCUtils;
import cn.zj.domain.Payoff;
import cn.zj.domain.Project;

public class payoffrank {
	Connection con=null;
	PreparedStatement ps=null;

	public List<Payoff> selectperrankpayoff() throws SQLException, ClassNotFoundException {
		       //获得连接
				con= JDBCUtils.getConnection();
			    
				List<Payoff> list=new LinkedList<Payoff>();
				
				String sql="select * from scientist_payoff order by p_class asc";
				
			    //获得预编译对象
				ps = con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
			    
				while(rs.next())
				{
					Payoff p=new Payoff();
			        p.setPay_id(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setCatagory(rs.getString(3));
					p.setRank(rs.getString(4));
					p.setP_class(rs.getInt(5));
					p.setTime(rs.getString(7));
					p.setCer_num(rs.getInt(6));
				    list.add(p);				
				}
				
			    //关闭连接
			    con.close();
			    ps.close();
			    
				return list;
		
	}
	
}
