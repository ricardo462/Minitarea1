public abstract class AbstractPokemon implements IPokemon {
    protected String name;
    protected String species;
    protected int health;

    public AbstractPokemon(String name, String species, int health){
        this.name = name;
        this.species = species;
        this.health = health;
    }
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDefeated(){
        if (health <= 0) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Pokemon's name: " + name + ", Pokemon's type: "+ this.getClass().getName() + ", Pokemon's species: " + species + ", Pokemon's current health points: " + health;
    }
}
