package Questao10;

public abstract class Empregado extends Pessoa {

	protected double salario;
	private String matricula;

	public Empregado(String nome, int idade, String sexo, double salario, String matricula, double valorInss) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public static double valorInss(double salario) {
		return salario * 0.11;
	}


}
