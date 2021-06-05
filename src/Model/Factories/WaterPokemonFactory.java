package Model.Factories;

import Model.WaterPokemon;

public class WaterPokemonFactory extends AbstractFactory implements IFactory{
    public WaterPokemonFactory(String name, String species, int maxHP, int maxPP) {
        super(name, species, maxHP, maxPP);
    }
    /* creates a water pokemon with the storage values, and returns it */
    @Override
    public WaterPokemon create() {
        return new WaterPokemon(getName(), getSpecies(), getMaxHP(), getMaxPP());
    }
}
