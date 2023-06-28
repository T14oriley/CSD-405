//CSD405 Tyler O'Riley 06/27/2023 Assignment 7
//Java program for JavaFX Borderpane useage

//Code frame used from JavaPoint Example: https://www.javatpoint.com/javafx-borderpane

package application;  
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Label;  
import javafx.scene.layout.*;  
import javafx.stage.Stage;  

public class essay_Border extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  //sets primary stage with exception is error is thrown
        BorderPane newBorder = new BorderPane();  //object to hold borderpane method to create instance of each coordinate
        newBorder.setTop(new Label("Item to appear at top border"));  
        newBorder.setLeft(new Label("Item to appear at left border"));  
        newBorder.setRight(new Label("Item to appear at right border"));  //each object method ran to display text at respective side 
        newBorder.setCenter(new Label("Item to appear at center of page"));  
        newBorder.setBottom(new Label("Item to appear at bottom border"));  
        Scene borderStage = new Scene(newBorder,600,400);  //Set stage borders to better show each output
        primaryStage.setScene(borderStage);  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  //launch method for program
    }  
      
}  