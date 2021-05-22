package com.company;

public class Harvest {
    public static void main(String[] args) {

        double area = 100;
        double averageHarvest = 20;
        int startIndex = 2;
        int finishIndex = 8;
        int percentArea = 5;
        int percentHarv = 2;

        while (startIndex<=finishIndex) {

            area += (area*percentArea)/100;
            averageHarvest += (averageHarvest*percentHarv)/100;
            System.out.println(String.format(("Площадь за %d ый год = %f"), startIndex, area));
            System.out.println(String.format(("Урожайность за %d ый год = %f"), startIndex, averageHarvest));

        }
    }
}