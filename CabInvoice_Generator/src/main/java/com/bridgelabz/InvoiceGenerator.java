package com.bridgelabz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a class for invoice generator is created with the given data set like distance and time
 */
public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final int MIN_FARE = 5;
    public Map<String, List<Ride>> userRideRepository = new HashMap<>();

    /**
     * Method is created to calculate the fare with parameter such as distance and time
     * @param distance
     * @param time
     * @return totalfare
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MIN_FARE);//UC1
    }

    /**
     * next is to calculate the total fare for multiple rides
     * @param rides
     * @return totalfares
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummary(rides.length, totalFare);//UC2
    }

    /**
     * method is created to return the invoice summary for multilpe rides
     * @param userId
     * @return invoice summary
     */
    public InvoiceSummary calculateFare(String userId) {
        List<Ride> rides = this.userRideRepository.get(userId);
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummary(rides.size(), totalFare);//UC4
    }
    public static void main(String[] args) {
        System.out.println("Welcome to CabInvoiceGenerator Application!");
    }
}