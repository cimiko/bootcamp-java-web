/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.model;

import co.g2academy.bootcamp.dao.PersonDaoJdbc;
import co.g2academy.bootcamp.entity.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cimiko
 */
public class Authenticator {
    
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static Connection connection;
    public static Connection getConnection(){
        if(connection == null){
            try{
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/javabootcamp",
                        "root", "test1234");
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return connection;
    }
    
    public Boolean authenticate(String userName, String password){
        PersonDaoJdbc personDao = new PersonDaoJdbc();
        
        try{
            personDao.setConnection(getConnection());
            Person person = personDao.getByUserName(userName);
            return person != null
                    && userName.equalsIgnoreCase(person.getName())
                    && password.equalsIgnoreCase(person.getPassword());
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
        return "cimiko".equalsIgnoreCase(userName)
            && "pwd123".equals(password);

    }
    
    public Boolean registAuth(String userName){
        PersonDaoJdbc personDao = new PersonDaoJdbc();
        
        try{
            personDao.setConnection(getConnection());
            Person person = personDao.getByUserName(userName);
            return userName.equalsIgnoreCase(person.getName()) 
                    || person == null;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return "cimiko".equalsIgnoreCase(userName);
    }
    
}
