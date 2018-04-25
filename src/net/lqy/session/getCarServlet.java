package net.lqy.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;


@WebServlet(name = "getCarServlet", urlPatterns = "/getcar")
public class getCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(1);
        List<String> list = (List<String>) session.getAttribute("list");
        System.out.println(2);
        response.setContentType("text/html;charset=utf-8");
        System.out.println(2.5);
       //遍历集合
        for (String s : list) {
            System.out.println(3);
            response.getWriter().write(s+"<br/>");
            
        }
    }
}
