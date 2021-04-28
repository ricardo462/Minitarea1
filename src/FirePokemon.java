public class FirePokemon extends AbstractPokemon{

    public FirePokemon(String name, String species, int health){
        super(name, species, health);
    }

    public void attack(IPokemon pokemon){
        pokemon.receiveFireDamage();
    }
    public void receiveFireDamage(){
        health -= 5;
    }
    public void receiveWaterDamage(){
        health -= 10;
    }
    public void receiveGrassDamage(){
        health -=5;
    }
}
