package com.eniso.hello_world.service;

import com.eniso.hello_world.enumeration.MathematicalOperations;

/**
 * CalculatorService provides basic arithmetic operations
 * and a method to compute a result based on a MathematicalOperations enum.
 */
public class CalculatorService {

    /**
     * Adds two numbers.
     * @param a the first number.
       @param b the second number.
       @return the sum of a and b as a String.
     */
    public String addition(final float  a, final float  b) {
        return Float.toString(a + b);
    }

    /**
     * Subtracts b from a.
     * @param a the first number.
 *     @param b the second number.
 *     @return the sum of a and b as a String.
     */
    public String subtraction(final float  a, final float  b) {
        return Float.toString(a - b);
    }

    /**
     * Multiplies two numbers.
     *  @param a the first number.
 *     @param b the second number.
 *     @return the sum of a and b as a String.
     */
    public String multiplication(final float  a, final float  b) {
        return Float.toString(a * b);
    }

    /**
     * Divides a by b. Returns error if b is zero.
     * @param a the first number.
 *     @param b the second number.
 *     @return the sum of a and b as a String.
     */
    public String division(final float  a, final float  b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return Float.toString(a / b);
    }

    /**
     * Computes the result of an operation on two numbers
     * based on the provided MathematicalOperations enum.
     * @param a the first number.
     * @param operation the operation
 *     @param b the second number.
 *     @return the sum of a and b as a String.
     */
    public String result(final float a,
final float b,
final MathematicalOperations operation) {
        try {
            switch (operation) {
                case ADDITION:
                    return addition(a, b);
                case SUBTRACTION:
                    return subtraction(a, b);
                case MULTIPLICATION:
                    return multiplication(a, b);
                case DIVISION:
                    return division(a, b);
                default:
                    return "Unknown operation";
            }
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }
}
