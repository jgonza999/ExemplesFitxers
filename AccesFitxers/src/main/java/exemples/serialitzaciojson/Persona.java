package exemples.serialitzaciojson;

public class Persona {

	private String nom;
	private int edat;

	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
	public Persona() {		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	@Override
	public String toString() {
		return "[nom=" + nom + ", edat=" + edat + "]";
	}
	

}
