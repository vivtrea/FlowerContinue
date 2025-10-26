/**
 * Provides classes for managing flowers, flower packs,
 *  buckets, colors, types, and stores.
 */
package ucu.edu.ua.lab7.flower.store;

/**
 * Represents a pack of flowers of the same type and quantity.
 */
public class FlowerPack {
    /**
     * The flower in the pack.
     */
    private Flower flower;
    /**
     * The quantity of flowers in the pack.
     */
    private int quantity;

    /**
     * Constructs a FlowerPack with the specified flower and quantity.
     * @param newFlower the flower to include in the pack
     * @param newQuantity the number of flowers in the pack
     */
    public FlowerPack(final Flower newFlower, final int newQuantity) {
        this.flower = new Flower(newFlower);
        this.quantity = newQuantity;
    }

    /**
     * Gets the flower in the pack.
     * @return the flower
     */
    public Flower getFlower() {
        return this.flower;
    }

    /**
     * Gets the quantity of flowers in the pack.
     * @return the quantity
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity of flowers in the pack.
     * @param newQuantity the quantity to set
     */
    public void setQuantity(final int newQuantity) {
        this.quantity = newQuantity;
    }

    /**
     * Sets the flower in the pack.
     * @param newFlower the new flower to set
     */
    public void setFlower(final Flower newFlower) {
        this.flower = new Flower(newFlower);
    }

    /**
     * Gets the total price of the flower pack.
     * @return the total price
     */
    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
