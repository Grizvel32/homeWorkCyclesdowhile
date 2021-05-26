package com.company;

public class Harvest {
    public static void main(String[] args) {

        double size = 100;
        double productivity = 20;
        int currentYear = 1;
        int maxYear = 8;

        double percentSize = 5;
        double percentProductivity = 2;

        double crop = size * productivity;
        double sumCrop = crop;
        int finishCropYear = 6;

        String outputForProductivity = "";
        String outputForSize = "";
        String outputForCrop = "";
        while (currentYear < maxYear) {

            size += (size * percentSize) / 100;
            productivity += (productivity * percentProductivity) / 100;

            currentYear++;

            outputForProductivity += String.format("Урожайность за %d ый год = %.3f\n", currentYear, productivity);

            if (currentYear >= 4 && currentYear <= 7) {
             outputForSize +=  String.format("Площадь за %d ый год = %.3f\n", currentYear, size);
            }

            if (currentYear <= finishCropYear) {
                sumCrop += size * productivity;


            }

        }
       outputForCrop += String.format("Урожайность за первые %d лет  = %.3f", finishCropYear, sumCrop);


        System.out.println(outputForProductivity);
        System.out.println(outputForSize);
        System.out.println(outputForCrop);
    }
}
