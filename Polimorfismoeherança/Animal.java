package Polimorfismoeherança;

public class Animal 
{
	
		private String nome,correr,emitesom; 
		private int idade; 
	
	public Animal(String nome,String correr,String emitesom,int idade)
	{
		super();
		this.nome = nome;
		this.correr = correr;
		this.emitesom = emitesom;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getEmitesom() {
		return emitesom;
	}

	public void setEmitesom(String emitesom) {
		this.emitesom = emitesom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
