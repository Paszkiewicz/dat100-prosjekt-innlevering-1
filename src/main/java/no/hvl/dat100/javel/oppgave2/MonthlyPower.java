package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            for (int j = 0; j < usage[i].length; j++) {
                System.out.printf("%.2f kWh ", usage[i][j]);
            }
            System.out.println();

        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("%.2f NOK ", prices[i][j]);
            }
            System.out.println();

        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++)
            for (int j = 0; j < usage[i].length; j++) {

                sum += usage[i][j];
            }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;
        int j = 0;

        while (i < powerusage.length && !exceeded) {
            j = 0;
            while (j < powerusage[i].length && !exceeded) {
                usage += powerusage[i][j];
                if (usage > threshold) {
                    exceeded = true;
                }
                j++;
            }
            i++;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++)
            for (int j = 0; j < usage[i].length; j++) {
                price += (usage[i][j] * prices[i][j]);
            }

        return price;
    }

    // f) power support for the month
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > THRESHOLD) {
                    double supportPerTime = prices[i][j] * usage[i][j] * PERCENTAGE;
                    support += supportPerTime;
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    private static final double NORGESPRIS_KWH = 0.5;
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++)
            for (int j = 0; j < usage[i].length; j++) {
                price += NORGESPRIS_KWH * usage[i][j];
            }

        return price;
    }
}
