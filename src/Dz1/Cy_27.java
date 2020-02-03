package Dz1;

import java.util.Random;

public class Cy_27 extends Airplane{
    private String metal;
    private double maxSpeed;
    Random random = new Random();

    public Cy_27(int weigth, double width, double length, String metal, double maxSpeed){
        super(length,width,weigth);
        this.metal=metal;
        this.maxSpeed=maxSpeed;
    }

    @Override
    public void turbo() {
        super.turbo();
        System.out.printf("Airplane speed after turbo = %.2f ", (random.nextDouble()*100+getMaxSpeed()));
    }

    @Override
    public void stealthTechnology() {
        super.stealthTechnology();
        System.out.println("Airplane not visible during " + random.nextInt(120) + "minutes");
    }

    @Override
    public void nuclearBomb() {
        super.nuclearBomb();
        System.out.println("Dumbed " + random.nextInt(10) + " bombs");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
