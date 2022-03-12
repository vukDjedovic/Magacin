package magacin;

public class Knjiga {

	private String nazivKnjige;
	private int sifraKnjige;
	private String opisKnjige;
	private int kolicinaKnjiga;
	
	public String getNazivKnjige() {
		return nazivKnjige;
	}
	public void setNazivKnjige(String nazivKnjige) throws Exception {
		if(nazivKnjige==null || nazivKnjige.isEmpty()) {
			throw new Exception("Naziv ne sme biti null ili prazan string!");
		}
		else this.nazivKnjige = nazivKnjige;
	}
	public int getSifraKnjige() {
		return sifraKnjige;
	}
	public void setSifraKnjige(int sifraKnjige) throws Exception {
		if(sifraKnjige<0) {
			throw new Exception("Sifra mora biti pozitivan ceo broj!");
		}
		this.sifraKnjige = sifraKnjige;
	}
	public String getOpisKnjige() {
		return opisKnjige;
	}
	public void setOpisKnjige(String opisKnjige) throws Exception {
		if(opisKnjige==null || opisKnjige.isEmpty()) {
			throw new Exception("Opis ne sme biti null ili prazan string!");
		}
		else this.opisKnjige = opisKnjige;
	}
	public int getKolicinaKnjiga() {
		return kolicinaKnjiga;
	}
	public void setKolicinaKnjiga(int kolicinaKnjiga) throws Exception {
		if(kolicinaKnjiga<=0) {
			throw new Exception("Kolicina mora biti pozitivan broj veci od nule!");
		}
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
