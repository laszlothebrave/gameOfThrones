package data_pack.map_pack;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    AreaList areaList;
    HashMap<Area,ArrayList <Area>> neighbourHashMap;

    public Map(int numberOfPlayer){
        areaList = new AreaList(numberOfPlayer);
        neighbourHashMap = AdjacencyInitialization.create(numberOfPlayer, areaList.getAreaHashMap());
    }


}
