package org.serratec.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.modelos.Palestrante;
import org.serratec.modelos.Participante;
import org.serratec.modelos.Pessoa;

public class PalestraApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Pessoa> pessoas = new ArrayList<>();
			boolean sair = false;

			while (!sair) {
				System.out.println("\n=== Palestras Serratec ===");
				System.out.println("1. Incluir palestrantes e participantes");
				System.out.println("2. Listar todos");
				System.out.println("3. Sair");
				System.out.print("Informe a opção desejada: ");
				int opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:
					System.out.print("Digite o nome: ");
					String nome = sc.nextLine();

					System.out.print("Digite o CPF: ");
					String cpf = sc.nextLine();

					System.out.println("Tipo de pessoa:");
					System.out.println("1. Participante");
					System.out.println("2. Palestrante");
					System.out.print("Escolha: ");
					int tipo = sc.nextInt();
					sc.nextLine();

					if (tipo == 1) {
						System.out.print("Digite o email: ");
						String email = sc.nextLine();
						pessoas.add(new Participante(nome, cpf, email));
					} else if (tipo == 2) {
						System.out.print("Digite o tema da palestra: ");
						String tema = sc.nextLine();
						pessoas.add(new Palestrante(nome, cpf, tema));
					} else {
						System.out.println("Tipo inválido!");
					}
					break;

				case 2:
					if (pessoas.isEmpty()) {
						System.out.println("\nNenhuma pessoa cadastrada.");
					} else {
						System.out.println("\n--- Lista de Pessoas ---");
						for (Pessoa p : pessoas) {
							p.exibirDados();
							System.out.println("------------------------");
						}
					}
					break;

				case 3:
					sair = true;
					System.out.println("Encerrando o programa...");
					break;

				default:
					System.out.println("Opção inválida.");

				}
			}
		}
	}
}


