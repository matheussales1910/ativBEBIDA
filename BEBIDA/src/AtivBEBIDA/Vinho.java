package AtivBEBIDA;

import java.util.InputMismatchException;

public class Vinho extends Bebida {
	private int safra;
	private String tipo;

	
	
	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

		//CONSTRUTOR PARA INICIALIZAR OS ATRIBUTOS COM VALORES VAZIOS 
		public Vinho() {
			                                                         
			this("", 0.0, "", 0);
			
		}
	
	public Vinho(String nome, double preco, String tipo, int safra) {
		super(nome, preco);
		this.safra = safra;
		this.tipo = tipo;
	}

	@Override
	public String MostrarBebida() {
		// TODO Auto-generated method stub
		return ("NOME: " + this.getNome() + "\n"+
		        "PRECO: R$ " + this.getPreco() + "\n"+
				"TIPO: " + this.tipo + "\n"+
		        "SAFRA:  " + this.safra + "\n");			
		
	}
	
	@Override
	public boolean VerificarPreco(double Preco) {
		
		if(Preco<25) {
			return true;
		}else {	
			return false;
		}
		
			}

}
