package computermen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javafx.scene.control.TextField;

public class Bdd {
    final static String dbURL = "jdbc:mysql://localhost:3306/ap2_gsb";
    final static String username = "root";
    final static String password = "Sanolo059410";
    private TextField user = new TextField();

    public static void conn() {

        try {

            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
                String sql = "SELECT ag_nom , ag_password FROM ap2_gsb.agents;";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery(sql);
                int count = 0;
                // statement.setString(1, "4");

                while (result.next()) {
                    String nom = result.getString(1);
                    String password = result.getString(2);
                    String output = "User #%d: %s-%s";
                    System.out.println(String.format(output, ++count, nom, password));
                    System.out.println();
                }

            }

        } catch (

        SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erreur Connected");
        }
    }

    public static String match(String nom) {
        try {

            Connection conn2 = DriverManager.getConnection(dbURL, username, password);
            if (conn2 != null) {
                String sql2 = ("SELECT ag_nom , ag_password FROM ap2_gsb.agents WHERE ag_nom='" + nom + "'");
                PreparedStatement statement = conn2.prepareStatement(sql2);
                ResultSet result = statement.executeQuery(sql2);

                while (result.next()) {
                    nom = result.getString(1);
                    String password = result.getString(2);
                    return nom;
                    // System.out.println(nom);
                    // System.out.println(password);
                }
                String error = "c'est une erreur";
                return error;
            }
            String error = "c'est une erreur";
            return error;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erreur Connected");
        }
        return nom;

    }
}