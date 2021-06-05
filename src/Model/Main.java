package Model;

import Model.Factories.FirePokemonFactory;
import Model.Factories.GrassPokemonFactory;
import Model.Factories.WaterPokemonFactory;
import Model.FirePokemon;
import Model.GrassPokemon;
import Model.IPokemon;
import Model.Items.Ether;
import Model.Items.FullRestore;
import Model.Items.Potion;

public class Main {
    public static void main(String[] args) {

        // Creating the Pokemon's Factories
        WaterPokemonFactory waterPokemonFactory = new WaterPokemonFactory("Ed", "Squirtle", 100, 5);
        FirePokemonFactory firePokemonFactory = new FirePokemonFactory("Edd", "Charmander", 100, 5);
        GrassPokemonFactory grassPokemonFactory = new GrassPokemonFactory("Eddy", "bulbasaur", 100, 5);

        // Getting pokemons from factories
        WaterPokemon squirtle = waterPokemonFactory.create();
        FirePokemon charmander = firePokemonFactory.create();
        GrassPokemon bulbbasaur = grassPokemonFactory.create();

        // changing parameter from factories
        waterPokemonFactory.setName("blue");
        waterPokemonFactory.setSpecies("blastoise");
        waterPokemonFactory.setMaxHP(240);

        WaterPokemon blastoise = waterPokemonFactory.create();
        System.out.println("The first pokemon created by the WaterPokemonFactory\n");
        System.out.println(squirtle);
        System.out.println("\nA different Pokemon from the waterPokemonFactory");
        System.out.println(blastoise);
        System.out.println("--------------------------------------------");


        // Checking for the weaknesses and strengths
        System.out.println("Checking for weaknesses and strengths");
        testPokemonAttack(charmander,bulbbasaur);
        testPokemonAttack(bulbbasaur,charmander);
        testPokemonAttack(charmander, squirtle);
        testPokemonAttack(squirtle, charmander);
        testPokemonAttack(squirtle, bulbbasaur);
        testPokemonAttack(bulbbasaur, squirtle);

        // Defeating a Pokemon
        System.out.println("\n\nDefeating a Pokemon");
        // charmander got confused and began to attack himself
        System.out.println("charmander got confused and began to attack himself");
        for(int i = 0; i<17; i++){
            testPokemonAttack(charmander, charmander);
        }

        // testing that a defeated Pokemon can not attack and receive damage
        System.out.println("\n\nTesting that a defeated Pokemon can not attack and receive damage");
        testPokemonAttack(charmander, squirtle);
        testPokemonAttack(squirtle, charmander);

        // Testing Pokemons Items
        System.out.println("Testing Items \n");

        Potion tenHPPotion = new Potion(10);
        Ether onePPEther = new Ether(1);
        FullRestore fullRestore = new FullRestore();

        tenHPPotion.use(charmander);
        System.out.println("10 HP potion to Charmander \n" + charmander + "\n");

        fullRestore.use(charmander);
        System.out.println("Full restore to Charmander \n" + charmander + "\n");

        tenHPPotion.use(charmander);
        System.out.println("10 HP potion to Charmander \n" + charmander + "\n");

        fullRestore.use(charmander);
        System.out.println("Full restore to Charmander \n" + charmander + "\n");

        charmander.setCurrentPP(charmander.getCurrentPP() - 1);
        System.out.println("Resting one PP from Charmander \n " + charmander + "\n");

        onePPEther.use(charmander);
        System.out.println("one PP ether to Charmander \n" + charmander + "\n");

        onePPEther.use(charmander);
        System.out.println("one PP ether to Charmander \n" + charmander + "\n");



        }

    public static void testPokemonAttack(IPokemon attacker, IPokemon victim){
        // Displays the the info of the victim before and after the attacker attacks him
        System.out.println("\n\n" +attacker.getClass().getName() + " attacks " + victim.getClass().getName() + "\n");
        System.out.println("Victim's info before the attack:");
        System.out.println(victim);
        attacker.attack(victim);
        System.out.println("Victim's info after the attack:");
        System.out.println(victim);
        System.out.println("---------------------------------------------------------------------------------------");
    }
    }

