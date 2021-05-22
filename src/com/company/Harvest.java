package com.company;

public class Harvest {
    public static void main(String[] args) {

        double size = 100;
        double productivity = 20;
        int currentYear = 1;
        int maxYear = 8;
        int percentSize = 5;
        int percentHarv = 2;


        while (currentYear<maxYear) {

            size += (size * percentSize) / 100;
            productivity += (productivity * percentHarv) / 100;

            System.out.println(String.format(("Урожайность за %d ый год = %f"), currentYear, productivity));

            if (currentYear >= 4 && currentYear <= 7) {
                System.out.println(String.format(("Площадь за %d ый год = %f"), currentYear, size));
            }
        }
    }
}