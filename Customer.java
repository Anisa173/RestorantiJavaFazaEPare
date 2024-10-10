package menaxhim.Restoranti;

import java.util.*;

public class Customer {
    private String nid;
	private String emerMb;
    private String nrCel;
	private String adresa;
    private String cardId;/*jo fushe e detyrueshme kur plotesohet formesi pasi  mund te kryhet pagesa  edhe me cash**/
	private String username;/*nenkupton email per t'u loguar**/
	private String password;/*Strong password per t'u loguar**/
	private int customerId;
	
 

	public Customer() {

		nid = "J25317719A";
		emerMb = "emerPersoni";
		nrCel = "0676475397";
		adresa = "Tirane,Apartamenti 20";
		cardId = "cardId";
		username = "celaanisa07@outlook.com";
		password = "CCaa1703@@#";
		customerId = 10123;
	}

	public Customer(String nid,String emerMb,String nrCel,String adresa,String cardId,String username, String password,    
			 int customerId) {
		this.nid = nid;
		this.emerMb = emerMb;
		this.nrCel = nrCel;
		this.adresa = adresa;
		this.cardId = cardId;
		this.username = username;
		this.password = password;
		this.customerId = customerId;
	    
	}

	private ArrayList<String> afishoEmerMbieKlienti() {
		System.out.println(" Klientet sipas Emrit dhe Mbiemrit"+'\n');
		ArrayList<String> personi = new ArrayList<String>();
		personi.add("Anisa  Çela");
		personi.add("Anisa Osmani");
		personi.add("Ermal  Ormeni");
		personi.add("Entela Çelaj");
		personi.add("Anisa  Plaku");
		personi.add("Mirela  Hoxha");
		personi.add("Gent  Tyxhari");
		personi.add("Marina  Kellezi");
		personi.add("Greta  Huda");
		personi.add("Enea  Gramo");
		personi.add("Vjollca  Lacka");
		personi.add("Migena  Musollari");
		personi.add("Megi  Proda");
		personi.add("Adela  Zaka");
		personi.add("Ksanthipi  Koleka");
		personi.add("Alma  Kastrati");
		personi.add("Elisabeta  Dervishi");
		personi.add("Enisa  Dervishi");
		personi.add("Bejana  Oshafi");
		personi.add("Xhuljana  Shkëmbi");
		personi.add("Eugen  Kellezi");
		personi.add("Erinda  Shehu");
		personi.add("Maria  Agaçi");
		personi.add("Gazmend  Paja");
		personi.add("Anjeza  Lacka");
		personi.add("Eduart  Ndoci");
		personi.add("Erinda  Oshafi");
		personi.add("Ilia  Prifti");
		personi.add("Aurela  Mullaj");
		personi.add("Guadalupe  Xhori");
		personi.add("Sindi  Manushi");
		personi.add("Hergi  Buasi");
		personi.add("Mimoza  Drenova");
		personi.add("Pjerina  Voda");
		personi.add("Anisa  Sallaku");
		personi.add("Joni  Shalsi");
		personi.add("Julia  Gjoka");
		personi.add("Elina  Rugova");
		personi.add("Kaltrin  Zotaj");
		personi.add("Dori  Gjini");
		personi.add("Fidan  Elezi");
		personi.add("Redi  Banushi");
		personi.add("Erda  Koroveshi");
		personi.add("Erina  Grabocka");

		for (String vl : personi) {
			System.out.println(vl);
		}
		System.out.println();
		System.out.println("Numri i klienteve te restorantit eshte :" + personi.size());
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
		personiId.put("E36958413F ", "Ermal Ormeni");
		personiId.put("G11568934K ", "Entela Çelaj");
		personiId.put("M11477598L", "Anisa Plaku");
		personiId.put("B25895162K", "Mirela Hoxha");
		personiId.put("D21115864O", "Gent Tyxhari");
		personiId.put("P44586217H", "Marina  Kellezi");
		personiId.put("A11254875J", "Greta  Huda");
		personiId.put("R14456671H", "Enea  Gramo");
		personiId.put("E11235441X", "Vjollca Lacka");
		personiId.put("D11256682C", "Migena  Musollari");
		personiId.put("F22145787L", "Megi  Proda");
		personiId.put("I88521447N", "Adela  Zaka");
		personiId.put("T25644719S", "Ksanthipi  Koleka");
		personiId.put("K13669874P", "Alma  Kastrati");
		personiId.put("E78895662G", "Elisabeta  Dervishi");
		personiId.put("Q44789631L", "Enisa  Dervishi");
		personiId.put("I45558789C", "Bejana  Oshafi");
		personiId.put("X12223566L", "Xhuljana  Shkëmbi");
		personiId.put("Y44158897L", "Eugen  Kellezi");
		personiId.put("T44858597O", "Erinda  Shehu");
		personiId.put("J25335647B", "Maria  Agaçi");
		personiId.put("L22369877I", "Gazmend  Paja");
		personiId.put("S11245879N", "Anjeza  Lacka");
		personiId.put("Z22369654G", "Eduart  Ndoci");
		personiId.put("M11258749B", "Erinda  Oshafi");
		personiId.put("G11258664U", "Ilia  Prifti");
		personiId.put("L11258476N", "Aurela  Mullaj");
		personiId.put("T14711755R", "Guadalupe  Xhori");
		personiId.put("C11447589I", "Sindi  Manushi");
		personiId.put("A33216554K", "Hergi  Buasi");
		personiId.put("K11289655F", "Mimoza  Drenova");
		personiId.put("T52889633D", "Pjerina  Voda");
		personiId.put("B44887569Y", "Anisa  Sallaku");
		personiId.put("U35264788O", "Joni  Shalsi");
		personiId.put("J14458897T", "Julia  Gjoka");
		personiId.put("V11255887S", "Elina  Rugova");
		personiId.put("M25581733G", "Kaltrin  Zotaj");
		personiId.put("H44588921L", "Dori  Gjini");
		personiId.put("E44569878O", "Fidan  Elezi");
		personiId.put("J66589352D", "Redi  Banushi");
		personiId.put("B11247886P", "Erda  Koroveshi");
		personiId.put("Y22155487C", "Erina  Grabocka");

		Set<Map.Entry<String, String>> set = personiId.entrySet();
		for (Map.Entry<String, String> vl : set) {
			System.out.print("Numri Personal i Identitetit:" + " " + vl.getKey() + " ");
			System.out.println("Emer Mbiemer :" + " " + vl.getValue());
		}
		System.out.println();

		return personiId;
	}

