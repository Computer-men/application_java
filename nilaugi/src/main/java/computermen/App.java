package computermen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;



    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("ConnexionF"), 600, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        
    String dbURL = "jdbc:mysql://localhost:3306/projet";
    String username = "root";
    String password = "lucas123";
    boolean ok = true;

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
    
        launch();
    }

}