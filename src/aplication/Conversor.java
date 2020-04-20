package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Conversor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double dollar;
		int quantidade;

		System.out.print("What is the dollar price: ");
		dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		quantidade = sc.nextInt();
		System.out.printf("Amount to be paid in reais = %.2f%n",CurrencyConverter.converte(quantidade, dollar));
		sc.close();
	}

}
