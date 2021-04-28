public class WaterPokemon extends AbstractPokemon{

    public WaterPokemon(String name, String species, int health){
        super(name, species, health);
    }

    public void attack(IPokemon pokemon){
        pokemon.receiveWaterDamage();
    }
    public void receiveFireDamage(){
        health -= 5;
    }
    public void receiveWaterDamage(){
        health -= 5;
    }
    public void receiveGrassDamage(){
        health -= 10;
    }
}
