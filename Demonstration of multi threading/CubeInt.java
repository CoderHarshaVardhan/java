public class CubeInt implements Runnable {

    private RandomIntGen rig;
    private Thread cubeInt;

    public CubeInt(String name, RandomIntGen rig) {
        this.rig = rig;
        cubeInt = new Thread(this, name);
        cubeInt.start();
    }

    public void run() {
        int randomInteger;
        int cube;

        while (rig.getRIntGenerator().isAlive()) {
            randomInteger = rig.getRandomInteger();

            if (randomInteger % 2 != 0) {
                cube = randomInteger * randomInteger * randomInteger;
                System.out.println(Thread.currentThread().getName() + " " + cube);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}l