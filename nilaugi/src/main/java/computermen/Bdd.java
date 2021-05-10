package computermen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




// import javafx.scene.control.TextField;

public class Bdd {
    final static String dbURL = "jdbc:mysql://localhost:3306/projet";
    final static String username = "root";
    final static String password = "toor";
    // private TextField user = new TextField();

    public static void conn() {

        try {

            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
                String sql = "SELECT us_identifiant , us_pasword FROM projet.user;";
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

    public static String match(String nom, String Password) {
        try {

            Connection conn2 = DriverManager.getConnection(dbURL, username, password);
            if (conn2 != null) {
                String sql2 = ("SELECT us_identifiant, us_pasword, id_matricule, fk_profession FROM projet.user WHERE us_identifiant='" + nom + "'AND us_pasword='"+ Password + "'");
                PreparedStatement statement = conn2.prepareStatement(sql2);
                ResultSet result = statement.executeQuery(sql2);

                while (result.next()) {
                    String NomUser = result.getString(1);
                    String password_user = result.getString(2);
                    String Matri = result.getString(3);
                    String Fonction = result.getString(4);

                    String test = "Connexion reussie !";

                    utilisateurconnect userconnect = new utilisateurconnect(NomUser, password_user, Matri, Fonction);
                    userconnect.afficherInfoDuConnectCompta();

                    // Liste_du_connecte password_du_connecte = personne_connecte.get(1);
                    // System.out.print(nom_du_connect_variable.getNom_du_connect());

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