package testes;

import Modelo.Hospede;
import Modelo.Recepcionista;
import Modelo.Servi�os;

public class testeGastosCliente {

	public static void main(String[] args) {

		Recepcionista recepcionista1 = new Recepcionista(null, null, 0);
		recepcionista1.setNome("Nat� Cicero");
		recepcionista1.setCpf("504.245.328-55");
		recepcionista1.setSal�rio(3000);
		recepcionista1.setSenha(1234);
		
		Hospede hospede1 = new Hospede(null, null, null, null, null, 0);
		hospede1.setNome("Marcos Rocha");
		hospede1.setRg("54.855.987-4");
		hospede1.setCpf("855.668.454-98");
		hospede1.setReserva("50");
		hospede1.setFormaDePagamento("Cart�o de Cr�dito");
		hospede1.setNumeroDoQuarto(10);
		
		Hospede hospede2 = new Hospede(null, null, null, null, null, 0);
		hospede2.setNome("Nat� Silva");
		hospede2.setRg("23.668.254-6");
		hospede2.setCpf("585.558.729-30");
		hospede2.setReserva("10");
		hospede2.setFormaDePagamento("Cart�o de D�bito");
		hospede2.setNumeroDoQuarto(2);
		
		Hospede hospede3 = new Hospede(null, null, null, null, null, 0);
		hospede3.setNome("Vitor Santos");
		hospede3.setRg("12.354.298-8");
		hospede3.setCpf("668.754.325-25");
		hospede3.setReserva("36");
		hospede3.setFormaDePagamento("Dinheiro");
		hospede3.setNumeroDoQuarto(4);
		
		Hospede hospede4 = new Hospede(null, null, null, null, null, 0);
		hospede4.setNome("Carlos Almeida");
		hospede4.setRg("32.354.589-6");
		hospede4.setCpf("985.222.658-77");
		hospede4.setReserva("9");
		hospede4.setFormaDePagamento("Cart�o de Cr�dito");
		hospede4.setNumeroDoQuarto(1);

	Servi�os[] servi�os = new Servi�os[4];
	
	servi�os[0] = new Servi�os("R$52,00","R$0,00","R$120,00","R$43,00",recepcionista1,hospede1); 
	servi�os[1] = new Servi�os("R$23,00","R$12,00","R$52,00","R$25,00", recepcionista1, hospede2); 
	servi�os[2] = new Servi�os("R$84,00","R$32,50","R$0,00","R$30,00", recepcionista1, hospede3); 
	servi�os[3] = new Servi�os("R$100,00","R$25,00","R$200,00","R$12,00", recepcionista1, hospede4); 
	
	System.out.println("***********************************************************************");
	System.out.println("                  RELAT�RIO DE GASTOS");
	System.out.println("***********************************************************************");
	
	for(int i=0;i<servi�os.length;i++){
	System.out.println("Restaurante: " + servi�os[i].getRestaurante());
	System.out.println("Bar: " + servi�os[i].getBar());
	System.out.println("SPA: " + servi�os[i].getSPA());
	System.out.println("Servi�os de Quarto: " + servi�os[i].getServi�osdeQuarto());
	
	System.out.println("************************DADOS DO RECEPCIONISTA**************************");
	System.out.println("Recepcionista: " + servi�os[i].getRecepcionista().getNome());
	System.out.println("CPF: " + servi�os[i].getRecepcionista().getCpf());
	System.out.println("Sal�rio: " + servi�os[i].getRecepcionista().getSal�rio());
	
	System.out.println("*********************DADOS DO HOSPEDE****************************");
	
	System.out.println("Hospede: " + servi�os[i].getHospede().getNome());
	System.out.println("RG: " + servi�os[i].getHospede().getRg());
	System.out.println("CPF: " + servi�os[i].getHospede().getCpf());
	System.out.println("Reserva: " + servi�os[i].getHospede().getReserva());
	System.out.println("Forma de Pagamento: " + servi�os[i].getHospede().getFormaDePagamento());
	System.out.println("Numero do Quarto: " + servi�os[i].getHospede().getNumeroDoQuarto());
	
	System.out.println("============================================================");
	
		}
	}
}
