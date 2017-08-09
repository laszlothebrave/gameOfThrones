package data_pack.wallet_pack;

import exception_pack.*;

public class Wallet {
    static final int MAX_GOLD = 20;
    static final int INITIAL_GOLD = 5;
    private int bankGold;
    private int playerGold;

    public Wallet() {
        playerGold = INITIAL_GOLD;
        bankGold = MAX_GOLD - INITIAL_GOLD;
    }

    public void addGold(int amount) throws NoBankGoldException {
        if (!hasBank(amount)) {
            playerGold += bankGold;
            bankGold = 0;
            throw new NoBankGoldException();
        }
        playerGold += amount;
        bankGold -= amount;
    }

    public void removeGold(int amount) throws NoPlayerGoldException {
        if(!hasPlayer(amount)) throw new NoPlayerGoldException();
        playerGold -= amount;
        bankGold += amount;
    }

    public void putOneOnMap() throws NoPlayerGoldException {
        if (!hasPlayer(1)) throw new NoPlayerGoldException();
        playerGold--;
    }

    public void takeOneFromMap() { bankGold++; }
    public int getPlayerGold() {
        return playerGold;
    }
    public int getBankGold() {
        return bankGold;
    }

    private boolean hasPlayer(int amount) {
        if (amount <= playerGold) return true;
        return false;
    }

    private boolean hasBank(int amount) {
        if (amount <= bankGold) return true;
        return false;
    }
}
