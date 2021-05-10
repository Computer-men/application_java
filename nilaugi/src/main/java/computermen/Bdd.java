package computermen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import javafx.scene.control.TextField;

public class Bdd {
    final static String dbURL = "jdbc:mysql://localhost:3306/projet_java";
    final static String username = "root";
    final static String password = "root";
    private TextField user = new TextField();

    public static void conn() {

        try {

            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
                String sql = "SELECT ag_nom , ag_password FROM projet_java.agents;";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery(sql);
                int count = 0;
                // statement.setString(1, "4");

                while (result.next()) {
                    String nom = result.getString(1);
                    String password = result.getString(2);
                    String output = "User #%d: %S-%s";
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
                String sql2 = ("SELECT ag_nom , ag_password, ag_matricule FROM projet_java.agents WHERE ag_nom='" + nom + "'");
                PreparedStatement statement = conn2.prepareStatement(sql2);
                ResultSet result = statement.executeQuery(sql2);

                while (result.next()) {
                    nom = result.getString(1);
                    String password = result.getString(2);
                    String matri = result.getString(3);

                    String test = "Connection reussi !";

                    utilisateurconnect userconnect = new utilisateurconnect(nom, password, matri);
                    userconnect.afficherInfoDuConnectCompta();


                    //Liste_du_connecte password_du_connecte = personne_connecte.get(1);
                    //System.out.print(nom_du_connect_variable.getNom_du_connect());


                    return test;
                    // System.out.println(nom);
                    // System.out.println(password);
                }
                String error = "User ou mdp incorrect !";
                return error;
            }
            String error = "User ou mdp incorrect !";
            return error;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erreur Connected");
        }
        return nom;
    }


}