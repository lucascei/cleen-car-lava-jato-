
package lavajato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Lava_Jato3 {
    public static void main(String[] args){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
            
            Statement stnt = (Statement) con.createStatement();
            
            String name = "lucas";
            int telefone = 91508691;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
