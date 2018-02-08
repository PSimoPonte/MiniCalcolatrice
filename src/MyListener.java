
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone.Pontalti
 */
 class MyListener implements EventHandler {
            public void handle(Event t) {
                
            
                String i1 = null;
                String i2 = null;
                double o1 = 0;
                double o2 = 0;
           /*     
            try {
                o1 = Double.parseDouble(i1);
                o2 = Double.parseDouble(i2);
               
            } catch (NumberFormatException e) {
               
                Label msg = new Label("Errore - Not A Number!");
                StackPane g = new StackPane();
                g.getChildren().add(msg);
              /*
                Scene stageScene = new Scene(g, 200, 200);
                Stage errorStage = new Stage();
                errorStage.setX(50);
                errorStage.setY(200);
                errorStage.setScene(stageScene);
                errorStage.show();
   
                //return;
   
                    }

               */
         
            String s = ((Button) t.getTarget()).getId();
            minicalcolatrice.checkFocus="2";
            
            switch (s) {
                case "+":
                i1 = minicalcolatrice.input1.getText();
                minicalcolatrice.input2.requestFocus();
                minicalcolatrice.a="+";
               // minicalcolatrice.txt1.setText("" + (o1 + o2));
                break;
                
                case "*":
                i1 = minicalcolatrice.input1.getText();
                minicalcolatrice.input2.requestFocus();
                minicalcolatrice.a="*";
                break;
                
                case "-":
                i1 = minicalcolatrice.input1.getText();
                minicalcolatrice.input2.requestFocus();
                minicalcolatrice.a="-";
                break;
                
                case "/":
                i1 = minicalcolatrice.input1.getText();
                minicalcolatrice.input2.requestFocus();
                minicalcolatrice.a="/";
                break;
           
                case "=":
                        i1 = minicalcolatrice.input1.getText();
                        i2 = minicalcolatrice.input2.getText();
                        o1 = Double.parseDouble(i1);
                        o2 = Double.parseDouble(i2);
                        minicalcolatrice.input1.requestFocus();
                        minicalcolatrice.checkFocus = "1";
                    switch (minicalcolatrice.a){
                        case "+":
                        
                        minicalcolatrice.txt1.setText("" + (o1 + o2));
                        break;

                        case "*":
                        minicalcolatrice.txt1.setText("" + (o1 * o2));
                        break;

                        case "-":
                        minicalcolatrice.txt1.setText("" + (o1 - o2));
                        break;

                        case "/":
                        minicalcolatrice.txt1.setText("" + (o1 / o2));
                        break;
                    
                       
                    }
                    
                    minicalcolatrice.input1.setEditable(true);
                    minicalcolatrice.input2.setEditable(true);
                    
                
                }
         
            }
  }
                

 
