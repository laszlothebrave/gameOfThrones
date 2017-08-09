package data_pack.military_pack;

import exception_pack.UnitTypeLimitReachedException;
import data_pack.Player;
import data_pack.map_pack.Area;

public class MoveArmy {
    public static void marchOrder(Area start, Area Stop){

    }

    public static void retreatDefender(Area start, Player player){

    }

    public static void retreatAttacker(Area location){
        try {
            location.getSelectedArmy().removeSoldier(0, 0, 0, location.getSelectedArmy().getTower());
        } catch (UnitTypeLimitReachedException e) {

        }
        move(location.getSelectedArmy(), location.getRoutedArmy());
    }

    private static void attack(){

    }

    private static void move(Army source, Army destination){
        destination.addSoldier(source.getInfantry(), source.getCavalry(), source.getShip(), source.getTower());
        source = new Army(0, 0, 0, 0);
    }
}
