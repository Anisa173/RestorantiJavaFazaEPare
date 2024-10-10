package menaxhim.Restoranti;

import java.util.*;

public class Restorant {
	private String emerR;
	private String FusheAktiviteti; // Fusha e veprimtarise: Kuzhine Aziatike
	private String idRestorant;// NUIS ose nr Nipt-i
	private String vendodhjeR;
	private String zonaSherbimi;
	private String orariSherbimit;
	private String nrTelefoni;
	private String formaPagese;

	public Restorant() {
		emerR = "SushiCO";
		FusheAktiviteti = "Kuzhinë Japoneze,Kineze dhe Tajlandeze";
		idRestorant = "Nr Nipti";
		vendodhjeR = "Rruga Nikolla Tupe, Nd nr 2 , Tirana 1001";
		zonaSherbimi = "Zonat e sherbimit";
		orariSherbimit = "11:30 - 23:30";
		nrTelefoni = "+355 69 70 333 99";
		formaPagese = "Para të Gatshme , Kartë Krediti ";
	}

	public Restorant(String emerR, String FusheAktiviteti, String idRestorant, String vendodhjeR, String zonaSherbimi,
			String orariSherbimit, String nrTelefoni, String formaPagese) {
		this.emerR = emerR;
		this.FusheAktiviteti = FusheAktiviteti;
		this.idRestorant = idRestorant;
		this.vendodhjeR = vendodhjeR;
		this.zonaSherbimi = zonaSherbimi;
		this.orariSherbimit = orariSherbimit;
		this.nrTelefoni = nrTelefoni;
		this.formaPagese = formaPagese;
	}

	public void setEmerR(String emerR) {
		this.emerR = emerR;
	}

	public String getEmerR() {
		return emerR;
	}

	public void setIdRestorant(String idRestorant) {
		this.idRestorant = idRestorant;
	}

	public String getIdRestorant() {
		return idRestorant;
	}

	public void setFusheAktiviteti(String FusheAktiviteti) {
		this.FusheAktiviteti = FusheAktiviteti;
	}

	public String getFusheAktiviteti() {
		return FusheAktiviteti;
	}

	public void setOrariSherbimit(String orariSherbimit) {
		this.orariSherbimit = orariSherbimit;
	}

	public String getOrariSherbimit() {
		return orariSherbimit;
	}

	public void setVendodhjeR(String vendodhjeR) {
		this.vendodhjeR = vendodhjeR;
	}

	public String getVendodhjeR() {
		return vendodhjeR;
	}

	public void setNrTelefoni(String nrTelefoni) {
		this.nrTelefoni = nrTelefoni;
	}

	public String getNrTelefoni() {
		return nrTelefoni;
	}

	public ArrayList<String> afishoMenyraPagese() {
		ArrayList<String> formëPagese = new ArrayList<String>();
		System.out.println("Format e kryerjes se pageses se porosise");
		formëPagese.add("Para të Gatshme/Cash");
		formëPagese.add("Pagesë me Kartë Krediti");
		for (String l : formëPagese) {
			System.out.println(l);
		}
		return formëPagese;
	}

	public String getFormëPagese() {
		afishoMenyraPagese();
		return formaPagese;
	}

	private ArrayList<String> shfaqZonaShërbimi() {
		System.out.println("Restoranti yne shërben vetem për këto zona te kryeqytetit:");
		ArrayList<String> zonaSherbimi = new ArrayList<String>();
		zonaSherbimi.add("Pazari i Ri");
		zonaSherbimi.add("Qendër");
		zonaSherbimi.add("Komuna E Parisit");
		zonaSherbimi.add("Qyteti Studenti");
		zonaSherbimi.add("21 Djetori");
		zonaSherbimi.add("Rruga e Elbasanit");
		zonaSherbimi.add("Tirana e Re");
		zonaSherbimi.add("Brraka");
		zonaSherbimi.add("Selvia");
		zonaSherbimi.add("Liqeni Thatë");
		zonaSherbimi.add("Xhamllik");
		zonaSherbimi.add("Stacioni i Trenit");
		zonaSherbimi.add("Ali Demi");
		zonaSherbimi.add("Laprakë");
		zonaSherbimi.add("Astir");
		zonaSherbimi.add("Don Bosko");
		zonaSherbimi.add("Fusha e Aviacionit");
		zonaSherbimi.add("Shkozë");
		zonaSherbimi.add("Sauk");
		zonaSherbimi.add("Kombinati");
		zonaSherbimi.add("Kamëz");
		zonaSherbimi.add("Kashar");
		zonaSherbimi.add("Surrel");
		zonaSherbimi.add("TEG");
		zonaSherbimi.add("Rolling Hills");
		for (String str : zonaSherbimi) {
			System.out.println(str);
		}
		return zonaSherbimi;
	}

	public String getZonaSherbimi() {
		shfaqZonaShërbimi();
		return zonaSherbimi;
	}
}