/**
 * Provides classes for managing flowers, flower packs,
 * buckets, colors, types, and stores.
 */
package ucu.edu.ua.lab7.flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that contains a collection of flowers.
 */
public class Store {
    /**
     * The list of flowers in the store.
     */
    private List<Flower> flowers;

    /**
     * Constructs an empty Store.
     */
    public Store() {
        this.flowers = new ArrayList<>();
    }

    /**
     * Adds a flower to the store.
     * @param flower the flower to add
     */
    public void addFlower(final Flower flower) {
        flowers.add(flower);
    }

    /**
     * Searches for flowers in the store that match the given criteria.
     * If a parameter is null or zero, it is ignored in the search.
     *
     * @param color the color to search for (can be null)
     * @param flowerType the type of flower to search for (can be null)
     * @param maxPrice the maximum price to search for (0 to ignore)
     * @return a list of matching flowers
     */
    public List<Flower> search(final FlowerColor color,
                               final FlowerType flowerType,
                               final double maxPrice) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            boolean matches = true;

            if (color != null && flower.getColorEnum() != color) {
                matches = false;
            }

            if (flowerType != null && flower.getFlowerType() != flowerType) {
                matches = false;
            }

            if (maxPrice > 0 && flower.getPrice() > maxPrice) {
                matches = false;
            }

            if (matches) {
                result.add(flower);
            }
        }
        return result;
    }

    /**
     * Gets a copy of the list of flowers in the store.
     * @return the list of flowers
     */
    public List<Flower> getFlowers() {
        return new ArrayList<>(flowers);
    }
}
