package Array;

import java.util.Random;
import java.util.Scanner;

/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

 */
public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [3][3];
		int somaMaiores=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha < 3; linha++)
			
		{
			for(int coluna=0; coluna < 3; coluna++) {
				System.out.print("Entre com o número: ");
				matriz[linha][coluna] = ler.nextInt();
				
				if (matriz[linha][coluna] > 10)
				{
					somaMaiores++;
				}
				
				}
		}
				System.out.println();
		
		for (int linha=0; linha < 3; linha++) {
			for (int coluna=0; coluna < 3; coluna++)
			{
				System.out.print(matriz[linha][coluna] + "\t");
			}
			
			System.out.println();
		}
		System.out.printf("\nQuantidade de números maiores que dez: %d números",somaMaiores);
	}	
	

}
