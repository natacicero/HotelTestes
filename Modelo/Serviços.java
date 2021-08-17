package Modelo;

public class Serviços {

	public Serviços(String Restaurante, String Bar, String SPA, String ServiçosdeQuarto, Recepcionista recepcionista, Hospede hospede) {
		this.Restaurante = Restaurante;
		this.Bar = Bar;
		this.SPA = SPA;
		this.ServiçosdeQuarto = ServiçosdeQuarto;
		this.recepcionista = recepcionista;
		this.hospede = hospede;
	}

	private String Restaurante;
	private String Bar;
	private String SPA;
	private String ServiçosdeQuarto;
	private Recepcionista recepcionista;
	private Hospede hospede;
	
	public String getRestaurante() {
		return Restaurante;
	}
	public void setRestaurante(String restaurante) {
		Restaurante = restaurante;
	}
	public String getBar() {
		return Bar;
	}
	public void setBar(String bar) {
		Bar = bar;
	}
	public String getSPA() {
		return SPA;
	}
	public void setSPA(String sPA) {
		SPA = sPA;
	}
	public String getServiçosdeQuarto() {
		return ServiçosdeQuarto;
	}
	public void setServiçosdeQuarto(String serviçosdeQuarto) {
		ServiçosdeQuarto = serviçosdeQuarto;
	}

	public Recepcionista getRecepcionista() {
		return recepcionista;
	}

	public void setRecepcionista(Recepcionista recepcionista) {
		this.recepcionista = recepcionista;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
}
