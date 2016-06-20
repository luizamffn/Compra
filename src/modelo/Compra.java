package modelo;
import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	private List<Item> itens;
	private Cliente cliente;
	private double valorTotal;

	public Compra(Cliente cliente) {
		itens = new ArrayList<Item>();
		this.cliente = cliente;
	}

	
	
	public void adicionarProduto(Item item){
		itens.add(item);
	}
	
	public void caucularValorTotalDaCompra(){
		this.valorTotal = 0;
		for (Item item : itens) {
			this.valorTotal += 	item.getValorTotalItem();
		}
	}
	
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
