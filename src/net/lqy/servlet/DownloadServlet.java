package net.lqy.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(name = "DownloadServlet", urlPatterns = "/download")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.getWriter(); //输出字节码文件
        //如何通知浏览器不要预览而是下载文件
        String FileName = request.getParameter("filename"); //获取浏览器传到服务器中需要下载的文件名
        //获取文件类型
        String mineType = this.getServletContext().getMimeType(FileName); //文件类型
        response.setContentType(mineType);
        response.setHeader("Content-Disposition","attachment;filename="+FileName);
        String RealPath = this.getServletContext().getRealPath("download/"+FileName); //拿到文件在项目中的绝对路径
        InputStream input = new FileInputStream(RealPath); //拿到一个输入流，读取文件,参数为文件地址
        ServletOutputStream outputStream = response.getOutputStream();//输出二进制文件，输出图片，MP3文件

        //将输入流的东西写进输出流
        //文件拷贝
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = input.read(buffer)) > 0) {
            outputStream.write(buffer, 0, len);
        }
        input.close();
    }
}
