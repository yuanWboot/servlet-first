package com.zy.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ua")
public class UserAgentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String ua = request.getHeader("User-Agent");
        if (ua == null){
            response.getWriter().println("User-Agent不存在！");
            return;
        }
        String output = "";
        if (ua.toLowerCase().indexOf("windows nt") != -1) {
            output = "<h1>这是PC端</h1>";
        } else if (ua.toLowerCase().indexOf("iphone") != -1 || ua.toLowerCase().indexOf("iphone") != -1) {
            output = "<h1>这是移动端</h1>";
        }
        response.getWriter().println(output);
    }
}
