package data_pack.card_pack;

public abstract class CardStack {
    protected Card cards[];
    private int current = 0;

    public void shuffle(){}
    public Card reveal(){ return cards[current]; }
    public void refresh(){}
}
