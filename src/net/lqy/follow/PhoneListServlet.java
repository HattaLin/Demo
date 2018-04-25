package net.lqy.follow;
import net.lqy.bean.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PhoneListServlet",urlPatterns = "/phonelist")
public class PhoneListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过servlet从数据库中获取数据，这里暂时通过手动创建数据
        Phone phone = new Phone();
        phone.setName("iPhone");
        phone.setId(001);
        phone.setPrice("99999");
        phone.setImage("images/1.jpg");
        Phone phone2 = new Phone();
        phone2.setName("huwei");
        phone2.setId(002);
        phone2.setPrice("55555");
        phone2.setImage("images/2.jpg");
        Phone phone3 = new Phone();
        phone3.setName("htc");
        phone3.setId(003);
        phone3.setPrice("8888888");
        phone3.setImage("images/3.jpg");
        Phone phone4 = new Phone();
        phone4.setName("honor");
        phone4.setId(004);
        phone4.setPrice("6666666");
        phone4.setImage("images/4.jpg");
        Phone phone5 = new Phone();
        phone5.setName("coolpad");
        phone5.setId(005);
        phone5.setPrice("55553");
        phone5.setImage("images/5.jpg");
        Phone phone6 = new Phone();
        phone6.setName("ipad");
        phone6.setId(006);
        phone6.setPrice("6666666");
        phone6.setImage("images/6.jpg");
        List<Phone> list = new ArrayList<>();
        list.add(phone);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add(phone5);
        list.add(phone6);
        //将数据存放在request域中
        request.setAttribute("list",list);
        //将数据转发给JSP界面
        request.getRequestDispatcher("/jstl/phonelist.jsp").forward(request,response);
        for (Phone phone1 : list) {
            System.out.println("hash"+phone1.getName());
        }
    }
}
