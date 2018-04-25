    package net.lqy.session;

    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.*;
    import java.io.IOException;

    @WebServlet(name = "SaveSessionServlet",urlPatterns = "/save")
    public class SaveSessionServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //存储session
            HttpSession session = request.getSession();
            //创建一个cookie覆盖服务器之前自动生成的Jsessionid
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            //设置持久化时间
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
            session.setAttribute("goods","cup");

        }
    }
