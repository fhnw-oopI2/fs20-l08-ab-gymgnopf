package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {

	enum State {
		ON{
		    public String toString(){
                return "On";
            }
		},
		OFF{
		    public String toString(){
                return "Off";
            }
		}
	} 
	
	private SimpleStringProperty windowTitleProperty;
	private ObjectProperty<State> buttonStateProperty;
	
	public PresentationModel() {
		this.windowTitleProperty = new SimpleStringProperty("JavaFX Application");
		this.buttonStateProperty =  new SimpleObjectProperty<>(State.OFF);
	}
	
	public String getWindowTitle() {
		return windowTitleProperty.get();
	}
	public void setWindowTitle(String windowTitle) {
		this.windowTitleProperty.set(windowTitle);
	}
	
	public SimpleStringProperty windowTitleProperty() {
		return this.windowTitleProperty;
	}
	
	public State getButtonState() {
		return buttonStateProperty.get();
	}
	public void setButtonState(State state) {
		this.buttonStateProperty.set(state);
	}
	public ObjectProperty<State> buttonStateProperty() {
		return this.buttonStateProperty;
	}
	
	public void toggleButtonState() {
		buttonStateProperty().setValue(buttonStateProperty().get() == State.ON ? State.OFF : State.ON);
	}
	
}
