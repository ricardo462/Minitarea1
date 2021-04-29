import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WaterPokemon squirtle = new WaterPokemon("Ed", "Squirtle", 100);
        FirePokemon charmander = new FirePokemon("Edd", "Charmander", 100);
        GrassPokemon bulbbasaur = new GrassPokemon("Eddy", "bulbasaur", 100);
        IPokemon[] pokemonsArray = new IPokemon[]{squirtle, charmander, bulbbasaur};

        attack(charmander,bulbbasaur);
        attack(bulbbasaur,charmander);
        attack(charmander, squirtle);
        attack(squirtle, charmander);
        attack(squirtle, bulbbasaur);
        attack(bulbbasaur, squirtle);


        // charmander got confused and began to attack himself
        System.out.println("\ncharmander got confused and began to attack himself");
        for(int i = 0; i<17; i++){
            charmander.attack(charmander);
            System.out.println(charmander.toString());
        }
        }
    public static void attack(IPokemon attacker, IPokemon victim){
        System.out.println("\n\n" +attacker.getClass().getName() + " attacks " + victim.getClass().getName() + "\n");
        System.out.println("Victim's info before the attack:");
        System.out.println(victim.toString());
        attacker.attack(victim);
        System.out.println("Victim's info after the attack:");
        System.out.println(victim.toString());
        System.out.println("---------------------------------------------------------------------------------------");
    }
    }

