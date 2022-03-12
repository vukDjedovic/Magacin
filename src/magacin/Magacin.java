package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	private LinkedList<KucnaHemija> kucneHemije = new LinkedList<KucnaHemija>();
	private LinkedList<KancelarijskiMaterijal> kancelarijskiMaterijali = new LinkedList<KancelarijskiMaterijal>();
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}
	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
		
		
	}
	@Override
	public Knjiga pronadjiIVratiKnjigu(int sifra) {
		for (Knjiga knjiga : knjige) {
			if (sifra == knjiga.getSifraKnjige()) {
				return knjiga;
			}
		}
		return null;
	}
	@Override
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {
		kancelarijskiMaterijali.add(materijal);
		
	}
	@Override
	public void obrisiKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {
		kancelarijskiMaterijali.remove(materijal);
	}
	@Override
	public KancelarijskiMaterijal pronadjiIVratiKancMaterijal(int sifra) {
		for (KancelarijskiMaterijal kancelarijskiMaterijal : kancelarijskiMaterijali) {
			if (sifra == kancelarijskiMaterijal.getSifraKancelarijskogMaterijala()) {
				return kancelarijskiMaterijal;
			}
		}
		return null;
	}
	@Override
	public void dodajKucnuHemiju(KucnaHemija hemija) {
		kucneHemije.add(hemija);
	}
	@Override
	public void obrisiKucnuHemiju(KucnaHemija hemija) {
		kucneHemije.remove(hemija);
	}
	@Override
	public KucnaHemija pronadjiIVratiKucnuHemiju(int sifra) {
		for (KucnaHemija kucnaHemija : kucneHemije) {
			if (sifra == kucnaHemija.getSifraKucneHemije()) {
				return kucnaHemija;
			}
		}
		return null;
	}

}
