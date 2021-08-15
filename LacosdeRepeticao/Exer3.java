package LacosdeRepeticao;

import java.util.Scanner;

/*
 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,cont21=0,cont50=0;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt();
	
		while (idade!=-99) {
			if (idade<21) {
				cont21++;
		
			}
			else if (idade>50) 
			{
				cont50++;
				
			}
			else 
			{
				System.out.println("\nIdade fora de escopo");
				
			}
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();	
		}
			System.out.println("\nTotal de pessoas abaixo de 21 "+cont21);
			System.out.println("\nTotal de pessoas acima de 50 "+cont50);
	}

}
