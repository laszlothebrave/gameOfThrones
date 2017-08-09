package data_pack.order_pack;

import exception_pack.InvalidOrderException;
import data_pack.Player;
import data_pack.map_pack.Area;

import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orderList;
    private int numberOfStar;

    public OrderList(){
        orderList = new ArrayList<Order>();
        orderList.add(new March(false, -1));
        orderList.add(new March(false, 0));
        orderList.add(new March(true, 1));
        orderList.add(new Defense(false, 1));
        orderList.add(new Defense(false, 1));
        orderList.add(new Defense(true, 2));
        orderList.add(new Raid(false, 0));
        orderList.add(new Raid(false, 0));
        orderList.add(new Raid(true, 0));
        orderList.add(new GetTaxes(false, 0));
        orderList.add(new GetTaxes(false, 0));
        orderList.add(new GetTaxes(true, 0));
        orderList.add(new Support(false, 0));
        orderList.add(new Support(false, 0));
        orderList.add(new Support(true, 0));
    }

    public void placeOrder(Order order, Area area, Player player) throws InvalidOrderException {
        if (!order.isAvailable()) throw new InvalidOrderException();
        if (area.getOwner() != player) throw new InvalidOrderException();
        if (order.hasStar() && (numberOfStar==0)) throw new InvalidOrderException();
        if (area.getOrder() != null) throw new InvalidOrderException();
        order.setAvailable(false);
        if(order.hasStar()) numberOfStar--;
        area.setOrder(order);
    }

    public void removeOrder(Area area, Player player) throws InvalidOrderException {
        if (area.getOwner() != player) throw new InvalidOrderException();
        if (area.getOrder() != null) throw new InvalidOrderException();
        if(area.getOrder().hasStar()) numberOfStar++;
        area.getOrder().setAvailable(true);
        area.setOrder(null);
    }

    public void setNumberOfStars(int numberOfStar) {
        this.numberOfStar = numberOfStar;
    }

    public int getNumberOfStars() {
        return numberOfStar;
    }
}
