
module computermen{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens computermen to javafx.fxml;
     exports computermen;

}