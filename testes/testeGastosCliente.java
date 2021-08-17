package testes;

import Modelo.Hospede;
import Modelo.Recepcionista;
import Modelo.Serviços;

public class testeGastosCliente {

	public static void main(String[] args) {

		Recepcionista recepcionista1 = new Recepcionista(null, null, 0);
		recepcionista1.setNome("Natã Cicero");
		recepcionista1.setCpf("504.245.328-55");
		recepcionista1.setSalário(3000);
		recepcionista1.setSenha(1234);
		
		Hospede hospede1 = new Hospede(null, null, null, null, null, 0);
		hospede1.setNome("Marcos Rocha");
		hospede1.setRg("54.855.987-4");
		hospede1.setCpf("855.668.454-98");
		hospede1.setReserva("50");
		hospede1.setFormaDePagamento("Cartão de Crédito");
		hospede1.setNumeroDoQuarto(10);
		
		Hospede hospede2 = new Hospede(null, null, null, null, null, 0);
		hospede2.setNome("Natã Silva");
		hospede2.setRg("23.668.254-6");
		hospede2.setCpf("585.558.729-30");
		hospede2.setReserva("10");
		hospede2.setFormaDePagamento("Cartão de Débito");
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
		hospede4.setFormaDePagamento("Cartão de Crédito");
		hospede4.setNumeroDoQuarto(1);

	Serviços[] serviços = new Serviços[4];
	
	serviços[0] = new Serviços("R$52,00","R$0,00","R$120,00","R$43,00",recepcionista1,hospede1); 
	serviços[1] = new Serviços("R$23,00","R$12,00","R$52,00","R$25,00", recepcionista1, hospede2); 
	serviços[2] = new Serviços("R$84,00","R$32,50","R$0,00","R$30,00", recepcionista1, hospede3); 
	serviços[3] = new Serviços("R$100,00","R$25,00","R$200,00","R$12,00", recepcionista1, hospede4); 
	
	System.out.println("***********************************************************************");
	System.out.println("                  RELATÓRIO DE GASTOS");
	System.out.println("***********************************************************************");
	
	for(int i=0;i<serviços.length;i++){
	System.out.println("Restaurante: " + serviços[i].getRestaurante());
	System.out.println("Bar: " + serviços[i].getBar());
	System.out.println("SPA: " + serviços[i].getSPA());
	System.out.println("Serviços de Quarto: " + serviços[i].getServiçosdeQuarto());
	
	System.out.println("************************DADOS DO RECEPCIONISTA**************************");
	System.out.println("Recepcionista: " + serviços[i].getRecepcionista().getNome());
	System.out.println("CPF: " + serviços[i].getRecepcionista().getCpf());
	System.out.println("Salário: " + serviços[i].getRecepcionista().getSalário());
	
	System.out.println("*********************DADOS DO HOSPEDE****************************");
	
	System.out.println("Hospede: " + serviços[i].getHospede().getNome());
	System.out.println("RG: " + serviços[i].getHospede().getRg());
	System.out.println("CPF: " + serviços[i].getHospede().getCpf());
	System.out.println("Reserva: " + serviços[i].getHospede().getReserva());
	System.out.println("Forma de Pagamento: " + serviços[i].getHospede().getFormaDePagamento());
	System.out.println("Numero do Quarto: " + serviços[i].getHospede().getNumeroDoQuarto());
	
	System.out.println("============================================================");
	
		}
	}
}
