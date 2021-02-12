package computermen;

import java.io.IOException;
import javafx.fxml.FXML;

public class PanelCompta {

    @FXML
    private void goConnexion() throws IOException {
        App.setRoot("ConnexionF");
    }
    @FXML
    private void goUser() throws IOException {
        App.setRoot("UtilisateurPanel");
    }
}