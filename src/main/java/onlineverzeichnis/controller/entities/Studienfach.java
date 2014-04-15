package onlineverzeichnis.controller.entities;

import java.io.Serializable;

public class Studienfach implements Serializable{
	
	private String bezeichnung;
	private String lvaNummer;
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getLvaNummer() {
		return lvaNummer;
	}
	public void setLvaNummer(String lvaNummer) {
		this.lvaNummer = lvaNummer;
	}

	
	
}
