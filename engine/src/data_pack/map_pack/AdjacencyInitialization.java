package data_pack.map_pack;

import java.util.ArrayList;
import java.util.HashMap;

public class AdjacencyInitialization {

    private static HashMap<Area, ArrayList<Area>> adjacencyHashMap;
    private static HashMap<AreaName,Area> areaHashMap;

    public static HashMap<Area,ArrayList <Area>> create(int numberOfPlayer, HashMap<AreaName,Area> areaHashMapOrginal){
        areaHashMap = areaHashMapOrginal;
        adjacencyHashMap = new HashMap<>();
        add(AreaName.winterfell, new AreaName[] {AreaName.portWinterfell});

        return adjacencyHashMap;
    }

    private static void add(AreaName key, AreaName[] neighbourTab){
        ArrayList<Area> areaArrayList = new ArrayList<>();
        for (AreaName neighbour : neighbourTab) {
            areaArrayList.add(areaHashMap.get(neighbour));
        }
        adjacencyHashMap.put(areaHashMap.get(key), areaArrayList);
    }
}
