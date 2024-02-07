public class TestThreads {

    public static void main(String[] args) {

        int numCount = Integer.parseInt(args[0]);
        int upperLimit = Integer.parseInt(args[1]);

        String name = "Random Int Generator";
        RandomIntGen rig = new RandomIntGen(name, numCount, upperLimit);

        name = "Square Integer";
        SquareInt si = new SquareInt(name, rig);

        name = "Cube Integer";
        CubeInt ci = new CubeInt(name, rig);
    }
}