package com.zy.serlvet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<h1 style='color:red'>hi,"+name+"!</h1></hr/>";
        System.out.println("返回给浏览器的响应内容为："+html);
        PrintWriter writer = resp.getWriter();
        writer.println(html);
    }
}
