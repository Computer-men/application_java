package computermen;

import java.io.IOException;
import javafx.fxml.FXML;

public class PanelUtilisateur {

    @FXML
    private void goCompta() throws IOException {
        App.setRoot("ComptaPanel");
    }
    @FXML
    private void goConnexion() throws IOException {
        App.setRoot("ConnexionF");
    }
    
}
