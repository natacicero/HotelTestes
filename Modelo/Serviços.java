package Modelo;

public class Servi�os {

	public Servi�os(String Restaurante, String Bar, String SPA, String Servi�osdeQuarto, Recepcionista recepcionista, Hospede hospede) {
		this.Restaurante = Restaurante;
		this.Bar = Bar;
		this.SPA = SPA;
		this.Servi�osdeQuarto = Servi�osdeQuarto;
		this.recepcionista = recepcionista;
		this.hospede = hospede;
	}

	private String Restaurante;
	private String Bar;
	private String SPA;
	private String Servi�osdeQuarto;
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
	public String getServi�osdeQuarto() {
		return Servi�osdeQuarto;
	}
	public void setServi�osdeQuarto(String servi�osdeQuarto) {
		Servi�osdeQuarto = servi�osdeQuarto;
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
