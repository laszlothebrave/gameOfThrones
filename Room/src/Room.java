import java.util.concurrent.LinkedBlockingQueue;

public class Room implements Runnable{

    LinkedBlockingQueue queue;
    @Override
    public void run() {

    }

    private void checkmessage() {
        try {
            queue.put(queue.take() + " checked");
        } catch (InterruptedException e){

        }
    }
}
