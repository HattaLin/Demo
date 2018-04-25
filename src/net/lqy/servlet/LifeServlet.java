package net.lqy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LifeServlet",urlPatterns = "/Life")
public class LifeServlet extends HttpServlet {
    @Override
    public void init( ) throws ServletException {
        System.out.println("初始化init");
        super.init();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service方法被执行了");
        super.service(req,res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doget方法被执行了");
    }
    @Override
    public void destroy() {
        System.out.println("destory方法被执行了");
        super.destroy();
    }
}
