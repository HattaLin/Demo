package net.lqy.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieServlet",urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //要发送一个Cookie，首先得创建一个Cookie对象
        Cookie cookie = new Cookie("goods","cup"); //不能携带中文
        Cookie cookie1 = new Cookie("userName","Chiara");
        //设置cookie存放时间
       // cookie.setMaxAge(0);
        //设置某个特定的请求需要携带cookie信息,传的是servlet的映射
        cookie.setPath("/hello/getCookie");
        //将创建好的cookie放到response响应头中，向客户端发送
        response.addCookie(cookie);
        response.addCookie(cookie1);

    }
}
