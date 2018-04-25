package net.lqy.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

@WebServlet(name = "TimeServlet", urlPatterns = "/time")
public class TimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //记录cookie响应时间，并将其通过cookie加入到响应头中
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss");
        String time = dateFormat.format(date);
        Cookie cookie = new Cookie("time", time);
        //cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie); //将响应的时间发送给客户端浏览器
        String value = null;
        response.setContentType("text/html;charset=utf-8");
        //获取响应时间
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie1 : cookies) {
            String cookieName = cookie1.getName();
            if (cookieName.equals("time")) {
                value = cookie1.getValue();

            }
        }
        if (value == null) {
            response.getWriter().write("欢迎您访问本网站");
        } else {
            response.getWriter().write("您上次访问的时间是：" + value);
        }

    }
}
