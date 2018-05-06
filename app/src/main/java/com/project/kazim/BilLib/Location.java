package com.project.kazim.BilLib;

/**
 * Created by kazIm on 7/29/2017.
 */

public class Location {
    private String ShelfID, ShelfLocation;
    private double Xcor, Ycor;

    public Location(String ShelfID,String ShelfLocation, double Xcor, double Ycor)
    {
        this.ShelfID = ShelfID;
        this.ShelfLocation = ShelfLocation;
        this.Xcor = Xcor;
        this.Ycor = Ycor;
    }

    public String getShelfID() {
        return ShelfID;
    }

    public String getShelfLocation() {
        return ShelfLocation;
    }

    public double getXcor() {
        return Xcor;
    }

    public double getYcor() {
        return Ycor;
    }

    @Override
    public String toString() {
        return "Location{" +
                "ShelfID='" + ShelfID + '\'' +
                ", ShelfLocation='" + ShelfLocation + '\'' +
                ", Xcor=" + Xcor +
                ", Ycor=" + Ycor +
                '}';
    }
}
