package com.bridgelabz;

/**
 * Generating the invoice of a cab with given respective time and km
 */
public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final int MIN_FARE = 5;



    /**
     * Creating ToCalculateFare to calculate the fare for the given distance and time
     * @param distance - double distance
     * @param time - int time
     * @return total fare
     */
    public static double calculateFare(double distance, int time) {
        double totalFare =  distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;//UC1
        return Math.max(totalFare,MIN_FARE);
    }

    /**
     * calculate the fare for multiple rides
     * @param rides
     * @return
     */

    public InvoiceSummary CalculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {

            totalFare += this.calculateFare(ride.getDistance(),ride.getTime());
        }
        return new InvoiceSummary(rides.length,totalFare);
    }

    /**
     * Main method to print Welcome message
     * @param args
     */
    public static void main(String[] args) {
       // System.out.println("The total fare is:");
        //System.out.println(calculateFare(2.0, 5));
    }
}