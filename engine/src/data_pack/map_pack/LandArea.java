package data_pack.map_pack;

public class LandArea extends Area {
    private boolean isCapital;
    private int supplies;
    private int areaGold;
    private int castleStrength;
    private boolean isMark;

    LandArea(AreaName areaName, int supplice, int areaGold, int castleStrength) {
        super(areaName);
        this.isCapital = false;
        this.supplies = supplice;
        this.areaGold = areaGold;
        this.isMark = false;
    }

    public int getSupplies(){
        return supplies;
    }

    public boolean hasVictoryPoint(){ return (castleStrength>0); }
}
