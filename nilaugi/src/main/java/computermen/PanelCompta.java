package computermen;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PanelCompta {

    //Declare le label name
    @FXML
    private Text name;

    //Declare le label matricule
    @FXML
    private Text matricule;


    //Lorsque on clique le bouton ConnexionF
    @FXML
    private void goConnexion() throws IOException {
        App.setRoot("ConnexionF");
    }

    //Lorsque on clique le bouton UtilisateurPanel
    @FXML
    private void goUser() throws IOException {
        App.setRoot("UtilisateurPanel");
    }

    //Lorsque on clique le bouton Actualisation
    @FXML
    private void actualisation() throws IOException {
            //matricule.setText(Bdd.match(User.getText()));
            // name.setText);
            name.setText("Erreur");
            matricule.setText("Erreur");
            
    }
    
}