package main_pack;

import map_pack.Map;

import java.util.concurrent.LinkedBlockingQueue;

public class Game implements Runnable{
    public LinkedBlockingQueue queue;
    public int roundCounter;
    public int wildlingsCounter;
    public Player throneTrack[];
    public Player swordTrack[];
    public Player ravenTrack[];
    public Map map;  

    public Game(int playersNumber, LinkedBlockingQueue queue){
        this.queue = queue;
        initialize(playersNumber);
    }

    private void initialize(int playersNumber){
        switch(playersNumber) {
            case 3: initializeFor3(); break;
            case 4: initializeFor4(); break;
            case 5: initializeFor5(); break;
            case 6: initializeFor6(); break;
        }
    }

    private void initializeFor3() {
    }

    private void initializeFor4() {
    }

    private void initializeFor5() {
    }

    private void initializeFor6() {
    }

    void nextRound(){
    }

    @Override
    public void run() {
        while(true) {
            checkmessage();
        }
    }

    private void checkmessage() {
        try {
            queue.put(queue.take() + " checked");
        } catch (InterruptedException e){

        }
    }
}
