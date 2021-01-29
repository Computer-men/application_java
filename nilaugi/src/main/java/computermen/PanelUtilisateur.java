package computermen;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class PanelUtilisateur {
    // Instanciation des objets
    @FXML
    private ListView Frais;
    @FXML
    private TextArea affFrais;

    // Fonctions
    @FXML
    private void goCompta() throws IOException {
        App.setRoot("ComptaPanel");
    }

    @FXML
    private void goConnexion() throws IOException {
        App.setRoot("ConnexionF");
    }

    @FXML
    private void afficherFrais() {
        String ficheFrais = "";
        ObservableList listOfItems = Frais.getSelectionModel().getSelectedItems();
        for (Object item : listOfItems)
        {
            ficheFrais += String.format("%s%n", (String) item);
        }
        this.affFrais.setText(ficheFrais);
    }
    // Mise à jour des détails
    @FXML
    private void initialize() {
        // Objets de la liste
        Frais.getItems().addAll("29/01/2021", "28/01/2021");
        // Affichage dans la zone de texte

    }
    
}
