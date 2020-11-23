/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controller;

import co.g2academy.bootcamp.dao.PersonDaoJdbc;
import co.g2academy.bootcamp.entity.Person;
import co.g2academy.bootcamp.model.Authenticator;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cimiko
 */
@WebServlet(name = "RegisterController", urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dispatchToView(request, response, "/view/register-view.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Person p = new Person();
        p.setName(request.getParameter("name"));
        p.setPassword(request.getParameter("password"));
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create database connection
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/javabootcamp",
                            "root", "test1234");

            //how to use DAO
            PersonDaoJdbc personDao = new PersonDaoJdbc();
            personDao.setConnection(connection);
            //insert person data
            p.setName(p.getName());
            p.setPassword(p.getPassword());
//            personDao.save(p);
//            dispatchToView(request, response, "/view/login-view.jsp");
            
            Authenticator authenticator = new Authenticator();
//            if(!authenticator.registAuth(p.getName())){
//                personDao.save(p);
//                dispatchToView(request, response, "/view/login-view.jsp");
//            }else{
//                dispatchToView(request, response, "/view/register-view.jsp");
//            }
            
            if(!authenticator.authenticate(p.getName(),p.getPassword())){
                personDao.save(p);
                dispatchToView(request, response, "/view/login-view.jsp");
            }else{
                dispatchToView(request, response, "/view/register-view.jsp");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
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
