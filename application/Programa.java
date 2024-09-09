package application;
import java.util.Scanner;
import entities.CurrencyConverter;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price:");
        double preco=sc.nextDouble();

        System.out.println("How much dollar do you want to buy:");
        double quantidade=sc.nextDouble();

        double vf=CurrencyConverter.finalvalue(preco,quantidade);

        System.out.println("Amount to be paid in reais:"+(vf+=vf*CurrencyConverter.iof));

        sc.close();
    }
}
