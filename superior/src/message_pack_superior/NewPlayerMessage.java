package message_pack_superior;


import main_pack.PlayerName;
import message_pack.Message;

import java.io.Serializable;

public class NewPlayerMessage extends Message implements Serializable{
    NewPlayerMessage(PlayerName player) {
        super(player);
    }
}
