package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Test01FX extends Application {
  @Override
	//Este es el punto de inicio de la aplicación
	//Aquí creamos y definimos la interfaz gráfica
	public void start(Stage primaryStage) {
	        Label label = new Label("Test Ventana");
	        StackPane root = new StackPane(label);
	        Scene scene = new Scene(root, 400, 300);

	        primaryStage.setTitle("Ventana JavaFX");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	
	// Lanza la aplicación
	//El método estático launch(args) es el encargado de lanzar la aplicación
	public static void main(String[] args) {
		launch(args);
  }
}
