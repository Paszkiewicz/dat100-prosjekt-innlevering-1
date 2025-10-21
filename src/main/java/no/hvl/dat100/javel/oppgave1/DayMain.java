package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        // a) printPowerPrices
        System.out.println("Test printPowerPrices:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println();

        // b) printPowerUsage
        System.out.println("Test printPowerUsage:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println();

        // c) computePowerUsage
        System.out.println("Test computePowerUsage:");
        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.printf("%.2f kWh ", totalUsage);
        System.out.println();
        System.out.println();

        // d) computeSpotPrice
        System.out.println("Test computeSpotPrice:");
        double spot = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK", spot);
        System.out.println();
        System.out.println();

        // f) computePowerSupport
        System.out.println("Test computePowerSupport:");
        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK", support);
        System.out.println();
        System.out.println();

        // g) computeNorgesPrice
        System.out.println("Test computeNorgesPrice:");
        double norgespris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("%.2f NOK", norgespris);
        System.out.println();
        System.out.println();

        // h) findPeakUsage
        System.out.println("Test findPeakUsage:");
        double peak = DailyPower.findPeakUsage(powerusage_day);
        System.out.printf("%.2f kWh", peak);
        System.out.println();
        System.out.println();

        // i) findAvgPower
        System.out.println("Test findAvgPower:");
        double avg = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("%.2f kWh", avg);
        System.out.println();

    }
}



