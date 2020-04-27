package Questao10;

public class Vendedor extends Empregado {
	private double valorVendas;
	private int qntVendas;

	public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas,
			int qntVendas,double valorInss) {
		super(nome, idade, sexo, salario, matricula, valorInss);
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

	public String toString() {
		return "Vendedor [valorVendas = " + valorVendas + ", qntVendas = " + qntVendas + ", Salario = " + getSalario()
				+ ", Matricula = " + getMatricula() + ", Nome = " + getNome() + ", Idade = " + getIdade()
				+ ", Sexo = " + getSexo() + "]";
	}
	
}
