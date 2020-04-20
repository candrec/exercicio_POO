package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Student;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		aluno.name=sc.nextLine();
		aluno.nota1=sc.nextDouble();
		aluno.nota2=sc.nextDouble();
		aluno.nota3=sc.nextDouble();
		aluno.total();
		System.out.println(aluno);
		sc.close();
	}

}
