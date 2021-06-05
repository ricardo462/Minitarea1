package Model.Items;

import Model.IPokemon;

public class Potion extends AbstractItem implements IItem{
    public Potion(int restoreHP){
        super(restoreHP, 0);
    }

    @Override
    public void use(IPokemon pokemon) {
        pokemon.usePotion(this);
    }
}
