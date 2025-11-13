package com.eniso.hello_world.enumeration;

/**
 * Enum representing the basic mathematical operations.
 * Each operation has a display label.
 * @author Houssem.
 */
public enum MathematicalOperations {

    /** Addition operation. */
    ADDITION("Addition"),

    /** Subtraction operation. */
    SUBTRACTION("Subtraction"),

    /** Multiplication operation. */
    MULTIPLICATION("Multiplication"),

    /** Division operation. */
    DIVISION("Division");

    /** Display label for the operation. */
    private final String label;

    /**
     * Constructor for the enum.
     * @param lbl the display label for the operation
     */
    MathematicalOperations(final String lbl) {
        this.label = lbl;
    }

    /**
     * Returns the label of the operation.
     * @return label as string
     */
    public String getLabel() {
        return label;
    }
}
