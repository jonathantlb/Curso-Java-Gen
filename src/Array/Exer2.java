package Array;

import java.util.Scanner;
/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
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
			System.out.printf("Digite um n�mero: ");
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
		
			System.out.println("\nN�meros pares digitados: " + par);
			System.out.println("\nSoma dos n�meros pares: " + numpar);
			System.out.println("\nQuantidade dos n�meros pares: " + quantimp);
	}
}

