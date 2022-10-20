package com.zy.serlvet.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletcontext/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        String  copyright =(String) servletContext.getAttribute("copyright");
        PrintWriter out = response.getWriter();
        out.println("导航栏");
        out.println("<hr/>");
        out.println("主题内容");
        out.println("<hr/>");
        out.println(copyright);

    }
}
