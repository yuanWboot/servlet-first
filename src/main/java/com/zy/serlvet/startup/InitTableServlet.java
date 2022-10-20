package com.zy.serlvet.startup;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Enumeration;

public class InitTableServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
       String database = config.getInitParameter("database");
        System.out.println("正在向"+database+"创建数据表......");
    }
}
