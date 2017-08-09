package data_pack.track_pack;

import data_pack.Player;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Track{
    protected ArrayList<Player> track;

    protected Track(){
        track = new ArrayList<Player>();
    }

    protected void removeNull() {
        track.removeAll(Collections.singleton(null));
    }

    public Player getPlayerOnPosition(int position){ return track.get(position); }
    public void setPlayerOnPosition(int position, Player player){ track.set(position, player); }
}