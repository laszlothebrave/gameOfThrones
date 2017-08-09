package data_pack.house_pack.Baratheon;

import data_pack.Player;
import data_pack.house_pack.*;
import exception_pack.UnitTypeLimitReachedException;

public class Baratheon extends House {
    public Baratheon(Player player) {
        super(2, 1, HouseName.Baratheon);

        try {
            player.getArmy().removeSoldier(2, 1, 2, 0);
        } catch (UnitTypeLimitReachedException e){

        }

    }
}