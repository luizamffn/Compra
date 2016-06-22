package teste;

import calcularDesconto.Desconto;
import modelo.Cliente;
import modelo.Compra;
import modelo.Item;

public class TesteCompra {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Luiza", 1000);
		Compra compra = new Compra(cliente);
		
		Item sabonete = new Item("Sabonete", 10, 1.5);
		
		Item cadeira = new Item("Cadeira", 20, 100);
		
		compra.adicionarProduto(sabonete);
		compra.adicionarProduto(cadeira);
		compra.caucularValorTotalDaCompra();
		
		System.out.println(compra.getValorTotal());
		Desconto desconto = new Desconto(compra);
		
		System.out.println(compra.getValorTotal());

		
		
		
		
	}

}
