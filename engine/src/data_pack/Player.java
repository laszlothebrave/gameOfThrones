package data_pack;

import data_pack.house_pack.HouseName;
import data_pack.map_pack.Area;
import data_pack.map_pack.AreaName;
import data_pack.military_pack.Army;
import data_pack.house_pack.House;
import data_pack.order_pack.OrderList;
import data_pack.wallet_pack.Wallet;

public class Player {
    private PlayerName playerName;
    private Wallet wallet;
    private Army army;
    private OrderList orderList;
    private House house;

    public Player(PlayerName playerName){
        this.playerName = playerName;
        wallet = new Wallet();
        army = new Army(10, 5, 6, 2);
        orderList = new OrderList();
        this.house = null;
    }

    public String getPlayerName() {
        return playerName.getName();
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Army getArmy() {
        return army;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public House getHouse() {
        return house;
    }

    public void addArea(AreaName areaName){
        house.getAreaList().addArea(areaName, this);

    }
}
