package exception_pack;

import data_pack.Player;

public class VictoryException extends Exception{
    public Player Winner;

    public VictoryException(Player Winner){
        System.out.print("Winner is " + Winner.getPlayerName() + "of house " + Winner.getHouse().getHouseName().getName());
        this.Winner = Winner;
    }

    public Player getWinner() {
        return Winner;
    }

}
