package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, soma = 0, media = 0, contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			
			if(numero % 3 == 0){
				soma += numero;
			}
			if(numero % 3 == 0){
			   contador++;
			}
			
			media = (soma/contador);
			
		}while(numero != 0);
		
		System.out.println(soma);
		System.out.println("\nA media dos números multiplos de 3 é: "+ media);
		
		System.out.println("Finalizou execução!!");
	}

}