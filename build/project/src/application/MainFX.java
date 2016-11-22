package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import vista.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class MainFX extends Application {
	  private Stage primaryStage;
    private AnchorPane rootLayout;


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PruebaJavaFXAdrian");

        initRootLayout();
    }

    /**
     * Initializes the root
     * @author Adri
     * @version 1
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("../vista/Profile.fxml"));
            rootLayout = (AnchorPane) loader.load();
            

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			

            Font.loadFont(getClass().getResourceAsStream("../resources/fonts/HipsterishFontNormal.ttf"), 20);
//			
			primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	
	public static void main(String[] args) {
		launch(args);
	}
}
