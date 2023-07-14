//CSD405 Tyler O'Riley 07/13/2023 Assignments 11
//JavaFX Program to create shapes

//Code based on original syntax from repository https://github.com/RustyDeGarmo/CSD405/blob/main/module-11/Shapes.java
//By user RustyDeGarmo

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import java.lang.Math;

public class Figures extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Rectangle shapeR = new Rectangle(); //class objects to run methods
        Circle shapeC = new Circle();
        Ellipse shapeE = new Ellipse();
        Polygon shapeP = new Polygon();

        shapeR.setStroke(Color.RED); //Sets shape outline to red
        shapeC.setStroke(Color.RED);
        shapeE.setStroke(Color.RED);
        shapeP.setStroke(Color.RED);

        shapeR.setFill(Color.GREEN); //Sets shape fill to green             
        shapeC.setFill(Color.GREEN);                
        shapeE.setFill(Color.GREEN);
        shapeP.setFill(Color.GREEN);

        RadioButton createRectangle = new RadioButton("Rectangle"); //radio buttons to generate each shape
        RadioButton createCircle = new RadioButton("Circle");
        RadioButton createEllipse = new RadioButton("Ellipse");
        RadioButton createPolygon = new RadioButton("Polygon");

        ToggleGroup toggle = new ToggleGroup(); //togglegroup for shape buttons that defaults to rectangle
        createRectangle.setToggleGroup(toggle);
        createCircle.setToggleGroup(toggle);
        createEllipse.setToggleGroup(toggle);
        createPolygon.setToggleGroup(toggle);
        
        Pane shapePane = new Pane(); //pane for shape objects
        shapePane.setPadding(new Insets(20, 20, 20, 20));
        shapePane.setStyle("-fx-border-width: 1px; -fx-border-color: yellow");
        createRectangle.setOnAction(x -> {
            shapePane.getChildren().removeAll(shapeC, shapeE, shapeP);
            shapeR.setX(20);
            shapeR.setY(20);
            shapeR.widthProperty().bind(shapePane.widthProperty().subtract(50));
            shapeR.heightProperty().bind(shapePane.heightProperty().subtract(50));
            shapePane.getChildren().add(shapeR);
        });

        createCircle.setOnAction(x -> {
            shapePane.getChildren().removeAll(shapeR, shapeE, shapeP);
            shapeC.centerXProperty().bind(shapePane.widthProperty().divide(2));
            shapeC.centerYProperty().bind(shapePane.heightProperty().divide(2));
            shapeC.radiusProperty().bind(shapePane.widthProperty().add(shapePane.heightProperty()).divide(4).subtract(30));
            shapePane.getChildren().add(shapeC);
        });

        createEllipse.setOnAction(x -> {
            shapePane.getChildren().removeAll(shapeC, shapeR, shapeP);
            shapeE.centerXProperty().bind(shapePane.widthProperty().divide(2));
            shapeE.centerYProperty().bind(shapePane.heightProperty().divide(2));
            shapeE.radiusXProperty().bind(shapePane.widthProperty().divide(2).subtract(25));
            shapeE.radiusYProperty().bind(shapePane.heightProperty().divide(2).subtract(25));
            shapePane.getChildren().add(shapeE);
        });

        createPolygon.setOnAction(x -> {
            shapePane.getChildren().removeAll(shapeC, shapeE, shapeR, shapeP);
            int polyPoints = (int)(randomNumber()/60)*2;
            for(int i = 0; i < polyPoints; i++){
                shapeP.getPoints().add(randomNumber());
            }
            shapePane.getChildren().add(shapeP);
        });

        VBox vBoxForRadio = new VBox(20); //pane for shape buttons
        vBoxForRadio.setPadding(new Insets(5, 5, 5, 5));
        vBoxForRadio.getChildren().addAll(createRectangle, createCircle, createEllipse, createPolygon);
        vBoxForRadio.setStyle("-fx-border-width: 1px; -fx-border-color: black");

        BorderPane pane = new BorderPane(); //Borderpane to hold elements
        pane.setCenter(shapePane);
        pane.setLeft(paneForCheck);
        pane.setRight(vBoxForRadio);

        Scene scene = new Scene(pane, 500, 300); //Scene creation and placement
        primaryStage.setTitle("Random Shape Filling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        private double randomNumber() { //Random number generater for polygon points
            return Math.random() * 250;
        }

}