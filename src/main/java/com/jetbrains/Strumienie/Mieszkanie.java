package com.jetbrains.Strumienie;

public class Mieszkanie {
	private String miasto;
	private String dzielnica;
	private String ulica;
	private int pokoje;
	private float powierchnia;
	private boolean piwnica;
	private int cena;

	public Mieszkanie(String miasto, String dzielnica, String ulica, int pokoje, float powierchnia, boolean piwnica, int cena) {
		this.miasto = miasto;
		this.dzielnica = dzielnica;
		this.ulica = ulica;
		this.pokoje = pokoje;
		this.powierchnia = powierchnia;
		this.piwnica = piwnica;
		this.cena = cena;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getDzielnica() {
		return dzielnica;
	}

	public void setDzielnica(String dzielnica) {
		this.dzielnica = dzielnica;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public int getPokoje() {
		return pokoje;
	}

	public void setPokoje(int pokoje) {
		this.pokoje = pokoje;
	}

	public float getPowierchnia() {
		return powierchnia;
	}

	public void setPowierchnia(float powierchnia) {
		this.powierchnia = powierchnia;
	}

	public boolean isPiwnica() {
		return piwnica;
	}

	public void setPiwnica(boolean piwnica) {
		this.piwnica = piwnica;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString(){
		return "Mieszkanie{"+
				"miasto = '"+ miasto + '\''+
				"dzielnica = '"+ dzielnica + '\''+
				"ulica = '"+ ulica + '\''+
				"pokoje = '"+ pokoje + '\''+
				"powierzchnia = '"+ powierchnia + '\''+
				"piwnica = '"+ piwnica + '\''+
				"cena = '"+ cena + '\''+
				'}';
	}

}
