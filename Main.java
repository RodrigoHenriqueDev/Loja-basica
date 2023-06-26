package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Loja l1 = new Loja();
		int opcao;
		System.out.println("1 - Adicionar Produto");
		System.out.println("2 - Mostrar Produto");
		System.out.println("3 - Cadastrar cliente");
		System.out.println("4 - Mostrar Cliente");
		System.out.println("5 - Realizar Pedido");
		System.out.println("6 - Mostrar Pedido");
		System.out.println("7 - Sair");
		opcao = leitor.nextInt();

		// Add produto
		// Mostrar Produtos

		// Cadastrar cliente
		// Mostrar produtos cadastrados

		// Realizar Pedido
		// Mostrar pedidos

		while (opcao != 7) {
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome de um produto");
				String nomeDoProd = leitor.next();
				l1.addProduto(nomeDoProd);
				break;

			case 2:
				System.out.println("Mostrando produtos cadastrados...");
				l1.mostrarProdutos();
				break;

			case 3:
				System.out.println("Informe o nome do cliente");
				String nomeClien = leitor.next();
				l1.cadastrarCliente(nomeClien);
				break;

			case 4:
				System.out.println("Mostrando clientes...");
				l1.mostrarClientesCadastrados();
				break;
			case 5:
				System.out.println("Informe o nome do pedido");
				String nomePedido = leitor.next();
				l1.realizarPedido(nomePedido);
				break;
			case 6:
				System.out.println("Mostrando pedidos");
				l1.mostrarPedidos();
				break;
			default:
				break;
			}

			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Mostrar Produto");
			System.out.println("3 - Cadastrar cliente");
			System.out.println("4 - Mostrar Cliente");
			System.out.println("5 - Realizar Pedido");
			System.out.println("6 - Mostrar Pedido");
			System.out.println("7 - Sair");
			opcao = leitor.nextInt();

		}

	}

}
