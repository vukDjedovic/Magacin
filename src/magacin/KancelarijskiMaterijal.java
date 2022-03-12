package magacin;

public class KancelarijskiMaterijal {

	private String nazivKancelarijskogMaterijala;
	private int sifraKancelarijskogMaterijala;
	private String opisKancelarijskogMaterijala;
	private int kolicinaKancelarijskogMaterijala;
	
	public String getNazivKancelarijskogMaterijala() {
		return nazivKancelarijskogMaterijala;
	}
	public void setNazivKancelarijskogMaterijala(String nazivKancelarijskogMaterijala) throws Exception {
		if(nazivKancelarijskogMaterijala==null || nazivKancelarijskogMaterijala.isEmpty()) {
			throw new Exception("Naziv ne sme biti null ili prazan string!");
		}
		else this.nazivKancelarijskogMaterijala = nazivKancelarijskogMaterijala;
	}
	public int getSifraKancelarijskogMaterijala() {
		return sifraKancelarijskogMaterijala;
	}
	public void setSifraKancelarijskogMaterijala(int sifraKancelarijskogMaterijala) throws Exception {
		if(sifraKancelarijskogMaterijala<0) {
			throw new Exception("Sifra mora biti pozitivan ceo broj!");
		}
		this.sifraKancelarijskogMaterijala = sifraKancelarijskogMaterijala;
	}
	public String getOpisKancelarijskogMaterijala() {
		return opisKancelarijskogMaterijala;
	}
	public void setOpisKancelarijskogMaterijala(String opisKancelarijskogMaterijala) throws Exception {
		if(opisKancelarijskogMaterijala==null || opisKancelarijskogMaterijala.isEmpty()) {
			throw new Exception("Opis ne sme biti null ili prazan string!");
		}
		else this.opisKancelarijskogMaterijala = opisKancelarijskogMaterijala;
	}
	public int getKolicinaKancelarijskogMaterijala() {
		return kolicinaKancelarijskogMaterijala;
	}
	public void setKolicinaKancelarijskogMaterijala(int kolicinaKancelarijskogMaterijala) throws Exception {
		if(kolicinaKancelarijskogMaterijala<=0) {
			throw new Exception("Kolicina mora biti pozitivan broj veci od nule!");
		}
		this.kolicinaKancelarijskogMaterijala = kolicinaKancelarijskogMaterijala;
	}
	@Override
	public String toString() {
		return "KancelarijskiMaterijal [nazivKancelarijskogMaterijala=" + nazivKancelarijskogMaterijala
				+ ", sifraKancelarijskogMaterijala=" + sifraKancelarijskogMaterijala + ", opisKancelarijskogMaterijala="
				+ opisKancelarijskogMaterijala + ", kolicinaKancelarijskogMaterijala="
				+ kolicinaKancelarijskogMaterijala + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifraKancelarijskogMaterijala;
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
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		if (sifraKancelarijskogMaterijala != other.sifraKancelarijskogMaterijala)
			return false;
		return true;
	}
	
	
	
	
}
