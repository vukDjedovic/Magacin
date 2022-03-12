package magacin;

public class Knjiga {

	private String nazivKnjige;
	private int sifraKnjige;
	private String opisKnjige;
	private int kolicinaKnjiga;
	
	public String getNazivKnjige() {
		return nazivKnjige;
	}
	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}
	public int getSifraKnjige() {
		return sifraKnjige;
	}
	public void setSifraKnjige(int sifraKnjige) {
		this.sifraKnjige = sifraKnjige;
	}
	public String getOpisKnjige() {
		return opisKnjige;
	}
	public void setOpisKnjige(String opisKnjige) {
		this.opisKnjige = opisKnjige;
	}
	public int getKolicinaKnjiga() {
		return kolicinaKnjiga;
	}
	public void setKolicinaKnjiga(int kolicinaKnjiga) {
		this.kolicinaKnjiga = kolicinaKnjiga;
	}
	@Override
	public String toString() {
		return "Knjiga [nazivKnjige=" + nazivKnjige + ", sifraKnjige=" + sifraKnjige + ", opisKnjige=" + opisKnjige
				+ ", kolicinaKnjiga=" + kolicinaKnjiga + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraKnjige;
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
		Knjiga other = (Knjiga) obj;
		if (sifraKnjige != other.sifraKnjige)
			return false;
		return true;
	}
	
	
}
