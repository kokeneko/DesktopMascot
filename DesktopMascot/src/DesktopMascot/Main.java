package DesktopMascot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.initStyle(StageStyle.TRANSPARENT); //Stage(枠)透過
			primaryStage.setX(1060.0);
			primaryStage.setY(240.0); //ウィンドウを表示する座標
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Mascot.fxml"));
			root.setStyle("-fx-background-radius: 10;-fx-background-color: rgba(0,0,0,0);"); //Pane透過
			Scene scene = new Scene(root,255,440);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(null); //scene透過
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
