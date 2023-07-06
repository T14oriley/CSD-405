//CSD405 Tyler O'Riley 07/05/2023 Assignments 10
//JavaFX Program for various card outputs


import javafx.scene.control.Button;
import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.Math;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Cards extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override 
    public void start(Stage stageOne) throws FileNotFoundException{
        
        int[] deck = new int[54];
        for(int x=0; x<54; x++) { //For Loop to create deck
            deck[x] = x+1;
        }
        
        ImageView vOne = new ImageView(); //View creation for respective cards
        vOne.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView vTwo = new ImageView();
        vTwo.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView vThree = new ImageView();
        vThree.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView vFour = new ImageView();
        vFour.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));

        Label one = new Label("First Card"); //Label strings
        Label two = new Label("Second Card");
        Label three = new Label("Third Card");
        Label four = new Label("Fourth Card");

        Button draw = new Button("Refresh"); //Button object to card drawing
        
        draw.setOnAction( e -> { //Button method to card drawing
            vOne.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            vTwo.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            vThree.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            vFour.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
        });

        Pane sp1 = new Pane(); //pane spacers for grid placement
        sp1.minHeightProperty().bind(one.heightProperty());
        Pane sp2 = new Pane();
        sp2.minHeightProperty().bind(two.heightProperty());
        Pane sp3 = new Pane();
        sp3.minHeightProperty().bind(three.heightProperty());
        Pane sp4 = new Pane();
        sp4.minHeightProperty().bind(four.heightProperty());
        
        GridPane gPane = new GridPane(); //Gridpane space placement for cards
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.setPadding(new Insets(5,5,5,5));
        
        gPane.addRow(0, vOne, vTwo, vThree, vFour); //Method to place card image in grid
        gPane.addRow(1, one, two, three, four);
        gPane.addRow(2, sp1, sp2, sp3, sp4);        

        VBox root = new VBox();
        root.getChildren().addAll(gPane, draw);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(root);
        
        stageOne.setScene(scene);
        stageOne.show();

    }

}