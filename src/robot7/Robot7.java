/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kyokuto
 */
public class Robot7 extends Application {
    public static FXMLDocumentController FXMLDocumentController;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
       Parent root = fxmlLoader.load();
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.setAlwaysOnTop(true);
        stage.show();
        
        FXMLDocumentController = fxmlLoader.getController();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
