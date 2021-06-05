package Model.Items;

import Model.IPokemon;

public class Ether extends AbstractItem implements IItem{
    public Ether (int restorePP) {
        super(0, restorePP);
    }

    @Override
    public void use(IPokemon pokemon) {
        pokemon.useEther(this);
    }
}
