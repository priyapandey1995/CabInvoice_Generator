package com.bridgelabz;

public class InvoiceSummary {
    /**
     * for multiple rides
     */
        private final int noOfRides;
        private final double totalFare;
        private final double avgFare;

        /**
         *constructor to hold the values
         * @param noOfRides
         * @param totalFare
         */
        public InvoiceSummary(int noOfRides, double totalFare) {
            this.noOfRides = noOfRides;
            this.totalFare = totalFare;
            this.avgFare = this.totalFare/this.noOfRides;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            InvoiceSummary that = (InvoiceSummary) o;
            return noOfRides == that.noOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
        }
    }


