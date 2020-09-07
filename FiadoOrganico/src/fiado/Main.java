package fiado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Array
		ArrayList<Integer> fiados = new ArrayList<Integer>();

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Captura nome

		
		 System.out.print("Informe o nome do cliente : "); 
		 String nome = sc.nextLine();
		 

		System.out.print("Qual o valor que deseja colocar no fiado? ");
		int valor = sc.nextInt();

		while (valor > 0) {
			adiciona(fiados, valor);
			System.out.print("Digite o proximo valor? ");
			valor = sc.nextInt();
		}
		
		for (int i = 0; i < fiados.size(); i++) {
			System.out.println(fiados.get(i));
		}

		// Soma
		int total = somaFor(fiados);
		
		
		System.out.println("O cliente " + nome + " deve :"+ total );

	}
	
	
	

	// Metodos

	public static void adiciona(ArrayList<Integer> fiados, int a) {
		fiados.add(a);
	}

	public static int somaWhile(ArrayList<Integer> fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.size()) {
			total += fiados.get(i);
			i++;
		}
		return total;
	}

	public static int somaFor(ArrayList<Integer> fiados) {
		int total = 0;
		for (int i = 0; i < fiados.size(); i++) {
			total += fiados.get(i);
		}

		return total;
	}

	public static int somaForeach(ArrayList<Integer> fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}

		return total;
	}
}
