package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	PrintWriter out=resp.getWriter();
    	 out.println("<html>");
	     out.println("<head>");
	     out.println("<title>我的servlet页面</title>");
	     out.println("</head>");
	     out.println("<body>");
	     out.println("<b>Hello</b><br>");
	     Date  now=new Date();
	     out.println("当前的服务器端时间是："+now.toLocaleString()+"<br>");
	     out.println("</body>");
	     out.println("</html>");
	      out.flush();
	      out.close();
    }
}
