package data_pack.house_pack;

import data_pack.Player;
import exception_pack.VictoryException;
import data_pack.map_pack.*;
import data_pack.military_pack.LeaderList;

public abstract class House {
    private HouseName houseName;
    private int supplyTrack;
    private int victoryTrack;
    private AreaList areaList;
    private LeaderList leaderList;

    public House(int suppliesTrack, int victoryTrack, HouseName name){
        this.supplyTrack = suppliesTrack;
        this.victoryTrack = victoryTrack;
        this.houseName = name;
    }

    public void updateSupplyTrack(){
        supplyTrack = areaList.getSupplies();
    }

    public void updateVictoryTrack() throws VictoryException {
        victoryTrack = areaList.getVictory();
    }

    public HouseName getHouseName() {
        return houseName;
    }

    public AreaList getAreaList() {
        return areaList;
    }

    public LeaderList getLeaderList() {
        return leaderList;
    }

}
