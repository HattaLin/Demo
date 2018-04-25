package net.lqy.servlet;

import org.omg.CORBA.portable.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;


@WebServlet(name = "ServletTest4", urlPatterns = "/Test4")
public class ServletTest4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        java.io.InputStream resouseStream = this.getServletContext().getResourceAsStream("/db.properties");
        Properties properties = new Properties();
        properties.load(resouseStream); //把我们的输入流存进去
        String name = properties.getProperty("name");
        String password = properties.getProperty("passWord");
        String url = properties.getProperty("url");
        System.out.println(name);
        System.out.println(password);
        System.out.println(url);
    }
}
