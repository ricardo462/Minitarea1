package Model.Factories;

public abstract class AbstractFactory {
    private String name;
    private String species;
    private int maxHP;
    private int maxPP;

    public AbstractFactory(String name, String species, int maxHP, int maxPP){
        setName(name);
        setSpecies(species);
        setMaxHP(maxHP);
        setMaxPP(maxPP);
    }
    /* gets the current name of the pokemon in the factory */
    public String getName() {
        return name;
    }
    /* sets the current name of the pokemon in the factory */
    public void setName(String name) {
        this.name = name;
    }

    /* gets the current species of the pokemon in the factory */
    public String getSpecies() {
        return species;
    }

    /* sets the current species of the pokemon in the factory */
    public void setSpecies(String species) {
        this.species = species;
    }

    /* gets the current MaxHP of the pokemon in the factory */
    public int getMaxHP() {
        return maxHP;
    }

    /* sets the current maxHP of the pokemon in the factory */
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    /* gets the current max PP of the pokemon in the factory */
    public int getMaxPP() {
        return maxPP;
    }

    /* sets the current maxPP of the pokemon in the factory */
    public void setMaxPP(int maxPP) {
        this.maxPP = maxPP;
    }
}
