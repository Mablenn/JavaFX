package com.mablen;

import javafx.application.Application;
import javafx.stage.Stage;


/*
    La estructura básica de una aplicación JavaFX
    está compuesta por los siguientes elementos:
    
    -Clase Application
    -Método start(Stage stage)
    -Clase Stage
    -Clase Scene
*/

public class Main extends Application {
    //Sobreescribir método start()
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
