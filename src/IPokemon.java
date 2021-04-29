public interface IPokemon {
    public String getName(); // gets the name of the pokemon
    public String getSpecies(); // gets the species of the pokemon
    public void setName(String name); // sets the name of the pokemon
    public void setSpecies(String species); // sets the species of the pokemon
    public void attack(IPokemon p); // attacks another pokemon unless the pokemon is defeated
    public void receiveFireDamage(); // receives damage from a fire pokemon unless the pokemon is defeated
    public void receiveWaterDamage(); // receives damage from a water pokemon
    public void receiveGrassDamage(); // receives damage from a grass pokemon
    public boolean isDefeated(); // checks if the pokemon is defeated
}

