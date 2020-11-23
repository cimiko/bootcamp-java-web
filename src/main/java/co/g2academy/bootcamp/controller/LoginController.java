/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controller;

import co.g2academy.bootcamp.model.Authenticator;
import co.g2academy.bootcamp.model.LoginModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;

/**
 *
 * @author cimiko
 */
@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        //1. show login page
        //2. no logic at all
        dispatchToView(request, response, "/view/login-view.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. maping antara model dengan request parameter
        LoginModel login = new LoginModel();
        login.setUserName(request.getParameter("userName"));
        login.setPassword(request.getParameter("password"));
        
        //2. Authenticate
        Authenticator authenticator = new Authenticator();
        if(authenticator.authenticate(login.getUserName(), login.getPassword())){
            //3. send userName to JSP
            request.setAttribute("userName", login.getUserName());
            //4. show login-success-view.jsp
            dispatchToView(request, response, "/view/login-success-view.jsp");
        } else {
            //5. show login-error-view if authentication process failed
            dispatchToView(request, response, "/view/login-error-view.jsp");
        }
    }


    public void dispatchToView(HttpServletRequest request,
            HttpServletResponse response,
            String jspView) throws ServletException, IOException{
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher(jspView);
        dispatcher.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
