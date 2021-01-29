package fr.dampierre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;



public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The 1arguments of the program.
     */
    public static void main(String[] args) {



        String dbURL = "jdbc:mysql://localhost:3306/1_pc_market";
        String username = "root";
        String password = "root";
         
        try {
         
            Connection conn = DriverManager.getConnection(dbURL, username, password);
         
            if (conn != null) {
                System.out.println("Connected !");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connect");
        }




        Scanner sc = new Scanner(System.in);
        int typeMenu = 0;
        boolean quitteApplication = true;





    

        //quitter la totalité du logiciel
        do{


            if (typeMenu == 0)
            {
                //do {
                    
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 0 = menu principal
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Bienvenue, veuillez selectionnez votre type de compte:");
                        System.out.println("1 - Visiteur");
                        System.out.println("2 - comptable");
                        System.out.println("3 - Visiteur medical");
                        System.out.println("4 - Pour quitter");
                        int type_compte = sc.nextInt();
                        if (type_compte == 1)
                        {
                            typeMenu = 1;
                        }
                        if (type_compte == 2) {
                            typeMenu = 2;
                        }
                        if (type_compte == 3) {
                            typeMenu = 3;
                        }
                        if (type_compte == 4) {
                            System.out.println("Etes-vous sur de quitter ?");
                            System.out.println("1 - Oui");
                            System.out.println("2- Non");
                            int marche = sc.nextInt();
                            if (marche == 1) {
                                quitteApplication = false;
                            }
                            if (marche == 2){
                                //Mettre une methode vers le menu principal
                            }
                        }
                        if (type_compte == 0) {
                            System.out.println("Erreur, veuillez re-essayer !");
                        }
                        if (type_compte > 4) {
                            System.out.println("Erreur, veuillez re-essayer !");
                        }


                        
                    //} while (quitteApplication);
                }

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 1 = menu du visiteur
                if (typeMenu == 1) {
                    String username_visiteur = "test";
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Vous etes sur le menu visiteur");
                    System.out.println("\n");
                    System.out.println("Veuillez indiquer votre nom d'utilisateur");
                    System.out.println("\n");
                    System.out.println("Taper 'quitte'pour quitter");
                    String username1 = sc.next();
                    String quitte = "quitte";
                    if(username1.equals(quitte)){
                        System.out.println("Test!");
                        typeMenu=0;
                    }

                    if (username1.equals(username_visiteur)){ //if (Variable1.equals(variable2)) on utilisse .equals pour faire le test d'égalite pour les string
                        // connection réussite !
                        typeMenu = 4; // direction vers le menu 5 (menu fonction visiteur )
                    }else
                    {
                        System.out.println("L'utilisateur n'existe pas dans la BDD !");
                    }
                }

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 2 = menu du comptable
                if (typeMenu == 2) {
                    String username_comptable = "test";
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Vous etes sur le menu Comptabme");
                    System.out.println("\n");
                    System.out.println("Veuillez indiquer votre nom d'utilisateur");
                    System.out.println("\n");
                    System.out.println("Taper 'quitte'pour quitter");
                    String username1 = sc.next();
                    String quitte = "quitte";
                    if(username1.equals(quitte)){
                        System.out.println("Test!");
                        typeMenu=0;
                    }

                    if (username1.equals(username_comptable)){ //if (Variable1.equals(variable2)) on utilisse .equals pour faire le test d'égalite pour les string
                        // connection réussite !
                        typeMenu = 5; // direction vers le menu 5 (menu fonction comptable )
                    }else
                    {
                        System.out.println("L'utilisateur n'existe pas dans la BDD !");
                    }
                }

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 3 = menu du visiteur medical
                if (typeMenu == 3) {
                    String vmedical = "test";
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Vous etes sur le menu Comptabme");
                    System.out.println("\n");
                    System.out.println("Veuillez indiquer votre nom d'utilisateur");
                    System.out.println("\n");
                    System.out.println("Taper 'quitte'pour quitter");
                    String username1 = sc.next();
                    String quitte = "quitte";
                    if(username1.equals(quitte)){
                        System.out.println("Test!");
                        typeMenu=0;
                    }

                    if (username1.equals(vmedical)){ //if (Variable1.equals(variable2)) on utilisse .equals pour faire le test d'égalite pour les string
                        // connection réussite !
                        typeMenu = 6; // direction vers le menu 6 (menu fonction visiteur medical )
                    }else
                    {
                        System.out.println("L'utilisateur n'existe pas dans la BDD !");
                    }
                }



                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 4 = menu fonction visiteur
                if (typeMenu == 4) {
                    System.out.println("\n\n\n");
                    System.out.println("Vous etes connecter en tant que utilisateur");
                    System.out.println("\n");
                    System.out.println("1 - Renseigner fiche de frais");
                    System.out.println("2 - Consulter fiches de frais");
                    System.out.println("\n");
                    int nmfunction0 = sc.nextInt();
                    if (nmfunction0 == 1){
                        System.out.println("\n\n\n");
                        System.out.println("1 - Option 1");
                        System.out.println("2 - Option 2");
                        System.out.println("3 - Retour");
                        int nmfunction1 = sc.nextInt();
                        if (nmfunction1 == 3){
                            typeMenu = 4;
                        }
                    }
                    if (nmfunction0 == 2){
                        System.out.println("\n\n\n");
                        System.out.println("1 - Option 1");
                        System.out.println("2 - Option 2");
                        System.out.println("3 - Retour");
                        int nmfunction2 = sc.nextInt();
                    }
                }


                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 5 = menu fonction comptable
                if (typeMenu == 5) {
                    System.out.println("\n\n\n");
                    System.out.println("Coming soon !");
                    int nmfunction10 = sc.nextInt();
                }


                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // menu 6 = menu fonction visiteur medical
                if (typeMenu == 6) {
                    System.out.println("\n\n\n");
                    System.out.println("Coming soon !");
                    int nmfunction20 = sc.nextInt();
                }

            } while (quitteApplication);
        }

}