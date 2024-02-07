import java.util.*;

public class Consumer implements Runnable{
    private Queue<Integer> queue;
    private Thread consumer;

    public Consumer(Queue<Integer> queue, String name){
        this.queue = queue; 
        consumer = new Thread(this, name);
        consumer.start();
    }

    public void run(){
        while(true){
            synchronized(queue){
                while(queue.isEmpty()){
                    try{
                        System.out.println("Queue is Empty, COnsumer waiting for Producer to add elements from Queue");
                        queue.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    
                }

                System.out.println("Consuming values : " + queue.remove());
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
