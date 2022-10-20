package com.zy.serlvet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session/random")
public class RandomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //生成随机数4位
        Integer random = new Random().nextInt(10000);
        //创建session对象
        HttpSession session = request.getSession();
        //设置session属性
        session.setAttribute("random",random);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("生成随机数为："+random);
    }
}
