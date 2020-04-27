package Questao10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		double salario=sc.nextDouble();
		double result = Empregado.valorInss(salario);
		
		
		Pessoa newpessoa = new Empregado("Joao",20,"masculino",5000.0,"142341354",result);
		Pessoa newpessoa1 = new Cliente("Maria",22,"feminino",1250.0,1998);
		Pessoa newpessoa2 = new Vendedor("Fernanda",32,"feminino",5000.0,"15465465246",3559.56,75,result);
		Pessoa newpessoa3 = new Gerente("Paulo",45,"masculino",5000.0,"199845154","XXXX",result);
		
		System.out.println(newpessoa);
		System.out.println(newpessoa1);
		System.out.println(newpessoa2);
		System.out.println(newpessoa3);
		
		sc.close();
	}

}
