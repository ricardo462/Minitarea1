package Model;

import Model.Items.Ether;
import Model.Items.FullRestore;
import Model.Items.Potion;

public interface IPokemon {
    // Getters
    // gets the name of the pokemon
    public String getName();

    // gets the species of the pokemon
    public String getSpecies();

    // gets the health of the pokemon
    public int getCurrentHP();

    /* gets the current PP of the pokemon */
    int getCurrentPP();

    /* gets the maximum HP of the pokemon */
    public int getMaxHP();

    /* gets the maximum PP of the pokemon */
    public int getMaxPP();

    // Setters
    // sets the name of the pokemon
    public void setName(String name);

    // sets the species of the pokemon
    public void setSpecies(String species);

    // sets the health of the pokemon
    public void setCurrentHP(int currentHP);

    /* sets the PP of the pokemon. If it exceeds the maximum value, it sets it to the maximum */
    public void setCurrentPP(int currentPP);

    // Implementing double dispatch:
    // A pokemon doesn't know what kind of pokemon is attacking, but he knows what kind of Pokemon is itself,
    // so it tells the other to receive the correct damage

    // attacks another pokemon unless the current pokemon is defeated
    public void attack(IPokemon p);
    // receives damage from a fire pokemon, unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveFireDamage(FirePokemon firePokemon);
    // receives damage from a water pokemon, unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveWaterDamage(WaterPokemon waterPokemon);
    // receives damage from a grass pokemon, unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveGrassDamage(GrassPokemon grassPokemon);
    // checks if the pokemon is defeated
    public boolean isDefeated();

    /* receives the HP from a potion, changing currentHP value */
    void usePotion(Potion potion);

    /* receives the PP from a ether, changing currentPP value */
    void useEther(Ether ether);

    /* sets currentHP and currentPP to their maximum values */
    void useFullRestore(FullRestore fullRestore);
}

