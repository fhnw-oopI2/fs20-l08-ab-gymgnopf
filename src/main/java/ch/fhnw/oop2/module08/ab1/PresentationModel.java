package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {

	
	private SimpleStringProperty windowTitleProperty;
	private SimpleStringProperty buttonTextProperty;
	
	public PresentationModel() {
		this.windowTitleProperty = new SimpleStringProperty("JavaFX Application");
		this.buttonTextProperty = new SimpleStringProperty("Hello World");
	}
	
	public String getWindowTitle() {
		return windowTitleProperty.get();
	}
	public void setWindowTitle(String windowTitle) {
		this.windowTitleProperty.set(windowTitle);
	}
	
	public String getButtonText() {
		return buttonTextProperty.get();
	}
	public void setButtonText(String buttonText) {
		this.buttonTextProperty.set(buttonText);
	}
	
	public SimpleStringProperty windowTitleProperty() {
		return this.windowTitleProperty;
	}
	
	public SimpleStringProperty buttonTextProperty() {
		return this.buttonTextProperty;
	}
	
}
