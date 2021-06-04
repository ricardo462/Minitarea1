package Model.Factories;

import Model.WaterPokemon;

public class WaterPokemonFactory extends AbstractFactory implements IFactory{
    public WaterPokemonFactory(String name, String species, int maxHP, int maxPP) {
        super(name, species, maxHP, maxPP);
    }

    @Override
    public WaterPokemon create() {
        return new WaterPokemon(getName(), getSpecies(), getMaxHP(), getMaxPP());
    }
}
