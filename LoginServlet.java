package myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		 String uname=req.getParameter("name");
		  String upass=req.getParameter("pass");
		  System.out.print(uname+"=="+upass);
		  if(uname==null||uname.equals("")){
		    	//作用范围是当前的请求
		    	 req.setAttribute("namenull", "用户名不能为空"); 
				  if(upass==null||upass.equals("")){
					  //作用范围是当前的请求
					  req.setAttribute("passnull", "密码不能为空");  
				  }
				  req.getRequestDispatcher("/adimit/login.jsp").forward(req, resp);  	
				return;
			  }else{
				  if(upass==null||upass.equals("")){
					  //作用范围是当前的请求
					  req.setAttribute("passnull", "密码不能为空"); 
					  req.getRequestDispatcher("/adimit/login.jsp").forward(req, resp);
					  return;
				  }
			  }
		  boolean flag=false;
		  if(uname.indexOf("tedu")>=0||uname.indexOf("达内")>=0){
			  flag=true;
		  }
		  if(flag){
			 req.getRequestDispatcher("/adimit/success.jsp").forward(req, resp);
		  }else{
			  req.getRequestDispatcher("/adimit/login.jsp").forward(req, resp);
		  }
	}
}
