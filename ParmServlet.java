package myservlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParmServlet extends HttpServlet {
	String filePath=null;
	String encoding=null;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context=this.getServletContext();
		filePath=context.getInitParameter("filePath");
		System.out.println(filePath);
		
		ServletConfig config=this.getServletConfig();
		encoding=config.getInitParameter("encoding");
		System.out.println(encoding);
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().write(filePath+"\n");
		resp.getWriter().print(encoding);
	}
}
