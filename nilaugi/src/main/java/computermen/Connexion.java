package computermen;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class Connexion {

    ObservableList<String> amsdlist = FXCollections.observableArrayList("Soignant>","Client","Comptabilité");
    @FXML
    private ChoiceBox amsd;
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("ComptaPanel");
    }
    @FXML
    private void initialize() {
        amsd.setItems(amsdlist);
    }

}