package Questao10;

public class Gerente extends Empregado {
	private String nomeGerencia;

	public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia,double valorInss) {
		super(nome, idade, sexo, salario, matricula, valorInss);
		this.nomeGerencia = nomeGerencia;
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

	
	public String toString() {
		return "Gerente [nomeGerencia=" + nomeGerencia + ", Salario = " + getSalario() + ", Matricula = "
				+ getMatricula() + ", Nome = " + getNome() + ", Idade = " + getIdade() + ", Sexo = "
				+ getSexo() + "]";
	}

}
