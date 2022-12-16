package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade =0, contMenos = 0, contMais = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(idade != -99){
		System.out.println("Digite uma idade: ");
		idade = entrada.nextInt();
		
		if(idade < 21) {
			contMenos++;
		}
		if(idade > 50) {
			contMais++;
		}
	}
	System.out.println("\nQtd de pessoas com idade maior 50 anos: "+ contMais);
	System.out.println("\nQtd de pessoas com idade menos 21 anos: "+ contMenos);
	
	System.out.println("\nFim da execução, foi digitado: -99");
	}
}
