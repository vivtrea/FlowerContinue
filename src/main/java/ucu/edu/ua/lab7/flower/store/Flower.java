/**
 * Represents a flower with color, sepal length, price, and type.
 */
package ucu.edu.ua.lab7.flower.store;

/**
 * Represents a flower with color, sepal length, price, and type.
 */
public class Flower {
    /**
     * The color of the flower.
     */
    private FlowerColor color;
    /**
     * The sepal length of the flower.
     */
    private double sepalLength;
    /**
     * The price of the flower.
     */
    private double price;
    /**
     * The type of the flower.
     */
    private FlowerType flowerType;

    /**
     * Default constructor.
     */
    public Flower() {
    }

    /**
     * Copy constructor.
     * @param other the flower to copy
     */
    public Flower(final Flower other) {
        this.color = other.color;
        this.sepalLength = other.sepalLength;
        this.price = other.price;
        this.flowerType = other.flowerType;
    }

    public Flower(FlowerColor blue, int i, int j, FlowerType tulip) {
        this.color = blue;
        this.sepalLength = i;
        this.price = j;
        this.flowerType = tulip;
    }

    /**
     * Gets the color enum of the flower.
     * @return the color enum
     */
    public FlowerColor getColorEnum() {
        return this.color;
    }

    /**
     * Gets the color of the flower as a string.
     * @return the color as string
     */
    public String getColor() {
        return color.toString();
    }

    /**
     * Sets the color of the flower.
     * @param newColor the color to set
     */
    public void setColor(final FlowerColor newColor) {
        this.color = newColor;
    }

    /**
     * Gets the sepal length of the flower.
     * @return the sepal length
     */
    public double getSepalLength() {
        return this.sepalLength;
    }

    /**
     * Sets the sepal length of the flower.
     * @param newSepalLength the sepal length to set
     */
    public void setSepalLength(final double newSepalLength) {
        this.sepalLength = newSepalLength;
    }

    /**
     * Gets the price of the flower.
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the price of the flower.
     * @param newPrice the price to set
     */
    public void setPrice(final double newPrice) {
        this.price = newPrice;
    }

    /**
     * Gets the type of the flower.
     * @return the flower type
     */
    public FlowerType getFlowerType() {
        return this.flowerType;
    }

    /**
     * Sets the type of the flower.
     * @param newFlowerType the flower type to set
     */
    public void setFlowerType(final FlowerType newFlowerType) {
        this.flowerType = newFlowerType;
    }
}
