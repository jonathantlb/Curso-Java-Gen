package LacosdeRepeticao;

import java.util.Scanner;
/*5 - Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
public class Exer5
{
	public static void main(String[] args) {
			int n,soma=0;
			Scanner teclado = new Scanner(System.in); 
			do {
				System.out.println("\nEntre com um número");
				n = teclado.nextInt();
				soma = n + soma;	
			}
			while (n!=0);
			System.out.println("\nA soma dos números digitados é: "+soma);
	}
}

