package Adapter;

public class Lightbulb {
   boolean powerOn = false;
   int voltage = 0;

   public void turnOn(int voltage){
       powerOn = true;
       this.voltage = voltage;
       System.out.println("Lightbuild powered on with " + voltage + "of current");
   }


    public void turnOff(){
       powerOn = false;
       voltage = 0;
        System.out.println("Lightbuld powered off ");
   }

   public  boolean isPoweredOn(){
       return  powerOn;
   }
}
