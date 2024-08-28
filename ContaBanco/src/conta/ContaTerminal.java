package conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Por favor, digite o número da Conta: ");
		int numeroConta = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = scan.nextLine();
		
		 System.out.println("Por favor, digite o nome do cliente: ");
		String nomeCliente = scan.nextLine();
		
		System.out.println("Por favor, digite o saldo da conta: ");
		double saldo = scan.nextDouble();
		
		scan.close();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
