package net.lqy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
       ServletConfig servletConfig = this.getServletConfig();
       String config = servletConfig.getInitParameter("encoding");
        System.out.println("encoding"+config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收get请求！");
        //获取请求参数
        String name = req.getParameter("name");
        String passWord = req.getParameter("passWord");
        System.out.println("用户名:"+name);
        System.out.println("密码:"+passWord);

        //返回网页信息，是否登陆成功，需要使用Respons对象
        String result = "恭喜您登陆成功";
        //ServletOutputStream outputStream = resp.getOutputStream();
        //outputStream.write(result.getBytes());
        resp.setContentType("text/html;charset=utf-8");
         PrintWriter writer = resp.getWriter();
         writer.write(result);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收post请求！");
    }
}
