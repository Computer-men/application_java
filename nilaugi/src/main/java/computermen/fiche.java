package computermen;

import javafx.fxml.FXML;
import java.io.IOException;

import javafx.scene.text.Text;

public class fiche {
    @FXML
    private Text metier;    
    @FXML
    private Text matricule;
    @FXML
    private Text nom;
    @FXML
    private Text prenom;

    @FXML // transition compta
    private void goCompta() throws IOException {
        App.setRoot("ComptaPanel");
    }

    @FXML // transition Utilisateur
    private void goUser() throws IOException {
        App.setRoot("UtilisateurPanel");
    }
    
    @FXML
    private void actualiser() throws IOException {
        matricule.setText(utilisateurconnect.getMatricule_du_connect());
        nom.setText(utilisateurconnect.getNom_du_connect());
        int Metier = Integer.parseInt(utilisateurconnect.getFonction_du_connect());
        if (Metier == 2) {
            metier.setText("Soignant");
        }
        else {
            metier.setText("Visiteur");
        }
    }

}
