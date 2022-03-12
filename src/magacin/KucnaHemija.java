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
	public void setNazivKucneHemije(String nazivKucneHemije) {
		this.nazivKucneHemije = nazivKucneHemije;
	}
	public int getSifraKucneHemije() {
		return sifraKucneHemije;
	}
	public void setSifraKucneHemije(int sifraKucneHemije) {
		this.sifraKucneHemije = sifraKucneHemije;
	}
	public String getOpisKucneHemije() {
		return opisKucneHemije;
	}
	public void setOpisKucneHemije(String opisKucneHemije) {
		this.opisKucneHemije = opisKucneHemije;
	}
	public int getKolicinaKucneHemije() {
		return kolicinaKucneHemije;
	}
	public void setKolicinaKucneHemije(int kolicinaKucneHemije) {
		this.kolicinaKucneHemije = kolicinaKucneHemije;
	}
	public Date getDatum() {
		return rokTrajanja;
	}
	public void setDatum(Date datum) {
		this.rokTrajanja = datum;
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
