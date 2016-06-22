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
		if(compra.getCliente().getPontos() >= 1000){
			compra.setValorTotal(compra.getValorTotal() - compra.getValorTotal()* 0.05);
			compra.getCliente().setPontos(compra.getCliente().getPontos()-1000);
		}		
	}
	
	public void descontoQuantidadeItem20(){
		for (Item item : compra.getItens()) {
			if(item.getQuantidade() >=20){
				compra.setValorTotal(compra.getValorTotal() - (item.getValorTotalItem()* 0.2));
			}
		}
	}
	
	public void descontoValorToralMaiorQueMil(){
		if(compra.getValorTotal() > 1000){
			compra.setValorTotal(compra.getValorTotal() - compra.getValorTotal()* 0.2);
		}
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
}
