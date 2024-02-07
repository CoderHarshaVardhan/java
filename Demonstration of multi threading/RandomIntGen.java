import java.util.Random;

public class RandomIntGen implements Runnable {

    private int randomInteger;
    private int numCount;
    private Random random;
    private int upperLimit;
    private Thread rIntGenerator;

    RandomIntGen(String name, int numCount, int upperLimit) {
        this.numCount = numCount;
        this.upperLimit = upperLimit;
        random = new Random();
        rIntGenerator = new Thread(this, name);
        rIntGenerator.start();
    }

    public int getRandomInteger() {
        return randomInteger;
    }

    public Thread getRIntGenerator() {
        return this.rIntGenerator;
    }

    public void run() {
        while (numCount > 0) {
            try {
                randomInteger = random.nextInt(upperLimit) + 1;
                System.out.println(Thread.currentThread().getName() + " " + randomInteger);
                numCount--;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}