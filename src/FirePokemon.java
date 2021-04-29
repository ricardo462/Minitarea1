public class FirePokemon extends AbstractPokemon{

    public FirePokemon(String name, String species, int health){
        super(name, species, health);
    }

    public void attack(IPokemon pokemon){
        if(!isDefeated()){
        pokemon.receiveFireDamage();}
    }
    public void receiveFireDamage(){
        if(!isDefeated()){
            health -= 5;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
    public void receiveWaterDamage(){
        if(!isDefeated()){
            health -= 10;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
    public void receiveGrassDamage(){
        if(!isDefeated()){
            health -= 5;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
}
