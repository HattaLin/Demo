package net.lqy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RefreshServlet",urlPatterns = "/refresh")
public class RefreshServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String message = "<meta http-equiv='refresh' content='3;url=/hello/MyHtml.html' '>三秒号自动跳转到首页，如果没有跳转请点击<a href='/hello/login.html'>跳转链接";
         request.setAttribute("message",message);//传一个参数到JSP页面。一般在JSP页面实现网页的跳转


        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    private void refreshDemo(HttpServletResponse response) throws IOException {
        response.setHeader("refresh","3;url='/hello/MyHtml.html'"); //三秒后刷新界面,url是刷新之后跳转的地址,为重定向，也可不传，不传的话只做刷新操作
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("三秒后刷新页面");
    }
}
