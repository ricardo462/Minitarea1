package Model.Items;

import Model.IPokemon;

public class Potion extends AbstractItem implements IItem{
    public Potion(int restoreHP){
        super(restoreHP, 0);
    }

    // Implementing double dispatch:
    // A Item doesn't know what kind of pokemon is affecting, but he knows what kind of item is itself,
    // so it tells the other to receive the correct restore

    /* uses the cure in one pokemon */
    @Override
    public void use(IPokemon pokemon) {
        pokemon.usePotion(this);
    }
}
