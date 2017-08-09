package message_pack;

import data_pack.PlayerName;

import java.io.Serializable;

public class AddNewPlayer extends Message implements Serializable{
    AddNewPlayer(PlayerName player) {
        super(player);
    }
}
