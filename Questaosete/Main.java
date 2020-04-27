package Questao7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
		Pessoa dados = new Pessoa();
		Familia fam = new Familia();
		// int tam_f;
		menu.Menu_inicial();
		/*
		 * menu.quant_familias(); tam_f = sc.nextInt(); ArrayList<Familia>
		 * ListaDeFamilias = new ArrayList<>(tam_f); for (int o = 0; 0 <= tam_f; o++) {
		 * }
		 */
		int f;
		menu.menu_integrantes();
		fam.integrantes = sc.nextInt();
		do {
			for (int i = 0; i <= fam.getIntegrantes(); i++) {
				dados.nome = sc.nextLine();
				System.out.println(dados.getNome());
				/*menu.trabalha();
				
				 * do { menu.tipo_emprego(); int escolha = escolhaOtipoDeTrabalho(); if
				 * (escolha==0) { // } else if(escolha==1){ }else if(escolha==2){ }
				 */
							
				}
			System.out.println("Para adicionar +1 familia aperta 1,para parar tecle 0 ");
			f = sc.nextInt();
		} while (f != 0);

		sc.close();

	}
}

/*
 * public static int escolhaOtipoDeTrabalho() {
 * System.out.println("Digite o tipo de trabalho");
 * 
 * return Integer.valueOf(sc.nextLine()); }
 */
