package programacaoSequencial;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia,ano,mes,idade;
		Scanner leia=new Scanner (System.in);
		
		System.out.println("\nEntre com sua idade em anos");
		ano=leia.nextInt();
		System.out.println("\nEntre com sua idade em mêses");
		mes=leia.nextInt();
		System.out.println("\nEntre com sua idade em dias");
		dia=leia.nextInt();
		
		idade=(ano*365)+(mes*30)+dia;
		
		System.out.println("\nA sua idade em dias é :"+idade);
		
	}

}
