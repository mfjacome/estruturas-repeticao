package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0, somaTotal = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			
		System.out.println("\nDigite um número, quando quiser parar digite 0: ");
		numero = ler.nextInt();
		
		somaTotal += numero;
		
		}while(numero != 0);
		
		System.out.println("A soma total = "+ somaTotal);
	}

}
