package Polimorfismoeherança;

public class testeanimais
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		cachorro pet = new cachorro(0.30,"Thorresmo","Sim","Sim",2);
		pet.info_cachorro();
		cavalo equino = new cavalo("Boa","Secretariet","Sim","Sim",23);
		equino.info_cavalo();
		preguica slow = new preguica("Sim","Maguila","Não","Não",15);
		slow.info_preguica();
	}
		
		
}
