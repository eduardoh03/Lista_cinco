package Questao10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informa o seu salario: ");
		double salario=sc.nextDouble();
		double result = Empregado.valorInss(salario);		
		
		Pessoa newpessoa1 = new Cliente("Maria",22,"feminino",1250,1998);
		Pessoa newpessoa2 = new Vendedor("Fernanda",32,"feminino",salario,"15465465246",3559.56,75);
		Pessoa newpessoa3 = new Gerente("Paulo",45,"masculino",salario,"199845154","Gerente de Vendas",result);
		
		System.out.println(newpessoa1);
		System.out.println(newpessoa2);
		System.out.println(newpessoa3);
		
		sc.close();
	}

}
