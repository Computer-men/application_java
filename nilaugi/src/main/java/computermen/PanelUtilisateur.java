package computermen;

import java.io.IOException;
import javafx.fxml.FXML;


public class PanelUtilisateur {


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
    private void afficheFraisJ() throws IOException {
        App.setRoot("FicheJanvier");
    }
    @FXML
    private void afficheFraisF() throws IOException {
        App.setRoot("FicheFévrier");
    }
    @FXML
    private void afficheFraisM() throws IOException {
        App.setRoot("FicheMars");
    }
    @FXML
    private void afficheFraisA() throws IOException {
        App.setRoot("FicheAvril");
    }
    @FXML
    private void afficheFraisMai() throws IOException {
        App.setRoot("FicheMai");
    }
    @FXML
    private void afficheFraisJuin() throws IOException {
        App.setRoot("FicheJuin");
    }
    @FXML
    private void afficheFraisJuil() throws IOException {
        App.setRoot("FicheJuillet");
    }
    @FXML
    private void afficheFraisAo() throws IOException {
        App.setRoot("FicheAout");
    }
    @FXML
    private void afficheFraisS() throws IOException {
        App.setRoot("FicheSeptembre");
    }
    @FXML
    private void afficheFraisO() throws IOException {
        App.setRoot("FicheOctobre");
    }
    @FXML
    private void afficheFraisN() throws IOException {
        App.setRoot("FicheNovembre");
    }
    @FXML
    private void afficheFraisD() throws IOException {
        App.setRoot("FicheDecembre");
    }

    @FXML
    private void createFiche() throws IOException {
        App.setRoot("Fiche_frais");
    }
        
    


    }

