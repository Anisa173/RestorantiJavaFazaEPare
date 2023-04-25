package menaxhim.Restoranti;

import java.util.*;

public class Customer {
	private String username;// nenkupton email
	private String password;// Strong pasword
	private String nid;
	private String emerMb;
	private String nrCel;
	private String adresa;
	private String cardId;// jo fushe e detyrueshme kur plotesohet formesi pasi mund te paguaje edhe me
							// cash
	protected int nrkliente;

	public Customer() {

		nid = "J25317719A";
		emerMb = "emerPersoni";
		nrCel = "0676475397";
		adresa = "Tirane,Apartamenti 20";
		cardId = "cardId";
		username = "celaanisa07@outlook.com";
		password = "CCaa1703@@#";

	}

	public Customer(String username, String password, String nid, String emerMb, String nrCel, String adresa,
			String cardId) {
		this.nid = nid;
		this.emerMb = emerMb;
		this.nrCel = nrCel;
		this.adresa = adresa;
		this.cardId = cardId;
		this.username = username;
		this.password = password;
	}

	private HashMap<String, String> afishoEmerMbieKlienti() {
		System.out.println("Emrat dhe Mbiemrat e Klienteve ");
		HashMap<String, String> personi = new HashMap<String, String>();
		personi.put("Anisa", "Çela");
		personi.put("Anisa", "Osmani");
		personi.put("Ermal", "Osmeni");
		personi.put("Entela", "Çela");
		personi.put("Anisa", "Plaku");
		personi.put("Mirela", "Hoxha");
		personi.put("Gent", "Korçari");
		personi.put("Nini", "Bakaj");
		personi.put("Dorina", "Avdija");
		personi.put("Marina", "Kekezi");
		personi.put("Greta", "Huda");
		personi.put("Ivi", "Bendaj");
		personi.put("Enea", "Gramo");
		personi.put("Vjollca", "Lacka");
		personi.put("Migena", "Musollari");
		personi.put("Moris", "Merhori");
		personi.put("Matilda", "Koni");
		personi.put("Megi", "Proda");
		personi.put("Adela", "Zaka");
		personi.put("Ksanthipi", "Koleka");
		personi.put("Alma", "Kastrati");
		personi.put("Rovina", "Margjoka");
		personi.put("Elisabeta", "Dervishi");
		personi.put("Enisa", "Dervishi");
		personi.put("Keti", "Pyze");
		personi.put("Bejana", "Oshafi");
		personi.put("Zaria", "Kantardzhieva");
		personi.put("Xhuljana", "Shkëmbi");
		personi.put("Eugen", "Kellezi");
		personi.put("Aulona", "Belulaj");
		personi.put("Majlinda", "Saliasi");
		personi.put("Engjellushe", "Lacka");
		personi.put("Erinda", "Shehu");
		personi.put("Maria", "Agaçi");
		personi.put("Gazmend", "Paja");
		personi.put("Anjeza", "Lacka");
		personi.put("Eduart", "Ndoci");
		personi.put("Erinda", "Oshafi");
		personi.put("Anila", "Demaj");
		personi.put("Ilia", "prifti");
		personi.put("Aurela", "Mullaj");
		personi.put("Eda", "Dishnica");
		personi.put("Daniel", "Dishnica");
		personi.put("Guadalupe", "Xhori");
		personi.put("Sindi", "Manushi");
		personi.put("Hergi", "Buasi");
		personi.put("Mimoza", "Drenova");
		personi.put("Pjerina", "Voda");
		personi.put("Anisa", "Sallaku");
		personi.put("Joni", "Shalsi");
		personi.put("Julia", "Gjoka");
		personi.put("Elina", "Rugova");
		personi.put("Kaltrin", "Sotaj");
		personi.put("Dori", "Gjini");
		personi.put("Fidan", "Elezi");
		personi.put("Redi", "Banushi");
		personi.put("Erda", "Koroveshi");
		personi.put("Erina", "Grabocka");
		personi.put("Sterio", "Plasa");
		personi.put("Platon", "Yzeiri");
		Set<Map.Entry<String, String>> set = personi.entrySet();
		for (Map.Entry<String, String> vl : set) {
			System.out.print(vl.getKey() + " ");
			System.out.println(vl.getValue());
		}
		System.out.println();

		return personi;
	}

	public String getEmerMb() {
		afishoEmerMbieKlienti();
		return emerMb;
	}

