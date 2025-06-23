package com.mablen;

import javafx.application.Application;
import javafx.stage.Stage;



/*
    1. Hereda de la Interfaz Application, así que
    se debe sobreescribir el método start()

    2. El método start(Stage stage) recibe como parámetro
    un objeto de la clase Stage que es la base de la aplicación.

    3. Dentro del método start() mostramos la ventana con 
    el método show() de la clase Stage

    4. Para lanzar la app lo hacemos dentro del método main 
    utilizándo el método launch()
*/
// Punto de inicio de la aplicación
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ventana JavaFX");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
