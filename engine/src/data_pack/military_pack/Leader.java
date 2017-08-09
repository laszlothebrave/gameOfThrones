package data_pack.military_pack;

public abstract class Leader {
    private int Strength;

    public Leader(int Strength){
        this.Strength = Strength;
    }

    public abstract void resolve();
}
