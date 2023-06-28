//CSD405 Tyler O'Riley 06/27/2023 Assignment 7
//Java program for JavaFX Gridpane useage

//Code frame used from JavaPoint Example: https://www.javatpoint.com/javafx-gridpane


package application;  
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;  

public class essay_Grid extends Application {
  
    @Override  //override tool to run at start of program
    public void start(Stage primaryStage) throws Exception {  
        Label displayOne=new Label("Grid Item One");  //creates object for text placeholder
        Label displayTwo=new Label("Grid Item Two");  
        TextField tf1=new TextField();  //textfield method to be used with text values for use in JavaFX
        TextField tf2=new TextField();  
        Button Submit=new Button ("Submit");  //submit button for future use when user input can be accepted
        GridPane root=new GridPane();  //grid method setup
        Scene scene = new Scene(root,400,200);  //scene setup
        root.addRow(0, first_name,tf1);  //row creation methods with parameters for text values alongside textfield for FX use
        root.addRow(1, last_name,tf2);  
        root.addRow(2, Submit);  
        primaryStage.setScene(scene);  //Stage set and show for GUI results
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  //primary method to launch program
    }  
      
}