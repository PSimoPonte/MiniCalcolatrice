
import javafx.event.Event;
import javafx.event.EventHandler;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone.Pontalti
 */
public class Gestore {
    
}


class Listener0 implements EventHandler {

    
    @Override
    public void handle(Event event) {
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"0");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"0");
         }
    
}
class Listener1 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"1");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"1");
         
        
         }
    
}


class Listener2 implements EventHandler {

    @Override
    public void handle(Event event) {
        
       
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"2");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"2");
         }
    
}

class Listener3 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"3");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"3");
        
         }
    
}

class Listener4 implements EventHandler {

    @Override
    public void handle(Event event) {
        
       
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"4");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"4");
        
         }
    
}

class Listener5 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"5");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"5");
         }
    
}


class Listener6 implements EventHandler {

    @Override
    public void handle(Event event) {
        
      
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"6");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"6");
        
         }
    
}


class Listener7 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"7");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"7");
         }
    
}

class Listener8 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"8");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"8");
         }
    
}

class Listener9 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        
        if(minicalcolatrice.checkFocus.equals("1"))
            minicalcolatrice.input1.setText(minicalcolatrice.input1.getText().toString()+"9");
         else
            minicalcolatrice.input2.setText(minicalcolatrice.input2.getText().toString()+"9"); 
         }
    
}


class Listener13 implements EventHandler {

    @Override
    public void handle(Event event) {
        
        clearAll();
       
    }

    public void clearAll() {
        minicalcolatrice.txt1.clear();
        minicalcolatrice.input1.clear();
        minicalcolatrice.input2.clear();
        minicalcolatrice.input1.requestFocus();
        minicalcolatrice.checkFocus="1";
        minicalcolatrice.input1.setEditable(false);
        minicalcolatrice.input2.setEditable(false);
    }
    
}
/*
class Listener12 implements EventHandler {

    @Override
    public void handle(Event event) {
        String i1 = input1.getText();
        String i2 = input2.getText();
        double o1 = 0;
        double o2 = 0;
        o1 = Double.parseDouble(i1);
        o2 = Double.parseDouble(i2);
        minicalcolatrice.txt1.setText("" + (o1 * o2));
        
         }
    
}
*/