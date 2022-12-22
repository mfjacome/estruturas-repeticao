package switchCase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DesafioJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0; 
		double saldoAtual = 100;
		
		while(saldoAtual > 0 && saldoAtual < 200) {
			System.out.println("\nMenu de opções:\n1 - Saldo atual;"
					+ "\n2 - Parar de jogar e ficar com o saldo atual;"
					+ "\n3 - Continuar jogando."
					);
			/*System.out.println("\nDigite a opção desejada:\n");
	    	opcao = entrada.nextInt();*/
	    	
	    	//tratamento caso usuário digite um valor que não seja numérico. 
		    try { 
		    	System.out.println("\nDigite a opção desejada:\n");
		    	opcao = entrada.nextInt();
		    } catch (InputMismatchException erro) {                          
                entrada.nextLine(); //descarta a entrada errada.
		    }                                                    
		switch(opcao){
		case 1: 
			System.out.println("O seu saldo Atual é:\n"+ saldoAtual);
			break;
			
		case 2:
			System.out.println("Obrigado e volte sempre!\n"+ "Seu saldo é: "+ saldoAtual);
			System.exit(2);
			break;
			
		case 3:
			Random random = new Random();
			
			int numSorteado = random.nextInt(99) + 1;
			
			if(numSorteado < 50) {
				saldoAtual = saldoAtual - numSorteado;
			}
			if(numSorteado == 50) {
				System.out.println("Não ganhou, nem perdeu!");
			}
			if(numSorteado > 50) {
				saldoAtual = saldoAtual + (numSorteado/2);
			}
			break;
			
		default:
			System.err.println("\nDigite apenas as opções do menu: 1, 2 ou 3."); 
			break;
			}
		
		if(saldoAtual >= 200) {
			System.out.println("Parabéns você venceu! Seu saldo é: " + saldoAtual);
			System.exit(0);
			}
		if(saldoAtual <= 0) {
		System.out.println("Você perdeu!  Seu saldo é: "+saldoAtual);
			System.exit(0);
			}
		}
	}
}

