package message_pack;

import data_pack.PlayerName;
import data_pack.house_pack.HouseName;

import java.io.Serializable;
import java.util.ArrayList;

public class AssignHousePreference extends Message implements Serializable{
    public ArrayList<HouseName> HousePreferenceList;

    AssignHousePreference(PlayerName player) {
        super(player);
        HousePreferenceList = new ArrayList <HouseName>();
    }

    public void addHouse (HouseName house){
        HousePreferenceList.add(house);
    }

    public void switchHouse (int houseOne, int houseTwo){
        HouseName tmp = HousePreferenceList.get(houseOne);
        HousePreferenceList.set(houseOne, HousePreferenceList.get(houseTwo));
        HousePreferenceList.set(houseTwo, tmp);
    }
}