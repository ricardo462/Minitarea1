public class FirePokemon extends AbstractPokemon{

    public FirePokemon(String name, String species, int health){
        super(name, species, health);
    }

    // Implementing double dispatch:
    // A pokemon doesn't know what kind of pokemon is attacking, but he knows what kind of Pokemon is itself,
    // so it tells the other to receive the correct damage


    // attacks another pokemon unless the current pokemon is defeated
    public void attack(IPokemon pokemon){
        if(!isDefeated()){
        pokemon.receiveFireDamage();}
    }

    // receives damage from a fire pokemon unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveFireDamage(){
        if(!isDefeated()){
            health -= 5;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
    // receives damage from a water pokemon, unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveWaterDamage(){
        if(!isDefeated()){
            health -= 10;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
    // receives damage from a grass pokemon, unless the pokemon is defeated. (notice that the damage depends on the kind of the pokemon)
    public void receiveGrassDamage(){
        if(!isDefeated()){
            health -= 5;}
        else{
            System.out.println("Pokemon's can not attack defeated Pokemon");
        }
    }
}
