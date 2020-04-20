package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class Empregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage;

		Employee empregado = new Employee();
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f%n",empregado.name,empregado.netSalary());
		System.out.print("\nWhich percentage to increase salary? ");
		percentage=sc.nextDouble();
		empregado.increaseSalary(percentage);
		System.out.printf("\nUpdated data: %s, $ %.2f",empregado.name,empregado.grossSalary);
		sc.close();
	}

}
