public interface IPokemon {
    public String getName();
    public String getSpecies();
    public void setName(String name);
    public void setSpecies(String species);
    public void attack(IPokemon p);
    public void receiveFireDamage(IPokemon p);
    public void receiveWaterDamage(IPokemon p);
    public void receiveGrassDamage(IPokemon p);
}

