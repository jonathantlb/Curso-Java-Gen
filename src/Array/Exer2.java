package Array;

import java.util.Scanner;
/* Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
*/
public class Exer2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int vet [] = new int [6], numpar=0,quantimp=0;
		String par="", impar="";
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0; x < 6; x++)
		{
			System.out.printf("Digite um número: ");
			vet[x] = ler.nextInt();
			
			if(vet[x] % 2 == 0) 
			{
			par = par + vet[x] + "\t";
			numpar += vet[x];
			}
			else
			{
			impar = impar + vet[x] + "\t";
			quantimp++;
			}
			
		
		}
		
			System.out.println("\nNúmeros pares digitados: " + par);
			System.out.println("\nSoma dos números pares: " + numpar);
			System.out.println("\nQuantidade dos números pares: " + quantimp);
	}
}

