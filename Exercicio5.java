package lacosDeRepeticao;
import java.util.*;

public class Exercicio5 {
	
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int x, somaNumeros = 0;
		System.out.println("entre com um número: ");
		x = ler.nextInt();
		
		do {
			somaNumeros = somaNumeros + x;
			System.out.println("entre com um número: ");
			x = ler.nextInt();
		}
		while (x!=0);
		
		System.out.println("a sama é:" + somaNumeros);
		
		ler.close();
	}

}
