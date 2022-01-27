package lacosDeRepeticao;
import java.util.*;

public class Exercicio4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int idade, dados=0, sexo, opcoes, calma=0, agressiva=0, nervosa=0;
		
		while (dados<3) {
			System.out.println("digite a idade da pessoa: ");
			idade = ler.nextInt();
			System.out.println("digite o sexo da, sendo: 1: feminino, 2: masculino ou 3: intersexo ");
			sexo = ler.nextInt();
			System.out.println("digite as opções da pessoa, sendo: 1: calma, 2: nervosa e 3: agressiva ");
			opcoes = ler.nextInt();
			
			if(sexo == '1')
			{
				
			}
			
			if(opcoes ==1) {
				calma +=1;
			}
			else if (opcoes ==2) 
			{
				nervosa+=1;
			}
			else if (opcoes==3) 
			{
				agressiva+=1;
		
			}
			else 
			{
				System.out.println("Opção inválida.");
			}
			
			dados = dados+1;
			
			
			
		}
	}

}
