package data_pack.map_pack;

public class SeaArea extends Area {
    SeaArea(AreaName areaName) {
        super(areaName);
    }

    public int getSupplies(){
        return 0;
    }

    public boolean hasVictoryPoint(){ return false; }
}
