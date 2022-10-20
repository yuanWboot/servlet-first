package com.zy.serlvet.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletcontext/init")
public class ServletContextInitServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("copyright","Copyright© 2022 imooc.com  京ICP备 12003892号-11 京公网安备11010802030151号 营业执照");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("ServletContext已经初始化");
    }
}
