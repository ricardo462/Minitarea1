public class WaterPokemon extends AbstractPokemon{

    public WaterPokemon(String name, String species, int health){
        super(name, species, health);
    }

    public void attack(IPokemon pokemon){}
    public void receiveFireDamage(IPokemon pokemon){
        health -= 5;
    }
    public void receiveWaterDamage(IPokemon pokemon){
        health -= 5;
    }
    public void receiveGrassDamage(IPokemon pokemon){
        health -= 10;
    }
}
