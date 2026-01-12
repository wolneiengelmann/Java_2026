package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// Ler cotação e a quantidade desejada de USD e retorna o valor e R$ já com IOF!
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarBought = sc.nextDouble();
		double real = CurrencyConverter.realPaid(dollar, dollarBought);
		System.out.printf("Amount to be paid in reais %.2f%n ", real);
		
		sc.close();
	}

}
