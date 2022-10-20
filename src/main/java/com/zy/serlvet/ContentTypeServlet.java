package com.zy.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ct")
public class ContentTypeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String output = "<h1><a href='http://www.baidu.com'><span>百度</span></h1>";
        response.setContentType("text/html;charset=utf-8");
       // response.setContentType("text/xml;charset=utf-8");
      //  response.setContentType("text/plain;charset=utf-8");
       // response.setContentType("application/x-msdownload;charset=utf-8");
        response.getWriter().println(output);
    }
}
