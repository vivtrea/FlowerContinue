/**
 * Provides classes for managing flowers,
 * flower packs, buckets, colors, types, and stores.
 */
package ucu.edu.ua.lab7.flower.store;

/**
 * Enum representing flower colors and their hex codes.
 */
public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000"),
    /**
     * Yellow color.
     */
    YELLOW("#FFFF00"),
    /**
     * Blue color.
     */
    BLUE("#0000FF"),
    /**
     * White color.
     */
    WHITE("#FFFFFF");

    /**
     * The hex code of the color.
     */
    private final String code;

    /**
     * Constructs a FlowerColor with the specified hex code.
     * @param newCode the hex code of the color
     */
    FlowerColor(final String newCode) {
        this.code = newCode;
    }

    /**
     * Gets the hex code of the color.
     * @return the hex code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Returns the string representation of the color (hex code).
     * @return the hex code as string
     */
    @Override
    public String toString() {
        return this.code;
    }
}
