/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author Simone.Pontalti
 */
public class minicalcolatrice extends Application {
    
    
    BorderPane bp;
    StackPane st;
    GridPane gp;
    TilePane box;
    HBox hb;
    static int contatore=0;
    
    static Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,
            btn12,btn13,btn14,btn15,btn16,btn17;
    static TextField txt1;
    static TextField input1; 
    static TextField input2; 
    Label lbl;
    static String checkFocus="1";
    static String a = null;
    
    @Override
    public void start(Stage primaryStage) {
        
 
        //#########BOTTONI##############
        btn0 = new Button("0");
        btn0.setMinSize(80,80);
        btn0.setId("0");
        
        btn1 = new Button("1");
        btn1.setMinSize(80,80);
        btn1.setId("1");
        
        btn2 = new Button("2");
        btn2.setMinSize(80,80);
        btn2.setId("2");
        
        btn3 = new Button("3");
        btn3.setMinSize(80,80);
        btn3.setId("3");
        
        btn4 = new Button("4");
        btn4.setMinSize(80,80);
        btn4.setId("4");
        
        btn5 = new Button("5");
        btn5.setMinSize(80,80);
        btn5.setId("5");
        
        btn6 = new Button("6");
        btn6.setMinSize(80,80);
        btn6.setId("6");
        
        btn7 = new Button("7");
        btn7.setMinSize(80,80);
        btn7.setId("7");
        
        btn8 = new Button("8");
        btn8.setMinSize(80,80);
        btn8.setId("8");
        
        btn9 = new Button("9");
        btn9.setMinSize(80,80);
        btn9.setId("9");
        
        btn10 = new Button("C");
        btn10.setMinSize(80,80);
        btn10.setId("C");
        
        btn11 = new Button("/");
        btn11.setMinSize(80,80);
        btn11.setId("/");
        
        btn12 = new Button("*");
        btn12.setMinSize(80,80);
        btn12.setId("*");
        
        btn13 = new Button("Del");
        btn13.setMinSize(80,80);
        btn13.setId("Del");
        
        btn14 = new Button("-");
        btn14.setMinSize(80,80);
        btn14.setId("-");
        
        btn15 = new Button("+");
        btn15.setMinSize(80,80);
        btn15.setId("+");
        
        btn16 = new Button("=");
        btn16.setMinSize(80,80);
        btn16.setId("=");
        
        btn17 = new Button(",");
        btn17.setMinSize(80,80);
        btn17.setId(",");
        
        lbl = new Label("Calcolatrice");
        
        //###########area non editabile#################
        txt1 = new TextField(" "+contatore);
        txt1.setEditable(false);
        
        
        input1= new TextField("");
        input1.requestFocus();
        input1.setEditable(false);
        input2= new TextField("");
        input2.setEditable(false);
        
        box = new TilePane();
        box.setPrefColumns(1);
        box.setMinWidth(320.0);
        box.setMaxWidth(320.0);
        box.getChildren().addAll(input1, input2, txt1);
        
        
        //################GESTORI EVENTI!#########################
        
        Listener0 a=new Listener0(); //istanziamento di un gestore denominato Listener
        btn0.addEventHandler(MouseEvent.MOUSE_CLICKED, a); //il gestore è una classe ESTERNA!

        Listener1 b=new Listener1(); //istanziamento di un gestore denominato Listener
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, b); //il gestore è una classe ESTERNA!

        Listener2 c=new Listener2(); //istanziamento di un gestore denominato Listener
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, c); //il gestore è una classe ESTERNA!

        Listener3 d=new Listener3(); //istanziamento di un gestore denominato Listener
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, d); //il gestore è una classe ESTERNA!

        Listener4 e=new Listener4(); //istanziamento di un gestore denominato Listener
        btn4.addEventHandler(MouseEvent.MOUSE_CLICKED, e); //il gestore è una classe ESTERNA!

        Listener5 f=new Listener5(); //istanziamento di un gestore denominato Listener
        btn5.addEventHandler(MouseEvent.MOUSE_CLICKED, f); //il gestore è una classe ESTERNA!

        Listener6 g=new Listener6(); //istanziamento di un gestore denominato Listener
        btn6.addEventHandler(MouseEvent.MOUSE_CLICKED, g); //il gestore è una classe ESTERNA!

        Listener7 h=new Listener7(); //istanziamento di un gestore denominato Listener
        btn7.addEventHandler(MouseEvent.MOUSE_CLICKED, h); //il gestore è una classe ESTERNA!

        Listener8 i=new Listener8(); //istanziamento di un gestore denominato Listener
        btn8.addEventHandler(MouseEvent.MOUSE_CLICKED, i); //il gestore è una classe ESTERNA!

        Listener9 l=new Listener9(); //istanziamento di un gestore denominato Listener
        btn9.addEventHandler(MouseEvent.MOUSE_CLICKED, l); //il gestore è una classe ESTERNA!

        Listener13 m=new Listener13(); //istanziamento di un gestore denominato Listener
        btn13.addEventHandler(MouseEvent.MOUSE_CLICKED, m); //il gestore è una classe ESTERNA!


        //##########inserimento area non editabile##############
        st = new StackPane();
        st.getChildren().add(box);
        
        
        gp = new GridPane();
        gp.add(btn10, 0, 0);
        gp.add(btn11, 1, 0);
        gp.add(btn12, 2, 0);
        gp.add(btn13, 3, 0);
        gp.add(btn7, 0, 1);
        gp.add(btn8, 1, 1);
        gp.add(btn9, 2, 1);
        gp.add(btn14, 3, 1);
        gp.add(btn4, 0, 2);
        gp.add(btn5, 1, 2);
        gp.add(btn6, 2, 2);
        gp.add(btn15, 3, 2);
        gp.add(btn1, 0, 3);
        gp.add(btn2, 1, 3);
        gp.add(btn3, 2, 3);
        gp.add(btn16, 3, 3);
        gp.add(btn0, 0, 4);
        gp.add(btn17, 2, 4);
        
        
        //####################################################
        //######################################################
        
        MyListener list = new MyListener();
        btn11.addEventFilter(ActionEvent.ACTION, list);
        btn12.addEventFilter(ActionEvent.ACTION, list);
        btn14.addEventFilter(ActionEvent.ACTION, list);
        btn15.addEventFilter(ActionEvent.ACTION, list);
        btn16.addEventFilter(ActionEvent.ACTION, list);

        //####################################################
        //######################################################

        bp = new BorderPane();
        bp.setTop(st);
        
       // bp.setAlignment(txt1, Pos.CENTER);
        bp.setCenter(gp);
       
        
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(bp, 320, 480);
        //(bp, 320, 480);
        primaryStage.setTitle("Mini calcolatrice");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
