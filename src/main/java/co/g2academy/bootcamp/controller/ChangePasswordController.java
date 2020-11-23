/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controller;

import co.g2academy.bootcamp.dao.PersonDaoJdbc;
import co.g2academy.bootcamp.entity.Person;
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
@WebServlet(name = "ChangePasswordController", urlPatterns = {"/changePassword"})
public class ChangePasswordController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dispatchToView(request, response, "/view/change-password-view.jsp");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            
            Person personId1 = personDao.getById(15);
            
            if(personId1 != null){
                personId1.getId();
                personId1.getName();
                personId1.getPassword();
                 
                personId1.setName(request.getParameter("name"));
                personId1.setPassword(request.getParameter("password"));
                personId1.setId(15);
                personDao.update(personId1);
                dispatchToView(request, response, "/view/login-view.jsp");
            }else{
                dispatchToView(request, response, "/view/change-password-view.jsp");
            }
            
            

//            personDao.save(p);
            
            
//            Authenticator authenticator = new Authenticator();
//            
//            if(!authenticator.authenticate(p.getName(),p.getPassword())){
//                personDao.save(p);
//                dispatchToView(request, response, "/view/login-view.jsp");
//            }else{
//                dispatchToView(request, response, "/view/register-view.jsp");
//            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
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
