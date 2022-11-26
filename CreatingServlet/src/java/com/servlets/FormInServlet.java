package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
 import javax.servlet.*;
import javax.servlet.http.*;
public class FormInServlet extends HttpServlet{

    @Override
        public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();
            out.println("<h2>Welcome</h2>");
            String username=req.getParameter("user_name");
            String email=req.getParameter("user_email");
            String password=req.getParameter("user_password");
            String gender=req.getParameter("user_gender");
            String courses=req.getParameter("user_courses");
            String condition=req.getParameter("condition");
            if(condition!=null){
                out.println("<h2> Name:- "+username+"</h2>");
                out.println("<h2> Password:- "+password+"</h2>");
                out.println("<h2> Email:- "+email+"</h2>");
                out.println("<h2> Course:- "+courses+"</h2>");
                out.println("<h2> Gender:- "+gender+"</h2>");
            }
            else{
                out.println("<h2>You have not agreed to the terms and conditions</h2>");
            }
        }
    
    
}
