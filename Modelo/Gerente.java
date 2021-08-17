package Modelo;

import autenticadorUtil.AutenticadorUtil;

public class Gerente extends Funcionario implements Autenticavel {

private AutenticadorUtil autenticador;
	
	public Gerente(String nome,String cpf,double salario) {
		super(nome,cpf,salario);
		this.autenticador = new AutenticadorUtil();
	}
	
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
