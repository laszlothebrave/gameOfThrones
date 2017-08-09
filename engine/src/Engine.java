import data_pack.GameData;
import data_pack.Player;
import data_pack.PlayerName;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Engine implements Runnable{
    private GameData gameData;
    private Network network;

    public Engine(Network network){
        this.network = network;
       /* ArrayList playersList = new ArrayList();
        playersList.add(new Player(new PlayerName ("Szymon")));
        playersList.add(new Player(new PlayerName ("Szymon")));
        playersList.add(new Player(new PlayerName ("Szymon")));
        playersList.add(new Player(new PlayerName ("Szymon")));
        playersList.add(new Player(new PlayerName ("Szymon")));
        playersList.add(new Player(new PlayerName ("Szymon")));
        gameData = new GameData(playersList);*/
    }

    @Override
    public void run() {
            System.out.println("Engine Server - OK");
    }
}
