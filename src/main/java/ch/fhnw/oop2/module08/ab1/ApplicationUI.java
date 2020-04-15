package ch.fhnw.oop2.module08.ab1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane   {

	
	private PresentationModel model;
	private Button button;
	
	
	public ApplicationUI(PresentationModel model) {
		this.model = model;
		initControls();
		layoutControls();
	}
	public void initControls() {
		button = new Button();
		button.textProperty().bind(model.buttonTextProperty());
	}
	public void layoutControls(){
		setAlignment(Pos.CENTER);
		getChildren().add(button);
	}
	
}
