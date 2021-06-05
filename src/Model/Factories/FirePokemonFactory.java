package Model.Factories;

import Model.FirePokemon;

public class FirePokemonFactory extends AbstractFactory implements IFactory{
    public FirePokemonFactory(String name, String species, int maxHP, int maxPP) {
        super(name, species, maxHP, maxPP);
    }

    @Override
    public FirePokemon create() {
        return new FirePokemon(getName(), getSpecies(), getMaxHP(), getMaxPP());
    }
}
