package PrimerFXApplication;

import PrimerFXApplication.layout.IndexLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimerApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = IndexLayout.buildMajorScene();

        primaryStage.setTitle("FXPrimer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
/*
* Here are the important things to know about the basic structure of a JavaFX application:

The main class for a JavaFX application extends the javafx.application.Application class. The start() method is the main entry point for
all JavaFX applications.

A JavaFX application defines the user interface container by means of a stage and a scene. The JavaFX Stage class is the top-level JavaFX
container. The JavaFX Scene class is the container for all content. Example 3-1 creates the stage and scene and makes the scene visible in
a given pixel size.

In JavaFX, the content of the scene is represented as a hierarchical scene graph of nodes. In this example, the root node is a
* StackPane object, which is a resizable layout node. This means that the root node's size tracks the scene's size and changes when
* the stage is resized by a user.

The root node contains one child node, a button control with text, plus an event handler to print a message when the button is pressed.

The main() method is not required for JavaFX applications when the JAR file for the application is created with the JavaFX Packager tool,
* which embeds the JavaFX Launcher in the JAR file. However, it is useful to include the main() method so you can run JAR files that were
* created without the JavaFX Launcher, such as when using an IDE in which the JavaFX tools are not fully integrated.
* Also, Swing applications that embed JavaFX code require the main() method.
* */