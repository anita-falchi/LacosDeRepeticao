package lacosDeRepeticao;
import java.util.*;


public class Exercicio6 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, soma=0, quant=0;
		int media;
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		

		do {
			if (numero%3==0)
			{
				soma = soma + numero;
				quant = quant +1;
			}
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
		}
		while (numero!=0);
		media = (int) soma /quant;
		
		System.out.println("A média dos multiplos de 3 é: " + media);
		ler.close();
}
	
	
	
}