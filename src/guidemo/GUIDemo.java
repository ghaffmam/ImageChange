/*
 * 
 */
package guidemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mamona Ghaffar
 */
public class GUIDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image img = new Image("/happy.png");
        Image img2 = new Image("/angry.png");
        Button btn = new Button();
        
        Text txt = new Text();
        
        btn.setText("Happy");
        ImageView imgView = new ImageView(img);
        imgView.setFitWidth(100);
        imgView.setFitHeight(100);

        ImageView imgView1 = new ImageView(img2);
        imgView.setFitWidth(100);
        imgView.setFitHeight(100);

//button 1       
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am Happy!");
                imgView.setImage(img);
                txt.setText("I am Happy!");
            }
        });

//button 2
        Button btn2 = new Button();

        btn2.setText("Angry");

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am Angry");
                imgView.setImage(img2);
                txt.setText("I am Angry!");
            }
        });
        
        
        Button btn3 = new Button();

        btn3.setText("Disappear");

        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Disappeared!");
                imgView.setImage(null);
                txt.setText("Disappeared!");
            }
        });
        GridPane root = new GridPane();
        HBox pane=new HBox(btn,btn2,btn3);
        VBox pane1=new VBox(root,pane);
        pane1.setSpacing(20);
        pane.setSpacing(20);
        /*
        root.setAlignment(Pos.CENTER);
        btn.setAlignment(Pos.BOTTOM_LEFT);
        btn2.setAlignment(Pos.BOTTOM_CENTER);
        btn3.setAlignment(Pos.BOTTOM_RIGHT);
        */
        root.add(imgView,0,0);
        root.add(txt,0,1);
        root.add(pane,0,3);

        Scene scene = new Scene(pane1,300, 300); //width and height

        imgView.setImage(img);

        primaryStage.setTitle("My Java GUI App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the c command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
