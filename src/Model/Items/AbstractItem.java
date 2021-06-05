package Model.Items;

public abstract class AbstractItem {
    private int restorePP;
    private int restoreHP;

    public AbstractItem(int restoreHP, int restorePP){
        setRestoreHP(restoreHP);
        setRestorePP(restorePP);
    }

    public int getRestorePP() {
        return restorePP;
    }

    public void setRestorePP(int restorePP) {
        this.restorePP = restorePP;
    }

    public int getRestoreHP() {
        return restoreHP;
    }

    public void setRestoreHP(int restoreHP) {
        this.restoreHP = restoreHP;
    }
}
