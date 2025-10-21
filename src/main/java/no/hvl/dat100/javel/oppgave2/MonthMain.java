package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Tester print_PowerUsage: ");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        System.out.println("print_PowerPrices: ");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        System.out.println("Test computePowerUsage: ");
        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("%.2f kWh ", totalUsage);
        System.out.println();
        System.out.println();

        System.out.println("Test exceedThreshold: ");
        double thresholdHytte = 1000;
        boolean exceededHytte = MonthlyPower.exceedThreshold(power_usage_month, thresholdHytte);
        System.out.println("Gresne for hytte overskredet? " + exceededHytte);

        double thresholdBolig = 5000;
        boolean exceededBolig = MonthlyPower.exceedThreshold(power_usage_month, thresholdBolig);
        System.out.println("Grense for bolig overskredet? " + exceededBolig);
        System.out.println();


        System.out.println("Test computeSpotPrice: ");
        double spot = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.printf("%.2f NOK", spot);
        System.out.println();
        System.out.println();

        System.out.println("Test computePowerSupport: ");
        double powerSupportMonth = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("%.2f NOK", powerSupportMonth);
        System.out.println();
        System.out.println();


        System.out.println("Test computeNorgesPrice: ");
        double norgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("%.2f NOK", norgespris);
        System.out.println();

    }
}