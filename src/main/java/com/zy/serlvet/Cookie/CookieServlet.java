package com.zy.serlvet.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/show")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //获取Cookies
        Cookie[] cookies = request.getCookies();
        Integer random = -1;
        for (Cookie c:cookies){
            if (c.getName().equals("random")){
                random = Integer.parseInt(c.getValue());
            }
        }
        response.getWriter().println("从cookie获取的随机数为："+random);
    }


}
