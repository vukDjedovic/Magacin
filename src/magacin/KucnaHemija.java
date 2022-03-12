package magacin;

import java.util.Date;

public class KucnaHemija {

	private String nazivKucneHemije;
	private int sifraKucneHemije;
	private String opisKucneHemije;
	private int kolicinaKucneHemije;
	private Date rokTrajanja;
	
	public String getNazivKucneHemije() {
		return nazivKucneHemije;
	}
	public void setNazivKucneHemije(String nazivKucneHemije) throws Exception {
		if(nazivKucneHemije==null || nazivKucneHemije.isEmpty()) {
			throw new Exception("Naziv ne sme biti null ili prazan string!");
		}
		else this.nazivKucneHemije = nazivKucneHemije;
	}
	public int getSifraKucneHemije() {
		return sifraKucneHemije;
	}
	public void setSifraKucneHemije(int sifraKucneHemije) throws Exception {
		if(sifraKucneHemije<0) {
			throw new Exception("Sifra mora biti pozitivan ceo broj!");
		}
		this.sifraKucneHemije = sifraKucneHemije;
	}
	public String getOpisKucneHemije() {
		return opisKucneHemije;
	}
	public void setOpisKucneHemije(String opisKucneHemije) throws Exception {
		if(opisKucneHemije==null || opisKucneHemije.isEmpty()) {
			throw new Exception("Opis ne sme biti null ili prazan string!");
		}
		else this.opisKucneHemije = opisKucneHemije;
	}
	public int getKolicinaKucneHemije() {
		return kolicinaKucneHemije;
	}
	public void setKolicinaKucneHemije(int kolicinaKucneHemije) throws Exception {
		if(kolicinaKucneHemije<=0) {
			throw new Exception("Kolicina mora biti pozitivan broj veci od nule!");
		}
		this.kolicinaKucneHemije = kolicinaKucneHemije;
	}
	public Date getDatum() {
		return rokTrajanja;
	}
	public void setDatum(Date rokTrajanja) throws Exception {
		if(rokTrajanja == null || rokTrajanja.before(new Date())) {
			throw new Exception("Rok trajanja ne sme biti null i ne sme biti pre datuma kreiranja artikla");
		}
		this.rokTrajanja = rokTrajanja;
	}
	@Override
	public String toString() {
		return "KucnaHemija [nazivKucneHemije=" + nazivKucneHemije + ", sifraKucneHemije=" + sifraKucneHemije
				+ ", opisKucneHemije=" + opisKucneHemije + ", kolicinaKucneHemije=" + kolicinaKucneHemije
				+ ", rokTrajanja=" + rokTrajanja + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraKucneHemije;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (sifraKucneHemije != other.sifraKucneHemije)
			return false;
		return true;
	}
	
	
	
}
