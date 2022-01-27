package lacosDeRepeticao;
import java.util.*;

public class Exercicio2 {
	public static void main (String args[])
	
	{
		Scanner ler = new Scanner (System.in);

		int x; //contador
		int y; //numeros
		int par=0;
		int impar=0;
		
		System.out.println("digite 10 números: ");
				
		for( x=1;x<=10;x++)
		{
			y = ler.nextInt();
			if (y%2==0) {
				par=par+1;
			}
			else {
				impar=impar+1;
			}

		}
		System.out.println("a quantidade de pares é: " +par);
		System.out.println("a quatindade de impares é: " +impar);
		
		
		
		
	}

}
