package data_pack.track_pack;

import data_pack.Player;
import data_pack.PlayerList;
import data_pack.house_pack.HouseName;
import java.util.ArrayList;

public class RavenTrack extends Track {

    ArrayList <Integer> stars;

    public RavenTrack(){
        super();
        track.add(PlayerList.PlayerOfHouse(HouseName.Lannister));
        track.add(PlayerList.PlayerOfHouse(HouseName.Stark));
        track.add(PlayerList.PlayerOfHouse(HouseName.Martell));
        track.add(PlayerList.PlayerOfHouse(HouseName.Baratheon));
        track.add(PlayerList.PlayerOfHouse(HouseName.Tyrell));
        track.add(PlayerList.PlayerOfHouse(HouseName.Greyjoy));
        setStars(PlayerList.getNumberOfPlayers());
        super.removeNull();
    }

    private int getNumberOfStars (Player player) {
        return stars.get(track.indexOf(player));
    }

    private void setStars (int playersNumber){
        if (playersNumber == 6) {
            stars.add(3);
            stars.add(3);
            stars.add(2);
            stars.add(1);
            stars.add(0);
            stars.add(0);
        } if (playersNumber == 5) {
            stars.add(3);
            stars.add(3);
            stars.add(2);
            stars.add(1);
            stars.add(0);
        } if (playersNumber == 4) {
            stars.add(3);
            stars.add(2);
            stars.add(1);
            stars.add(0);
        } if (playersNumber == 3) {
            stars.add(3);
            stars.add(2);
            stars.add(1);
        }
    }

}
