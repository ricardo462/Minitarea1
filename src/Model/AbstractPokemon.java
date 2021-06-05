package Model;

import Model.Items.Ether;
import Model.Items.FullRestore;
import Model.Items.Potion;

public abstract class AbstractPokemon implements IPokemon {
    private String name;
    private String species;
    private int currentHP;
    private int currentPP;
    private final int maxHP;
    private final int maxPP;


    public AbstractPokemon(String name, String species, int maxHP, int maxPP){
        setName(name);
        setSpecies(species);
        this.maxHP = maxHP;
        this.maxPP = maxPP;
        setCurrentHP(maxHP);
        setCurrentPP(maxPP);

    }
    // Getters and setters

    /* gets the name of the pokemon */
    public String getName() {
        return name;
    }

    /* sets the name of the pokemon */
    public void setName(String name) {
        this.name = name;
    }

    /* gets the species of the pokemon */
    public String getSpecies() {
        return species;
    }

    /* sets the species of the pokemon */
    public void setSpecies(String species) {
        this.species = species;
    }

    /* gets the current HP of the pokemon*/
    public int getCurrentHP() {
        return currentHP;
    }

    /* sets the HP of the pokemon. If it exceeds the maximum value, it sets it to the maximum */
    public void setCurrentHP(int currentHP) {
        if(currentHP > getMaxHP()) {
            this.currentHP = getMaxHP();
        } else {
            this.currentHP = currentHP;
        }
    }
    /* gets the current PP of the pokemon */
    public int getCurrentPP() {
        return currentPP;
    }
    /* sets the PP of the pokemon. If it exceeds the maximum value, it sets it to the maximum */
    public void setCurrentPP(int currentPP) {
        if (currentPP > getMaxPP()) {
            this.currentPP = maxPP;
        } else {
            this.currentPP = currentPP;
        }
    }
    /* gets the maximum HP of the pokemon */
    public int getMaxHP() {
        return maxHP;
    }
    /* gets the maximum PP of the pokemon */
    public int getMaxPP() {
        return maxPP;
    }

    /* checks if the pokemon is defeated */
    public boolean isDefeated(){
        return currentHP <= 0;
    }
    /* Returns the relevant info of the Pokemon */
    @Override
    public String toString() {
        return "Pokemon's name: " + getName() + ", Pokemon's type: "+ this.getClass().getName() + ", Pokemon's species: " + getSpecies() + ", Pokemon's current HP: " + getCurrentHP() + ", Pokemon's current PP: " + getCurrentPP() + " Pokemon's max HP: " + getMaxHP() + " Pokemon's max PP: " + getMaxPP();
    }

    /* receives the HP from a potion, changing currentHP value */
    @Override
    public void usePotion(Potion potion){
        setCurrentHP(getCurrentHP() + potion.getRestoreHP());
    }

    /* receives the PP from a ether, changing currentPP value */
    @Override
    public void useEther(Ether ether) {
        setCurrentPP(getCurrentPP() + ether.getRestorePP());
    }

    /* sets currentHP and currentPP to their maximum values */
    @Override
    public void useFullRestore(FullRestore fullRestore) {
        setCurrentHP(fullRestore.getRestoreHP());
        setCurrentPP(fullRestore.getRestorePP());
    }
}
