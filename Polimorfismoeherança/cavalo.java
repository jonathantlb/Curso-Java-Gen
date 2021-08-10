package Polimorfismoeherança;

public class cavalo extends Animal

{
		private String dente;
		
		public cavalo(String dente,String nome,String correr,String emitesom,int idade)
		{
			super(nome,correr,emitesom,idade);
			this.dente = dente;
			
		}

		public String getDente() {
			return dente;
		}

		public void setDente(String dente) {
			this.dente = dente;
		}
		public void info_cavalo()
		  {
			  System.out.println("\nInformações do Equino:\n\nNome: "+getNome()+"\nIdade: "+getIdade()+" anos"+"\nQualidade do Dente: "+getDente()+"\nEle corre: "+getCorrer()+"\nEmite som: "+getEmitesom());
		  }
}
