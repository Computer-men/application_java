package computermen;

import java.io.IOException;
import javafx.fxml.FXML;
// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
// import javafx.scene.control.ChoiceBox;
// import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PanelCompta {



    //Declare le label name
    @FXML
    private Text name;

    //Declare le label matricule
    @FXML
    private Text matricule;




    //Lorsque on clique le bouton UtilisateurPanel
    @FXML
    private void goUser() throws IOException {
        App.setRoot("UtilisateurPanel");
    }


    
    //Lorsque on clique le bouton Deconnexion
    @FXML
    private void goConnexion() throws IOException {
        App.setRoot("ConnexionF");
        //System.out.println("test");

        //Remet ces variable à null afin d'enlever l'utilisateurconnect
        String nom=null;
        String password=null;
        String matri=null;
        String fonction=null;
        utilisateurconnect userconnect = new utilisateurconnect(nom, password, matri, fonction);
    }


    //Lorsque on clique le bouton Actualisation
    @FXML
    private void actualisation() throws IOException {
            //matricule.setText(Bdd.match(User.getText()));
            // name.setText);
            
            if(utilisateurconnect.getNom_du_connect() == null){
                name.setText("Vous n'êtes pas connecté !");
                matricule.setText(" ");
            } else {
                name.setText(utilisateurconnect.getNom_du_connect());
                matricule.setText(utilisateurconnect.getMatricule_du_connect());
            }
            
    }
    
}