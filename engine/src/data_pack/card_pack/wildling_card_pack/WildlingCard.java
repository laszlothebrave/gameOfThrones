package data_pack.card_pack.wildling_card_pack;

import data_pack.card_pack.Card;

public abstract class WildlingCard implements Card {

    protected abstract void resolveNightWatch();

    protected abstract void resolveWildling();

    public WildlingCard(){

    }
}
