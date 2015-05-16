/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import factory.ConnectionFactory;


public class testconnection {
	@Test
    public void testarConexao() throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Coneccao aberta!");
			connection.close();
    }
}
