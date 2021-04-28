public class Main {
    public static void main(String[] args) {
        WaterPokemon squirtle = new WaterPokemon("Ed", "Squirtle", 100);
        FirePokemon charmander = new FirePokemon("Edd", "Charmander", 100);
        GrassPokemon bulbbasaur = new GrassPokemon("Eddy", "bulbasaur", 100);
        charmander.attack(squirtle);
        squirtle.attack(charmander);
        charmander.attack(bulbbasaur);
        System.out.println(charmander.toString());
        System.out.println(squirtle.toString());
        System.out.println(bulbbasaur.toString());
    }
}
