package net.lqy.follow;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FollowServlet",urlPatterns = "/follow")
public class FollowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //关注的时候传一个参数follow为1，不关注的时候传参数为0
        //1.获取到这个参数
        String follow = request.getParameter("follow");
        //传过去之前需要将这个参数放到域中，由于是单个请求，用request域
        request.setAttribute("follow",follow);
        //2.将获取到的参数转发到jsp页面
        request.getRequestDispatcher("/jstl/jstl.jsp").forward(request,response);


    }
}
