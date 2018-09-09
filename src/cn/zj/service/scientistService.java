package cn.zj.service;

import java.sql.SQLException;
import java.util.List;

import cn.zj.dao.scientistDao;
import cn.zj.domain.Admin;
import cn.zj.domain.Department;
import cn.zj.domain.Payoff;
import cn.zj.domain.Person;
import cn.zj.domain.Project;

public class scientistService {

	private scientistDao dao=new scientistDao();
	
	//项目
	 public void addproject(Project p) throws ClassNotFoundException, SQLException {
	
	    dao.addproject(p);	
	}
	 
	 public List<Project> getproject() throws ClassNotFoundException, SQLException {
			
	      return dao.getproject();
	}

	//部门
	public void adddepartment(Department d) throws ClassNotFoundException, SQLException {
	      dao.adddepartment(d);
	}
	
	public List<Department> getdepartment() throws ClassNotFoundException, SQLException {
		
	      return dao.getdepartment();
	}
    
	//科研成果
	public void addpayoff(Payoff p) throws ClassNotFoundException, SQLException {
	      dao.addpayoff(p);
	}
	
	public List<Payoff> getpayoff() throws ClassNotFoundException, SQLException {
		
	      return dao.getpayoff();
	}
	
	//人员
	public void addperson(Person p) throws ClassNotFoundException, SQLException {
	      dao.addperson(p);
	}
	
	public List<Person> getperson() throws ClassNotFoundException, SQLException {
		
	      return dao.getperson();
	}

	public Admin login(Admin a) throws ClassNotFoundException, SQLException{
		
		Admin admin=dao.login(a.getAccount());
		

        boolean flag=false;
		if(a.getAccount().equals(admin.getAccount())&&a.getPassword().equals(admin.getPassword())) 
		{
			flag=true;
		}
		
		if(flag) {
			return admin;
		}else {
			
		 return null;	
		}
	}

	//修改密码
	public void updatepassword(String p) throws ClassNotFoundException, SQLException {
	
	   dao.updatepassword(p);	
	}

	//项目成果排名
	public List<Payoff> rank() throws ClassNotFoundException, SQLException {
	
		List<Payoff> rank = dao.rank();
		return rank;
	}

	//删除payoff
	public void deletepayoff(String id) throws ClassNotFoundException, SQLException {
		
		dao.deletepayoff(id);
	}
    //删除department
	public void deletedepartment(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		dao.deletedepartment(id);
	}
    //删除person
	public void deleteperson(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		dao.deletedeperson(id);
	}
    //删除project
	public void deleteProject(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		dao.deleteproject(id);
	}
	 
}
