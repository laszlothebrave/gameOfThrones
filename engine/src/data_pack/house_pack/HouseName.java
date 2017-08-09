package data_pack.house_pack;

public enum HouseName {
    Stark ("Ród Starków"),
    Greyjoy("Ród Greyjoyów"),
    Lannister("Ród Lannisterów"),
    Martell("Ród Martellów"),
    Tyrell("Ród Tyrellów"),
    Baratheon("Ród Baratheonów");

    private String name;

    HouseName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
