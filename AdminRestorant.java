package menaxhim.Restoranti;

import java.util.*;


public class AdminRestorant {
	private String username;
	private String password;
	private Set<CustomerLoyalty> cl;
	private ArrayList<Orders> order;// e njejta gje edhe per 'Orders'
	private TreeMap<Integer, Dish> d;// e njejta gje edhe per 'Dish'
	private TreeMap<Integer, Orders> porosiKlienti;

	public AdminRestorant() {
		username = "username";
		password = "password";
	}

	public AdminRestorant(String username, String password, Set<CustomerLoyalty> cl, ArrayList<Orders> order,
			TreeMap<Integer, Dish> d) {
		this.username = username;
		this.password = password;
		this.cl = cl;
		this.order = order;
		this.d = d;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	private TreeMap<Integer, Dish> menuRestoranti() {
		TreeMap<Integer, Dish> menu = new TreeMap<Integer, Dish>();
		Dish d1 = new Dish(101, "Kimchi", "(s'ka pershkrim)", 690.00, "Appetizer", 19);
		menu.put(1, d1);
		Dish d2 = new Dish(102, "Salmon Tataki", "(s'ka pershkrim)", 960.00, "Appetizer", 19);
		menu.put(2, d2);
		Dish d3 = new Dish(103, "Tuna Tataki", "(s'ka pershkrim)", 900.00, "Appetizer", 19);
		menu.put(3, d3);
		Dish d4 = new Dish(104, "Pulë Kaarage me Parmesan", "(s'ka pershkrim)", 760.00, "Appetizer", 19);
		menu.put(4, d4);
		Dish d5 = new Dish(105, "Misër Tempura", "(s'ka pershkrim)", 690.00, "Appetizer", 19);
		menu.put(5, d5);
		Dish d6 = new Dish(106, "Edamame", "(s'ka pershkrim)", 480.00, "Appetizer", 19);
		menu.put(6, d6);
		Dish d7 = new Dish(107, "Edamame me Hudhë Djegëse", "(s'ka pershkrim)", 420.00, "Appetizer", 19);
		menu.put(7, d7);
		Dish d8 = new Dish(108, "Baby Kalamari Tempura", "(s'ka pershkrim)", 960.00, "Appetizer", 19);
		menu.put(8, d8);
		Dish d9 = new Dish(109, "Karkalecë Deti Crispy", "(s'ka pershkrim)", 960.00, "Appetizer", 19);
		menu.put(9, d9);
		Dish d10 = new Dish(110, "Fish & Chips", "(s'ka pershkrim)", 900.00, "Appetizer", 19);
		menu.put(10, d10);
		Dish d11 = new Dish(111, "Tartar Salmoni me Tartuf", "(s'ka pershkrim)", 1240.00, "Appetizer", 19);
		menu.put(11, d11);
		Dish d12 = new Dish(112, "Pulë Crispy Appetizer", " '8 copë' ", 480.00, "Appetizer", 19);
		menu.put(12, d12);
		Dish d13 = new Dish(113, "Qofte me Mish Pule", " '8 copë' ", 480.00, "Appetizer", 19);
		menu.put(13, d13);
		Dish d14 = new Dish(114, "Qofte me Karkalecë Deti", " '6 copë' ", 760.00, "Appetizer", 19);
		menu.put(14, d14);
		Dish d15 = new Dish(115, "Shrimp Bomb", "(s'ka pershkrim)", 880.00, "Appetizer", 19);
		menu.put(15, d15);
		Dish d16 = new Dish(116, "Salmon Carpaccio", "(s'ka pershkrim)", 1170.00, "Appetizer", 19);
		menu.put(16, d16);
		Dish d17 = new Dish(117, "Salmon & Suzuki Carpaccio", "(s'ka pershkrim)", 1100.00, "Appetizer", 19);
		menu.put(17, d17);
		Dish d18 = new Dish(118, "Tempura Mix", " 'Karkalecë të detit,Kallamari,Bishtaja Crispy'  ", 1450.00,
				"Appetizer", 19);
		menu.put(18, d18);
		Dish d19 = new Dish(119, "Tempura Perimesh", " 'Perime të Brumosura,tempura të fërguara' ", 760.00, "Appetizer",
				19);
		menu.put(19, d19);
		Dish d20 = new Dish(201, "Wonton Korean", " '4 copë' ", 690.00, "Dim Sum", 6);
		menu.put(1, d20);
		Dish d21 = new Dish(202, "Spring Roll", "  '2 copë'  ", 550.00, "Dim Sum", 6);
		menu.put(2, d21);
		Dish d22 = new Dish(203, "Dumplings Viçi ne Avull", "  '5 copë'  ", 620.00, "Dim Sum", 6);
		menu.put(3, d22);
		Dish d23 = new Dish(204, "Wonton Crispy", "  '4 copë'  ", 550.00, "Dim Sum", 6);
		menu.put(4, d23);
		Dish d24 = new Dish(205, "Spring Roll me Mish Pate", "(s'ka Pershkrim) ", 690.00, "Dim Sum", 6);
		menu.put(5, d24);
		Dish d25 = new Dish(206, "Gyoza me Perime", "  '4 copë'  ", 480.00, "Dim Sum", 6);
		menu.put(6, d25);
		Dish d26 = new Dish(301, "Bun Vici", " (s'ka Pershkrim)  ", 620.00, "Bun", 3);
		menu.put(1, d26);
		Dish d27 = new Dish(302, "Bun Pule", " (s'ka Pershkrim)  ", 550.00, "Bun", 3);
		menu.put(2, d27);
		Dish d28 = new Dish(303, "Bun(Kuleçë) me mish te Patës", " (s'ka Pershkrim)  ", 690.00, "Bun", 3);
		menu.put(3, d28);
		Dish d29 = new Dish(401, "Tom Yum", "  'Supe me Karkaleca Deti'  ", 780.00, "Supat", 7);
		menu.put(1, d29);

		Dish d30 = new Dish(402, "Supë me Fruta Deti", "(ska pershkrim)", 820.00, "Supat", 7);
		menu.put(2, d30);
		Dish d31 = new Dish(403, "Wonton Supë", "(ska pershkrim)", 480.00, "Supat", 7);
		menu.put(3, d31);
		Dish d32 = new Dish(404, "Supë Djegëse dhe e thartë", "(ska pershkrim)", 530.00, "Supat", 7);
		menu.put(4, d32);
		Dish d33 = new Dish(405, "Supë Pule dhe Misri me Shparguj", "(ska pershkrim)", 520.00, "Supat", 7);
		menu.put(5, d33);
		Dish d34 = new Dish(406, "Miso Supë", "(ska pershkrim)", 550.00, "Supat", 7);
		menu.put(6, d34);
		Dish d35 = new Dish(407, "Pad Thai", " 'Supe me Karkaleca Deti'  ", 830.00, "Supat", 7);
		menu.put(7, d35);
		Dish d36 = new Dish(501, "Ramen me Mish Pule", "(s'ka pershkrim)", 1000.00, "Ramen", 3);
		menu.put(1, d36);
		Dish d37 = new Dish(502, "Ramen me Mish Viçi", "(s'ka pershkrim)", 1150.00, "Ramen", 3);
		menu.put(2, d37);
		Dish d38 = new Dish(503, "Ramen - Karkalec", "(s'ka pershkrim)", 1290.00, "Ramen", 3);
		menu.put(3, d38);
		Dish d39 = new Dish(601, "Sallatë Aziatike", "(s'ka pershkrim)", 700.00, "Sallatat", 9);
		menu.put(1, d39);
		Dish d40 = new Dish(602, "Sallatë Aziatike me Karkaleca Deti Crispy", "(s'ka pershkrim)", 1240.00, "Sallatat",
				9);
		menu.put(2, d40);
		Dish d41 = new Dish(603, "Sallatë Lakre Djegëse", "(s'ka pershkrim)", 410.00, "Sallatat", 9);
		menu.put(3, d41);
		Dish d42 = new Dish(604, "Sallatë SushiCO Wakame", "(s'ka pershkrim)", 690.00, "Sallatat", 9);
		menu.put(4, d42);
		Dish d43 = new Dish(605, "Sallatë Kani dhe Tranguj", "(s'ka pershkrim)", 830.00, "Sallatat", 9);
		menu.put(5, d43);
		Dish d44 = new Dish(606, "Sallatë Sashimi", "(s'ka pershkrim)", 1100.00, "Sallatat", 9);
		menu.put(6, d44);
		Dish d45 = new Dish(607, "Sallatë me fruta të Detit", "(s'ka pershkrim)", 1240.00, "Sallatat", 9);
		menu.put(7, d45);
		Dish d46 = new Dish(608, "Sallatë Quinoa me Edamame", "(s'ka pershkrim)", 690.00, "Sallatat", 9);
		menu.put(8, d46);
		Dish d47 = new Dish(609, "Sallatë Quinoa me Salmon", "(s'ka pershkrim)", 1240.00, "Sallatat", 9);
		menu.put(9, d47);
		Dish d48 = new Dish(701, "Donburi me ngjalë", "(s'ka pershkrim)", 1380.00, "Donburi", 3);
		menu.put(1, d48);
		Dish d49 = new Dish(702, "Donburi me Mish të Patës", "(s'ka pershkrim)", 1240.00, "Donburi", 3);
		menu.put(2, d49);
		Dish d50 = new Dish(703, "Salmon Donburi", "(s'ka pershkrim)", 1240.00, "Donburi", 3);
		menu.put(3, d50);
		Dish d51 = new Dish(801, "Udon Bulgogi Korean Mish Viçi", "(s'ka pershkrim)", 1050.00, "Noodles", 14);
		menu.put(1, d51);
		Dish d52 = new Dish(802, "Udon Bulgogi Korean Pulë", "(s'ka pershkrim)", 930.00, "Noodles", 14);
		menu.put(2, d52);
		Dish d53 = new Dish(803, "Noodles të thjeshta", "(s'ka pershkrim)", 480.00, "Noodles", 14);
		menu.put(3, d53);
		Dish d54 = new Dish(804, "Noodles me Perime", "(s'ka pershkrim)", 620.00, "Noodles", 14);
		menu.put(4, d54);
		Dish d55 = new Dish(805, "Noodles me Pulë", "(s'ka pershkrim)", 760.00, "Noodles", 14);
		menu.put(5, d55);
		Dish d56 = new Dish(806, "Noodles me Mish Viçi", "(s'ka pershkrim)", 960.00, "Noodles", 14);
		menu.put(6, d56);
		Dish d57 = new Dish(807, "Noodles me Karkalecë Deti", "(s'ka pershkrim)", 1030.00, "Noodles", 14);
		menu.put(7, d57);
		Dish d58 = new Dish(808, "Singapore Noodles me salcë Këri", "(s'ka pershkrim)", 1100.00, "Noodles", 14);
		menu.put(8, d58);
		Dish d59 = new Dish(809, "Udon me Perime dhe Salcë të Hudhrës së Zezë", "(s'ka pershkrim)", 830.00, "Noodles",
				14);
		menu.put(9, d59);
		Dish d60 = new Dish(810, "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë", "(s'ka pershkrim)", 1100.00,
				"Noodles", 14);
		menu.put(10, d60);
		Dish d61 = new Dish(811, "Udon me Karkalecë", "(s'ka pershkrim)", 1230.00, "Noodles", 14);
		menu.put(11, d61);
		Dish d62 = new Dish(812, "Noodles të Stilit Tajlandez me mish Pule", "(s'ka pershkrim)", 1100.00, "Noodles",
				14);
		menu.put(12, d62);
		Dish d63 = new Dish(813, "Noodles të Stilit Tajlandez me Karkalecë Deti", "(s'ka pershkrim)", 1380.00,
				"Noodles", 14);
		menu.put(13, d63);
		Dish d64 = new Dish(814, "Noodles të Stilit Tajlandez me Mish Noodles të Stilit Japonez", "(s'ka pershkrim)",
				1240.00, "Noodles", 14);
		menu.put(14, d64);
		Dish d65 = new Dish(901, "Oriz në Avull", "(150 gr)", 280.00, "Oriz", 9);
		menu.put(1, d65);
		Dish d66 = new Dish(902, "Oriz në Avull", "(300 gr)", 410.00, "Oriz", 9);
		menu.put(2, d66);
		Dish d67 = new Dish(903, "Oriz me Perime", "(s'ka pershkrim)", 620.00, "Oriz", 9);
		menu.put(3, d67);
		Dish d68 = new Dish(904, "Oriz me Vezë të fërguara", "(s'ka pershkrim)", 690.00, "Oriz", 9);
		menu.put(4, d68);
		Dish d69 = new Dish(905, "Oriz me Pulë", "(s'ka pershkrim)", 830.00, "Oriz", 9);
		menu.put(5, d69);
		Dish d70 = new Dish(906, "Oriz me Këri dhe Mish Viçi", "(s'ka pershkrim)", 900.00, "Oriz", 9);
		menu.put(6, d70);
		Dish d71 = new Dish(907, "Oriz me Mish Viçi", "(s'ka pershkrim)", 900.00, "Oriz", 9);
		menu.put(7, d71);
		Dish d72 = new Dish(908, "Oriz i Stilit Tajladez me Ananas", "(s'ka pershkrim)", 830.00, "Oriz", 9);
		menu.put(8, d72);
		Dish d73 = new Dish(909, "Oriz me Karkalecë Deti", "(s'ka pershkrim)", 960.00, "Oriz", 9);
		menu.put(9, d73);
		Dish d74 = new Dish(1001, "Perime të Përzier të Skuqura", "(s'ka pershkrim)", 620.00, "Perime", 3);
		menu.put(1, d74);
		Dish d75 = new Dish(1002, "Perime të Përzier të Skuqura Djegëse", "(s'ka pershkrim)", 620.00, "Perime", 3);
		menu.put(2, d75);
		Dish d76 = new Dish(1003, "Brokoli dhe karrote me salcë Hudhre", "(s'ka pershkrim)", 690.00, "Perime", 3);
		menu.put(3, d76);
		Dish d77 = new Dish(1101, "Salmon Poke Bowl", "(s'ka pershkrim)", 1380.00, "Poke Bowl", 2);
		menu.put(1, d77);
		Dish d78 = new Dish(1102, "Salmon & Maguro Poke Bowl", "(s'ka pershkrim)", 1380.00, "Poke Bowl", 2);
		menu.put(2, d78);
		Dish d79 = new Dish(1201, "Pulë me Keri të Kuq", " 'sherbehet me Oriz' ", 1080.00, "Pule", 10);
		menu.put(1, d79);
		Dish d80 = new Dish(1202, "Bulgogi Pulë në Stilin Korean", " 'sherbehet me Oriz' ", 1020.00, "Pule", 10);
		menu.put(2, d80);
		Dish d81 = new Dish(1203, "Pulë me Perime", "(s'ka pershkrim)", 840.00, "Pule", 10);
		menu.put(3, d81);
		Dish d82 = new Dish(1204, "Pulë Crispy", "(s'ka pershkrim)", 960.00, "Pule", 10);
		menu.put(4, d82);
		Dish d83 = new Dish(1205, "Pulë Sweet&Sour", "(s'ka pershkrim)", 960.00, "Pule", 10);
		menu.put(5, d83);
		Dish d84 = new Dish(1206, "Pulë me salcë Djegëse", "(s'ka pershkrim)", 960.00, "Pule", 10);
		menu.put(6, d84);
		Dish d85 = new Dish(1207, "Pulë Manc hurian", "(s'ka pershkrim)", 1030.00, "Pule", 10);
		menu.put(7, d85);
		Dish d86 = new Dish(1208, "Pulë Crispy me Xhenxherfil", "(s'ka pershkrim)", 1130.00, "Pule", 10);
		menu.put(8, d86);
		Dish d87 = new Dish(1209, "Pulë General Tso", "(s'ka pershkrim)", 1180.00, "Pule", 10);
		menu.put(9, d87);
		Dish d88 = new Dish(1210, "Pulë Tajlandeze me Arra Indiane", "(s'ka pershkrim)", 1120.00, "Pule", 10);
		menu.put(10, d88);
		Dish d89 = new Dish(1301, "Salmon Tajlandez me Curry", "(s'ka pershkrim)", 1420.00, "Ushqimi i Detit", 7);
		menu.put(1, d89);
		Dish d90 = new Dish(1302, "Salmon në Avull", "(s'ka pershkrim)", 1450.00, "Ushqimi i Detit", 7);
		menu.put(2, d90);
		Dish d91 = new Dish(1303, "Salmon në Skarë me Salcë Teriyaki", "(s'ka pershkrim)", 1580.00, "Ushqimi i Detit",
				7);
		menu.put(3, d91);
		Dish d92 = new Dish(1304, "Kalamari Djegëse me Arra Indiane", "(s'ka pershkrim)", 1450.00, "Ushqimi i Detit",
				7);
		menu.put(4, d92);
		Dish d93 = new Dish(1305, "Karkalecë Deti me Tempura", "(s'ka pershkrim)", 1580.00, "Ushqimi i Detit", 7);
		menu.put(5, d93);
		Dish d94 = new Dish(1306, "Oktapod djegës me Perime", "(s'ka pershkrim)", 1540.00, "Ushqimi i Detit", 7);
		menu.put(6, d94);
		Dish d95 = new Dish(1307, "Kalamarë Deti me Arra Indiane", "(s'ka pershkrim)", 1460.00, "Ushqimi i Detit", 7);
		menu.put(7, d95);
		Dish d96 = new Dish(1401, "Bulgogi Koreane me Mish Viçi", "  'sherbehet me Oriz'  ", 1280.00, "Mishi i Viçit",
				6);
		menu.put(1, d96);
		Dish d97 = new Dish(1402, "Mish Viçi Djegëse dhe Kërpudha", "  'sherbehet me Oriz'  ", 1200.00, "Mishi i Viçit",
				6);
		menu.put(2, d97);
		Dish d98 = new Dish(1403, "Mish Viçi me Perime", "  'sherbehet me Oriz'  ", 1240.00, "Mishi i Viçit", 6);
		menu.put(3, d98);
		Dish d99 = new Dish(1404, "Mish Viçi me Speca të gjelbërta te pra hollë", "  'sherbehet me Oriz'  ", 1240.00,
				"Mishi i Viçit", 6);
		menu.put(4, d99);
		Dish d100 = new Dish(1405, "Mish Viçi me Hudhër të Zezë", "  'sherbehet me Oriz'  ", 1280.00, "Mishi i Viçit",
				6);
		menu.put(5, d100);
		Dish d101 = new Dish(1406, "Mish Viçi i Stilit Tajlandez me Chilli dhe Borzilok", "  'sherbehet me Oriz'  ",
				1310.00, "Mishi i Viçit", 6);

		menu.put(6, d101);
		Dish d102 = new Dish(1501, "Patë Crispy_1", "  'Serviret gjysem_Patë'  ", 2890.00, "Patë", 3);
		menu.put(1, d102);
		Dish d103 = new Dish(1502, "Patë Crispy_2", "  'Serviret çerek_Patë'  ", 1520.00, "Patë", 3);
		menu.put(2, d103);
		Dish d104 = new Dish(1503, "Donburi me Mish Pate", "(s'ka pershkrim)", 1240.00, "Patë", 3);
		menu.put(3, d104);
		Dish d105 = new Dish(1601, "Tamago", " 'Omelet' ", 140.00, "Nigiri", 11);
		menu.put(1, d105);
		Dish d106 = new Dish(1602, "Maguro", " 'Tuna' ", 280.00, "Nigiri", 11);
		menu.put(2, d106);
		Dish d107 = new Dish(1603, "Karkalecë Deti", " 'Shprimp' ", 280.00, "Nigiri", 11);
		menu.put(3, d107);
		Dish d108 = new Dish(1604, "Suzuki", " 'Levrek' ", 280.00, "Nigiri", 11);
		menu.put(4, d108);
		Dish d109 = new Dish(1605, "Sake", " 'Salmon' ", 280.00, "Nigiri", 11);
		menu.put(5, d109);
		Dish d110 = new Dish(1606, "Sake Avocado", " 'Salmon dhe Avocado' ", 280.00, "Nigiri", 11);
		menu.put(6, d110);
		Dish d111 = new Dish(1607, "Unagi", " 'Ngjale' ", 410.00, "Nigiri", 11);
		menu.put(7, d111);
		Dish d112 = new Dish(1608, "Ebi Tempura", " 'Karkalece Crispy' ", 410.00, "Nigiri", 11);
		menu.put(8, d112);
		Dish d113 = new Dish(1609, "Nigiri Mix_I", "  '7 cope'  ", 1650.00, "Nigiri", 11);
		menu.put(9, d113);
		Dish d114 = new Dish(1610, "Nigiri Mix_II", "  '9 cope'  ", 2140.00, "Nigiri", 11);
		menu.put(10, d114);
		Dish d115 = new Dish(1611, "Nigiri Mix_III", "  '11 cope'  ", 2550.00, "Nigiri", 11);
		menu.put(11, d115);
		Dish d116 = new Dish(1701, "Set Sake", " 'Salmon-12 fetë' ", 1240.00, "Sashimi Set", 5);
		menu.put(1, d116);
		Dish d117 = new Dish(1702, "Maguro", " 'Tuna-12 fetë' ", 1240.00, "Sashimi Set", 5);
		menu.put(2, d117);
		Dish d118 = new Dish(1703, "Sashimi Mix", " '12 cope' ", 1240.00, "Sashimi Set", 5);
		menu.put(3, d118);
		Dish d119 = new Dish(1704, "Sake & Maguro", " '12 cope' ", 2550.00, "Sashimi Set", 5);
		menu.put(4, d119);

		Dish d120 = new Dish(1705, "Deluxe Set", " 'Salmon-13 fetë' ", 1720.00, "Sashimi Set", 5);
		menu.put(5, d120);
		Dish d121 = new Dish(1801, "Forest Roll",
				"  '8 cope;Kastravec/Mbështjellë me Salmon,Salcë Yuzu,Miso,Gjethe Krokante,Lakër Jeshile'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(1, d121);
		Dish d122 = new Dish(1802, "Kani Salad Roll",
				"  '8 cope;Katravec,Avocado/Sallatë Kani,Onion Rings,Salcë Djegëse'  ", 1030.00, "Special Rolls", 20);
		menu.put(2, d122);
		Dish d123 = new Dish(1803, "Smoked Salmon Truffle Roll", "(ska pershkrim)", 1620.00, "Special Rolls", 20);
		menu.put(3, d123);
		Dish d124 = new Dish(1804, "Smoked Salmon Roll",
				"  'Salmon i Tymosur,Krem Djathë,Kastravec/Mbështjellë me Salmon të Tymosur dhe Kaperi'  ", 1240.00,
				"Special Rolls", 20);
		menu.put(4, d124);

		Dish d125 = new Dish(1805, "Fire Salmon",
				"  '6 cope;Avocado,Krem Djathë,Sallatë Jeshile/Mbështjellë me Salmon,majonez djegës,Micro Greens'  ",
				1360.00, "Special Rolls", 20);
		menu.put(5, d125);
		Dish d126 = new Dish(1806, "Spicy Philadelphia Roll",
				"  '8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbeshtjellë me Susam'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(6, d126);
		Dish d127 = new Dish(1807, "San Diego Roll", "  '6 copë;Salmon,Avocado,Tranguj/Mbështjellë me Masago'  ",
				1030.00, "Special Rolls", 20);
		menu.put(7, d127);

		Dish d128 = new Dish(1808, "Spicy California Roll",
				"  '8 copë;Kani,Avocado,Cucumber,Majoneze Lattuce/Mbeshtjelle me Tobikko Sushi'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(8, d128);
		Dish d129 = new Dish(1809, "Ebi California Roll", "(ska pershkrim)", 1030.00, "Special Rolls", 20);
		menu.put(9, d129);
		Dish d130 = new Dish(1810, "Canadian Roll", "  '6 cope;Kani,Tranguj/Mbeshtjelle me Salmon'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(10, d130);
		Dish d131 = new Dish(1811, "Sesame Maki Roll",
				"  '8 copë;Karkalecë Deti,Avocado,Tranguj,Majonezë,Sallatë e Gjelbërt/Mbështjellë me Susam'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(11, d131);

		Dish d132 = new Dish(1812, "California Roll",
				"  '8 cope;Kani,Avocado,Tranguj,Majonezë,Sallatë jeshile/Mbështjellë me Tobikko'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(12, d132);
		Dish d133 = new Dish(1813, "Rainbow Roll",
				" '6 copë;Kani,Tranguj/Mbështjellë me Salmon ,Levrek,Tuna dhe Avocado' ", 1030.00, "Special Rolls", 20);
		menu.put(13, d133);

		Dish d134 = new Dish(1814, "Quinoa Avocado Roll",
				"  '6 copë;Quinoa,Goma Wakame(alga Deti me Susam),Shparguj,Karrotë,Arra të Pjekura/Mbështjellur me Avocado'  ",
				760.00, "Special Rolls", 20);
		menu.put(14, d134);
		Dish d135 = new Dish(1815, "Two Way Salmon Roll",
				"  '5 copë;Salmon,Tranguj,Krem Djathi/Mbështjellur me Salmon të Tymosur,Salcë Ponzu,Salcë Teriyaki & Salcë Sriracha'  ",
				1030.00, "Special Rolls", 20);
		menu.put(15, d135);
		Dish d136 = new Dish(1816, "Philadelphia Roll",
				"  '8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbështjellur me Susam'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(16, d136);
		Dish d137 = new Dish(1817, "Tiger Roll",
				"  '5 copë;Ngjalë,Avocado,Tranguj,Krem Djathi,Salcë Djegëse/Mbështjellur me Karkalecë Deti'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(17, d137);
		Dish d138 = new Dish(1818, "Spicy Maguro Avocado", "  '6 copë;Tuna ,Tartar/Mbështjellur me Avocado'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(18, d138);
		Dish d139 = new Dish(1819, "Veggie Roll",
				"  '8 copë;Avocado,Karrota,Kastravec,Shparguj,Sallate Jeshile/Mbështjellë me Susam'  ", 960.00,
				"Special Rolls", 20);
		menu.put(19, d139);
		Dish d140 = new Dish(1820, "Crunchy Roll",
				"  '5 copë;Sallatë Kani,Tamago,Tranguj,Majoneze,Therrime/Mbështjellë me Tobikko'  ", 1030.00,
				"Special Rolls", 20);
		menu.put(20, d140);
		Dish d141 = new Dish(1901, "Crazy Philly Roll",
				" '8 copë , Kani,Avocado,Krem Djathë/Mbështjellë me Salmon Djegës ' ", 1560.00, "Cooked Rolls", 18);
		menu.put(1, d141);
		Dish d142 = new Dish(1902, "Kyoto Roll", " (ska pershkrim) ", 1260.00, "Cooked Rolls", 18);
		menu.put(2, d142);
		Dish d143 = new Dish(1903, "Yuzu Special Roll", " (ska pershkrim)", 1340.00, "Cooked Rolls", 18);
		menu.put(3, d143);
		Dish d144 = new Dish(1904, "SuchiCo Roll",
				" '5 copë;Karkalecë,Tempura , Avocado,Majonezë,Tranguj,Masago/Mbështjellë me Salmon Crispy dhe Salcë Teriyaki' ",
				1130.00, "Cooked Rolls", 18);
		menu.put(4, d144);

		Dish d145 = new Dish(1905, "Fish&Chips Roll",
				" 'Levrek i fërguar,Patate të fërguara,tranguj,Majonez me Tartuf/Mbështjellur me Avocado dhe Patate të Fërguara,Salcë Terijaki' ",
				1170.00, "Cooked Rolls", 18);
		menu.put(5, d145);
		Dish d146 = new Dish(1906, "Ebi Ten Roll",
				" '5 copë;Karkalecë,Tempura , Avocado,Majonezë,Masago/Mbështjellë me Susam ' ", 1080.00, "Cooked Rolls",
				18);
		menu.put(6, d146);
		Dish d147 = new Dish(1907, "Samuria Roll",
				" '8 copë;Karkalecë Tempura,Avocado,Sallatë e Gjelbërt/Mbështjellë me Susam dhe Massago ' ", 1130.00,
				"Cooked Rolls", 18);
		menu.put(7, d147);
		Dish d148 = new Dish(1908, "Salmon Aburi Roll",
				" 'Karkalecë i skuqur,Shparguj/Mbështjellë me Salmon ,Wasabi,Delight Salcë,Kaperi' ", 1240.00,
				"Cooked Rolls", 18);
		menu.put(8, d148);
		Dish d149 = new Dish(1909, "Ebi Tempura Roll with Truffle",
				" '8 copë,Karkalec Deti Crispy,Avocado,Tranguj/Mbështjellur me Majonezë Tartufi,Patate Crispy,Salcë Teriyaki,Susam i Bardhë dhe i Zi' ",
				1280.00, "Cooked Rolls", 18);
		menu.put(9, d149);
		Dish d150 = new Dish(1910, "Chicken Teriyaki Roll",
				" 'Pulë Tempura,Majonezë,Lakër e Bardhë/Mbështjellur me Susam,Qepë Crispy & Salcë Teryaki' ", 1170.00,
				"Cooked Rolls", 18);
		menu.put(10, d150);
		Dish d151 = new Dish(1911, "Sake Ten Roll",
				" '6 copë;Salmon Tempura,Avocado,Tranguj,Majonez,Sallatë e Gjelbërt/Mbështjellur me Massago' ", 1120.00,
				"Cooked Rolls", 18);
		menu.put(11, d151);
		Dish d152 = new Dish(1912, "Phily Roll",
				" '8 copë;Kani,Avocado,Krem Djathi,Pjesa e jashtme e fërguar ne Brum dhe Salcë Teriyaki' ", 1030.00,
				"Cooked Rolls", 18);
		menu.put(12, d152);

		Dish d153 = new Dish(1913, "Jungle Roll",
				" '8 copë;Ngjalë,Avocado,Shparguj,Krem Djathi/Mbështjellur me Goma Wakame(alga Deti me Susam)' ",
				1100.00, "Cooked Rolls", 18);
		menu.put(13, d153);

		Dish d154 = new Dish(1914, "Tempura Sake Maki Roll", " '(ska Pershkrim)' ", 1240.00, "Cooked Rolls", 18);
		menu.put(14, d154);
		Dish d155 = new Dish(1915, "Dragon Roll",
				" '6 copë;Avocado,Tranguj/Mbështjellur me Ngjalë dhe Salcë Teriyaki' ", 1120.00, "Cooked Rolls", 18);
		menu.put(15, d155);
		Dish d156 = new Dish(1916, "Tokyo Drift Roll",
				" '8 copë;Salmon Tempura,Avocado,Tranguj/Mbështjellur me Masago,Patate Crispy' ", 1100.00,
				"Cooked Rolls", 18);
		menu.put(16, d156);
		Dish d157 = new Dish(1917, "Special Salmon Roll",
				" '8 copë;Kani,Avocado,Tranguj,Majonezë,Sallatë e Gjelbërt/Mbështjellur me Tobikko ' ", 1260.00,
				"Cooked Rolls", 18);
		menu.put(17, d157);
		Dish d158 = new Dish(1918, "Shrimp Bomb Roll",
				" '8 copë;Tranguj,Takuan,Avocado/Mbështjellur me Karkalecë+ Deti' ", 1260.00, "Cooked Rolls", 18);
		menu.put(18, d158);

		Dish d159 = new Dish(2001, "Tempura Shrimp Plate ", "  '21 copë;Ebi Ten Roll 5,Samurai Roll8,Salmon Aburi 8'  ",
				3130.00, "Set Menu", 9);
		menu.put(1, d159);
		Dish d160 = new Dish(2002, "ABC Sushi Moriawase ",
				"  '15 copë + Epadame,Kappa Roll 6-cope,Kani Roll 6-cope,California Roll 3-cope'  ", 1750.00,
				"Set Menu", 9);
		menu.put(2, d160);
		Dish d161 = new Dish(2003, "California Dream ",
				"  '16 copë;California Roll 4-cope,Spicy California Roll 4-copë,Sesame California 4-copë,Black Sesame California Roll 4-copë'  ",
				2170.00, "Set Menu", 9);
		menu.put(3, d161);

		Dish d162 = new Dish(2004, "Sushi Queen",
				"  '11 copë +Epadame, Sake Roll 3-cope,Kani Roll 3-cope,Maguro 1-cp,Ebi 1(N/A),Sake 1,Suzuki 1,Kani 1'  ",
				2580.00, "Set Menu", 9);
		menu.put(4, d162);
		Dish d163 = new Dish(2005, "Sushi King",
				"  '15 copë;Sake Roll 3,Kani Roll 2,California Roll 3,Maguro 1,Suzuki 1,Sake 1, Ebi 1,Saba 1,Kani 1'  ",
				3130.00, "Set Menu", 9);
		menu.put(5, d163);

		Dish d164 = new Dish(2006, "Salmon Lovers ",
				"  '20 copë,San Diego Roll 6,Philadelphia Roll 6,Sake Roll 6,Sake Nigiri 2'  ", 2990.00, "Set Menu", 9);
		menu.put(6, d164);
		Dish d165 = new Dish(2007, "Hot Sushi Plate ",
				"  '19 copë,Philly Roll 8, Baby Kalamar Roll 5,Sake Ten Roll 6'  ", 3820.00, "Set Menu", 9);
		menu.put(7, d165);

		Dish d166 = new Dish(2008, "Sushi Prince 1 ",
				"  '25 cope;California Roll 3,Sakel Roll 3,Kappa Roll 3,Crunchy Roll 5,Sake Nigiri 2,Kani Nigiri 2,Ebi Nigiri 2,SushiCo Wakame Salad'  ",
				3130.00, "Set Menu", 9);
		menu.put(8, d166);

		Dish d167 = new Dish(2009, "Sushi Prince 2",
				"  '24 cope;Sesame Maki Roll 6,Manhattan Roll 5,Spicy California Roll 3,Sake Roll 3,Kani Roll 3,Maguro Nigiri 2,Sake Avocado Nigiri 2'  ",
				3820.00, "Set Menu", 9);
		menu.put(9, d167);
		Dish d168 = new Dish(2101, "Bento Menu 1",
				"  'Spring Roll(1 copë),Mish Viçi me Perime, Oriz me Perime,Sallatë Lakre,Spec djegës, 1 kanaçe Coca-Cola'  ",
				1430.00, "Bento Menu", 8);
		menu.put(1, d168);

		Dish d169 = new Dish(2102, "Bento Menu 2",
				"  'Wonton Crispy(2 copë),Pulë Crispy me xhenxherfil,Noodless me Perime,Sallatë Lakre Djegesë,1 kanaçe Coca-Cola'  ",
				1360.00, "Bento Menu", 8);
		menu.put(2, d169);
		Dish d170 = new Dish(2103, "Bento Menu 3",
				"  'Edamame Maki Roll me Susam(6 copë),Sake Roll(6 copë), 1 kanace Coca-Cola'  ", 1700.00, "Bento Menu",
				8);
		menu.put(3, d170);
		Dish d171 = new Dish(2104, "Bento Menu 4",
				"  'Qofte Pule(4 copë),Noodles me Perime,Ebi Ten Roll(5 copë),Sake Ten Roll(3 copë),1 Kanaçe Coca-Cola'  ",
				1840.00, "Bento Menu", 8);
		menu.put(4, d171);
		Dish d172 = new Dish(2105, "Bento Menu 5",
				"  'California Roll(6 copë),Philadelphia Roll(6 copë),Kappa Roll(6 copë),Sallatë SushiCo Wakame(alga deti me susam), 1 kanaçe Coca-Cola'  ",
				2120.00, "Bento Menu", 8);
		menu.put(5, d172);

		Dish d173 = new Dish(2106, "Bento Menu 6",
				"  'Wonton Crispy(2 copë),Pulë Sweet&Sour,Oriz me Perime,Edamame, 1 kanace Coca-Cola'  ", 1360.00,
				"Bento Menu", 8);
		menu.put(6, d173);
		Dish d174 = new Dish(2107, "Bento Menu Vegjetariane",
				"  'Edamame,Perime të Përziera të skuqura,Oriz me Perime,Kappa Roll(3 copë),Avocado Roll(3 copë), 1 Coca Cola'  ",
				1360.00, "Bento Menu", 8);
		menu.put(7, d174);

		Dish d175 = new Dish(2108, "Kids Bento",
				"  '2 Wonton Crispy,6 qofte me Mish Pule,Noodles me Perime,2 Banane te skuqura,Leng frutash'  ",
				1130.00, "Bento Menu", 8);
		menu.put(8, d175);
		Dish d176 = new Dish(2201, "Kappa Roll", "(s'ka pershkrim) ", 420.00, "Sushi Roll", 12);
		menu.put(1, d176);
		Dish d177 = new Dish(2202, "Maguro Roll ", "Peshk Tuna", 690.00, "Sushi Roll", 12);
		menu.put(2, d177);
		Dish d178 = new Dish(2203, "Tofu Takuan Roll", "Tofu,Takuan/Mbështjellur me Nori", 720.00, "Sushi Roll", 12);
		menu.put(3, d178);
		Dish d179 = new Dish(2204, " Ebi Roll", "Karkalecë", 690.00, "Sushi Roll", 12);
		menu.put(4, d179);

		Dish d180 = new Dish(2205, " Kani Roll", "Surumi", 620.00, "Sushi Roll", 12);
		menu.put(5, d180);
		Dish d181 = new Dish(2206, " Sake Roll", "Salmon", 690.00, "Sushi Roll", 12);
		menu.put(6, d181);
		Dish d182 = new Dish(2207, " Unagi Roll", "Ngjale", 960.00, "Sushi Roll", 12);
		menu.put(7, d182);

		Dish d183 = new Dish(2208, " Avocado Ebi Roll", "Karkalece dhe avocado", 780.00, "Sushi Roll", 12);
		menu.put(8, d183);

		Dish d184 = new Dish(2209, " Avocado Sake Roll", "Salmon dhe Avocado", 780.00, "Sushi Roll", 12);
		menu.put(9, d184);
		Dish d185 = new Dish(2210, " Unagi Avicado Roll", "Ngjale dhe Avocado", 1080.00, "Sushi Roll", 12);
		menu.put(10, d185);

		Dish d186 = new Dish(2211, " Quinoa Sake Roll", "Salmon,Avocado,Tranguj,Quinoa", 720.00, "Sushi Roll", 12);
		menu.put(11, d186);

		Dish d187 = new Dish(2212, " Quinoa California Roll",
				"  '8 copë Quinoa,Kani,Avocado,Tranguj,Majonezë,Tobikko/Mbështjellur me Nori'  ", 900.00, "Sushi Roll",
				12);
		menu.put(12, d187);
		Dish d188 = new Dish(2301, " Ginger", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(1, d188);
		Dish d189 = new Dish(2302, " Sweet Sour Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(2, d189);
		Dish d190 = new Dish(2303, " Wasabi", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(3, d190);
		Dish d191 = new Dish(2304, " Sriracha", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(4, d191);

		Dish d192 = new Dish(2305, " Teriyaka Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(5, d192);
		Dish d193 = new Dish(2306, " Samurai Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(6, d193);

		Dish d194 = new Dish(2307, " Sweet Chili Sos", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(7, d194);
		Dish d195 = new Dish(2308, " Hoisin Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(8, d195);
		Dish d196 = new Dish(2309, " Plum Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(9, d196);
		Dish d197 = new Dish(2310, " Pancake", "(7 cope)", 2000.00, "Salcat", 12);
		menu.put(10, d197);

		Dish d198 = new Dish(2311, " Chinese Hot Sauce", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(11, d198);
		Dish d199 = new Dish(2312, " Truffle Mayonnaise", "(s'ka pershkrim)", 500.00, "Salcat", 12);
		menu.put(12, d199);
		Dish d200 = new Dish(2401, " BUN'utella", "(s'ka pershkrim)", 690.00, "Desert", 5);
		menu.put(1, d200);
		Dish d201 = new Dish(2402, " Akullore e Fërguar", "  'Vanilla/Chocolate", 480.00, "Desert", 5);
		menu.put(2, d201);
		Dish d202 = new Dish(2403, " Ananas i fërguar me Kanellë", "s'ka pershkrim", 480.00, "Desert", 5);
		menu.put(3, d202);
		Dish d203 = new Dish(2404, " Akullore e Fërguar me Bajame", "s'ka pershkrim", 550.00, "Desert", 5);
		menu.put(4, d203);
		Dish d204 = new Dish(2405, " Arra të Karamelizuara", "s'ka pershkrim", 480.00, "Desert", 5);
		menu.put(5, d204);
		Dish d205 = new Dish(2501, " Asahi Birrë", "Birre e importuar Japoneze", 420.00, "Birre", 3);
		menu.put(1, d205);

		Dish d206 = new Dish(2502, " Corona", "(s'ka pershkrim)", 370.00, "Birre", 3);
		menu.put(2, d206);
		Dish d207 = new Dish(2503, " Tuborg", "(s'ka pershkrim)", 300.00, "Birre", 3);
		menu.put(3, d207);
		Dish d208 = new Dish(2601, " Sake 0.75", "(s'ka pershkrim)", 3600.00, "Sake & Wine", 2);
		menu.put(1, d208);

		Dish d209 = new Dish(2602, " Sake 0.18", "(s'ka pershkrim)", 1200.00, "Sake & Wine", 2);
		menu.put(2, d209);
		Dish d210 = new Dish(2701, " Coca - Cola", "(s'ka pershkrim)", 220.00, "Pijet e Ftohta", 10);
		menu.put(1, d210);

		Dish d211 = new Dish(2702, " Coca - Cola Zero", "(s'ka pershkrim)", 220.00, "Pijet e Ftohta", 10);
		menu.put(2, d211);
		Dish d212 = new Dish(2703, " Fanta", "(s'ka pershkrim)", 220.00, "Pijet e Ftohta", 10);
		menu.put(3, d212);
		Dish d213 = new Dish(2704, " Sprite", "(s'ka pershkrim)", 220.00, "Pijet e Ftohta", 10);
		menu.put(4, d213);
		Dish d214 = new Dish(2705, " Schweppes", "(s'ka pershkrim)", 220.00, "Pijet e Ftohta", 10);
		menu.put(5, d214);
		Dish d215 = new Dish(2706, " RedBull", "(s'ka pershkrim)", 300.00, "Pijet e Ftohta", 10);
		menu.put(6, d215);
		Dish d216 = new Dish(2707, " Acqua Panna - 0.25ml", "(0.25 ml)", 180.00, "Pijet e Ftohta", 10);
		menu.put(7, d216);
		Dish d217 = new Dish(2708, " Acqua Panna - 0.75ml", "(s'ka pershkrim)", 370.00, "Pijet e Ftohta", 10);
		menu.put(8, d217);

		Dish d218 = new Dish(2709, " San Pellegrino - 0.25ml", "(s'ka pershkrim)", 180.00, "Pijet e Ftohta", 10);
		menu.put(9, d218);
		Dish d219 = new Dish(2710, " San Pellegrino", "(s'ka pershkrim)", 370.00, "Pijet e Ftohta", 10);
		menu.put(10, d219);
		Set<Map.Entry<Integer, Dish>>set=menu.entrySet();
		for (Map.Entry<Integer, Dish> d : set) {
			System.out.println(d.getKey()+" "+d.getValue());
		}
	
		System.out.println();
	System.out.println("Shto menu");
		menu.putIfAbsent(10, new Dish(610, "Sallatë Oktapod", "  'Sallate Jeshile,Oktapod,Mango,te gjitha salcat'  ",
				720.00, "Sallatat", 10));
		System.out.println(menu);
		return menu;
	}

	public TreeMap<Integer, Dish> getD() {
		menuRestoranti();
		return d;
	}

	private TreeSet<CustomerLoyalty> shfaqKlientet() {
		System.out.println("Shfaq Klientë të Restorantit");
		TreeSet<CustomerLoyalty> cust = new TreeSet<CustomerLoyalty>();
		CustomerLoyalty cl1 = new CustomerLoyalty("J25369872K", "Anisa Çela", "0676575397",
				"Laprakë/Rruga: Stanislav Zuber/Ndërtesa nr: 12/Kati nr: 3/Apartamenti : 20", null,
				"celaanisa07@gmail.com", "Vb29gh@@#", 10323, null);
		cust.add(cl1);
		CustomerLoyalty cl2 = new CustomerLoyalty("H21569871P", "Anisa  Osmani", "0676585497",
				"Laprakë/Rruga: Lord Bajron/Ndërtesa nr: 5/Kati nr: 6/Apartamenti : 20", "5678 9012 3456 7698",
				"anisa.osmani01@hotmail.com", "AM25ma@&", 20323, "170120260520");
		cust.add(cl2);

		CustomerLoyalty cl3 = new CustomerLoyalty("E36958413F ", "Ermal Ormeni", "0685568794",
				"Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 13/Kati nr: 5/Apartamenti : 16",
				"4435 1234 4567 9988", "ormeni.Ermal18@yahoo.com", "Er42mo#@", 30323, "020221120721");
		cust.add(cl3);
		CustomerLoyalty cl4 = new CustomerLoyalty("G11568934K ", "Entela Çelaj", "0682247991",
				"Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 25/Kati nr: 8/Apartamenti : 29", null,
				"centela02@outlook.com", "ECt13am@@", 40323, "030418090918");
		cust.add(cl4);

		CustomerLoyalty cl5 = new CustomerLoyalty("M11477598L", "Anisa Plaku", "0698854542",
				"21 Djetori/Rruga: Sulejman Pitarka/Ndërtesa nr:22/Kati nr: 15/Apartamenti :48", null,
				"plakuanisa138@yahoo.com", "132APpl@&", 50323, null);
		cust.add(cl5);

		CustomerLoyalty cl6 = new CustomerLoyalty("B25895162K", "Mirela Hoxha", "0667889544",
				"Fusha e Aviacionit/Rruga: Grigor Gjirokastriti/Ndërtesa nr: 16/Vila : 16", null,
				"mirela.hoxha@gmail.com", "HM@mh22&", 60323, null);
		cust.add(cl6);
		CustomerLoyalty cl7 = new CustomerLoyalty("D21115864O", "Gent Tyxhari", "0669987852",
				"Fusha e Aviacionit/Rruga: Ali Kolonja/Ndërtesa nr: 18/Kati nr: 5/Apartamenti : 22", null,
				"tyxhari.gent174@hotmail.com", "GE87vt#&", 70323, null);
		cust.add(cl7);
		CustomerLoyalty cl8 = new CustomerLoyalty("P44586217H", "Marina  Kellezi", "0695547881",
				"Ali Demi/Rruga: Ali Demi/Ndërtesa nr: 22/Kati nr: 9/Apartamenti : 36", null,
				"kellezimarina06@yahoo.com", "KM24ee&@", 80323, null);
		cust.add(cl8);

		CustomerLoyalty cl9 = new CustomerLoyalty("A11254875J", "Greta  Huda", "0678895472",
				"Ali Demi/Rruga: Nazmi Frakulli/Ndërtesa nr: 34/Kati nr: 4/Apartamenti : 16", "4436 1234 4567 9999",
				"ghuda03@icloud.com", "HU76gr@@", 90323, "030219060619");
		cust.add(cl9);

		CustomerLoyalty cl10 = new CustomerLoyalty("R14456671H", "Enea  Gramo", "0676502155",
				"Liqeni i Thatë/Rruga: Bektash Berberi/Ndërtesa nr: 46/Kati nr: 9/Apartamenti : 42",
				"5186 5212 3456 7891", "gramo.eno127@gmail.com", "gr56@EN&", 100323, "300516121016");
		cust.add(cl10);
		CustomerLoyalty cl11 = new CustomerLoyalty("E11235441X", "Vjollca Lacka", "0699876547",
				"Liqeni i Thatë/Rruga: Sami Frashëri/Ndërtesa nr: 72/Kati nr: 6/Apartamenti : 22",
				"4227 0123 4567 8901", "vj.lacka258@hotmail.com", "VL56lh@&", 110323, "141119050320");
		cust.add(cl11);
		CustomerLoyalty cl12 = new CustomerLoyalty("D11256682C", "Migena  Musollari", "0685521224",
				"Kombinati/Rruga: Shaban Bardhoshi/Ndërtesa nr: 127/Kati nr: 3/Apartamenti : 12", "1234 5678 9012 3456",
				"musollari.gena@outlook.com", "G@u58Ms#", 120323, "150722131222");
		cust.add(cl12);
		CustomerLoyalty cl13 = new CustomerLoyalty("F22145787L", "Megi  Proda", "0699984711",
				"Kombinati/Rruga: Hamdi Cenojmeri/Ndërtesa nr: 175/Kati nr: 5/Apartamenti : 18", "4321 0123 4567 8901",
				"prodamegi09@yahoo.com", "DB49za@&", 130323, "060912210113");
		cust.add(cl13);
		CustomerLoyalty cl14 = new CustomerLoyalty("I88521447N", "Adela  Zaka", "0662253541",
				"Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 27/Kati nr: 8/Apartamenti : 29", "0123 4567 8901 2345",
				"adela.zaka019@gmail.com", "kk66OL@@", 140323, "180820160121");
		cust.add(cl14);
		CustomerLoyalty cl15 = new CustomerLoyalty("T25644719S", "Ksanthipi  Koleka", "0685544701",
				"Fusha e Aviacionit/Rruga: Grigor Gjirokastriti/Ndërtesa nr: 10/Kati nr: 10/Apartamenti : 54",
				"4025 8200 1234 5678", "koleka.ksanthipi02@outlook.com", "SK87dg&@", 150323, "040422190922");
		cust.add(cl15);
		CustomerLoyalty cl16 = new CustomerLoyalty("K13669874P", "Alma  Kastrati", "0697879788",
				"Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 13/Kati nr: 5/Apartamenti : 19",
				"4000 1234 5678 1234", "kastratialma03@yahoo.com", "OvVe67@@", 160323, "081015260316");
		cust.add(cl16);
		CustomerLoyalty cl17 = new CustomerLoyalty("E78895662G", "Elisabeta  Dervishi", "0695258454",
				"Stacioni i Trenit/Rruga: Sotir Polena/Ndërtesa nr: 56/Kati nr: 8/Apartamenti : 40",
				"6244 4501 8888 7777", "betadervishi367@gmail.com", "d12EEv@#&", 170323, "240520220920");
		cust.add(cl17);
		CustomerLoyalty cl18 = new CustomerLoyalty("Q44789631L", "Enisa  Dervishi", "0677117455",
				"Stacioni i Trenit/Rruga: Skënder Kosturi/Ndërtesa nr: 176/Kati nr: 12/Apartamenti : 62",
				"1234 8827 8299 4532", "dervishieni024@gmail.com", "OB26aa@#&", 180323, "210718061218");
		cust.add(cl18);
		CustomerLoyalty cl19 = new CustomerLoyalty("I45558789C", "Bejana  Oshafi", "0699352411",
				"Stacioni i Trenit/Rruga: Reshit Petrela/Ndërtesa nr: 123/Kati nr: 9/Apartamenti : 58",
				"5955 8988 8888 6565", "oshafi.bejana01@icloud.com", "EA89zo@@", 190323, "070317210817");
		cust.add(cl19);
		CustomerLoyalty cl20 = new CustomerLoyalty("X12223566L", "Xhuljana  Shkëmbi", "0689995764",
				"Tirane e Re/Rruga: Ismail Qemali/Ndërtesa nr: 147/Kati nr : 15/Apartamenti : 75",
				"4850 6900 0000 0001", "shkembixhul21@outlook.com", "UC54ld&&", 200323, "221016150317");
		cust.add(cl20);
		CustomerLoyalty cl21 = new CustomerLoyalty("Y44158897L", "Eugen  Kellezi", "0685959457",
				"Astir/Rruga: Kristaq Mone/Ndërtesa nr: 185/Kati nr : 5/Apartamenti : 17", "5412 7512 3412 3456",
				"kellezigeni52@yahoo.com", "ELkn49&&", 210323, "250221030721");
		cust.add(cl21);
		CustomerLoyalty cl22 = new CustomerLoyalty("T44858597O", "Erinda  Shehu", "0698787878",
				"Astir/Rruga: Nexho Konomi/Ndërtesa nr: 85/Kati nr : 5/Apartamenti : 17", "5462 1234 5678 7000",
				"erinda.shehu19@gmail.com", "UR73ed@@", 220323, "160622141122");
		cust.add(cl22);
		CustomerLoyalty cl23 = new CustomerLoyalty("J25335647B", "Maria  Agaçi", "0695524873",
				"Astir/Rruga: Dhaskal Todri/Ndërtesa nr: 68/Kati nr : 2/Apartamenti : 10", "5258 9212 3456 7890",
				"agaci_maria24@outlook.com", "GM51ma&&", 230323, "270819270120");
		cust.add(cl23);
		CustomerLoyalty cl24 = new CustomerLoyalty("L22369877I", "Gazmend  Paja", "0699514547",
				"Qyteti Studenti/Rruga : Sotir Kolea/Ndertesa nr : 54/Kati nr : 7/Apartamenti : 40",
				"4796 5629 3087 2808", "pajaj.gaz123@yahoo.com", "PGaj04@@", 240323, "240415260915");
		cust.add(cl24);
		CustomerLoyalty cl25 = new CustomerLoyalty("S11245879N", "Anjeza  Lacka", "0685523411",
				"Don Bosko/Rruga : Dom Mark Dushi/Ndertesa nr : 154/Kati nr : 4/Apartamenti : 16",
				"4195 3456 7895 1234", "lackaanjeza022@yahoo.com", "AJ18al@&", 250323, "290620221120");
		cust.add(cl25);
		CustomerLoyalty cl26 = new CustomerLoyalty("Z22369654G", "Eduart  Ndoci", "0677879745",
				"Don Bosko/Rruga : Don Bosko/Ndertesa nr : 194/Kati nr : 3/Apartamenti : 12", "5000 1234 5678 9090",
				"edi.ndoci35@outlook.com", "eSf&A27@", 260323, "130816080117");
		cust.add(cl26);
		CustomerLoyalty cl27 = new CustomerLoyalty("M11258749B", "Erinda  Oshafi", "0699874545",
				"Sauk/Rruga : Xhevat Kallajxhi/Ndertesa nr : 114/Kati nr : 7/Apartamenti : 25", "1234 5678 9876 5432",
				"erindaoshafi19@gmail.com", "JA@nl61@", 270323, "040110280611");
		cust.add(cl27);
		CustomerLoyalty cl28 = new CustomerLoyalty("G11258664U", "Ilia  Prifti", "0685459501",
				"Sauk/Rruga : Danish Jukniu/Ndertesa nr : 134/Kati nr : 3/Apartamenti : 15", "4538 1234 5678 9112",
				"prifti.ilia156@gmail.com", "RF34in@&#", 280323, "020118240618");
		cust.add(cl28);
		CustomerLoyalty cl29 = new CustomerLoyalty("L11258476N", "Aurela  Mullaj", "0685524631",
				"Sauk/Rruga : Hajredin Kumbaro/Ndertesa nr : 124/Kati nr : 6/Apartamenti : 21", null,
				"mullaaurela36@yahoo.com", "RM@ae&46", 290323, null);
		cust.add(cl29);
		CustomerLoyalty cl30 = new CustomerLoyalty("T14711755R", "Guadalupe  Xhori", "0693332211",
				"Brraka/Rruga : Asim Vokshi/Ndertesa nr : 94/Kati nr : 16/Apartamenti : 75", null,
				"lupexhori37@yahoo.com", "UP@5or&11", 300323, null);
		cust.add(cl30);
		CustomerLoyalty cl31 = new CustomerLoyalty("C11447589I", "Sindi  Manushi", "0688641222",
				"Pazari i Ri/Rruga : Hoxha Tahsim/Ndertesa nr : 44/Kati nr : 4/Apartamenti : 16", "0000 1234 5678 9010",
				"manushi.sindi13@outlook.com", "DNis1&5@#", 310323, "180512301012");
		cust.add(cl31);
		CustomerLoyalty cl32 = new CustomerLoyalty("A33216554K", "Hergi  Buasi", "0677155423",
				"Kamëz/Rruga : Azem Galica/Ndertesa nr : 24/Kati nr : 4/Apartamenti : 16", null,
				"hergibuasi29@outlook.com", "GU214eaz@#", 320323, null);
		cust.add(cl32);
		CustomerLoyalty cl33 = new CustomerLoyalty("K11289655F", "Mimoza  Drenova", "0663230121",
				"Kamëz/Rruga : Martin Camaj/Ndertesa nr : 6/Kati nr : 14/Apartamenti : 71", null,
				"moza.drenova517@yahoo.com", "zdD1O3&&", 340323, null);
		cust.add(cl33);
		CustomerLoyalty cl34 = new CustomerLoyalty("T52889633D", "Pjerina  Voda", "0693235621",
				"Liqeni i Thatë/Rruga: Bektash Berberi/Ndërtesa nr: 49/Kati nr: 9/Apartamenti : 42",
				"0987 6543 2101 2345", "inavoda321@gmail.com", "JI27gh@&", 350323, "220209260709");
		cust.add(cl34);
		CustomerLoyalty cl35 = new CustomerLoyalty("B44887569Y", "Anisa  Sallaku", "0663998741",
				"Komuna e Parisit/Rruga: Medar Shtylla/Ndërtesa nr: 33/Kati nr: 5/Apartamenti : 19",
				"1234 5678 9123 4567", "anisa.sallaku1@outlook.com", "NS1@l1i@4", 360323, "281016220317");
		cust.add(cl35);
		CustomerLoyalty cl36 = new CustomerLoyalty("U35264788O", "Joni  Shalsi", "0683355542",
				"Laprakë/Rruga: Stanislav Zuber/Ndërtesa nr: 2/Kati nr: 3/Apartamenti : 15", "4321 0122 4567 8910",
				"jonian.shalsi35@gmail.com", "AJ11@sh&", 370323, "291013250313");
		cust.add(cl36);
		CustomerLoyalty cl37 = new CustomerLoyalty("J14458897T", "Julia  Gjoka", "0674418952",
				"Fusha e Aviacionit/Rruga: Gregor Gjirokastriti/Ndërtesa nr: 11/Kati nr: 10/Apartamenti : 54",
				"5288 5678 9012 3456", "jul.gjoka19@yahoo.com", "OA53jk@&", 380323, "050314110814");
		cust.add(cl37);
		CustomerLoyalty cl38 = new CustomerLoyalty("V11255887S", "Elina  Rugova", "0699633201",
				"21 Djetori/Rruga: Rruga e Kavajes/Ndërtesa nr:72/Kati nr: 15/Apartamenti :48", null,
				"rugovaelina147@outlook.com", "BG57ov@&#", 390323, null);
		cust.add(cl38);
		CustomerLoyalty cl39 = new CustomerLoyalty("M25581733G", "Kaltrin  Zotaj", "0699584753",
				"Komuna e Parisit/Rruga: Haxhi Kika/Ndërtesa nr: 24/Kati nr: 8/Apartamenti : 29", null,
				"zotajkaltri159@yahoo.com", "kZ48Aj@&", 400323, null);
		cust.add(cl39);
		CustomerLoyalty cl40 = new CustomerLoyalty("H44588921L", "Dori  Gjini", "0695552432",
				"Stacioni i Trenit/Rruga: Skënder Kosturi/Ndërtesa nr: 198/Kati nr: 12/Apartamenti : 62", null,
				"dor.gjini22@gmail.com", "OIgn94@@", 410323, null);
		cust.add(cl40);
		CustomerLoyalty cl41 = new CustomerLoyalty("E44569878O", "Fidan  Elezi", "0699878725",
				"Qender/Rruga: Sami Frashëri/Ndërtesa nr: 19/Kati nr: 9/Apartamenti : 32", null,
				"danielezi135@yahoo.com", "NEvb84@&", 420323, null);
		cust.add(cl41);
		CustomerLoyalty cl42 = new CustomerLoyalty("J66589352D", "Redi  Banushi", "0684445202",
				"Tirane e Re/Rruga: Ismail Qemali/Ndërtesa nr: 187/Kati nr : 15/Apartamenti : 75",
				"4300 8200 1234 5678", "redibush135@icloud.com", "NU37rb&&", 430323, "290319310819");
		cust.add(cl42);
		CustomerLoyalty cl43 = new CustomerLoyalty("B11247886P", "Erda  Koroveshi", "0685564452",
				"Laprakë/Rruga: Lord Bajron/Ndërtesa nr: 10/Kati nr: 6/Apartamenti : 22", "6244 4501 8887 6667",
				"erda.koro48@hotmail.com", "VOed64@&", 440323, "061114120414");
		cust.add(cl43);
		CustomerLoyalty cl44 = new CustomerLoyalty("Y22155487C", "Erina  Grabocka", "0665958221",
				"Qendër/Rruga: Myslym Shyri/Ndërtesa nr:102/Kati nr: 15/Apartamenti :48", "4850 6900 0000 0010",
				"inagrabocka41@gmail.com", "O16Gba@@", 460323, "070720301220");
		cust.add(cl44);

		for (CustomerLoyalty cl : cust) {
			System.out.println(cl);
		}

		return cust;
	}

	public Set<CustomerLoyalty> getCl() {
		shfaqKlientet();
		return cl;
	}

	private ArrayList<Orders> afishoPorosiJavore() {
		ArrayList<Orders> order = new ArrayList<Orders>();
		Orders ord1 = new Orders(5109, 4800.00, 5, "8:30|18.03.2023", "12:00|18.03.2023", "Processed", "Appetizer", 19,
				109, "Karkalecë Deti Crispy", "(ska pershkrim)", 960.00);
		order.add(ord1);
		Orders ord2 = new Orders(3117, 3300.00, 3, "9:00|18.03.2023", "13:30|18.03.2023", "Processed", "Appetizer", 19,
				117, "Salmon & Suzuki Carpaccio", "(ska pershkrim)", 1100.00);
		order.add(ord2);
		Orders ord3 = new Orders(6104, 4560.00, 6, "10:35|18.03.2023", "13:30|18.03.2023", "Processed", "Appetizer", 19,
				104, "Pulë Kaarage me Parmesan", "(ska pershkrim)", 760.00);
		order.add(ord3);
		Orders ord4 = new Orders(62602, 7200.00, 6, "10:38|18.03.2023", "13:00|18.03.2023", "Processed", "Sake&Wine", 2,
				2602, "Sake 0.18", "(ska pershkrim)", 1200.00);
		order.add(ord4);
		Orders ord5 = new Orders(5119, 3800.00, 5, "11:00|18.03.2023", "12:30|18.03.2023", "Processed", "Appetizer", 19,
				119, "Tempura Perimesh", "Perime të Brumosura,tempura të fërguara", 760.00);
		order.add(ord5);
		Orders ord6 = new Orders(10301, 6200.00, 10, "13:00|18.03.2023", "14:30|18.03.2023", "Processed", "Bun", 3, 301,
				"Bun Vici", "ska pershkrim", 620.00);
		order.add(ord6);
		Orders ord7 = new Orders(62404, 3300.00, 6, "13:05|18.03.2023", "14:30|18.03.2023", "Processed", "Desert", 5,
				2404, "Akullore e Fërguar me Bajame", "(ska pershkrim)", 550.00);
		order.add(ord7);
		Orders ord8 = new Orders(42702, 880.00, 4, "13:08|18.03.2023", "14:30|18.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2702, "Coca - Cola Zero", "kanace", 220.00);
		order.add(ord8);
		Orders ord9 = new Orders(2407, 1660.00, 2, "16:30|18.03.2023", null, "Cancel", "Supat", 7, 407,
				"Pad Thai", "Supë me Karkaleca Deti", 830.00);
		order.add(ord9);
		Orders ord10 = new Orders(5303, 3450.00, 5, "16:35|18.03.2023", "17:00|18.03.2023", "Processed", "Bun", 3, 303,
				"Bun(Kuleçë) me mish te Patës", "ska pershkrim", 690.00);
		order.add(ord10);
		Orders ord11 = new Orders(12111, 14880.00, 12, "19:00|18.03.2023", "20:25|18.03.2023", "Processed", "Appetizer",
				19, 111, "Tartar Salmoni me Tartuf", "(ska pershkrim)", 1240.00);
		order.add(ord11);
		Orders ord12 = new Orders(15601, 10500.00, 15, "8:00|19.03.2023", "12:00|19.03.2023", "Processed", "Sallatat",
				9, 601, "Sallatë Aziatike", "(ska pershkrim)", 700.00);
		order.add(ord12);
		Orders ord13 = new Orders(10503, 12900.00, 10, "8:35|19.03.2023", "12:00|19.03.2023", "Processed", "Ramen", 3,
				503, "Ramen - Karkalec", "(ska pershkrim)", 1290.00);
		order.add(ord13);
		Orders ord14 = new Orders(10605, 8300.00, 10, "10:00|19.03.2023", "11:40|19.03.2023", "Processed", "Sallatat",
				9, 605, "Sallatë Kani dhe Tranguj", "(ska pershkrim)", 830.00);
		order.add(ord14);
		Orders ord15 = new Orders(7205, 4830.00, 7, "11:35|19.03.2023", "12:00|19.03.2023", "Processed", "Dim Sum", 6,
				205, "Spring Roll me Mish Pate", "(ska pershkrim)", 690.00);
		order.add(ord15);
		Orders ord16 = new Orders(5606, 5500.00, 5, "13:00|19.03.2023", "14:10|19.03.2023", "Processed", "Sallatat", 9,
				606, "Sallatë Sashimi", "(ska pershkrim)", 1100.00);
		order.add(ord16);
		Orders ord17 = new Orders(3602, 3720.00, 3, "13:30|19.03.2023", "14:20|19.03.2023", "Processed", "Sallatat", 9,
				602, "Sallatë Aziatike me Karkaleca Deti Crispy", "(ska pershkrim)", 1240.00);
		order.add(ord17);
		Orders ord18 = new Orders(4609, 4960.00, 4, "15:35|19.03.2023", "16:00|19.03.2023", "Processed", "Sallatat", 9,
				609, "Sallatë Quinoa me Salmon", "(ska pershkrim)", 1240.00);
		order.add(ord18);
		Orders ord19 = new Orders(3607, 3720.00, 3, "15:40|19.03.2023", "16:00|19.03.2023", "Processed", "Sallatat", 9,
				607, "Sallatë me fruta të Detit", "(ska pershkrim)", 1240.00);
		order.add(ord19);
		Orders ord20 = new Orders(8808, 8800.00, 8, "18:30|19.03.2023", "19:10|19.03.2023", "Processed", "Noodles", 14,
				808, "Singapore Noodles me salcë Këri", "(ska pershkrim)", 1100.00);
		order.add(ord20);
		Orders ord21 = new Orders(5701, 6900.00, 5, "19:45|19.03.2023", "20:30|19.03.2023", "Processed", "Donburi", 3,
				701, "Donburi me ngjalë", "(ska pershkrim)", 1380.00);
		order.add(ord21);
		Orders ord22 = new Orders(32108, 3390.00, 3, "9:35|20.03.2023", "12:00|20.03.2023", "Processed", "Bento Menu",
				8, 2108, "Kids Bento",
				"2 Wonton Crispy,6 qofte me Mish Pule,Noodles me Perime,2 Banane te skuqura,Leng frutash", 1130.00);
		order.add(ord22);
		Orders ord23 = new Orders(32704, 660.00, 3, "9:40|20.03.2023", "11:45|20.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2704, "Sprite", "Sprite", 220.00);
		order.add(ord23);
		Orders ord24 = new Orders(2118, 2900.00, 2, "10:00|20.03.2023", "12:00|20.03.2023", "Processed", "Appetizer",
				19, 118, "Tempura Mix", "Karkalecë të detit,Kallamari,Bishtaja Crispy", 1450.00);
		order.add(ord24);
		Orders ord25 = new Orders(2904, 1380.00, 2, "11:05|20.03.2023", "12:00|20.03.2023", "Processed", "Oriz", 9, 904,
				"Oriz me Vezë të fërguara", "(ska pershkrim)", 690.00);
		order.add(ord25);
		Orders ord26 = new Orders(20809, 2200.00, 20, "12:00|20.03.2023", "13:30|20.03.2023", "Processed", "Noodles",
				14, 809, "Udon me Perime dhe Salcë të Hudhrës së Zezë", "(ska pershkrim)", 830.00);
		order.add(ord26);
		Orders ord27 = new Orders(5801, 5250.00, 5, "12:30|20.03.2023", "13:00|20.03.2023", "Processed", "Noodles", 14,
				801, "Udon Bulgogi Korean Mish Viçi", "(ska pershkrim)", 1050.00);
		order.add(ord27);
		Orders ord28 = new Orders(5813, 6900.00, 5, "14:03|20.03.2023", "14:30|20.03.2023", "Processed", "Noodles", 14,
				813, "Noodles të Stilit Tajlandez me Karkalecë Deti", "(ska pershkrim)", 1240.00);
		order.add(ord28);
		Orders ord29 = new Orders(2908, 1660.00, 2, "14:05|20.03.2023", "14:30|20.03.2023", "Processed", "Oriz", 9, 908,
				"Oriz i Stilit Tajladez me Ananas", "(ska pershkrim)", 830.00);
		order.add(ord29);
		Orders ord30 = new Orders(51810, 5150.00, 5, "18:00|20.03.2023", "19:30|20.03.2023", "Processed",
				"Special Rolls", 20, 1810, "Canadian Roll", "6 cope;Kani,Tranguj/Mbeshtjelle me Salmon", 1030.00);
		order.add(ord30);
		Orders ord31 = new Orders(501301, 71000.00, 50, "21:00|20.03.2023", "22:10|20.03.2023", "Processed",
				"Ushqimi Detit", 7, 1301, "Salmon Tajlandez me Curry", "(ska pershkrim)", 1420.00);
		order.add(ord31);

		Orders ord32 = new Orders(22105, 4242.00, 2, "7:45|21.03.2023", "11:50|21.03.2023", "Processed", "Bento Menu",
				8, 2105, "Bento Menu 5",
				"California Roll(6 copë),Philadelphia Roll(6 copë),Kappa Roll(6 copë),Sallatë SushiCo Wakame(alga deti me susam), 1 kanaçe Coca-Cola",
				2120.00);
		order.add(ord32);
		Orders ord33 = new Orders(42101, 5720.00, 4, "8:20|21.03.2023", "12:00|21.03.2023", "Processed", "Bento Menu",
				8, 2101, "Bento Menu 1",
				"Spring Roll(1 copë),Mish Viçi me Perime, Oriz me Perime,Sallatë Lakre,Spec djegës, 1 kanaçe Coca-Cola",
				1430.00);
		order.add(ord33);
		Orders ord34 = new Orders(52005, 15650.00, 5, "9:25|21.03.2023", "12:30|21.03.2023", "Processed", "Set Menu", 9,
				2005, "Sushi King",
				"15 copë;Sake Roll 3,Kani Roll 2,California Roll 3,Maguro 1,Suzuki 1,Sake 1, Ebi 1,Saba 1,Kani 1",
				3130.00);
		order.add(ord34);
		Orders ord35 = new Orders(32708, 11100.00, 3, "9:26|21.03.2023", "12:30|21.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2708, "Acqua Panna - 0.75ml", "(ska pershkrim)", 370.00);
		order.add(ord35);
		Orders ord36 = new Orders(51816, 5150.00, 5, "17:00|21.03.2023", "17:45|21.03.2023", "Processed",
				"Special Rolls", 20, 1816, "Philadelphia Roll",
				"8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbështjellur me Susam", 1030.00);
		order.add(ord36);
		Orders ord37 = new Orders(52007, 15650.00, 5, "20:00|21.03.2023", "21:00|21.03.2023", "Processed", "Set Menu",
				9, 2007, "Hot Sushi Plate ", "19 copë,Philly Roll 8, Baby Kalamar Roll 5,Sake Ten Roll 6", 3130.00);
		order.add(ord37);
		Orders ord38 = new Orders(52009, 19100.00, 5, "8:00|22.03.2023", "12:00|22.03.2023", "Processed", "Set Menu", 9,
				2009, "Sushi Prince 2",
				"24 cope;Sesame Maki Roll 6,Manhattan Roll 5,Spicy California Roll 3,Sake Roll 3,Kani Roll 3,Maguro Nigiri 2,Sake Avocado Nigiri 2",
				3820.00);
		order.add(ord38);
		Orders ord39 = new Orders(62102, 8160.00, 6, "9:00|22.03.2023", "12:20|22.03.2023", "Processed", "Bento Menu",
				8, 2102, "Bento Menu 2",
				"Wonton Crispy(2 copë),Pulë Crispy me xhenxherfil,Noodless me Perime,Sallatë Lakre Djegesë,1 kanaçe Coca-Cola",
				1360.00);
		order.add(ord39);
		Orders ord40 = new Orders(51905, 5850.00, 5, "10:05|22.03.2023", "12:35|22.03.2023", "Processed",
				"Cooked Rolls", 18, 1905, "Fish&Chips Roll",
				"Levrek i fërguar,Patate të fërguara,tranguj,Majonez me Tartuf/Mbështjellur me Avocado dhe Patate të Fërguara,Salcë Terijaki",
				1170.00);
		order.add(ord40);
		Orders ord41 = new Orders(32311, 1500.00, 3, "10:10|22.03.2023", "12:30|22.03.2023", "Processed", "Salcat", 12,
				2311, "Chinese Hot Sauce", "(ska pershkrim)", 500.00);
		order.add(ord41);
		Orders ord42 = new Orders(21611, 5100.00, 2, "12:00|22.03.2023", "12:40|22.03.2023", "Processed", "Nigiri", 11,
				1611, "Nigiri Mix_III", "11 cope", 2550.00);
		order.add(ord42);
		Orders ord43 = new Orders(42312, 2000.00, 5, "12:05|22.03.2023", "13:05|22.03.2023", "Processed", "Salcat", 12,
				2312, "Truffle Mayonnaise", "(ska pershkrim)", 500.00);
		order.add(ord43);
		Orders ord44 = new Orders(62203, 4320.00, 6, "12:35|22.03.2023", "13:00|22.03.2023", "Processed", "Sushi Roll",
				11, 2203, "Tofu Takuan Roll", "Tofu,Takuan/Mbështjellur me Nori", 720.00);
		order.add(ord44);
		Orders ord45 = new Orders(51303, 7900.00, 5, "12:40|22.03.2023", "13:20|22.03.2023", "Processed",
				"Ushqimi i Detit", 7, 1303, "Salmon në Skarë me Salcë Teriyaki", "(ska pershkrim)", 1580.00);
		order.add(ord45);
		Orders ord46 = new Orders(22401, 1380.00, 2, "12:42|22.03.2023", "14:15|22.03.2023", "Processed", "Desert", 5,
				2401, "BUN'utella", "(ska pershkrim)", 690.00);
		order.add(ord46);
		Orders ord47 = new Orders(31903, 4020.00, 3, "13:30|22.03.2023", "14:40|22.03.2023", "Processed",
				"Coocked Rolls", 18, 1903, "Yuzu Special Roll", "(ska pershkrim)", 1340.00);
		order.add(ord47);
		Orders ord48 = new Orders(22002, 3500.00, 2, "15:00|22.03.2023", "16:00|22.03.2023", "Processed", "Set Menu", 9,
				2002, "ABC Sushi Moriawase",
				"15 copë + Epadame,Kappa Roll 6-cope,Kani Roll 6-cope,California Roll 3-cope", 1750.00);
		order.add(ord48);
		Orders ord49 = new Orders(51402, 6000.00, 5, "15:30|22.03.2023", "16:40|22.03.2023", "Processed",
				"Mishi i Viçit", 6, 1402, "Mish Viçi Djegëse dhe Kërpudha", "(ska pershkrim)", 1200.00);
		order.add(ord49);
		Orders ord50 = new Orders(2903, 1240.00, 2, "18:05|22.03.2023", "18:55|22.03.2023", "Processed", "Oriz", 9, 903,
				"Oriz me Perime", "(ska pershkrim)", 620.00);
		order.add(ord50);
		Orders ord51 = new Orders(51202, 15650.00, 5, "19:15|22.03.2023", "20:20|22.03.2023", "Processed", "Pulë", 10,
				1202, "Bulgogi Pulë në Stilin Korean", "Shërbehet me Oriz", 1020.00);
		order.add(ord51);
		Orders ord52 = new Orders(5602, 6200.00, 5, "20:30|22.03.2023", "21:45|22.03.2023", "Processed", "Sallatat", 9,
				602, "Sallatë Aziatike me Karkaleca Deti Crispy", "(ska pershkrim)", 1240.00);
		order.add(ord52);
		Orders ord53 = new Orders(4906, 3600.00, 4, "08:17|23.03.2023", "12:00|23.03.2023", "Processed", "Oriz", 9, 906,
				"Oriz me Këri dhe Mish Viçi", "(ska pershkrim)", 900.00);
		order.add(ord53);
		Orders ord54 = new Orders(32307, 1500.00, 3, "8:20|23.03.2023", "12:10|23.03.2023", "Processed", "Salcat", 12,
				2307, "Sweet Chili Sos", "(ska pershkrim)", 500.00);
		order.add(ord54);
		Orders ord55 = new Orders(3702, 3720.00, 3, "8:25|23.03.2023", "12:15|23.03.2023", "Processed", "Donburi", 3,
				702, "Donburi me Mish të Patës", "(ska pershkrim)", 1240.00);
		order.add(ord55);
		Orders ord56 = new Orders(4402, 3280.00, 4, "9:00|23.03.2023", "12:30|23.03.2023", "Processed", "Supat", 7, 402,
				"Supë me Fruta Deti", "(ska pershkrim)", 820.00);
		order.add(ord56);
		Orders ord57 = new Orders(3111, 3720.00, 3, "12:00|23.03.2023", "13:10|23.03.2023", "Processed", "Appetizer",
				19, 111, "Tartar Salmoni me Tartuf", "(ska pershkrim)", 1240.00);
		order.add(ord57);
		Orders ord58 = new Orders(3601, 2100.00, 3, "12:05|23.03.2023", "13:20|23.03.2023", "Processed", "Sallatat", 9,
				601, "Sallatë Aziatike", "(ska pershkrim)", 700.00);
		order.add(ord58);
		Orders ord59 = new Orders(4201, 2760.00, 4, "14:30|23.03.2023", "16:00|23.03.2023", "Processed", "Dim Sum", 6,
				201, "Wonton Korean", "4 copë", 690.00);
		order.add(ord59);
		Orders ord60 = new Orders(6813, 8280.00, 6, "15:40|23.03.2023", "16:00|23.03.2023", "Processed", "Noodles", 14,
				813, "Noodles të Stilit Tajlandez me Karkalecë Deti", "(ska pershkrim)", 1240.00);
		order.add(ord60);
		Orders ord61 = new Orders(81306, 12320.00, 8, "18:00|23.03.2023", "18:30|23.03.2023", "Processed",
				"Ushqimi i Detit", 7, 1306, "Oktapod djegës me Perime", "(ska pershkrim)", 1540.00);
		order.add(ord61);
		Orders ord62 = new Orders(41202, 4080.00, 4, "19:35|23.03.2023", "20:20|23.03.2023", "Processed", "Pulë", 10,
				1202, "Bulgogi Pulë në Stilin Korean", "Shërbehet me oriz", 1020.00);
		order.add(ord62);
		Orders ord63 = new Orders(2114, 1520.00, 2, "20:20|23.03.2023", "21:00|23.03.2023", "Processed", "Appetizer",
				19, 114, "Qofte me Karkalecë Deti", "6 copë", 760.00);
		order.add(ord63);
		Orders ord64 = new Orders(42004, 10320.00, 4, "22:00|23.03.2023", "22:45|23.03.2023", "Processed", "Set Menu",
				9, 2004, "Sushi Queen",
				"11 copë +Epadame, Sake Roll 3-cope,Kani Roll 3-cope,Maguro 1-cp,Ebi 1(N/A),Sake 1,Suzuki 1,Kani 1",
				2580.00);
		order.add(ord64);
		for (Orders f : order) {
			System.out.println(f);
		}
		return order;
	}

	public ArrayList<Orders> getOrder() {
		afishoPorosiJavore();
		return order;
	}

	private TreeMap<Integer, Orders> afishoPorosiKlienti() {
		TreeMap<Integer, Orders> ordCl = new TreeMap<Integer, Orders>();
		ordCl.put(10323, new Orders(5109, 4800.00, 5, "8:30|18.03.2023", "12:00|18.03.2023", "Processed", "Appetizer",
				19, 109, "Karkalecë Deti Crispy", "(ska pershkrim)", 960.00));
		ordCl.put(20323, new Orders(3117, 3300.00, 3, "9:00|18.03.2023", "13:30|18.03.2023", "Processed", "Appetizer",
				19, 117, "Salmon & Suzuki Carpaccio", "(ska pershkrim)", 1100.00));
		ordCl.put(30323, new Orders(6104, 4560.00, 6, "10:35|18.03.2023", "13:30|18.03.2023", "Processed", "Appetizer",
				19, 104, "Pulë Kaarage me Parmesan", "(ska pershkrim)", 760.00));
		ordCl.put(30323, new Orders(62602, 7200.00, 6, "10:38|18.03.2023", "13:00|18.03.2023", "Processed", "Sake&Wine",
				2, 2602, "Sake 0.18", "(ska pershkrim)", 1200.00));
		ordCl.put(40323, new Orders(5119, 3800.00, 5, "11:00|18.03.2023", "12:30|18.03.2023", "Processed", "Appetizer",
				19, 119, "Tempura Perimesh", "Perime të Brumosura,tempura të fërguara", 760.00));
		ordCl.put(50323, new Orders(10301, 6200.00, 10, "13:00|18.03.2023", "14:30|18.03.2023", "Processed", "Bun", 3,
				301, "Bun Vici", "ska pershkrim", 620.00));
		ordCl.put(50323, new Orders(62404, 3300.00, 6, "13:05|18.03.2023", "14:30|18.03.2023", "Processed", "Desert", 5,
				2404, "Akullore e Fërguar me Bajame", "(ska pershkrim)", 550.00));
		ordCl.put(50323, new Orders(42702, 880.00, 4, "13:08|18.03.2023", "14:30|18.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2702, "Coca - Cola Zero", "kanace", 220.00));
		ordCl.put(60323, new Orders(2407, 1660.00, 2, "16:30|18.03.2023", null, "Cancel", "Supat", 7,
				407, "Pad Thai", "Supë me Karkaleca Deti", 830.00));
		ordCl.put(70323, new Orders(5303, 3450.00, 5, "16:35|18.03.2023", "17:00|18.03.2023", "Processed", "Bun", 3,
				303, "Bun(Kuleçë) me mish te Patës", "ska pershkrim", 690.00));
		ordCl.put(80323, new Orders(12111, 14880.00, 12, "19:00|18.03.2023", "20:25|18.03.2023", "Processed",
				"Appetizer", 19, 111, "Tartar Salmoni me Tartuf", "(ska pershkrim)", 1240.00));
		ordCl.put(90323, new Orders(15601, 10500.00, 15, "8:00|19.03.2023", "12:00|19.03.2023", "Processed", "Sallatat",
				9, 601, "Sallatë Aziatike", "(ska pershkrim)", 700.00));
		ordCl.put(100323, new Orders(10503, 12900.00, 10, "8:35|19.03.2023", "12:00|19.03.2023", "Processed", "Ramen",
				3, 503, "Ramen - Karkalec", "(ska pershkrim)", 1290.00));
		ordCl.put(100323, new Orders(10605, 8300.00, 10, "10:00|19.03.2023", "11:40|19.03.2023", "Processed",
				"Sallatat", 9, 605, "Sallatë Kani dhe Tranguj", "(ska pershkrim)", 830.00));
		ordCl.put(110323, new Orders(7205, 4830.00, 7, "11:35|19.03.2023", "12:00|19.03.2023", "Processed", "Dim Sum",
				6, 205, "Spring Roll me Mish Pate", "(ska pershkrim)", 690.00));
		ordCl.put(120323, new Orders(5606, 5500.00, 5, "13:00|19.03.2023", "14:10|19.03.2023", "Processed", "Sallatat",
				9, 606, "Sallatë Sashimi", "(ska pershkrim)", 1100.00));
		ordCl.put(130323, new Orders(3602, 3720.00, 3, "13:30|19.03.2023", "14:20|19.03.2023", "Processed", "Sallatat",
				9, 602, "Sallatë Aziatike me Karkaleca Deti Crispy", "(ska pershkrim)", 1240.00));
		ordCl.put(140323, new Orders(4609, 4960.00, 4, "15:35|19.03.2023", "16:00|19.03.2023", "Processed", "Sallatat",
				9, 609, "Sallatë Quinoa me Salmon", "(ska pershkrim)", 1240.00));
		ordCl.put(140323, new Orders(3607, 3720.00, 3, "15:40|19.03.2023", "16:00|19.03.2023", "Processed", "Sallatat",
				9, 607, "Sallatë me fruta të Detit", "(ska pershkrim)", 1240.00));
		ordCl.put(150323, new Orders(8808, 8800.00, 8, "18:30|19.03.2023", "19:10|19.03.2023", "Processed", "Noodles",
				14, 808, "Singapore Noodles me salcë Këri", "(ska pershkrim)", 1100.00));
		ordCl.put(160323, new Orders(5701, 6900.00, 5, "19:45|19.03.2023", "20:30|19.03.2023", "Processed", "Donburi",
				3, 701, "Donburi me ngjalë", "(ska pershkrim)", 1380.00));
		ordCl.put(170323, new Orders(32108, 3390.00, 3, "9:35|20.03.2023", "12:00|20.03.2023", "Processed",
				"Bento Menu", 8, 2108, "Kids Bento",
				"2 Wonton Crispy,6 qofte me Mish Pule,Noodles me Perime,2 Banane te skuqura,Leng frutash", 1130.00));
		ordCl.put(170323, new Orders(32704, 660.00, 3, "9:40|20.03.2023", "11:45|20.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2704, "Sprite", "Sprite", 220.00));
		ordCl.put(180323, new Orders(2118, 2900.00, 2, "10:00|20.03.2023", "12:00|20.03.2023", "Processed", "Appetizer",
				19, 118, "Tempura Mix", "Karkalecë të detit,Kallamari,Bishtaja Crispy", 1450.00));
		ordCl.put(180323, new Orders(2904, 1380.00, 2, "11:05|20.03.2023", "12:00|20.03.2023", "Processed", "Oriz", 9,
				904, "Oriz me Vezë të fërguara", "(ska pershkrim)", 690.00));
		ordCl.put(190323, new Orders(20809, 2200.00, 20, "12:00|20.03.2023", "13:30|20.03.2023", "Processed", "Noodles",
				14, 809, "Udon me Perime dhe Salcë të Hudhrës së Zezë", "(ska pershkrim)", 830.00));
		ordCl.put(200323, new Orders(5801, 5250.00, 5, "12:30|20.03.2023", "13:00|20.03.2023", "Processed", "Noodles",
				14, 801, "Udon Bulgogi Korean Mish Viçi", "(ska pershkrim)", 1050.00));
		ordCl.put(210323, new Orders(5813, 6900.00, 5, "14:03|20.03.2023", "14:30|20.03.2023", "Processed", "Noodles",
				14, 813, "Noodles të Stilit Tajlandez me Karkalecë Deti", "(ska pershkrim)", 1240.00));
		ordCl.put(210323, new Orders(2908, 1660.00, 2, "14:05|20.03.2023", "14:30|20.03.2023", "Processed", "Oriz", 9,
				908, "Oriz i Stilit Tajladez me Ananas", "(ska pershkrim)", 830.00));
		ordCl.put(220323, new Orders(51810, 5150.00, 5, "18:00|20.03.2023", "19:30|20.03.2023", "Processed",
				"Special Rolls", 20, 1810, "Canadian Roll", "6 cope;Kani,Tranguj/Mbeshtjelle me Salmon", 1030.00));
		ordCl.put(230323, new Orders(501301, 71000.00, 50, "21:00|20.03.2023", "22:10|20.03.2023", "Processed",
				"Ushqimi Detit", 7, 1301, "Salmon Tajlandez me Curry", "(ska pershkrim)", 1420.00));
		ordCl.put(240323, new Orders(22105, 4242.00, 2, "7:45|21.03.2023", "11:50|21.03.2023", "Processed",
				"Bento Menu", 8, 2105, "Bento Menu 5",
				"California Roll(6 copë),Philadelphia Roll(6 copë),Kappa Roll(6 copë),Sallatë SushiCo Wakame(alga deti me susam), 1 kanaçe Coca-Cola",
				2120.00));
		ordCl.put(250323, new Orders(42101, 5720.00, 4, "8:20|21.03.2023", "12:00|21.03.2023", "Processed",
				"Bento Menu", 8, 2101, "Bento Menu 1",
				"Spring Roll(1 copë),Mish Viçi me Perime, Oriz me Perime,Sallatë Lakre,Spec djegës, 1 kanaçe Coca-Cola",
				1430.00));
		ordCl.put(260323, new Orders(52005, 15650.00, 5, "9:25|21.03.2023", "12:30|21.03.2023", "Processed", "Set Menu",
				9, 2005, "Sushi King",
				"15 copë;Sake Roll 3,Kani Roll 2,California Roll 3,Maguro 1,Suzuki 1,Sake 1, Ebi 1,Saba 1,Kani 1",
				3130.00));
		ordCl.put(260323, new Orders(32708, 11100.00, 3, "9:26|21.03.2023", "12:30|21.03.2023", "Processed",
				"Pijet e Ftohta", 10, 2708, "Acqua Panna - 0.75ml", "(ska pershkrim)", 370.00));
		ordCl.put(270323,
				new Orders(51816, 5150.00, 5, "17:00|21.03.2023", "17:45|21.03.2023", "Processed", "Special Rolls", 20,
						1816, "Philadelphia Roll",
						"8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbështjellur me Susam", 1030.00));
		ordCl.put(280323,
				new Orders(52007, 15650.00, 5, "20:00|21.03.2023", "21:00|21.03.2023", "Processed", "Set Menu", 9, 2007,
						"Hot Sushi Plate ", "19 copë,Philly Roll 8, Baby Kalamar Roll 5,Sake Ten Roll 6", 3130.00));
		ordCl.put(290323, new Orders(52009, 19100.00, 5, "8:00|22.03.2023", "12:00|22.03.2023", "Processed", "Set Menu",
				9, 2009, "Sushi Prince 2",
				"24 cope;Sesame Maki Roll 6,Manhattan Roll 5,Spicy California Roll 3,Sake Roll 3,Kani Roll 3,Maguro Nigiri 2,Sake Avocado Nigiri 2",
				3820.00));
		ordCl.put(300323, new Orders(51905, 5850.00, 5, "10:05|22.03.2023", "12:35|22.03.2023", "Processed",
				"Cooked Rolls", 18, 1905, "Fish&Chips Roll",
				"Levrek i fërguar,Patate të fërguara,tranguj,Majonez me Tartuf/Mbështjellur me Avocado dhe Patate të Fërguara,Salcë Terijaki",
				1170.00));
		ordCl.put(300323, new Orders(32311, 1500.00, 3, "10:10|22.03.2023", "12:30|22.03.2023", "Processed", "Salcat",
				12, 2311, "Chinese Hot Sauce", "(ska pershkrim)", 500.00));
		ordCl.put(310323, new Orders(21611, 5100.00, 2, "12:00|22.03.2023", "12:40|22.03.2023", "Processed", "Nigiri",
				11, 1611, "Nigiri Mix_III", "11 cope", 2550.00));
		ordCl.put(310323, new Orders(42312, 2000.00, 5, "12:05|22.03.2023", "13:05|22.03.2023", "Processed", "Salcat",
				12, 2312, "Truffle Mayonnaise", "(ska pershkrim)", 500.00));
		ordCl.put(320323, new Orders(62203, 4320.00, 6, "12:35|22.03.2023", "13:00|22.03.2023", "Processed",
				"Sushi Roll", 11, 2203, "Tofu Takuan Roll", "Tofu,Takuan/Mbështjellur me Nori", 720.00));
		ordCl.put(330323, new Orders(51303, 7900.00, 5, "12:40|22.03.2023", "13:20|22.03.2023", "Processed",
				"Ushqimi i Detit", 7, 1303, "Salmon në Skarë me Salcë Teriyaki", "(ska pershkrim)", 1580.00));
		ordCl.put(340323, new Orders(22401, 1380.00, 2, "12:42|22.03.2023", "14:15|22.03.2023", "Processed", "Desert",
				5, 2401, "BUN'utella", "(ska pershkrim)", 690.00));
		ordCl.put(350323, new Orders(31903, 4020.00, 3, "13:30|22.03.2023", "14:40|22.03.2023", "Processed",
				"Coocked Rolls", 18, 1903, "Yuzu Special Roll", "(ska pershkrim)", 1340.00));
		ordCl.put(360323,
				new Orders(22002, 3500.00, 2, "15:00|22.03.2023", "16:00|22.03.2023", "Processed", "Set Menu", 9, 2002,
						"ABC Sushi Moriawase",
						"15 copë + Epadame,Kappa Roll 6-cope,Kani Roll 6-cope,California Roll 3-cope", 1750.00));
		ordCl.put(360323, new Orders(51402, 6000.00, 5, "15:30|22.03.2023", "16:40|22.03.2023", "Processed",
				"Mishi i Viçit", 6, 1402, "Mish Viçi Djegëse dhe Kërpudha", "(ska pershkrim)", 1200.00));
		ordCl.put(370323, new Orders(2903, 1240.00, 2, "18:05|22.03.2023", "18:55|22.03.2023", "Processed", "Oriz", 9,
				903, "Oriz me Perime", "(ska pershkrim)", 620.00));
		ordCl.put(370323, new Orders(51202, 15650.00, 5, "19:15|22.03.2023", "20:20|22.03.2023", "Processed", "Pulë",
				10, 1202, "Bulgogi Pulë në Stilin Korean", "Shërbehet me Oriz", 1020.00));
		ordCl.put(370323, new Orders(5602, 6200.00, 5, "20:30|22.03.2023", "21:45|22.03.2023", "Processed", "Sallatat",
				9, 602, "Sallatë Aziatike me Karkaleca Deti Crispy", "(ska pershkrim)", 1240.00));
		ordCl.put(380323, new Orders(4906, 3600.00, 4, "08:17|23.03.2023", "12:00|23.03.2023", "Processed", "Oriz", 9,
				906, "Oriz me Këri dhe Mish Viçi", "(ska pershkrim)", 900.00));
		ordCl.put(390323, new Orders(32307, 1500.00, 3, "8:20|23.03.2023", "12:10|23.03.2023", "Processed", "Salcat",
				12, 2307, "Sweet Chili Sos", "(ska pershkrim)", 500.00));
		ordCl.put(390323, new Orders(3702, 3720.00, 3, "8:25|23.03.2023", "12:15|23.03.2023", "Processed", "Donburi", 3,
				702, "Donburi me Mish të Patës", "(ska pershkrim)", 1240.00));
		ordCl.put(390323, new Orders(4402, 3280.00, 4, "9:00|23.03.2023", "12:30|23.03.2023", "Processed", "Supat", 7,
				402, "Supë me Fruta Deti", "(ska pershkrim)", 820.00));
		ordCl.put(400323, new Orders(3111, 3720.00, 3, "12:00|23.03.2023", "13:10|23.03.2023", "Processed", "Appetizer",
				19, 111, "Tartar Salmoni me Tartuf", "(ska pershkrim)", 1240.00));
		ordCl.put(400323, new Orders(3601, 2100.00, 3, "12:05|23.03.2023", "13:20|23.03.2023", "Processed", "Sallatat",
				9, 601, "Sallatë Aziatike", "(ska pershkrim)", 700.00));
		ordCl.put(410323, new Orders(4201, 2760.00, 4, "14:30|23.03.2023", "16:00|23.03.2023", "Processed", "Dim Sum",
				6, 201, "Wonton Korean", "4 copë", 690.00));
		ordCl.put(410323, new Orders(6813, 8280.00, 6, "15:40|23.03.2023", "16:00|23.03.2023", "Processed", "Noodles",
				14, 813, "Noodles të Stilit Tajlandez me Karkalecë Deti", "(ska pershkrim)", 1240.00));
		ordCl.put(420323, new Orders(81306, 12320.00, 8, "18:00|23.03.2023", "18:30|23.03.2023", "Processed",
				"Ushqimi i Detit", 7, 1306, "Oktapod djegës me Perime", "(ska pershkrim)", 1540.00));
		ordCl.put(430323, new Orders(41202, 4080.00, 4, "19:35|23.03.2023", "20:20|23.03.2023", "Processed", "Pulë", 10,
				1202, "Bulgogi Pulë në Stilin Korean", "Shërbehet me oriz", 1020.00));
		ordCl.put(430323, new Orders(2114, 1520.00, 2, "20:20|23.03.2023", "21:00|23.03.2023", "Processed", "Appetizer",
				19, 114, "Qofte me Karkalecë Deti", "6 copë", 760.00));
		ordCl.put(440323, new Orders(42004, 10320.00, 4, "22:00|23.03.2023", "22:45|23.03.2023", "Processed",
				"Set Menu", 9, 2004, "Sushi Queen",
				"11 copë +Epadame, Sake Roll 3-cope,Kani Roll 3-cope,Maguro 1-cp,Ebi 1(N/A),Sake 1,Suzuki 1,Kani 1",
				2580.00));
		for (Map.Entry<Integer, Orders> value : ordCl.entrySet()) {
			System.out.println("CustomerId :" + " " + value.getKey() + " " + value.getValue());
		}
		System.out.println("Fshi porosite me statusin 'Cancel' ");
		ordCl.remove(60323);
		System.out.println(ordCl);
		return ordCl;
	}

	public TreeMap<Integer, Orders> getPorosiKlienti() {
		afishoPorosiKlienti();
		return porosiKlienti;
	}
}