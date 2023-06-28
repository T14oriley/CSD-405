//CSD405 Tyler O'Riley 06/25/2023 Assignment 8
//Java program viewing cards using JavaFX

//Code structure produced but still working out kinks with JavaFX used on VS Code. Multiple run errors not caused by code.
//will be troubleshooting compatibility errors as week progresses

import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.Math;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Cards extends Application {
    public static void main(String [] args){
        launch(args);
    }

    @Override //OVerride tool as program starts
    public void start(Stage stageOne) throws FileNotFoundException{
        
        int[] deck = new int[54];   //For loop to create deck
        for(int x=0; x<54; x++) {
            deck[x] = x+1;
        }

        int cardNumOne = deck[(int)(Math.random() * 54 + 1)]; //Random number generator to select card from deck
        int cardNumTwo = deck[(int)(Math.random() * 54 + 1)];
        int cardNumThree = deck[(int)(Math.random() * 54 + 1)];
        int cardNumFour = deck[(int)(Math.random() * 54 + 1)];

        Image cardIMGOne = new Image(new FileInputStream("cards\\" + cardNumOne + ".png")); //FileInputStream to select card image from folder location for FX use
        Image cardIMGTwo = new Image(new FileInputStream("cards\\" + cardNumTwo + ".png"));
        Image cardIMGThree = new Image(new FileInputStream("cards\\" + cardNumThree + ".png"));
        Image cardIMGFour = new Image(new FileInputStream("cards\\" + cardNumFour + ".png"));

        ImageView displayOne = new ImageView(); //ImageView to take selected cards and produce FX view for use
        displayOne.setImage(cardIMGOne);
        ImageView displayTwo = new ImageView();
        displayTwo.setImage(cardIMGTwo);
        ImageView displayThree = new ImageView();
        displayThree.setImage(cardIMGThree);
        ImageView displayFour = new ImageView();
        displayFour.setImage(cardIMGFour);

        Label one = new Label("Card 1"); //Card image labels for each produced card
        Label two = new Label("Card 2");
        Label three = new Label("Card 3");
        Label four = new Label("Card 4");

        GridPane root = new GridPane(); //Grid creation to format selected cards in grid view (a little similar to HTML grid)
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(5,5,5,5));

        Scene scene = new Scene(root); //Scene FX method 

        root.addRow(0, one, two); //Addrow methods to display each card in its respective grid space
        root.addRow(1, displayOne, displayTwo);
        root.addRow(2, three, four);
        root.addRow(3, displayThree, displayFour);

        stageOne.setScene(scene); //Set scene method and show method for final results display
        stageOne.show();

    }
}
