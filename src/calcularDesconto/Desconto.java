package calcularDesconto;

import modelo.Compra;
import modelo.Item;

public class Desconto {
	private Compra compra;
	
	public Desconto(Compra compra) {
		this.compra = compra;
		descontoPontuacaoMil();
		descontoQuantidadeItem20();
		descontoValorToralMaiorQueMil();
	}

	public void descontoPontuacaoMil(){
		compra.setValorTotal(compra.getCliente().getPontos() >= 1000 ? compra.getValorTotal() - compra.getValorTotal()* 0.05 : compra.getValorTotal());	
	}
	
	public void descontoQuantidadeItem20(){
		for (Item item : compra.getItens()) {
			compra.setValorTotal(item.getQuantidade() >=20 ? compra.getValorTotal() - (item.getValorTotalItem()* 0.2) : compra.getValorTotal());
		}
	}
	
	public void descontoValorToralMaiorQueMil(){
		compra.setValorTotal(compra.getValorTotal() > 1000 ? compra.getValorTotal() - compra.getValorTotal()* 0.2 : compra.getValorTotal());
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
}
