package onlineverzeichnis.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VerzeichnisManagedBean {

	/**
	 * Creates a new instance of VerzeichnisManagedBean
	 */
	public VerzeichnisManagedBean() {
	}

	private String welcomeText = "Onlineverzeichnis Neu";

	public String getWelcomeText() {
		return welcomeText;
	}

	private String test ="Hello Africa";
}
