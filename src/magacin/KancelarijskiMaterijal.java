package magacin;

public class KancelarijskiMaterijal {

	private String nazivKancelarijskogMaterijala;
	private int sifraKancelarijskogMaterijala;
	private String opisKancelarijskogMaterijala;
	private int kolicinaKancelarijskogMaterijala;
	
	public String getNazivKancelarijskogMaterijala() {
		return nazivKancelarijskogMaterijala;
	}
	public void setNazivKancelarijskogMaterijala(String nazivKancelarijskogMaterijala) {
		this.nazivKancelarijskogMaterijala = nazivKancelarijskogMaterijala;
	}
	public int getSifraKancelarijskogMaterijala() {
		return sifraKancelarijskogMaterijala;
	}
	public void setSifraKancelarijskogMaterijala(int sifraKancelarijskogMaterijala) {
		this.sifraKancelarijskogMaterijala = sifraKancelarijskogMaterijala;
	}
	public String getOpisKancelarijskogMaterijala() {
		return opisKancelarijskogMaterijala;
	}
	public void setOpisKancelarijskogMaterijala(String opisKancelarijskogMaterijala) {
		this.opisKancelarijskogMaterijala = opisKancelarijskogMaterijala;
	}
	public int getKolicinaKancelarijskogMaterijala() {
		return kolicinaKancelarijskogMaterijala;
	}
	public void setKolicinaKancelarijskogMaterijala(int kolicinaKancelarijskogMaterijala) {
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
