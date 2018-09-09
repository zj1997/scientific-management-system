package cn.zj.web.payoff;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zj.domain.Payoff;
import cn.zj.service.scientistService;


public class rankservlet extends HttpServlet {

	private scientistService service =new scientistService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    List<Payoff> pays;
		try {
			
			pays = service.rank();
			request.setAttribute("ranklist", pays);
			
			request.getRequestDispatcher("jsp/payoff/rank.jsp").forward(request,response);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
