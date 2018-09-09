package cn.zj.web.updateadmin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zj.service.scientistService;

public class updateadmin extends HttpServlet {

	private scientistService service =new scientistService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String p1 = request.getParameter("password1");
	    String p2 = request.getParameter("password2");
	    
	    if(p1.equals(p2))
	    {
	    	//修改数据库密码
	    	try {
				service.updatepassword(p1);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	    	
	    	//重定向到主页面
	    	
	    	request.getRequestDispatcher("index.jsp").forward(request, response);
	    	
	    	
	    }else{
	    	//反馈密码两次输入不一致
	    	
	    	request.setAttribute("error","两次输入密码不一致，请从新更正后再输入！！！");
	    	request.getRequestDispatcher("jsp/updatepassword.jsp").forward(request, response);
	    }
	    
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
