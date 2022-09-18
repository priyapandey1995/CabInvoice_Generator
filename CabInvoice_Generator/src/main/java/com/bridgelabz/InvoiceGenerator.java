package com.bridgelabz;

/**
 * Generating the invoice of a cab with given respective time and km
 */
public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;

    /**
     * Creating ToCalculateFare to calculate the fare for the given distance and time
     * @param distance - double distance
     * @param time - int time
     * @return total fare
     */
    public static double toCalculateFare(double distance, int time) {
        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
    }
    /**
     * Main method to print Welcome message
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("The total fare is:");
        System.out.println(toCalculateFare(2.0, 5));
    }
}