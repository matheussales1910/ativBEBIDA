package AtivBEBIDA;

public class Refrigerante extends Bebida {
	
	private boolean Retornavel;
	
	public boolean getRetornavel(boolean retornavel) {
		if(true) {
			String retorn = "SIM";
		}else {
			String retorn = "NÃO";
		}
		return retornavel;
	}
	
	
	public boolean isRetornavel(double Preco) {
		
		if(this.getPreco()<= 5) {
			return true;
		}else {
			return false;
		}
	}

	public void setRetornavel(boolean retornavel) {
		Retornavel = retornavel;
	}

			//CONSTRUTOR PARA INICIALIZAR OS ATRIBUTOS COM VALORES VAZIOS 
			public Refrigerante() {
				                                                         
				this("", 0.0, true);
				
			}
			
		//CONSTRUTOR COM PARÂMETROS PARA INICIALIZAR OBJETOS COM VALOR PARA OS ATRIBUTOS
			public Refrigerante(String nome,double preco, boolean retornavel) {
				
				super(nome, preco);
				this.Retornavel = retornavel;
				
			}	
	
	@Override
	public String MostrarBebida() {
		// TODO Auto-generated method stub
		return ("NOME " + this.getNome() + "\n"+
		        "PRECO: R$ " + this.getPreco() + "\n"+
				"RETORNAVEL: " + this.Retornavel + "\n");
	}

	@Override
	public boolean VerificarPreco(double Preco) {
		
		// TODO Auto-generated method stub
		if(Preco<2.5) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
	}
	
	
		
		
	}
		

