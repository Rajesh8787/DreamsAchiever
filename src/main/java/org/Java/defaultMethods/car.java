package main.java.org.Java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import java.sql.SQLOutput;

interface Vehicle {
    String getBrand();

    String getModel();

    int playSong();

    default String tunOnAlarmOn() {
        return "Alarm turned on";
    }

    default String tunOnAlarmOf() {
        return "Alarm turned of";
    }

}
//implementing class
class CarImp implements Vehicle{
     @Override
     public String getBrand(){
         return "abc";
     }
     @Override

     public String getModel(){
         return "xyz";

     }
     @Override
     public int playSong(){
         return 4;
     }

}
public class car {
     public static void main(String args[]){
         Vehicle obj = new CarImp();


         System.out.println(obj.getBrand());
         System.out.println(obj.getModel());
         System.out.println(obj.tunOnAlarmOn());
     }
}
