package Questao7;

public class Pessoa extends Familia {
	
	Familia[] pessoas;
	int numPessoas;
	String nome;
	String emprego;
	
	public void Familia() {
		pessoas = new Familia[100];
		numPessoas = 0;
	}

	void adicionar(Familia novoPessoa) {
		pessoas[numPessoas] = novoPessoa;
		numPessoas++;
		}
	public String getEmprego() {
		return emprego;
	}

	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}