package Model.Items;

import Model.IPokemon;

public class FullRestore extends AbstractItem implements IItem{
    public FullRestore(){
        super(1000000, 1000000);
    }

    // Implementing double dispatch:
    // A Item doesn't know what kind of pokemon is affecting, but he knows what kind of item is itself,
    // so it tells the other to receive the correct restore

    /* uses the cure in one pokemon */
    @Override
    public void use(IPokemon pokemon) {
        pokemon.useFullRestore(this);
    }
}
