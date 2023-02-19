package exercicios;

import java.util.ArrayList;

public class Loja {

	public String nomeDaLoja;
	public ArrayList<String> listaDeProdutosDisponiveis=new ArrayList<String>();
	public ArrayList<String> listaDeClientesCadastrados=new ArrayList<String>();
	public ArrayList<String> listaDePedidosRealizados=new ArrayList<String>();




	void addProduto(String nomeDoProduto) {
		
		listaDeProdutosDisponiveis.add(nomeDoProduto);
	}
	
	void mostrarProdutos() {
		System.out.println("Lista de produtos disponíveis:"+listaDeProdutosDisponiveis);
	}
	
	void cadastrarCliente(String nomeCliente)
	{
		listaDeClientesCadastrados.add(nomeCliente);
	}
	void mostrarClientesCadastrados() {
		System.out.println("Lista de clientes realizados:"+listaDeClientesCadastrados);
	}
	
	void realizarPedido(String nomeDoPedido) {
		listaDePedidosRealizados.add(nomeDoPedido);
	}
	
	void mostrarPedidos() {
		System.out.println("Os pedidos são: "+listaDePedidosRealizados);
	}
	
	
	
}
