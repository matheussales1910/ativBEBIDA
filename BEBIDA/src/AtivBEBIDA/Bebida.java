package AtivBEBIDA;

public abstract class Bebida {
	
	private String nome;
	private double preco;
	
	
	public abstract String MostrarBebida();
	public abstract boolean VerificarPreco(double Preco);
	/**
	 * @return the nome
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return this.preco;
	}
	public Bebida(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
