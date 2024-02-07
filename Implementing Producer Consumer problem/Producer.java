import java.util.*;

public class Producer implements Runnable{
    private Queue<Integer> queue;
    private int maxSize;
    private Thread producer;
    private int uLimit;

    public Producer(Queue<Integer> queue,int maxSize, int uLimit, String name){
        this.queue = queue; 
        this.maxSize = maxSize;
        this.uLimit = uLimit;
        producer = new Thread(this, name);
        producer.start();
    }

    public void run(){
        Random random = new Random();
        while(true){
            synchronized(queue){
                while(queue.size() == maxSize){
                    try{
                        System.out.println("Queue is full, producer waiting for Consumer to remove elements from Queue");
                        queue.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    
                }

                int i = random.nextInt(uLimit);
                System.out.println("Producing values : " + i);
                queue.add(i);
                queue.notifyAll();
                try{
                    Thread.currentThread().sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }


}