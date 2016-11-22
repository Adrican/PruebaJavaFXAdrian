package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	private MainFX mainApp;
	public static Stage sendStage;

	/**
	 * Is called by the main application to give a reference back to itself.
	 * @author Adri
	 * @param mainApp
	 */
	public void setMainApp(MainFX mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * This will show the new windows
	 * @author Adri
	 */

	public void showSendProfile() {
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			sendStage = new Stage();
			sendStage.setTitle("Ventana2");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to handle the ImageView action in the Main stage
	 */

	@FXML
	public void sendStage() {
		showSendProfile();
		
		
	}

	/**
	 * Closes the application when clicked on Exit in the secondary stage
	 */
	@FXML
	public void closeStage() {
		System.exit(0);
	}
	
	/**
	 * Method that will close the window but not the application.
	 * @author Adri
	 */
	@FXML
	public void cerrarVentana2(){
		sendStage.close();
	}
}