	private HashMap<String, String> afishoNidKlienti() {
		System.out.println("Numrin Personal të Identifikimit për çdo Klient ");
		HashMap<String, String> personiId = new HashMap<String, String>();
		personiId.put("J25369872K", "Anisa Çela");
		personiId.put("H21569871P", "Anisa  Osmani");
		personiId.put("E36958413F ", "Ermal Osmeni");
		personiId.put("G11568934K ", "Entela Çela");
		personiId.put("M11477598L", "Anisa Plaku");
		personiId.put("B25895162K", "Mirela Hoxha");
		personiId.put("D21115864O", "Gent Korçari");
		personiId.put("Z32115686K", "Nini Bakaj");
		personiId.put("L12115887F", "Dorina Avdija");
		personiId.put("P44586217H", "Marina  Kekezi");
		personiId.put("A11254875J", "Greta  Huda");
		personiId.put("U25654558G", "Ivi  Bendaj");
		personiId.put("R14456671H", "Enea  Gramo");
		personiId.put("E11235441X", "Vjollca Lacka");
		personiId.put("D11256682C", "Migena  Musollari");
		personiId.put("B45852566J", "Moris  Merhori");
		personiId.put("O55645582M", "Matilda  Koni");
		personiId.put("F22145787L", "Megi  Proda");
		personiId.put("I88521447N", "Adela  Zaka");
		personiId.put("T25644719S", "Ksanthipi  Koleka");
		personiId.put("K13669874P", "Alma  Kastrati");
		personiId.put("V11256897L", "Rovina  Margjoka");
		personiId.put("E78895662G", "Elisabeta  Dervishi");
		personiId.put("Q44789631L", "Enisa  Dervishi");
		personiId.put("T14456936D", "Keti  Pyze");
		personiId.put("I45558789C", "Bejana  Oshafi");
		personiId.put("U55698771B", "Zaria  Kantardzhieva");
		personiId.put("X12223566L", "Xhuljana  Shkëmbi");
		personiId.put("Y44158897L", "Eugen  Kellezi");
		personiId.put("R11258955Z", "Aulona  Belulaj");
		personiId.put("V11265898O", "Majlinda  Saliasi");
		personiId.put("D11256987K", "Engjellushe  Lacka");
		personiId.put("T44858597O", "Erinda  Shehu");
		personiId.put("J25335647B", "Maria  Agaçi");
		personiId.put("L22369877I", "Gazmend  Paja");
		personiId.put("S11245879N", "Anjeza  Lacka");
		personiId.put("Z22369654G", "Eduart  Ndoci");
		personiId.put("M11258749B", "Erinda  Oshafi");
		personiId.put("A17177855H", "Anila  Demaj");
		personiId.put("G11258664U", "Ilia  Prifti");
		personiId.put("L11258476N", "Aurela  Mullaj");
		personiId.put("J14459877P", "Eda  Dishnica");
		personiId.put("X44569877U", "Daniel  Dishnica");
		personiId.put("T14711755R", "Guadalupe  Xhori");
		personiId.put("C11447589I", "Sindi  Manushi");
		personiId.put("A33216554K", "Hergi  Buasi");
		personiId.put("K11289655F", "Mimoza  Drenova");
		personiId.put("T52889633D", "Pjerina  Voda");
		personiId.put("B44887569Y", "Anisa  Sallaku");
		personiId.put("U35264788O", "Joni  Shalsi");
		personiId.put("J14458897T", "Julia  Gjoka");
		personiId.put("V11255887S", "Elina  Rugova");
		personiId.put("M25581733G", "Kaltrin  Sotaj");
		personiId.put("H44588921L", "Dori  Gjini");
		personiId.put("E44569878O", "Fidan  Elezi");
		personiId.put("J66589352D", "Redi  Banushi");
		personiId.put("B11247886P", "Erda  Koroveshi");
		personiId.put("Y22155487C", "Erina  Grabocka");
		personiId.put("T17114586I", "Sterio  Plasa");
		personiId.put("P22356878G", "Platon  Yzeiri");
		Set<Map.Entry<String, String>> set = personiId.entrySet();
		for (Map.Entry<String, String> vl : set) {
			System.out.print(vl.getKey() + " ");
			System.out.println(vl.getValue());
		}
		System.out.println();

		return personiId;
	}

	public String getNid() {
		afishoNidKlienti();
		return nid;
	}
private TreeSet<String> afishoNrCel(){
System.out.println("Numri i celularit te çdo klienti");
	TreeSet<String> nrtel = new TreeSet<String>();
	nrtel.add("0676575397");
	nrtel.add("0676585497");
	nrtel.add("0685568794");
	nrtel.add("0682247991");
	nrtel.add("0698854542");
	nrtel.add("0667889544");
	nrtel.add("0669987852");
	nrtel.add("0671414701");
	nrtel.add("0698787542");
	nrtel.add("0695547881");
	nrtel.add("0678895472");
	nrtel.add("0695587763");
	nrtel.add("0676502155");
	nrtel.add("0699876547");
	nrtel.add("0685521224");
	nrtel.add("0699984711");
	nrtel.add("0698887602");
	nrtel.add("0674443201");
	nrtel.add("0662253541");
	nrtel.add("0685544701");
	nrtel.add("0697879788");
	nrtel.add("0699514544");
	nrtel.add("0695258454");
	nrtel.add("0677117455");
	nrtel.add("0695582456");
	nrtel.add("0699352411");
	nrtel.add("0689995764");
	nrtel.add("0685959457");
	nrtel.add("0698787878");
	nrtel.add("0685524433");
	nrtel.add("0674475219");
	nrtel.add("0665545458");
	nrtel.add("0699514547");
	nrtel.add("0695524873");
	nrtel.add("0685523411");
	nrtel.add("0677879745");
	nrtel.add("0699874545");
	nrtel.add("0685459501");
	nrtel.add("0685524631");
	nrtel.add("0693332211");
	nrtel.add("0688641222");
	nrtel.add("0685559974");
	nrtel.add("0677414141");
	nrtel.add("0677155423");
	nrtel.add("0663230121");
	nrtel.add("0693235621");
	nrtel.add("0663998741");
	nrtel.add("0683355542");
	nrtel.add("0674418952");
	nrtel.add("0699633201");
	nrtel.add("0699584753");
	nrtel.add("0695552432");
	nrtel.add("0699878725");
	nrtel.add("0684445202");
	nrtel.add("0685564452");
	nrtel.add("0665958221");
	nrtel.add("0678985201");
	nrtel.add("0677415896");
	nrtel.add("0698585213");
	nrtel.add("0675958664");
	
	for (String vl : nrtel) {
		System.out.println(vl);
		
	}
	System.out.println();

	return nrtel;
}	
public String getNrCel() {
	afishoNrCel();
return nrCel;
}
	public void kryejBlerjeApp() {
		System.out.println("Klienti nuk duhet te qendroje si nje vizitor por duhet te krijoje llogari.");
	}
}
