module computermen {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens computermen to javafx.fxml;
    exports computermen;
}