	public String getNid() {
		afishoNidKlienti();
		return nid;
	}

	private HashMap<Integer, String> afishoIdKlienti() {
		System.out.println("Klientet sipas 'CustomerId' "+'\n');
		HashMap<Integer, String> personiId = new HashMap<Integer,String>();
		personiId.put(10323, "Anisa Çela");
		personiId.put(20323, "Anisa  Osmani");
		personiId.put(30323, "Ermal Ormeni");
		personiId.put(40323, "Entela Çelaj");
		personiId.put(50323, "Anisa Plaku");
		personiId.put(60323, "Mirela Hoxha");
		personiId.put(70323, "Gent Tyxhari");
		personiId.put(80323, "Marina  Kellezi");
		personiId.put(90323, "Greta  Huda");

		personiId.put(100323, "Enea  Gramo");
		personiId.put(110323, "Vjollca Lacka");
		personiId.put(120323, "Migena  Musollari");

		personiId.put(130323, "Megi  Proda");
		personiId.put(140323, "Adela  Zaka");
		personiId.put(150323, "Ksanthipi  Koleka");
		personiId.put(160323, "Alma  Kastrati");

		personiId.put(170323, "Elisabeta  Dervishi");
		personiId.put(180323, "Enisa  Dervishi");

		personiId.put(190323, "Bejana  Oshafi");

		personiId.put(200323, "Xhuljana  Shkëmbi");
		personiId.put(210323, "Eugen  Kellezi");

		personiId.put(220323, "Erinda  Shehu");
		personiId.put(230323, "Maria  Agaçi");
		personiId.put(240323, "Gazmend  Paja");
		personiId.put(250323, "Anjeza  Lacka");
		personiId.put(260323, "Eduart  Ndoci");
		personiId.put(270323, "Erinda  Oshafi");

		personiId.put(280323, "Ilia  Prifti");
		personiId.put(290323, "Aurela  Mullaj");

		personiId.put(300323, "Guadalupe  Xhori");
		personiId.put(310323, "Sindi  Manushi");
		personiId.put(320323, "Hergi  Buasi");
		personiId.put(330323, "Mimoza  Drenova");
		personiId.put(340323, "Pjerina  Voda");
		personiId.put(350323, "Anisa  Sallaku");
		personiId.put(360323, "Joni  Shalsi");
		personiId.put(370323, "Julia  Gjoka");
		personiId.put(380323, "Elina  Rugova");
		personiId.put(390323, "Kaltrin  Zotaj");
		personiId.put(400323, "Dori  Gjini");
		personiId.put(410323, "Fidan  Elezi");
		personiId.put(420323, "Redi  Banushi");
		personiId.put(430323, "Erda  Koroveshi");
		personiId.put(440323, "Erina  Grabocka");

		Set<Map.Entry<Integer, String>> set = personiId.entrySet();
		for (Map.Entry<Integer, String> vl : set) {
			System.out.print("CustomerId"+" "+vl.getKey() + " -- ");
			System.out.println(vl.getValue());
		}
		System.out.println();

		return personiId;
	}

