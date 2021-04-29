public abstract class AbstractPokemon implements IPokemon {
    protected String name;
    protected String species;
    protected int health;

    public AbstractPokemon(String name, String species, int health){
        setName(name);
        setSpecies(species);
        setHealth(getHealth());
    }
    // Getters and setters

    // gets the name of the pokemon
    public String getName() {
        return name;
    }

    // sets the name of the pokemon
    public void setName(String name) {
        this.name = name;
    }

    // gets the species of the pokemon
    public String getSpecies() {
        return species;
    }

    // sets the species of the pokemon
    public void setSpecies(String species) {
        this.species = species;
    }

    // gets the health of the pokemon
    public int getHealth() {
        return health;
    }

    // sets the health of the pokemon
    public void setHealth(int health) {
        this.health = health;
    }

    // checks if the pokemon is defeated
    public boolean isDefeated(){
        return health <= 0;
    }
    // Returns the relevant info of the Pokemon
    @Override
    public String toString() {
        return "Pokemon's name: " + getName() + ", Pokemon's type: "+ this.getClass().getName() + ", Pokemon's species: " + getSpecies() + ", Pokemon's current health points: " + getHealth();
    }
}
