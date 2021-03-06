package UI;

import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageController {
	private HashMap<String, Stage> stages = new HashMap<String, Stage>();
	
	public void addStage(String name, Stage stage) {
		stages.put(name, stage);
	}
	
	public Stage getStage(String name) {
		return stages.get(name);
	}
	
	public void setPrimaryStage(String primaryStageName, Stage primaryStage) {
		this.addStage(primaryStageName, primaryStage);
	}
	
	public boolean loadStage(String name, String resources, StageStyle... styles) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(resources));
			Pane tempPane = (Pane) loader.load();
			
			ControlledStage controlledStage = (ControlledStage) loader.getController();
			controlledStage.setStageController(this);
			
			Scene tempScene = new Scene(tempPane);
			Stage tempStage = new Stage();
			tempStage.setScene(tempScene);
			
			for(StageStyle style: styles) {
				tempStage.initStyle(style);
			}
			
			this.addStage(name, tempStage);
			
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean setStage(String name) {
		this.getStage(name).show();
		return true;
	}
	
	public boolean setStage(String show, String close) {
		getStage(close).close();
		setStage(show);
		return true;
	}
	
	public boolean unloadStage(String name) {
		if(stages.remove(name) == null) {
			System.out.println("there is not a stage called " + name + ", please check the name");
			return false;
		} else {
			System.out.print("Close success");
			return true;
		}
	}
	
}
