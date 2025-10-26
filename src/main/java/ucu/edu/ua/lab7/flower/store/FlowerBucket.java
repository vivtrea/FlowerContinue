/**
 * Contains classes for managing flowers, flower packs, buckets, and stores.
 */
package ucu.edu.ua.lab7.flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bucket containing multiple flower packs.
 */
public class FlowerBucket {
    /**
     * The list of flower packs in the bucket.
     */
    private List<FlowerPack> flowerPacks;

    /**
     * Constructs an empty FlowerBucket.
     */
    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    /**
     * Adds a flower pack to the bucket.
     * @param flowerPack the flower pack to add
     */
    public void addFlowerPack(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    /**
     * Gets the total price of all flower packs in the bucket.
     * @return the total price
     */
    public double getPrice() {
        return flowerPacks.stream()
            .mapToDouble(FlowerPack::getPrice)
            .sum();
    }

    /**
     * Gets a copy of the list of flower packs in the bucket.
     * @return the list of flower packs
     */
    public List<FlowerPack> getFlowerPacks() {
        return new ArrayList<>(flowerPacks);
    }
}
