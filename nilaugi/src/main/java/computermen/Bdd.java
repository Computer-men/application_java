package computermen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Bdd {
final static  String dbURL = "jdbc:mysql://localhost:3306/projet";
final static String username = "root";
final static String password = "lucas123";

public static void conn(){
    
    

    try {

        Connection conn = DriverManager.getConnection(dbURL, username, password);
        if (conn != null) {
            System.out.println("Connected");
            String sql = "SELECT * FROM projet.authentification;";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            // statement.setString(1, "4");
            while (result.next()) {
                String us_nom = result.getString(2);
                String us_prenom = result.getString(3);
                String us_profession = result.getString(4);
                String output = "User #%d: %s-%s-%s";
                System.out.println(String.format(output, ++count, us_nom, us_prenom, us_profession));
            }
            
        }
    
    }
    catch (

        SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erreur Connected");
        }
}
}