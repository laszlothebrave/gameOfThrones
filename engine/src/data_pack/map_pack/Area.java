package data_pack.map_pack;

import data_pack.military_pack.Army;
import data_pack.order_pack.Order;
import data_pack.Player;

public abstract class Area {
    AreaName areaName;
    Player owner;
    Army army;
    Army selectedArmy;
    Army routedArmy;
    Order order;

    Area(AreaName areaName){
        this.areaName = areaName;
        owner = null;
        army = new Army(0, 0, 0, 0);
        selectedArmy = new Army(0, 0, 0, 0);
        routedArmy = new Army(0, 0, 0, 0);
        order = null;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return areaName.getName();
    }

    public Player getOwner() {
        return owner;
    }

    public Army getArmy() {
        return army;
    }

    public Order getOrder() {
        return order;
    }

    public Army getSelectedArmy() {
        return selectedArmy;
    }

    public Army getRoutedArmy() {
        return routedArmy;
    }


    public abstract int getSupplies();
    public abstract boolean hasVictoryPoint();
}
