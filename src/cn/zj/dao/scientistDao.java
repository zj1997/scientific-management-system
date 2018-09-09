package cn.zj.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cn.zj.JDBCUtils.JDBCUtils;
import cn.zj.dao.department.departmentDao;
import cn.zj.dao.login.loginDao;
import cn.zj.dao.payoff.payoffDao;
import cn.zj.dao.person.personDao;
import cn.zj.dao.project.projectDao;
import cn.zj.dao.rank.payoffrank;
import cn.zj.dao.update.UpdatePassword;
import cn.zj.domain.Admin;
import cn.zj.domain.Department;
import cn.zj.domain.Payoff;
import cn.zj.domain.Person;
import cn.zj.domain.Project;

public class scientistDao {

	private projectDao pd=new projectDao();
	private departmentDao de=new departmentDao();
	private payoffDao pay=new payoffDao();
	private personDao person=new personDao();
	private loginDao login=new loginDao();
	private UpdatePassword update=new UpdatePassword();
	private payoffrank prank=new payoffrank();
	//项目
	public void addproject(Project p) throws ClassNotFoundException, SQLException {
	      pd.insertperson(p);
	}
	
	public List<Project> getproject() throws ClassNotFoundException, SQLException {
		
	      return pd.selectperson();
	}
	
	//部门
	public void adddepartment(Department d) throws ClassNotFoundException, SQLException {
	      de.insertdepartment(d);
	}
	
	public List<Department> getdepartment() throws ClassNotFoundException, SQLException {
		
	      return de.selectdepartment();
	}
    
	//科研成果
	public void addpayoff(Payoff p) throws ClassNotFoundException, SQLException {
	      pay.insertpayoff(p);
	}
	
	public List<Payoff> getpayoff() throws ClassNotFoundException, SQLException {
		
	      return pay.selectpayoff();
	}
	
	//人员
	public void addperson(Person p) throws ClassNotFoundException, SQLException {
	      person.insertperson(p);
	}
	
	public List<Person> getperson() throws ClassNotFoundException, SQLException {
		
	      return person.selectperson();
	}

	public Admin login(Integer account) throws ClassNotFoundException, SQLException {
		Admin a = login.selectlogin(account);
		
		return a;
	}

	//修改密码
	public void updatepassword(String p) throws ClassNotFoundException, SQLException {
		
		update.updatepassword(p);
	}

	//项目排名
	public List<Payoff> rank() throws ClassNotFoundException, SQLException {
		
		List<Payoff> p = prank.selectperrankpayoff();
		
		return p;
	}

	//删除payoff
	public void deletepayoff(String id) throws ClassNotFoundException, SQLException {
		pay.delete(id);
		
	}
   //删除department
	public void deletedepartment(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		de.delete(id);
	}
    //删除person
	public void deletedeperson(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		person.delete(id);
	}
    //删除project
	public void deleteproject(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		pd.delete(id);
	}
}