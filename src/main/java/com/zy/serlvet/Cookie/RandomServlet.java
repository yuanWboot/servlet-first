package com.zy.serlvet.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/cookie/random")
public class RandomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //产生一个四位随机数
        Integer random = new Random().nextInt(10000);
        //创建Cookie
        Cookie cookie = new Cookie("random", String.valueOf(random));
        //为cookie设置有效时间一天
        cookie.setMaxAge(60*60*24);
        //向页面回应
        response.addCookie(cookie);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<h2>随机数为："+random+"</h2>");
    }
}
