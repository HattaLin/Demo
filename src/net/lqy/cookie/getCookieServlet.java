package net.lqy.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getCookieServlet", urlPatterns = "/getCookie")
public class getCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Cookie信息
        Cookie[] cookies = request.getCookies();
        //拿到cookie数组，需要遍历这个cookie，取到想要的值
        for (Cookie cookie : cookies) {
            //取出Cookie的名字，
            String cookieName = cookie.getName();
            if (cookieName.equals("userName")) {
                //拿到cookie的name，再获取cookie的值
                String value = cookie.getValue();
                //输出到浏览器
                response.getWriter().write("userName" + value);
            }
        }
    }
}