	public int getCustomerId() {
		afishoIdKlienti();
		return customerId;
	}

	private TreeSet<String> afishoNrCel() {
		System.out.println("Numri i celularit te çdo klienti");
		TreeSet<String> nrtel = new TreeSet<String>();
		nrtel.add("0676575397");
		nrtel.add("0676585497");
		nrtel.add("0685568794");
		nrtel.add("0682247991");
		nrtel.add("0698854542");
		nrtel.add("0667889544");
		nrtel.add("0669987852");
		nrtel.add("0695547881");
		nrtel.add("0678895472");

		nrtel.add("0676502155");
		nrtel.add("0699876547");
		nrtel.add("0685521224");
		nrtel.add("0699984711");

		nrtel.add("0662253541");
		nrtel.add("0685544701");
		nrtel.add("0697879788");

		nrtel.add("0695258454");
		nrtel.add("0677117455");

		nrtel.add("0699352411");
		nrtel.add("0689995764");
		nrtel.add("0685959457");
		nrtel.add("0698787878");

		nrtel.add("0699514547");
		nrtel.add("0695524873");
		nrtel.add("0685523411");
		nrtel.add("0677879745");
		nrtel.add("0699874545");
		nrtel.add("0685459501");
		nrtel.add("0685524631");
		nrtel.add("0693332211");
		nrtel.add("0688641222");

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

	private TreeSet<String> afishoUsername() {
		System.out.println("Fjalekalimi i account_rregjistrimi te çdo klienti"+'\n');
		TreeSet<String> username = new TreeSet<String>();
		username.add("celaanisa07@gmail.com");
		username.add("anisa.osmani01@hotmail.com");
		username.add("ormeni.Ermal18@yahoo.com");
		username.add("centela02@outlook.com");
		username.add("plakuanisa138@yahoo.com");
		username.add("mirela.hoxha@gmail.com");
		username.add("tyxhari.gent174@hotmail.com");
		username.add("kellezimarina06@yahoo.com");
		username.add("ghuda03@icloud.com");

		username.add("gramo.eno127@gmail.com");
		username.add("vj.lacka258@hotmail.com");
		username.add("musollari.gena@outlook.com");

		username.add("prodamegi09@yahoo.com");
		username.add("adela.zaka019@gmail.com");
		username.add("koleka.ksanthipi02@outlook.com");
		username.add("kastratialma03@yahoo.com");

		username.add("betadervishi367@gmail.com");
		username.add("dervishieni024@gmail.com");

		username.add("oshafi.bejana01@icloud.com");

		username.add("shkembixhul21@outlook.com");
		username.add("kellezigeni52@yahoo.com");

		username.add("erinda.shehu19@gmail.com");
		username.add("agaci_maria24@outlook.com");
		username.add("pajaj.gaz123@yahoo.com");
		username.add("lackaanjeza022@yahoo.com");
		username.add("edi.ndoci35@outlook.com");
		username.add("erindaoshafi19@gmail.com");

		username.add("prifti.ilia156@gmail.com");
		username.add("mullaaurela36@yahoo.com");

		username.add("lupexhori37@yahoo.com");
		username.add("manushi.sindi13@outlook.com");
		username.add("hergibuasi29@outlook.com");
		username.add("moza.drenova517@yahoo.com");
		username.add("inavoda321@gmail.com");
		username.add("anisa.sallaku1@outlook.com");
		username.add("jonian.shalsi35@gmail.com");
		username.add("jul.gjoka19@yahoo.com");
		username.add("rugovaelina147@outlook.com");
		username.add("zotajkaltri159@yahoo.com");
		username.add("dor.gjini22@gmail.com");
		username.add("danielezi135@yahoo.com");
		username.add("redibush135@icloud.com");
		username.add("erda.koro48@hotmail.com");
		username.add("inagrabocka41@gmail.com");

		for (String vl : username) {
			System.out.println("Adresa e emailit :" + vl);

		}
		System.out.println();

		return username;
	}

	public String getUsername() {
		afishoUsername();
		return username;
	}

	private TreeSet<String> afishoPassword() {
		System.out.println("Passwordi i 'account_rregjistrimi' te çdo klienti"+'\n');
		TreeSet<String> passname = new TreeSet<String>();
		passname.add("Vb29gh@@#");
		passname.add("AM25ma@&");
		passname.add("Er42mo#@");
		passname.add("ECt13am@@");
		passname.add("132APpl@&");
		passname.add("HM@mh22&");
		passname.add("GE87vt#&");

		passname.add("KM24ee&@");
		passname.add("HU76gr@@");

		passname.add("gr56@EN&");
		passname.add("VL56lh@&");
		passname.add("G@u58Ms#");

		passname.add("DB49za@&");
		passname.add("kk66OL@@");
		passname.add("SK87dg&@");
		passname.add("OvVe67@@");
		passname.add("d12EEv@#&");

		passname.add("OB26aa@#&");
		passname.add("EA89zo@@");
		passname.add("UC54ld&&");
		passname.add("ELkn49&&");

		passname.add("UR73ed@@");
		passname.add("GM51ma&&");
		passname.add("PGaj04@@");
		passname.add("AJ18al@&");

		passname.add("eSf&A27@");
		passname.add("JA@nl61@");
		passname.add("RF34in@&#");
		passname.add("RM@ae&46");

		passname.add("UP@5or&11");
		passname.add("DNis1&5@#");
		passname.add("GU214eaz@#");
		passname.add("zdD1O3&&");
		passname.add("JI27gh@&");
		passname.add("NS1@l1i@4");
		passname.add("AJ11@sh&");
		passname.add("OA53jk@&");
		passname.add("BG57ov@&#");
		passname.add("kZ48Aj@&");
		passname.add("OIgn94@@");
		passname.add("NEvb84@&");
		passname.add("NU37rb&&");
		passname.add("VOed64@&");
		passname.add("O16Gba@@");

		for (String vl : passname) {
			System.out.println("Paswordi :" + " " + vl);

		}
		System.out.println();

		return passname;
	}

	public String getPassword() {
		afishoPassword();
		return password;
	}

	private TreeSet<String> afishoAdresë() {
		System.out.println("Klientët sipas Adreses"+'\n');
		TreeSet<String> adresename = new TreeSet<String>();
		adresename.add("Laprakë/Rruga: Stanislav Zuber/Ndërtesa nr: 12/Kati nr: 3/Apartamenti : 20");
		adresename.add("Laprakë/Rruga: Lord Bajron/Ndërtesa nr: 5/Kati nr: 6/Apartamenti : 20");
		adresename.add("Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 13/Kati nr: 5/Apartamenti : 16");
		adresename.add("Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 25/Kati nr: 8/Apartamenti : 29");
		adresename.add("21 Djetori/Rruga: Sulejman Pitarka/Ndërtesa nr:22/Kati nr: 15/Apartamenti :48");
		adresename.add("Fusha e Aviacionit/Rruga: Grigor Gjirokastriti/Ndërtesa nr: 16/Vila : 16");
		adresename.add("Fusha e Aviacionit/Rruga: Ali Kolonja/Ndërtesa nr: 18/Kati nr: 5/Apartamenti : 22");
		adresename.add("Ali Demi/Rruga: Ali Demi/Ndërtesa nr: 22/Kati nr: 9/Apartamenti : 36");
		adresename.add("Ali Demi/Rruga: Nazmi Frakulli/Ndërtesa nr: 34/Kati nr: 4/Apartamenti : 16");
		adresename.add("Liqeni i Thatë/Rruga: Bektash Berberi/Ndërtesa nr: 46/Kati nr: 9/Apartamenti : 42");

		adresename.add("Liqeni i Thatë/Rruga: Sami Frashëri/Ndërtesa nr: 72/Kati nr: 6/Apartamenti : 22");
		adresename.add("Kombinati/Rruga: Shaban Bardhoshi/Ndërtesa nr: 127/Kati nr: 3/Apartamenti : 12");
		adresename.add("Kombinati/Rruga: Hamdi Cenojmeri/Ndërtesa nr: 175/Kati nr: 5/Apartamenti : 18");
		adresename.add("Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 27/Kati nr: 8/Apartamenti : 29");
		adresename.add("Fusha e Aviacionit/Rruga: Grigor Gjirokastriti/Ndërtesa nr: 10/Kati nr: 10/Apartamenti : 54");
		adresename.add("Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 13/Kati nr: 5/Apartamenti : 19");

		adresename.add("Stacioni i Trenit/Rruga: Sotir Polena/Ndërtesa nr: 56/Kati nr: 8/Apartamenti : 40");
		adresename.add("Stacioni i Trenit/Rruga: Skënder Kosturi/Ndërtesa nr: 176/Kati nr: 12/Apartamenti : 62");
		adresename.add("Stacioni i Trenit/Rruga: Reshit Petrela/Ndërtesa nr: 123/Kati nr: 9/Apartamenti : 58");
		adresename.add("Tirane e Re/Rruga: Ismail Qemali/Ndërtesa nr: 147/Kati nr : 15/Apartamenti : 75");

		adresename.add("Astir/Rruga: Kristaq Mone/Ndërtesa nr: 185/Kati nr : 5/Apartamenti : 17");
		adresename.add("Astir/Rruga: Nexho Konomi/Ndërtesa nr: 85/Kati nr : 5/Apartamenti : 17");
		adresename.add("Astir/Rruga: Dhaskal Todri/Ndërtesa nr: 68/Kati nr : 2/Apartamenti : 10");
		adresename.add("Qyteti Studenti/Rruga : Sotir Kolea/Ndertesa nr : 54/Kati nr : 7/Apartamenti : 40");
		adresename.add("Don Bosko/Rruga : Dom Mark Dushi/Ndertesa nr : 154/Kati nr : 4/Apartamenti : 16");
		adresename.add("Don Bosko/Rruga : Don Bosko/Ndertesa nr : 194/Kati nr : 3/Apartamenti : 12");
		adresename.add("Sauk/Rruga : Xhevat Kallajxhi/Ndertesa nr : 114/Kati nr : 7/Apartamenti : 25");
		adresename.add("Sauk/Rruga : Danish Jukniu/Ndertesa nr : 134/Kati nr : 3/Apartamenti : 15");
		adresename.add("Sauk/Rruga : Hajredin Kumbaro/Ndertesa nr : 124/Kati nr : 6/Apartamenti : 21");

		adresename.add("Brraka/Rruga : Asim Vokshi/Ndertesa nr : 94/Kati nr : 16/Apartamenti : 75");
		adresename.add("Pazari i Ri/Rruga : Hoxha Tahsim/Ndertesa nr : 44/Kati nr : 4/Apartamenti : 16");
		adresename.add("Kamëz/Rruga : Azem Galica/Ndertesa nr : 24/Kati nr : 4/Apartamenti : 16");
		adresename.add("Kamëz/Rruga : Martin Camaj/Ndertesa nr : 6/Kati nr : 14/Apartamenti : 71");
		adresename.add("Liqeni i Thatë/Rruga: Bektash Berberi/Ndërtesa nr: 49/Kati nr: 9/Apartamenti : 42");
		adresename.add("Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 33/Kati nr: 5/Apartamenti : 19");
		adresename.add("Laprakë/Rruga: Stanislav Zuber/Ndërtesa nr: 2/Kati nr: 3/Apartamenti : 15");
		adresename.add("Fusha e Aviacionit/Rruga: Grigor Gjirokastriti/Ndërtesa nr: 11/Kati nr: 10/Apartamenti : 54");
		adresename.add("21 Djetori/Rruga: Rruga e Kavajes/Ndërtesa nr:72/Kati nr: 15/Apartamenti :48");
		adresename.add("Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 24/Kati nr: 8/Apartamenti : 29");
		adresename.add("Stacioni i Trenit/Rruga: Skënder Kosturi/Ndërtesa nr: 198/Kati nr: 12/Apartamenti : 62");
		adresename.add("Qender/Rruga: Sami Frashëri/Ndërtesa nr: 19/Kati nr: 9/Apartamenti : 32");
		adresename.add("Tirane e Re/Rruga: Ismail Qemali/Ndërtesa nr: 187/Kati nr : 15/Apartamenti : 75");
		adresename.add("Laprakë/Rruga: Lord Bajron/Ndërtesa nr: 10/Kati nr: 6/Apartamenti : 22");
		adresename.add("Qendër/Rruga: Myslym Shyri/Ndërtesa nr:102/Kati nr: 15/Apartamenti :48");

		for (String vl : adresename) {
			System.out.println(vl);

		}
		System.out.println();

		return adresename;
	}

	public String getAdresa() {
		afishoAdresë();
		return adresa;
	}

	private TreeMap<String, String> afishoNrBankcard() {
		System.out.println("Kodi i kartes se bankes per çdo klient qe paguan porosine me karte"+'\n');
		TreeMap<String, String> CardNumber = new TreeMap<String, String>();
		CardNumber.put("Anisa  Osmani", "5678 9012 3456 7698");
		CardNumber.put("Ermal Ormeni", "4435 1234 4567 9988");
		CardNumber.put("Greta  Huda", "4436 1234 4567 9999");
		CardNumber.put("Enea  Gramo", "5186 5212 3456 7891");
		CardNumber.put("Vjollca Lacka", "4227 0123 4567 8901");
		CardNumber.put("Migena  Musollari", "1234 5678 9012 3456");
		CardNumber.put("Megi  Proda", "4321 0123 4567 8901");
		CardNumber.put("Adela  Zaka", "0123 4567 8901 2345");
		CardNumber.put("Ksanthipi  Koleka", "4025 8200 1234 5678");
		CardNumber.put("Alma  Kastrati", "4000 1234 5678 1234");
		CardNumber.put("Elisabeta  Dervishi", "6244 4501 8888 7777");
		CardNumber.put("Enisa  Dervishi", "1234 8827 8299 4532");
		CardNumber.put("Bejana  Oshafi", "5955 8988 8888 6565");
		CardNumber.put("Xhuljana  Shkëmbi", "4850 6900 0000 0001");
		CardNumber.put("Eugen  Kellezi", "5412 7512 3412 3456");
		CardNumber.put("Erinda  Shehu", "5462 1234 5678 7000");
		CardNumber.put("Maria  Agaçi", "5258 9212 3456 7890");
		CardNumber.put("Gazmend  Paja", "4796 5629 3087 2808");
		CardNumber.put("Anjeza  Lacka", "4195 3456 7895 1234");
		CardNumber.put("Erinda  Oshafi", "1234 5678 9876 5432");
		CardNumber.put("Eduart  Ndoci", "5000 1234 5678 9090");
		CardNumber.put("Ilia  Prifti", "4538 1234 5678 9112");
		CardNumber.put("Sindi  Manushi", "0000 1234 5678 9010");
		CardNumber.put("Pjerina  Voda", "0987 6543 2101 2345");
		CardNumber.put("Anisa  Sallaku", "1234 5678 9123 4567");
		CardNumber.put("Joni  Shalsi", "4321 0122 4567 8910");
		CardNumber.put("Julia  Gjoka", "5288 5678 9012 3456");
		CardNumber.put("Erda  Koroveshi", "6244 4501 8887 6667");
		CardNumber.put("Erina  Grabocka", "4850 6900 0000 0010");
		CardNumber.put("Redi  Banushi", "4300 8200 1234 5678");
		Set<Map.Entry<String, String>> seti = CardNumber.entrySet();
		for (Map.Entry<String, String> v : seti) {
			System.out.println(v.getValue() + " | " + v.getKey());
		}
		System.out.println();

		return CardNumber;
	}

	public String getCardId() {
		afishoNrBankcard();
		return cardId;
	}

	public void kryejBlerjeApp() {
		System.out.println("Klienti nuk duhet te qendroje si nje vizitor por duhet te krijoje llogari.");
	}
}
