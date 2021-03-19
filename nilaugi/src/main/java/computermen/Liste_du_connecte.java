package computermen;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.List;

public class Liste_du_connecte {
    
    private String nom_du_connect;
    private String password_du_connect;
    private String matricule_du_connect;


    public Liste_du_connecte(String name, String password, String matricule){
        this.nom_du_connect = name;
        this.password_du_connect = password;
        this.matricule_du_connect = matricule;
    }

    
    public void afficherInfoDuConnectCompta() {
        System.out.println("///////// INFO UTILISATEUR CONNECTE \\\\\\\\\\");
        System.out.println( "nom: " + getNom_du_connect() );
        System.out.println( "matricule: " + getMatricule_du_connect() );
        System.out.println( "mot de passe: " + getPassword_du_connect());

    } 

    public String getNom_du_connect(){
        return this.nom_du_connect;
    }

    public void setNom_du_connect(String nom_du_connect){
        this.nom_du_connect = nom_du_connect;
    }

    public String getPassword_du_connect(){
        return this.password_du_connect;
    }

    public void setPassword_du_connect(String password_du_connect){
        this.password_du_connect = password_du_connect;
    }

    public String getMatricule_du_connect(){
        return this.matricule_du_connect;
    }

    public void setMatricule_du_connect(String matricule_du_connect){
        this.matricule_du_connect = matricule_du_connect;
    }

}
