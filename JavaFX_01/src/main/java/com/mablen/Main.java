package com.mablen;

import javafx.application.Application;
import javafx.stage.Stage;


/*
     La estructura básica de una aplicación JavaFX
    está compuesta por los siguientes elementos:
    
    -Clase Application: Punto de entrada de una aplicación JavaFX.
    -Clase Stage: Es la ventana que mostrará todos los comoponentes de nuestra UI. La podemos considerar como la ventana nativa.
    -Clase Scene: Contiene los componentes (nodos) de la ventana.
    -Método start(Stage stage): Aquí es donde se construye el gráfico de escena.
    -Método launch(args): Este método es el encargado de crear una nueva instancia de la clase Application.
*/

public class Main extends Application {
   
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ventana JavaFX");
        primaryStage.show();
    }
    
    // Punto de inicio de la aplicación
    public static void main(String[] args) {
        Application.launch(args);
    }
}
