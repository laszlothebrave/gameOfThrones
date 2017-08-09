package data_pack.order_pack;

public abstract class Order {
    private boolean hasStar;
    private int modifier;
    private boolean isAvailable;

    public Order (boolean hasStar, int modifier){
        this.hasStar = hasStar;
        this.modifier = modifier;
        isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
    public boolean hasStar() {
        return hasStar;
    }
    public int getModifier() {
        return modifier;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    abstract void resolve();
}