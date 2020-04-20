package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Rectangle;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();
		System.out.println("Enter rectangle Height and width:");
		x.height=sc.nextDouble();
		x.width=sc.nextDouble();
		System.out.println(x);
		
		sc.close();
	}

}
