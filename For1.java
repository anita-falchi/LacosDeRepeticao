//		se(n%3==0)


package lacosDeRepeticao;

import java.util.*;

public class For1 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("entre com a sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
	
		System.out.printf("entre com o seu nome:");
		nome = ler.nextLine();
		
		System.out.printf("\nseu nome: %s",nome);
		System.out.printf("\nsua idade: %d",idade);
		
		if(idade>=18)
		{
			System.out.println("\nvoce é maior de idade");
		}
		else if(idade>=1 && idade<18);
		{
			System.out.printf("\nvoce é menor de idade");

		}
		
		{
			System.out.printf("\nVoce entrou com um idade inválida.");
		}
		
	}

}



