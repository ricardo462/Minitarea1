import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Pokemons
        WaterPokemon squirtle = new WaterPokemon("Ed", "Squirtle", 100);
        FirePokemon charmander = new FirePokemon("Edd", "Charmander", 100);
        GrassPokemon bulbbasaur = new GrassPokemon("Eddy", "bulbasaur", 100);

        // Checking for the weaknesses and strengths
        System.out.println("Checking for weaknesses and strengths");
        testPokemonAttack(charmander,bulbbasaur);
        testPokemonAttack(bulbbasaur,charmander);
        testPokemonAttack(charmander, squirtle);
        testPokemonAttack(squirtle, charmander);
        testPokemonAttack(squirtle, bulbbasaur);
        testPokemonAttack(bulbbasaur, squirtle);


        // charmander got confused and began to attack himself
        System.out.println("\n\ncharmander got confused and began to attack himself");
        for(int i = 0; i<17; i++){
            testPokemonAttack(charmander, charmander);
            System.out.println(charmander.toString());
        }

        // testing that a defeated Pokemon can not attack and receive damage
        System.out.println("\n\nTesting that a defeated Pokemon can not attack and receive damage");
        testPokemonAttack(charmander, squirtle);
        testPokemonAttack(squirtle, charmander);



        }

    public static void testPokemonAttack(IPokemon attacker, IPokemon victim){
        // Displays the the info of the victim before and after the attacker attacks him
        System.out.println("\n\n" +attacker.getClass().getName() + " attacks " + victim.getClass().getName() + "\n");
        System.out.println("Victim's info before the attack:");
        System.out.println(victim.toString());
        attacker.attack(victim);
        System.out.println("Victim's info after the attack:");
        System.out.println(victim.toString());
        System.out.println("---------------------------------------------------------------------------------------");
    }
    }

