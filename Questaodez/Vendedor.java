package Questao10;

public class Vendedor extends Empregado {
	private double valorVendas;
	private int qntVendas;

	public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas,
			int qntVendas) {
		super(nome, idade, sexo, salario, matricula, valorVendas);
		this.valorVendas = valorVendas;
		this.qntVendas = qntVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [Nome = " + getNome() + ", Idade = " + getIdade() + ", Sexo = " + getSexo()
				+ ", Salario = " + getSalario() + ", Matricula = " + getMatricula() + ", valorVendas = "
				+ valorVendas + ", qntVendas = " + qntVendas + "]";
	}


	
}
