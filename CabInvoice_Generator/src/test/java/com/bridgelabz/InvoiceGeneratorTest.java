package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare, 0.0);
    }

    /**
     * to test the fare for minimal distance
     */
    @Test//UC1
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = InvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(2, fare, 0.0);
    }

    /**
     * UC2
     * test for multiple rides
     */
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double totalFare = InvoiceGenerator.calculateFare(2,5);
        Assertions.assertEquals(27.0, totalFare, 0.0);
    }
    /**
     * Test acses for UC3:invoice summary
     */
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary invoiceSummary = InvoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(invoiceSummary, expectedInvoiceSummary);
    }
}

