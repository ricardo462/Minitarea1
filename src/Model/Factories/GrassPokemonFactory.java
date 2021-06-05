package Model.Factories;

import Model.GrassPokemon;

public class GrassPokemonFactory extends AbstractFactory implements IFactory{

    public GrassPokemonFactory(String name, String species, int maxHP, int maxPP) {
        super(name, species, maxHP, maxPP);
    }

    /* creates a grass pokemon with the storage values, and returns it */
    @Override
    public GrassPokemon create() {
        return new GrassPokemon(getName(), getSpecies(), getMaxHP(), getMaxPP());
    }
}
