package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	// Projekat Magacin je u potpunosti zavrsen!
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	private LinkedList<KucnaHemija> kucneHemije = new LinkedList<KucnaHemija>();
	private LinkedList<KancelarijskiMaterijal> kancelarijskiMaterijali = new LinkedList<KancelarijskiMaterijal>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {

		if(knjiga == null) {
			throw new RuntimeException("Knjiga ne sme biti null!");
		}
		if(knjige.contains(knjiga)) {
			int indeks = knjige.indexOf(knjiga);
			int kolicina = knjige.get(indeks).getKolicinaKnjiga();
			try {
				knjige.get(indeks).setKolicinaKnjiga(kolicina + knjiga.getKolicinaKnjiga());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			knjige.add(knjiga);
		}
		
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		
		if(knjiga == null) {
			throw new RuntimeException("Knjiga ne sme biti null!");
		}
		if(knjige.contains(knjiga)) {
			int indeks = knjige.indexOf(knjiga);
			int kolicina = knjige.get(indeks).getKolicinaKnjiga();
			try {
				if(kolicina>knjiga.getKolicinaKnjiga()) {
					knjige.get(indeks).setKolicinaKnjiga(kolicina - knjiga.getKolicinaKnjiga());
				} else {
					knjige.remove(knjiga);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			throw new RuntimeException("Knjiga ne postoji u magacinu pa se ne moze obrisati!");
		}
	}

	@Override
	public Knjiga pronadjiIVratiKnjigu(int sifra) {
		for (Knjiga knjiga : knjige) {
			if(sifra== knjiga.getSifraKnjige()) {
				return knjiga;
			}
		}
		
		return null;
	}

	@Override
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {

		
		if(materijal == null) {
			throw new RuntimeException("Kancelarijski materijal ne sme biti null!");
		}
		if(kancelarijskiMaterijali.contains(materijal)) {
			int indeks = kancelarijskiMaterijali.indexOf(materijal);
			int kolicina = kancelarijskiMaterijali.get(indeks).getKolicinaKancelarijskogMaterijala();
			try {
				kancelarijskiMaterijali.get(indeks).setKolicinaKancelarijskogMaterijala(kolicina + materijal.getKolicinaKancelarijskogMaterijala());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			kancelarijskiMaterijali.add(materijal);
		}
	}

	@Override
	public void obrisiKancelarijskiMaterijal(KancelarijskiMaterijal materijal) {
		
		if(materijal == null) {
			throw new RuntimeException("Kancelarijski materijal ne sme biti null!");
		}
		if(kancelarijskiMaterijali.contains(materijal)) {
			int indeks = kancelarijskiMaterijali.indexOf(materijal);
			int kolicina = kancelarijskiMaterijali.get(indeks).getKolicinaKancelarijskogMaterijala();
			try {
				if(kolicina>materijal.getKolicinaKancelarijskogMaterijala()) {
					kancelarijskiMaterijali.get(indeks).setKolicinaKancelarijskogMaterijala(kolicina - materijal.getKolicinaKancelarijskogMaterijala());
				} else {
					kancelarijskiMaterijali.remove(materijal);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			throw new RuntimeException("Kancelarijski materijal ne postoji u magacinu pa se ne moze obrisati!");
		}
	}

	@Override
	public KancelarijskiMaterijal pronadjiIVratiKancMaterijal(int sifra) {
		
		for (KancelarijskiMaterijal materijal : kancelarijskiMaterijali) {
			if(sifra == materijal.getSifraKancelarijskogMaterijala()) {
				return materijal;
			}
		}
		
		return null;
	}

	@Override
	public void dodajKucnuHemiju(KucnaHemija hemija) {
		
		if(hemija == null) {
			throw new RuntimeException("Kucna hemija ne sme biti null!");
		}
		if(kucneHemije.contains(hemija)) {
			int indeks = kucneHemije.indexOf(hemija);
			int kolicina = kucneHemije.get(indeks).getKolicinaKucneHemije();
			try {
				kucneHemije.get(indeks).setKolicinaKucneHemije(kolicina + hemija.getKolicinaKucneHemije());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			kucneHemije.add(hemija);
		}

	}

	@Override
	public void obrisiKucnuHemiju(KucnaHemija hemija) {

		if(hemija == null) {
			throw new RuntimeException("Kucna hemija ne sme biti null!");
		}
		if(kucneHemije.contains(hemija)) {
			int indeks = kucneHemije.indexOf(hemija);
			int kolicina = kucneHemije.get(indeks).getKolicinaKucneHemije();
			try {
				if(kolicina>hemija.getKolicinaKucneHemije()) {
					kucneHemije.get(indeks).setKolicinaKucneHemije(kolicina - hemija.getKolicinaKucneHemije());
				} else {
					kucneHemije.remove(hemija);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			throw new RuntimeException("Kucna hemija ne postoji u magacinu pa se ne moze obrisati!");
		}
	}

	@Override
	public KucnaHemija pronadjiIVratiKucnuHemiju(int sifra) {
		
		for (KucnaHemija hemija : kucneHemije) {
			if(sifra == hemija.getSifraKucneHemije()) {
				return hemija;
			}
		}
		
		return null;
	}

}
