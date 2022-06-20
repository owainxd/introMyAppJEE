/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author al-am
 */
public class DataManager {
    
   // protected static final String DRIVER_NAME =  "com.mysql.jdbc.Driver";
   protected static final String DRIVER_NAME =  "com.mysql.cj.jdbc.Driver";
   protected static final String DB_NAME = "myapp_2022";
   protected static final String URL = "jdbc:mysql://localhost/" + DB_NAME;
   protected static final String USER = "root";
   protected static final String PASSWORD = ""; 
   
   
   static {
       
       try{
           Class.forName(DRIVER_NAME).newInstance();  
       }catch(Exception e){
           System.out.println(" driver connection failed" + e.getMessage());
       }       
   }
   
   public static Connection getConnection() throws Exception{
              
                return DriverManager.getConnection(URL, USER, PASSWORD);
   }   
}
