package myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet {
           public LifeServlet() {
			System.out.println("实例化对象");
		}
           @Override
        public void init() throws ServletException {
        	   System.out.println("初始化方法");
        }
           @Override
        protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
        	throws ServletException, IOException {
        	   System.out.println("请求和响应方法");
        }
           @Override
        public void destroy() {
        	   System.out.println("销毁方法");
        }
}
