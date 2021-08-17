package Modelo;

import autenticadorUtil.AutenticadorUtil;

	public class Recepcionista extends Funcionario implements Autenticavel{
	
	public Recepcionista(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticadorUtil();
	}

	private AutenticadorUtil autenticador;
	
	//Métodos Getters e Setters (Contrato da Interface)
			@Override
			public int getSenha() {
				return this.autenticador.getSenha();
			}
			
			@Override
			public void setSenha(int senha) {
				this.autenticador.setSenha(senha);
			}

}
