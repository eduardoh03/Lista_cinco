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

	@Override
	public String toString() {
		return "Gerente [Nome = " + getNome() + ", getIdade = " + getIdade() + ", Sexo = " + getSexo()
				+ ", Salario = " + getSalario() + ", Matricula = " + getMatricula() + ", nomeGerencia="
				+ nomeGerencia + ",valorINSS = " + Empregado.valorInss(salario)+"]";
	}

	


}
