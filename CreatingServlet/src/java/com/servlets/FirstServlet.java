/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Asus
 */
public class FirstServlet implements Servlet {

    //Life Cycle Methods
    ServletConfig conf;
  
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println(".....creating object");
    }
    
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
        System.out.println("Service Method Implemented");
        //set the content type of response
        resp.setContentType("text/html");
        //to print an data either on console or on file in form of text
        PrintWriter out=resp.getWriter();
        out.println("<h1>This is to check Servlet is running</h1>");
    }
 
    public void destroy(){
        System.out.println("Destroying Servlet");
    }
    //Non Life Cycle Methods
    
    public ServletConfig getServletConfig(){
        return this.conf;
    }
   
    public String getServletInfo(){
        return "This method is used to get Servlet Information";
    }
}
