package data_pack.card_pack.wildling_card_pack;

import data_pack.card_pack.*;

public class WildlingCardStack extends CardStack{
    public WildlingCardStack(){
        cards = new Card[9];
        cards[0] = new MammothRiders();
        cards[1] = new MammothRiders();
        cards[2] = new MammothRiders();
        cards[3] = new MammothRiders();
        cards[4] = new MammothRiders();
        cards[5] = new MammothRiders();
        cards[6] = new MammothRiders();
        cards[7] = new MammothRiders();
        cards[8] = new MammothRiders();
        shuffle();
    }

}
