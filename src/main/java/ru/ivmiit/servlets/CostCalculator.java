package ru.ivmiit.servlets;

public class CostCalculator {
    private double kgCost;
    private double kmCost;

    public CostCalculator(double kgCost, double kmCost) {
        this.kgCost = kgCost;
        this.kmCost = kmCost;
    }

    public double calcCost(Box box, int km) {
        return box.getWeight() * kgCost + km * kmCost;
    }

    public double calcCost(double kg, int km) {
        return kg*kgCost+km*kmCost;
    }
}
