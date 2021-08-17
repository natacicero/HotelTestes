package Modelo;

public class Funcionario {
	
	//Propriedades 
	private String nome;
	private String cpf;
	private double salário;
	
	public Funcionario(String nome, String cpf, double salario) {
		
	}
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;

	}
	
}

