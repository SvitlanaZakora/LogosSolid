package Dz1;

import java.util.Random;

public class AirplaneControl implements Motion,AirplaneAdditionally{
    Random random = new Random();
    public void engineOn(){
        System.out.println("Take off through: " + (random.nextInt(68)+20) + " second" );
    }
    public void takeOff(){
        System.out.printf("Airplane will fly %.2f on full tank of fuel", (random.nextDouble()*1000)  );
    }
    public void landing(){
        System.out.println("Airplane is landing " );
    }

    @Override
    public void turbo() {
        System.out.println("Airplane increase speed.....");
    }

    @Override
    public void stealthTechnology() {
        System.out.println("Airplane applies Steals Technology....");
    }

    @Override
    public void nuclearBomb() {
        System.out.println("Airplane dump bomb.....");
    }

    @Override
    public void motionUp() {
        System.out.println("AirplaneControler fly up on " + random.nextInt(1000));
    }

    @Override
    public void motionDown() {
        System.out.println("AirplaneControler fly down on " + random.nextInt(1000));
    }

    @Override
    public void motionForward() {
        System.out.println("AirplaneControler fly forward on " + random.nextInt(1000));
    }

    @Override
    public void motionBack() {
        System.out.println("AirplaneControler fly back on " + random.nextInt(1000));
    }
}
