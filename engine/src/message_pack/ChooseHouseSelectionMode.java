package message_pack;

import data_pack.PlayerName;

import java.io.Serializable;

public class ChooseHouseSelectionMode extends Message implements Serializable{
    private HouseSelectionMode houseSelectionMode;

    public ChooseHouseSelectionMode(PlayerName player, HouseSelectionMode houseSelectionMode){
        super(player);
        this.houseSelectionMode = houseSelectionMode;
    }

    public HouseSelectionMode getHouseSelectionMode() { return houseSelectionMode;
    }
}