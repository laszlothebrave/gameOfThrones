package data_pack.military_pack;

import exception_pack.UnitTypeLimitReachedException;

public class Army {
    private int Infantry;
    private int Cavalry;
    private int Ship;
    private int Tower;

    public Army(int Infantry, int Cavalry, int Ship, int Tower){
        this.Infantry = Infantry;
        this.Cavalry = Cavalry;
        this.Ship = Ship;
        this.Tower = Tower;
    }

    public void addSoldier(int Infantry, int Cavalry, int Ship, int Tower){
        this.Infantry += Infantry;
        this.Cavalry += Cavalry;
        this.Ship += Ship;
        this.Tower += Tower;
    }

    public void removeSoldier (int Infantry, int Cavalry, int Ship, int Tower) throws UnitTypeLimitReachedException {
        isAvailable(Infantry, Cavalry, Ship, Tower);
        this.Infantry -= Infantry;
        this.Cavalry -= Cavalry;
        this.Ship -= Ship;
        this.Tower -= Tower;
    }

    private void isAvailable(int Infantry, int Cavalry, int Ship, int Tower) throws UnitTypeLimitReachedException {
        if (this.Infantry < Infantry) throw new UnitTypeLimitReachedException();
        if (this.Cavalry < Cavalry) throw new UnitTypeLimitReachedException();
        if (this.Ship < Ship) throw new UnitTypeLimitReachedException();
        if (this.Tower < Tower) throw new UnitTypeLimitReachedException();
    }

    public int getInfantry() { return Infantry; }
    public int getCavalry() { return Cavalry; }
    public int getShip() { return Ship; }
    public int getTower() { return Tower; }
}
