package com.infirmiere.epsi;

import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnexionBDD {
	public static java.sql.Connection MySql() {
	
	java.sql.Connection conn = null;
  
    try {

    	String user = "root";
    	String password = "Douggy38";
        String DRIVER = "com.mysql.jdbc.Driver"; 
        String URL = "jdbc:mysql://localhost:3306/Infirmiere?verifyServerCertificate=false&useSSL=true";
        

        Class.forName(DRIVER).newInstance(); 
        conn = DriverManager.getConnection(URL,user, password);
    }
    catch (Exception e) {
        System.out.println(e);
    }
    
    return conn; 
	}
	
}
