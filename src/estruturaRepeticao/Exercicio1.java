package estruturaRepeticao;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contPar = 0, contImpar = 0;
		
		for(numero = 0; numero < 10; numero++){
			
			if(numero % 2 == 0) {
				contPar++;
			}else{
				contImpar++;
			}
		}
		System.out.println("\nQtd números pares: "+ contPar);
		
		System.out.println("\nQtd números ímpares: "+ contImpar);
	}

}
