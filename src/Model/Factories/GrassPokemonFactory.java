package Model.Factories;

import Model.GrassPokemon;

public class GrassPokemonFactory extends AbstractFactory implements IFactory{

    public GrassPokemonFactory(String name, String species, int maxHP, int maxPP) {
        super(name, species, maxHP, maxPP);
    }

    @Override
    public GrassPokemon create() {
        return new GrassPokemon(getName(), getSpecies(), getMaxHP(), getMaxPP());
    }
}
