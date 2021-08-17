package testes;

import Modelo.Gerente;
import Modelo.Recepcionista;
import sistemaInterno.SistemaInterno;

public class TesteAcessoSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Thales Dias","866.254.387-45",3000);
		gerente.setSenha(1234);
		
		Recepcionista recepcionista = new Recepcionista("Natã Siva","504.254.285-87",3000);
		recepcionista.setSenha(1284);
		
		SistemaInterno si = new SistemaInterno();
		si.loginRestrito(gerente);	
		si.loginRestrito(recepcionista);

	}
}


