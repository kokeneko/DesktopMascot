package DesktopMascot;

import java.time.LocalDateTime;

import javafx.application.Platform;
//import javafx.scene.input.MouseEvent;
//import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class MascotController{

	@FXML private ImageView Image;
	@FXML private Label TimeLabel;
	@FXML private ContextMenu Menu;
	@FXML private MenuItem MenuItemDelete;

	LocalDateTime time = LocalDateTime.now();


//	MouseEvent a = new MouseEvent(EventType<? extends MouseEvent> ANY);


	@FXML
	private void Delete() {
		System.out.println("delete");
		Platform.exit();

	}

	@FXML
	private void ConectContextMenu(){
		System.out.println("delete");
//		Menu.show(Time, a.getScreenX(), a.getScreenY());
	}

	@FXML
	private void GetTime() {
		boolean switcher = false;

		if(switcher == true) {
			switcher = false;
		}
		else {
			switcher = true;
		}


		if(switcher) {
			while(true) {
				TimeLabel.setText("現在時刻は"+ TimeClass.nowtime() +"です");
				System.out.println("set");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			TimeLabel.setText(null);
		}
	}

}
