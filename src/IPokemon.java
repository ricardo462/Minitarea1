public interface IPokemon {
    public String getName();
    public String getSpecies();
    public void setName(String name);
    public void setSpecies(String species);
    public void attack();
    public void attackFire();
    public void attackWater();
    public void attackGrass();
    public void receiveDamage(int damage);
}

