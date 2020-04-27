package Questao9;

public class Peixe extends Animal{

	private String habitat;

	public Peixe(String nome, Double peso, String habitat) {
		super(nome, peso);
		this.habitat=habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String toString() {
		return "Peixe [Nome = " + getNome() 
				+", Habitat = " + habitat 
		        + ", Peso = " + getPeso() + " gramas]";
	}
	
}
