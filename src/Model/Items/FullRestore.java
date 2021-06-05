package Model.Items;

import Model.IPokemon;

public class FullRestore extends AbstractItem implements IItem{
    public FullRestore(){
        super(1000000, 1000000);
    }

    @Override
    public void use(IPokemon pokemon) {
        pokemon.useFullRestore(this);
    }
}
