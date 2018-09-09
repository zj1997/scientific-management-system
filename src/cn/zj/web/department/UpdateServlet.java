package cn.zj.web.department;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.zj.dao.department.departmentDao;
import cn.zj.domain.Department;


public class UpdateServlet extends HttpServlet implements Servlet {

	departmentDao dao=new departmentDao();
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method=request.getParameter("method");
		
		if("getbyid".equals(method)) {
			
			try {
				getp(request,response);
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("update".equals(method)) {
			
			try {
				update(request,response);
			} catch (IllegalAccessException | InvocationTargetException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("mohu".equals(method)) {
			
			try {
				querybyname(request,response);
			} catch (IllegalAccessException | InvocationTargetException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

    public void getp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException, SQLException {
		
		String id =request.getParameter("id");
		
		 int pid = Integer.parseInt(id);
		
		 System.out.println(pid+1);
		 
		  Department d = dao.findbyId(pid);

		  System.out.println(d);
		   
		request.setAttribute("d", d);
    	
		request.getRequestDispatcher("/jsp/department/update.jsp").forward(request, response);
	}
	
    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalAccessException, InvocationTargetException, SQLException {
		
    	Department d =new Department();
    	
    	
    	BeanUtils.populate(d, request.getParameterMap());
    	
    	dao.updatebyId(d);
    	
    	request.getRequestDispatcher("/getDepartmentServlet").forward(request, response);
	}
    
    
   public void querybyname(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalAccessException, InvocationTargetException, SQLException {
		
    	Department d =new Department();
    	
    	String dname =request.getParameter("pname");
    
    	List<Department> ds = dao.querybyname(dname);
    	
    	request.setAttribute("list", ds);
    	
    	
    	request.getRequestDispatcher("/jsp/department/list.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
