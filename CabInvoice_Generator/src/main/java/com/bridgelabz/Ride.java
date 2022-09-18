package com.bridgelabz;

public class Ride {
    /**
     * variables to be taken as distance and time and also to make them as private
     */
    private double distance;
    private int time;

    /**
     * to calculate for the multiple rides
     * @param :distance
     * @param :time
     * and to add getter methods for distance and time
     */
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }
}

