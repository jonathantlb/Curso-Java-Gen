package LacosdeRepeticao;

import java.util.Scanner;
/*5 - Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/
public class Exer5
{
	public static void main(String[] args) {
			int n,soma=0;
			Scanner teclado = new Scanner(System.in); 
			do {
				System.out.println("\nEntre com um n�mero");
				n = teclado.nextInt();
				soma = n + soma;	
			}
			while (n!=0);
			System.out.println("\nA soma dos n�meros digitados �: "+soma);
	}
}

