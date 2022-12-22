package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contagem = 0, idade, sexo, calmas = 0, nervosa = 0, agressiva = 0; 
		Scanner entrada = new Scanner(System.in);
		
		while(contagem <= 3) {
			System.out.println("Informa sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("1 - feminino, 2 - masculino, 3 - outros");
			sexo = entrada.nextInt();
			
			if(sexo == 1) {
				calmas++;
				System.out.println("Pessoa calma!");
			}
			if(sexo == 2) {
				nervosa++;
				System.out.println("Pessoa nervosa!");
			}
			if(sexo == 3) {
				agressiva++;
				System.out.println("Pessoa agressiva!");
			}
		}
		System.out.println("Quantidade de pessoas calmas: "+ calmas);
	}
}
