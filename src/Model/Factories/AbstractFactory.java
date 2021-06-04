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

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxPP() {
        return maxPP;
    }

    public void setMaxPP(int maxPP) {
        this.maxPP = maxPP;
    }
}
