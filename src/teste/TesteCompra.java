package teste;

import calcularDesconto.Desconto;
import modelo.Cliente;
import modelo.Compra;
import modelo.Item;
import java.util.List;
import java.util.Arrays;

public class TesteCompra {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Luiza", 1000);
		Compra compra = new Compra(cliente);

		Item sabonete = new Item("Sabonete", 10, 1.5);
		Item cadeira = new Item("Cadeira", 20, 100);
		
		List itens = Arrays.asList(sabonete,cadeira);

		for (Item item : itens){
			compra.adicionarProduto(item);
		}
			
		compra.calcularValorTotalDaCompra();
		
		System.out.println(compra.getValorTotal());
		Desconto desconto = new Desconto(compra);
		
		System.out.println(compra.getValorTotal());

		
		
		
		
	}

}
