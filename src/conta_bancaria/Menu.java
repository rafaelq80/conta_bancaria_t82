package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		// Criar (instanciar) um Objeto da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Aylla", 500000);
		c1.visualizar();
		
		// Sacar
		c1.sacar(100);
		c1.visualizar();

		// Depositar
		c1.depositar(1000);
		c1.visualizar();
		
		// Alterar a propriedade titular
		c1.setTitular("Aylla Scaglia");
		c1.visualizar();
		
		// Instanciando um Objeto da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 456, 1, "Renata Negrini", 600000, 60000);
		cc1.visualizar();
		
		cc1.sacar(659000);
		cc1.visualizar();
		
		cc1.depositar(50000);
		cc1.visualizar();
		
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
