import java.util.*;

public class TestPC {
    public static void main(String args[]){
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = Integer.parseInt(args[0]);
        int uLimit = Integer.parseInt(args[1]);
        Producer producer = new Producer(buffer, maxSize, uLimit, "Producer");
        Consumer consumer = new Consumer(buffer,"Consumer");
    }
}

