package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Conta;

public class ProgramaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o titular da conta: ");
		String nome = sc.nextLine();
		System.out.print("Deseja depositar um valor inicial: (s/n): ");
		char construtor = sc.next().charAt(0);

		if(construtor == 's') {
			System.out.print("Qual o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta,nome);
		}
		
		System.out.println("\nDados da Conta:");
		System.out.println(conta);
		
		System.out.print("\nEntre com o valor do depósito: ");
		double saldo = sc.nextDouble();
		conta.deposito(saldo);
		System.out.println("Atualização dos dados da conta:");
		System.out.println(conta);
		
		System.out.print("\nEntre com o valor do saque: ");
		saldo = sc.nextDouble();
		conta.saque(saldo);
		System.out.println("Atualização dos dados da conta:");
		System.out.println(conta);
		
		sc.close();
	}

}
