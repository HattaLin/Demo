package net.lqy.servlet;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "VerifyCodeServlet",urlPatterns = "/code")
public class VerifyCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置图片的宽和高,第三个参数为图片类型
        int width = 100;
        int height = 30;
        //随机生成字符串，提供字符串字符集
        String data = "abcdefghigklmnpqrstuvwxyz123456789";
        Random ran = new Random();
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //更换验证码颜色
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.gray);
        graphics.fillRect(0,0,width,height);
        //在验证码上画四个字符
        graphics.setColor(Color.black);
        for (int i=0;i<4;i++){
            int position = ran.nextInt(data.length());
          String random =  data.substring(position,position+1);
            graphics.drawString(random,width/5*(i+1),15);
        }
        //将验证码图片输出给浏览器
        ImageIO.write(image,"jpg",response.getOutputStream());



    }
}
