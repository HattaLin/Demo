package net.lqy.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "addCarServlet",urlPatterns = "/addcar")
public class addCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取商品信息
        String name = request.getParameter("name");
        //保存商品信息到session中
        HttpSession session = request.getSession();
        //创建list集合，将之前的商品存到list中

        List list = (List) session.getAttribute("list");
        //当第一次访问时list不存在，需要创建一个
        if(list==null){
                list = new ArrayList();
        }
        list.add(name);
        //最后将list放到session中
        session.setAttribute("list",list);
        //对session做持久化操作
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(60*60*24);
        cookie.setPath("/hello");
        response.addCookie(cookie);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(list+"加入购物车成功");
        for (Object o : list) {

            System.out.println(1);
        }

    }
}
