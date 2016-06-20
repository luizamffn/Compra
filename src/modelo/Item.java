package modelo;

public class Item {
	
	private String nome;
	private int quantidade;
	private double valor;
	private double valorTotalItem;
	
	public Item(String nome, int quantidade, double valor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		calcularValorTotal();
	}

	public void calcularValorTotal(){
		valorTotalItem = quantidade * valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorTotalItem() {
		return valorTotalItem;
	}
	public void setValorTotalItem(double valorTotalItem) {
		this.valorTotalItem = valorTotalItem;
	}

}
