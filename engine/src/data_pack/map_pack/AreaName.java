package data_pack.map_pack;

public enum AreaName {
    czarnyZamek ("Czarny Zamek"),
    karhold ("Karhold"),
    winterfell ("Winterfell"),
    kamiennyBrzeg ("Kamienny brzeg"),
    białyPortArea ("Biały PortArea"),
    wdowiaStraznica ("Wdowia Strażnica"),
    portWinterfell ("PortArea w Winterfell"),
    lodowaZatoka ("Lodowa Zatoka"),
    morzeDreszczy ("Morze Dreszczy"),
    portBiałyPortArea ("PortArea Bialy PortArea"),
    palecFlinta ("Palec Flinta"),
    straznicaNadSzaraWoda ("Strażnica nad Szarą Wodą"),
    fosaCailin("Fosa Cailin"),
    seagard ("SeaAreagard"),
    blizniaki ("Bliźniaki"),
    paluchy ("Paluchy"),
    goryKsiezycowe ("Gory księżycowe"),
    orleGniazdo("Orle Gniazdo"),
    pyke ("Pyke"),
    portPyke ("PortArea Pyke"),
    riverrun ("Riverrun"),
    lanisport ("Lanisport"),
    portLanisport ("PortArea Lanisport"),
    kamiennySept ("Kamienny Sept"),
    harrenhal ("Harrenhal"),
    szczypcowyPrzyladek ("Szczypcowy Przylądek"),
    smoczaSkala ("Smocza Skala"),
    portSmoczaSkala ("PortArea Smocza Skala"),
    morzeZachodzacegoSlonca ("Morze Zachodzącego Słońca"),
    zatokaZelaznychLudzi ("Zatoka Żelaznych Ludzi"),
    zlotaCiesnina ("Złota Cieśnina"),
    waskieMorze ("Wąskie Morze"),
    czarnaZatoka ("Czarna Zatoka"),
    zatokaRozbitkow ("Zatoka Rozbitków"),
    wschodnieMorzeLetnie ("Wschodnie Morze Letnie"),
    zachodnieMorzeLetnie ("Zachodnie Morze Letnie"),
    morzeDornijskie ("Morze Dornijskie"),
    ciesninaRedwyne ("Cieśnina Renwyne'ów"),
    arbor ("Arbor"),
    mokradlaWschodniegoTraktu ("Mokradła Wschodniego Traktu"),
    czarnyNurt ("Czarny nurt"),
    krolewskaPrzystan ("Królewska Przystań"),
    wysogrod ("Wysogród"),
    reach ("Reach"),
    krolewskiLas ("Królewski Las"),
    koniecBurzy ("Koniec Burzy"),
    portKoniecBurzy("PortArea Koniec Burzy"),
    szlakKosci ("Szlak Kości"),
    dornijskiePogranicze ("Dornijskie Pogranicze"),
    stareMiasto ("Stare Miasto"),
    portStareMiasto ("PortArea Stare Miasto"),
    trzyWieze ("Trzy Wieże"),
    przelenczKsiecia("Przełencz Księcia"),
    starfall ("Starfall"),
    yronwood ("Yronwood"),
    slonyBrzeg("Słony Brzeg"),
    slonecznaWlocznia ("Słoneczna Włócznia"),
    portSlonecznaWlocznia ("PortArea Słoneczna Włócznia");

    private String name;

    AreaName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
