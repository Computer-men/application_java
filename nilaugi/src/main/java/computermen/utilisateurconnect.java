package computermen;

public class utilisateurconnect {
    

    private static String nom_du_connect;
    private static String password_du_connect;
    private static String matricule_du_connect;
    private static String fonction_du_connect;


    public utilisateurconnect(String name, String password, String matricule, String fonction){
        nom_du_connect = name;
        password_du_connect = password;
        matricule_du_connect = matricule;
        fonction_du_connect = fonction;
    }
    
    public void afficherInfoDuConnectCompta() {
        System.out.println("///////// INFO UTILISATEUR CONNECTE \\\\\\\\\\");
        System.out.println( "nom: " + getNom_du_connect() );
        System.out.println( "matricule: " + getMatricule_du_connect() );
        System.out.println( "mot de passe: " + getPassword_du_connect());
        System.out.println("Fonction: " + getFonction_du_connect());
    } 

    /*public String getNom_du_connect(){
        return this.nom_du_connect;
    }*/

    public static String getNom_du_connect(){
        return nom_du_connect;
    }

    // public void setNom_du_connect(String nom_du_connect1){
    //     nom_du_connect = nom_du_connect1;
    // }

    public String getPassword_du_connect(){
        return password_du_connect;
    }

    public void setPassword_du_connect(String password_du_connect1){
        password_du_connect = password_du_connect1;
    }

    public static String getMatricule_du_connect(){
        return matricule_du_connect;
    }

    public void setMatricule_du_connect(String matricule_du_connect1){
        matricule_du_connect = matricule_du_connect1;
    }

    public static String getFonction_du_connect(){
        return fonction_du_connect;
    }

    public void setFonction_du_connect(String fonction_du_connect1){
        fonction_du_connect = fonction_du_connect1;
    }


}
