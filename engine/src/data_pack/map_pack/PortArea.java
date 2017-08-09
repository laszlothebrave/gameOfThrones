package data_pack.map_pack;

public class PortArea extends  Area {
    PortArea(AreaName areaName) {
        super(areaName);
    }

    public int getSupplies() {
        return 0;
    }

    public boolean hasVictoryPoint() { return false; }
}
