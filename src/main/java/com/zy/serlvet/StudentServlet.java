package com.zy.serlvet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String sex = request.getParameter("sex");
        String[] hobbies = request.getParameterValues("hobbies");
        PrintWriter out = response.getWriter();
        out.println("<h1>name:"+name+"</h1>");
        out.println("<h1>mobile:"+mobile+"</h1>");
        out.println("<h1>sex:"+sex+"</h1>");
        for (String h:hobbies) {
            out.println("<h1>hobbie:"+h+"</h1>");
        }
    }
}
