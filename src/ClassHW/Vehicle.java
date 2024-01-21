package ClassHW;

public class Vehicle {
    private int speed;
    private Engine engine;
    public void startEngine(){
    speed=0;
    Engine engine = new Engine();
    engine.run((int)Math.random()*100);
    }

    interface Runnable{
    void run(int x);
    }
    class Engine implements Runnable{

        @Override
        public void run(int x) {
            Vehicle.this.speed+=x;
            System.out.println("Runnnig speed: "+ speed);
        }
    }
}
