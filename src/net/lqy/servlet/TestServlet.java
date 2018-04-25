package net.lqy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "TestServlet", urlPatterns = "/Test") //多了一个注解，帮助我们完成xml文件里配置的东西
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("部署成功接收到get请求！");
        //打印请求行
        System.out.println("请求方式：" + request.getMethod());
        System.out.println("URL：" + request.getRequestURI());
        System.out.println("发出请求客户端IP地址：" + request.getRemoteAddr());
        System.out.println("访问客户端的端口号：" + request.getRemotePort());
        System.out.println("服务点接收请求的IP地址：" + request.getLocalAddr());
        System.out.println("Web应用路径：" + request.getContextPath());
        System.out.println("Http协议和版本：" + request.getProtocol());
        //打印请求头
        final Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String element = headerNames.nextElement();
            System.out.println(element);
            System.out.println(request.getHeader(element));

            //获取请求参数
            String name = request.getParameter("name");
            String passWord = request.getParameter("passWord");
            System.out.println("用户名:" + name);
            System.out.println("密码:" + passWord);

        }
    }
}
