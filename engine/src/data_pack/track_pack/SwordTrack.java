package data_pack.track_pack;

import data_pack.PlayerList;
import data_pack.house_pack.HouseName;

public class SwordTrack extends Track{

    public SwordTrack(){
        super();
        track.add(PlayerList.PlayerOfHouse(HouseName.Greyjoy));
        track.add(PlayerList.PlayerOfHouse(HouseName.Tyrell));
        track.add(PlayerList.PlayerOfHouse(HouseName.Martell));
        track.add(PlayerList.PlayerOfHouse(HouseName.Stark));
        track.add(PlayerList.PlayerOfHouse(HouseName.Baratheon));
        track.add(PlayerList.PlayerOfHouse(HouseName.Lannister));
        super.removeNull();
    }

}
