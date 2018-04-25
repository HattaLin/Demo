package net.lqy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = "xiaoming";
        String passWord = "123456";
        //获取浏览器传递过来的参数
        String name = request.getParameter("name");
        String word = request.getParameter("passWord");
        System.out.println("name" + name);
        //将不同场景下的错误打出，通过JSP页面接收这个错误
        if (!name.equals(userName)) {
            //用户名不正确
            request.setAttribute("errorMessage", "账户不存在");
            request.getRequestDispatcher("/LoginError.jsp").forward(request, response);
        } else if (!word.equals(passWord)) {
            //密码不正确
            request.setAttribute("errorMessage", "密码错误");
            request.getRequestDispatcher("/LoginError.jsp").forward(request, response);
        }else{
            //设置状态码
            //response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY); //设置状态码为常量302
            //设置响应头地址
           // response.setHeader("Location","https://www.baidu.com");//重定向到新的网址
            //重定向方法二
            //response.sendRedirect("https://www.jd.com");
            response.sendRedirect("/hello/MyHtml.html");
        }


    }
}
