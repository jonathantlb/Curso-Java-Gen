package Polimorfismoeheran�a;

public class preguica extends Animal
{
		private String subir;
		
		public preguica(String subir,String nome,String correr,String emitesom,int idade)
		{
			super(nome,correr,emitesom,idade);
			this.subir = subir;	
		}

		public String getSubir() {
			return subir;
		}

		public void setSubir(String subir) {
			this.subir = subir;
		}
		public void info_preguica()
		  {
			  System.out.println("\nInforma��es da pregui�a:\n\nNome: "+getNome()+"\nIdade: "+getIdade()+" anos\nSobe em �rvore: "+getSubir()+"\nEle corre: "+getCorrer()+"\nEmite som: "+getEmitesom());
		  }
		
}
