package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        System.out.println("Test av printInvoice: ");
        Customer c = new Customer("Markus", "markus@eksempel.no", 101, PowerAgreementType.SPOTPRICE);
        Invoice invoice = new Invoice(c, "Mai", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        invoice.printInvoice();
        System.out.println();
        System.out.println("Slutt av test");







        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
