
public class Compra {
	private int quantidade;
	private int pontos;
	private double valor;
	
	
	public double desconto(){
		if (quantidade>=20 || valor> 1000){
			return valor * 0.1;
		}
		if(pontos >=100){
			return valor * 0.05;
		}
		return 0;
		
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
