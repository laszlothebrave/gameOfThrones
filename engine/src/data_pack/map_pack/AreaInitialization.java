package data_pack.map_pack;

import java.util.HashMap;

public class AreaInitialization {
    public static HashMap<AreaName,Area> create(int numberOfPlayers){
        int numberOfArea;
        HashMap<AreaName,Area> areaList;
        areaList = new HashMap<>();
        if (numberOfPlayers >= 3) {
            areaList.put(AreaName.czarnyZamek,new LandArea(AreaName.czarnyZamek, 0, 1, 0));
            areaList.put(AreaName.karhold,new LandArea(AreaName.karhold, 0, 1, 0));
            areaList.put(AreaName.winterfell,new LandArea(AreaName.winterfell, 1, 1, 2));
            areaList.put(AreaName.białyPortArea,new LandArea(AreaName.białyPortArea, 0, 0, 1));
            areaList.put(AreaName.wdowiaStraznica,new LandArea(AreaName.wdowiaStraznica, 1, 0, 0));
            areaList.put(AreaName.kamiennyBrzeg,new LandArea(AreaName.kamiennyBrzeg, 1, 0, 0));
            areaList.put(AreaName.straznicaNadSzaraWoda,new LandArea(AreaName.straznicaNadSzaraWoda, 1, 0, 0));
            areaList.put(AreaName.fosaCailin,new LandArea(AreaName.fosaCailin, 0, 0, 1));
            areaList.put(AreaName.palecFlinta,new LandArea(AreaName.palecFlinta, 0, 0, 1));
            areaList.put(AreaName.seagard,new LandArea(AreaName.seagard, 1, 1, 2));
            areaList.put(AreaName.blizniaki,new LandArea(AreaName.blizniaki, 0, 1, 0));
            areaList.put(AreaName.paluchy,new LandArea(AreaName.paluchy, 1, 0, 0));
            areaList.put(AreaName.goryKsiezycowe,new LandArea(AreaName.goryKsiezycowe, 1, 0, 0));
            areaList.put(AreaName.orleGniazdo,new LandArea(AreaName.orleGniazdo, 1, 1, 1));
            areaList.put(AreaName.riverrun,new LandArea(AreaName.riverrun, 1, 1, 2));
            areaList.put(AreaName.lanisport,new LandArea(AreaName.lanisport, 2, 0, 2));
            areaList.put(AreaName.kamiennySept,new LandArea(AreaName.kamiennySept,0, 1, 0));
            areaList.put(AreaName.szczypcowyPrzyladek,new LandArea(AreaName.szczypcowyPrzyladek, 0, 0, 1));
            areaList.put(AreaName.smoczaSkala,new LandArea(AreaName.smoczaSkala,1, 1, 2));
            areaList.put(AreaName.krolewskiLas ,new LandArea(AreaName.krolewskiLas, 1, 1, 0));
            areaList.put(AreaName.koniecBurzy,new LandArea(AreaName.koniecBurzy,0, 0, 1));
            areaList.put(AreaName.szlakKosci,new LandArea(AreaName.szlakKosci, 0, 1, 0));
            areaList.put(AreaName.dornijskiePogranicze,new LandArea(AreaName.dornijskiePogranicze, 0, 1, 0));
            areaList.put(AreaName.przelenczKsiecia,new LandArea(AreaName.przelenczKsiecia, 1, 1, 0));
            areaList.put(AreaName.trzyWieze,new LandArea(AreaName.trzyWieze, 1, 0, 0));
            areaList.put(AreaName.stareMiasto,new LandArea(AreaName.stareMiasto, 0, 0, 2));
            areaList.put(AreaName.wysogrod,new LandArea(AreaName.wysogrod, 2, 0,2));
            areaList.put(AreaName.mokradlaWschodniegoTraktu,new LandArea(AreaName.mokradlaWschodniegoTraktu, 1, 0, 0));
            areaList.put(AreaName.harrenhal,new LandArea(AreaName.harrenhal, 0, 1, 1));
            areaList.put(AreaName.starfall,new LandArea(AreaName.starfall, 1, 0, 1));
            areaList.put(AreaName.yronwood,new LandArea(AreaName.yronwood, 0, 0, 1));
            areaList.put(AreaName.slonyBrzeg,new LandArea(AreaName.slonyBrzeg, 1, 0, 0));
            areaList.put(AreaName.slonecznaWlocznia,new LandArea(AreaName.slonecznaWlocznia, 1, 1, 2));
            areaList.put(AreaName.reach,new LandArea(AreaName.reach, 0, 0, 1));
            areaList.put(AreaName.pyke,new LandArea(AreaName.pyke, 1, 1,2));
            areaList.put(AreaName.arbor,new LandArea(AreaName.arbor, 0, 1, 0));
            areaList.put(AreaName.krolewskaPrzystan,new LandArea(AreaName.krolewskaPrzystan, 0, 2, 2));
            areaList.put(AreaName.czarnyNurt,new LandArea(AreaName.czarnyNurt, 2, 0, 0));

            areaList.put(AreaName.portWinterfell,new PortArea(AreaName.portWinterfell));
            areaList.put(AreaName.portBiałyPortArea,new PortArea(AreaName.portBiałyPortArea));
            areaList.put(AreaName.portPyke,new PortArea(AreaName.portPyke));
            areaList.put(AreaName.portLanisport,new PortArea(AreaName.portLanisport));
            areaList.put(AreaName.portSmoczaSkala,new PortArea(AreaName.smoczaSkala));
            areaList.put(AreaName.portKoniecBurzy,new PortArea(AreaName.portKoniecBurzy));
            areaList.put(AreaName.portStareMiasto,new PortArea(AreaName.portStareMiasto));
            areaList.put(AreaName.portSlonecznaWlocznia,new PortArea(AreaName.portSlonecznaWlocznia));

            areaList.put(AreaName.morzeDreszczy,new SeaArea(AreaName.morzeDreszczy));
            areaList.put(AreaName.waskieMorze,new SeaArea(AreaName.waskieMorze));
            areaList.put(AreaName.zatokaRozbitkow,new SeaArea(AreaName.zatokaRozbitkow));
            areaList.put(AreaName.czarnaZatoka,new SeaArea(AreaName.czarnaZatoka));
            areaList.put(AreaName.wschodnieMorzeLetnie,new SeaArea(AreaName.wschodnieMorzeLetnie));
            areaList.put(AreaName.morzeDornijskie,new SeaArea(AreaName.morzeDornijskie));
            areaList.put(AreaName.zachodnieMorzeLetnie,new SeaArea(AreaName.zachodnieMorzeLetnie));
            areaList.put(AreaName.morzeZachodzacegoSlonca,new SeaArea(AreaName.morzeZachodzacegoSlonca));
            areaList.put(AreaName.zlotaCiesnina,new SeaArea(AreaName.zlotaCiesnina));
            areaList.put(AreaName.lodowaZatoka,new SeaArea(AreaName.lodowaZatoka));
            areaList.put(AreaName.ciesninaRedwyne,new SeaArea(AreaName.ciesninaRedwyne));
            areaList.put(AreaName.zatokaZelaznychLudzi,new SeaArea(AreaName.zatokaZelaznychLudzi));

        }
        if (numberOfPlayers >= 4) {

        }
        if (numberOfPlayers >= 5) {

        }
        if (numberOfPlayers >= 6) {

        }
        return areaList;
    }
}
