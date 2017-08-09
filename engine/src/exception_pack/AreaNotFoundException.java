package exception_pack;

import data_pack.map_pack.Area;

public class AreaNotFoundException extends Exception{
    public Area area;

    public AreaNotFoundException(Area area){
        this.area = area;
        System.out.print("Area not found\n");
    }
}