/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;


import java.sql.Connection; 
import java.sql.SQLException;
import java.sql.DriverManager;




public class ConnectionFactory {
	private String  drive = "com.mysql.jdbc.Driver";
    
    public Connection getConnection() {
        try {
        	System.setProperty("jdbc.Drivers", drive);
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/lava_jato","root","1234");
            
        }
        
        catch(SQLException excecao) {
            throw new RuntimeException(excecao); 
            
        }
    }
}