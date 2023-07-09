package org.jeffersoncalderon.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {  // throws indica si no existe el documento
        
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        // FXMLLoader es el browser, load es como el click, get obtiene el recurso que necesito
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
