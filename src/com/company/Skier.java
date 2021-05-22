package com.company;

public class Skier {
    public static void main(String[] args) {
        double mileage = 10;
        double starDaymileage = mileage;
        int percent = 10;

        int startRun = 2;
        int finishRun = 10;
        int finishIndex = 7;
        double sum = 0;

        int i = startRun;
        int n = finishRun;

        while (i <= n) {

            mileage += (mileage * percent) / 100;

            System.out.println(String.format(("Пробег за %d ый день = %.3f"), i, mileage));
            if (i <= finishIndex) {
                sum += mileage;
            }

            i++;
        }

        sum += starDaymileage;

        System.out.println(String.format(("Пробег за %d дней = %.3f"), finishIndex, sum));


    }
}


