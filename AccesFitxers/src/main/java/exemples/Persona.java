package exemples;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 2L;  // Definir un serialVersionUID explícitament
	private String nom;
	private int edat;

	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}

	@Override
	public String toString() {
		return nom + " - " + edat;
	}	

}
