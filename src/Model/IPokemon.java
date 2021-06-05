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

    // Setters
    // sets the name of the pokemon
    public void setName(String name);

    // sets the species of the pokemon
    public void setSpecies(String species);

    // sets the health of the pokemon
    public void setCurrentHP(int currentHP);

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

    void usePotion(Potion potion);

    void useEther(Ether ether);

    void useFullRestore(FullRestore fullRestore);
}

