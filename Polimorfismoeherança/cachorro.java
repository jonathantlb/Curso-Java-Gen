package Polimorfismoeherança;

public class cachorro extends Animal 
{
	  private  double altura; 
	  
	  public cachorro (double altura,String nome,String correr,String emitesom,int idade)
	  {
		  super(nome, correr, emitesom,idade);
		  this.altura = altura;
	  }

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	  
	  public void info_cachorro()
	  {
		  System.out.println("\nInformações do Pet:\n\nNome: "+getNome()+"\nIdade: "+getIdade()+" anos"+"\nAltura: "+getAltura()+"\nO Pet corre: "+getCorrer()+"\nO Pet Emite som: "+getEmitesom());
	  }
}

