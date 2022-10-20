package com.zy.serlvet.encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/encoding/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        System.out.println(keyword);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //利用UTF-8解析请求体中的请求参数
        request.setCharacterEncoding("UTF-8");
       //设置页面中的显示编码utf-8
        response.setContentType("text/html;charset=utf-8");
        String keyword = request.getParameter("keyword");
        System.out.println(keyword);
        response.getWriter().println(keyword);
    }
}
