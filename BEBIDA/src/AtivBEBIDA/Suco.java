package AtivBEBIDA;

public class Suco extends Bebida {
	
	private String Sabor;

	
	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}

		//CONSTRUTOR PARA INICIALIZAR OS ATRIBUTOS COM VALORES VAZIOS 
		public Suco() {
			                                                         
			this("", 0.0, "");
			
		}
		
		//CONSTRUTOR COM PARÂMETROS PARA INICIALIZAR OBJETOS COM VALOR PARA OS ATRIBUTOS
		public Suco(String nome,double preco, String sabor) {
			
			super(nome, preco);
			this.Sabor = sabor;
			
		}
	
	@Override
	public String MostrarBebida() {
		// TODO Auto-generated method stub
		return ("NOME: " + this.getNome() + "\n" +
				"PRECO: R$ " + this.getPreco() + "\n" +
				"SABOR: " + this.Sabor + "\n");
	}

	@Override
	public boolean VerificarPreco(double Preco) {
		// TODO Auto-generated method stub
		if(Preco<5) {
			return true;
		}else {
		return false;
		}
		
	}

}
