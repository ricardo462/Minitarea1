package Model.Factories;
import Model.IPokemon;
public interface IFactory {
    /* creates a Pokemon and returns it */
    IPokemon create();
}
