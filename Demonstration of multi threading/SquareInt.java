import java.util.Random;

public class SquareInt implements Runnable {

    private RandomIntGen rig = null;
    private Thread squareInt = null;

    public SquareInt(String name, RandomIntGen rig) {
        this.rig = rig;
        squareInt = new Thread(this, name);
        squareInt.start();
    }

    public void run() {
        int randomInteger = 0;
        int square = 0;

        while (rig.getRIntGenerator().isAlive()) {
            randomInteger = rig.getRandomInteger();

            if ((randomInteger % 2) == 0) {
                square = randomInteger * randomInteger;
                System.out.println(Thread.currentThread().getName() + ": " + square);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}