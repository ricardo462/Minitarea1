public class GrassPokemon extends AbstractPokemon{
    public GrassPokemon(String name, String species, int health){
        super(name, species, health);
    }

    public void attack(IPokemon pokemon){
        pokemon.receiveGrassDamage();
    }
    public void receiveFireDamage(){
        health -= 10;
    }
    public void receiveWaterDamage(){
        health -= 5;
    }
    public void receiveGrassDamage(){
        health -= 5;
    }
}
