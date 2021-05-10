package computermen;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Connexion {

    ObservableList<String> amsdlist = FXCollections.observableArrayList("Client", "Comptabilité");

    @FXML
    private TextField User;

    @FXML
    private Text renduBDD;

    @FXML
    private Text matricule;

    @FXML
    private ChoiceBox amsd;



    @FXML // transition compta
    private void goCompta() throws IOException {
        App.setRoot("ComptaPanel");
    }

    @FXML // transition Utilisateur
    private void goUser() throws IOException {
        App.setRoot("UtilisateurPanel");
    }

    @FXML // affichage des infos BDD
    private void match() throws IOException {
        if ((User.getText() != null)) {
            
            renduBDD.setText(Bdd.match(User.getText()));


        }
    }

    @FXML
    private void initialize() {
        amsd.setItems(amsdlist);
    }
    
}