/**
 * The ShapesApplication class serves as the entry point for the JavaFX application.
 * It loads the GUI layout from the FXML file and displays the main window where users
 * can interact with the shape selection and calculation interface.
 */

package com.example.cmsc_335_shapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShapesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/cmsc_335_shapes/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 700);   // Scene holding GUI elements
        stage.setTitle("Project 2 Shape");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

