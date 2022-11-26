
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class CreateServletUsingHttpServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        System.out.println("This is get method....in HTTPSERVLET");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.print("<h1>Servlet Created using HTTP SERVLET</h1>");
    }
    
}
