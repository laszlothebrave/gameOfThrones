import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Network implements Runnable {

    private Scanner in;
    LinkedBlockingQueue serverToClinet;
    LinkedBlockingQueue clientToServer;

    public Network(){
       serverToClinet = new LinkedBlockingQueue();
       clientToServer = new LinkedBlockingQueue();
    }

    @Override
    public void run(){
            System.out.println("Network Server - OK");
            receiveMessage();
    }

    private void receiveMessage() {
    }
}

