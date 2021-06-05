package Model.Items;

public abstract class AbstractItem {
    private int restorePP;
    private int restoreHP;

    public AbstractItem(int restoreHP, int restorePP){
        setRestoreHP(restoreHP);
        setRestorePP(restorePP);
    }
    /* returns the restorePP of the Item */
    public int getRestorePP() {
        return restorePP;
    }

    /* sets the restorePP of the Item */
    public void setRestorePP(int restorePP) {
        this.restorePP = restorePP;
    }

    /* returns the restoreHP of the Item */
    public int getRestoreHP() {
        return restoreHP;
    }

    /* sets the restoreHP of the Item */
    public void setRestoreHP(int restoreHP) {
        this.restoreHP = restoreHP;
    }
}
