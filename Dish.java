package menaxhim.Restoranti;

import java.util.*;

public class Dish extends DishType {
	private int dishId;// kodi ne databaze e entitetit Dish per menune apo pjaten perkatese
	protected String dishName; // sipas llojit emrin perkates te menuse
	protected double dishPrize;// kostoje e cdo menuje
	protected String dishDescription;
	private int dishItemsPerType;// numri i menuve per kategori

	public Dish() {
		dishName = "dishName";
		dishDescription = "dish_Description";
		dishPrize = 456.55;
		dishId = 153;
		dishItemsPerType = 6;
	}

	public Dish(int dishId,String dishType, String dishName, String dishDescription, double dishPrize, 
			int dishItemsPerType) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.dishPrize = dishPrize;
		this.dishItemsPerType = dishItemsPerType;
	}

	private TreeMap<String, String> afishoEmerMenu() {
		System.out.println("Kategoria për çdo menu janë:");
		TreeMap<String, String> menuPerKategori = new TreeMap<String, String>();
		menuPerKategori.put("Appetizer", "Kimchi");
		menuPerKategori.put("Appetizer", "Salmon Tataki");
		menuPerKategori.put("Appetizer", "Tuna Tataki");
		menuPerKategori.put("Appetizer", "Pulë Kaarage me Parmesan");
		menuPerKategori.put("Appetizer", "Misër Tempura");
		menuPerKategori.put("Appetizer", "Edamame me Hudher Djegese");
		menuPerKategori.put("Appetizer", "Edamame");
		menuPerKategori.put("Appetizer", "Baby Kalamari Tempura");
		menuPerKategori.put("Appetizer", "Karkalecë Deti Crispy");
		menuPerKategori.put("Appetizer", "Fish & Chips");
		menuPerKategori.put("Appetizer", "Tartar Salmoni me Tartuf");
		menuPerKategori.put("Appetizer", "Pulë Crispy Appetizer");
		menuPerKategori.put("Appetizer", "Qofte me Mish Pule");
		menuPerKategori.put("Appetizer", "Qofte me Karkalecë Deti");
		menuPerKategori.put("Appetizer", "Shrimp Bomb");
		menuPerKategori.put("Appetizer", "Salmon Carpaccio");
		menuPerKategori.put("Appetizer", "Salmon & Suzuki Carpaccio");
		menuPerKategori.put("Appetizer", "Tempura Mix");
		menuPerKategori.put("Appetizer", "Tempura Perimesh");
		menuPerKategori.put("Dim Sum", "Wonton Korean");
		menuPerKategori.put("Dim Sum", "Spring Roll");
		menuPerKategori.put("Dim Sum", "Dumplings Viçi ne Avull");
		menuPerKategori.put("Dim Sum", "Wonton Crispy");
		menuPerKategori.put("Dim Sum", "Spring Roll me Mish Pate");
		menuPerKategori.put("Dim Sum", "Gyoza me Perime");
		menuPerKategori.put("Bun", "Bun Vici");
		menuPerKategori.put("Bun", "Bun Pule");
		menuPerKategori.put("Bun", "Bun(Kuleçë) me mish te Patës");
		menuPerKategori.put("Supat", "Tom Yum");
		menuPerKategori.put("Supat", "Supë me Fruta Deti");
		menuPerKategori.put("Supat", "Wonton Supë");
		menuPerKategori.put("Supat", "Supë Djegëse dhe e thartë");
		menuPerKategori.put("Supat", "Supë Pule dhe Misri me Shparguj");
		menuPerKategori.put("Supat", "Miso Supë");
		menuPerKategori.put("Supat", "Pad Thai");
		menuPerKategori.put("Ramen", "Ramen me Mish Pule");
		menuPerKategori.put("Ramen", "Ramen me Mish Viçi");
		menuPerKategori.put("Ramen", "Ramen - Karkalec");
		menuPerKategori.put("Sallatat", "Sallatë Aziatike");
		menuPerKategori.put("Sallatat", "Sallatë Aziatike me Karkaleca Deti Crispy");
		menuPerKategori.put("Sallatat", "Sallatë Lakre Djegëse");
		menuPerKategori.put("Sallatat", "Sallatë SushiCO Wakame");
		menuPerKategori.put("Sallatat", "Sallatë Kani dhe Tranguj");
		menuPerKategori.put("Sallatat", "Sallatë Sashimi");
		menuPerKategori.put("Sallatat", "Sallatë me fruta të Detit");
		menuPerKategori.put("Sallatat", "Sallatë Quinoa me Edamame");
		menuPerKategori.put("Sallatat", "Sallatë Quinoa me Salmon");
		menuPerKategori.put("Donburi", "Donburi me ngjalë");
		menuPerKategori.put("Donburi", "Donburi me Mish të Patës");
		menuPerKategori.put("Donburi", "Salmon Donburi");
		menuPerKategori.put("Noodles", "Udon Bulgogi Korean Mish Viçi");
		menuPerKategori.put("Noodles", "Udon Bulgogi Korean Pulë");
		menuPerKategori.put("Noodles", "Noodles të thjeshta");
		menuPerKategori.put("Noodles", "Noodles me Perime");
		menuPerKategori.put("Noodles", "Noodles me Pulë");
		menuPerKategori.put("Noodles", "Noodles me Mish Viçi");
		menuPerKategori.put("Noodles", "Noodles me Karkalecë Deti");
		menuPerKategori.put("Noodles", "Singapore Noodles me salcë Këri");
		menuPerKategori.put("Noodles", "Udon me Perime dhe Salcë të Hudhrës së Zezë");
		menuPerKategori.put("Noodles", "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë");
		menuPerKategori.put("Noodles", "Udon me Karkalecë");
		menuPerKategori.put("Noodles", "Noodles të Stilit Tajlandez me mish Pule");
		menuPerKategori.put("Noodles", "Noodles të Stilit Tajlandez me Karkalecë Deti");
		menuPerKategori.put("Noodles", "Noodles të Stilit Tajlandez me Mish Noodles të Stilit japonez");
		menuPerKategori.put("Oriz", "Oriz në Avull");
		menuPerKategori.put("Oriz", "Oriz në Avull");
		menuPerKategori.put("Oriz", "Oriz me Perime");
		menuPerKategori.put("Oriz", "Oriz me Vezë të fërguara");
		menuPerKategori.put("Oriz", "Oriz me Pulë");
		menuPerKategori.put("Oriz", "Oriz me Këri dhe Mish Viçi");
		menuPerKategori.put("Oriz", "Oriz me Mish Viçi");
		menuPerKategori.put("Oriz", "Oriz i Stilit Tajladez me Ananas");
		menuPerKategori.put("Oriz", "Oriz me Karkalecë Deti");
		menuPerKategori.put("Perimet", "Perime të Përzier të Skuqura");
		menuPerKategori.put("Perimet", "Perime të Përzier të Skuqura Djegëse");
		menuPerKategori.put("Perimet", "Brokoli dhe karrote me salcë Hudhre");
		menuPerKategori.put("Poke Bowl", "Salmon Poke Bowl");
		menuPerKategori.put("Poke Bowl", "Salmon & Maguro Poke Bowl");
		menuPerKategori.put("Pulë", "Pulë me Keri të Kuq");
		menuPerKategori.put("Pulë", "Bulgogi Pulë në Stilin Korean");
		menuPerKategori.put("Pulë", "Pulë me Perime");
		menuPerKategori.put("Pulë", "Pulë Crispy");
		menuPerKategori.put("Pulë", "Pulë Sweet&Sour");
		menuPerKategori.put("Pulë", "Pulë me salcë Djegëse");
		menuPerKategori.put("Pulë", "Pulë Manc hurian");
		menuPerKategori.put("Pulë", "Pulë Crispy me Xhenxherfil");
		menuPerKategori.put("Pulë", "Pulë General Tso");
		menuPerKategori.put("Pulë", "Pulë Tajlandeze me Arra Indiane");
		menuPerKategori.put("Ushqimi i Detit", "Salmon Tajlandez me Curry");
		menuPerKategori.put("Ushqimi i Detit", "Salmon në Avull");
		menuPerKategori.put("Ushqimi i Detit", "Salmon në Skarë me Salcë Teriyaki");
		menuPerKategori.put("Ushqimi i Detit", "Kalamari Djegëse me Arra Indiane");
		menuPerKategori.put("Ushqimi i Detit", "Karkalecë Deti me Tempura");
		menuPerKategori.put("Ushqimi i Detit", "Oktapod djegës me Perime");
		menuPerKategori.put("Ushqimi i Detit", "Kalamarë Deti me Arra Indiane");
		menuPerKategori.put("Mishi i Viçit", "Bulgogi Koreane me Mish Viçi");
		menuPerKategori.put("Mishi i Viçit", "Mish Viçi Djegëse dhe Kërpudha");
		menuPerKategori.put("Mishi i Viçit", "Mish Viçi me Perime");
		menuPerKategori.put("Mishi i Viçit", "Mish Viçi me Speca të gjelbërta te pra hollë");
		menuPerKategori.put("Mishi i Viçit", "Mish Viçi me Hudhër të Zezë");
		menuPerKategori.put("Mishi i Viçit", "Mish Viçi i Stilit Tajlandez me Chilli dhe Borzilok");
		menuPerKategori.put("Patë", "Patë Crispy_1");
		menuPerKategori.put("Patë", "Patë Crispy_2");
		menuPerKategori.put("Patë", "Donburi me Mish Pate");
		menuPerKategori.put("Nigiri", "Tamago Omlet");
		menuPerKategori.put("Nigiri", "Maguro");
		menuPerKategori.put("Nigiri", "Karkalecë");
		menuPerKategori.put("Nigiri", "Suzuki Levrek");
		menuPerKategori.put("Nigiri", "Sake");
		menuPerKategori.put("Nigiri", "Sake Avocado");
		menuPerKategori.put("Nigiri", "Unagi");
		menuPerKategori.put("Nigiri", "Ebi Tempura");
		menuPerKategori.put("Nigiri", "Nigiri Mix_I");
		menuPerKategori.put("Nigiri", "Nigiri Mix_II");
		menuPerKategori.put("Nigiri", "Nigiri Mix_III");
		menuPerKategori.put("Sashimi Set", "Set Sake");
		menuPerKategori.put("Sashimi Set", "Maguro");
		menuPerKategori.put("Sashimi Set", "Sashimi Mix");
		menuPerKategori.put("Sashimi Set", "Sake & Maguro");
		menuPerKategori.put("Sashimi Set", "Deluxe Set");
		menuPerKategori.put("Special Rolls", "Forest Roll");
		menuPerKategori.put("Special Rolls", "Kani Salad Roll");
		menuPerKategori.put("Special Rolls", "Smoked Salmon Truffle Roll");
		menuPerKategori.put("Special Rolls", "Smoked Salmon Roll");
		menuPerKategori.put("Special Rolls", "Fire Salmon");
		menuPerKategori.put("Special Rolls", "Spicy Philadelphia Roll");
		menuPerKategori.put("Special Rolls", "San Diego Roll");
		menuPerKategori.put("Special Rolls", "Spicy California Roll");
		menuPerKategori.put("Special Rolls", "Ebi California Roll");
		menuPerKategori.put("Special Rolls", "Canadian Roll");
		menuPerKategori.put("Special Rolls", "Sesame Maki Roll");
		menuPerKategori.put("Special Rolls", "California Roll");
		menuPerKategori.put("Special Rolls", "Rainbow Roll");
		menuPerKategori.put("Special Rolls", "Quinoa Avocado Roll");
		menuPerKategori.put("Special Rolls", "Two Way Salmon Roll");
		menuPerKategori.put("Special Rolls", "Philadelphia Roll");
		menuPerKategori.put("Special Rolls", "Tiger Roll");
		menuPerKategori.put("Special Rolls", "Spicy Maguro Avocado");
		menuPerKategori.put("Special Rolls", "Veggie Roll");
		menuPerKategori.put("Special Rolls", "Crunchy Roll");//
		menuPerKategori.put("Cooked Rolls", "Crazy Philly Roll");
		menuPerKategori.put("Cooked Rolls", "Kyoto Roll");
		menuPerKategori.put("Cooked Rolls", "Yuzu Special Roll");
		menuPerKategori.put("Cooked Rolls", "SuchiCo Roll");
		menuPerKategori.put("Cooked Rolls", "Fish&Chips Roll");
		menuPerKategori.put("Cooked Rolls", "Ebi Ten Roll");
		menuPerKategori.put("Cooked Rolls", "Samuria Roll");
		menuPerKategori.put("Cooked Rolls", "Salmon Aburi Roll");
		menuPerKategori.put("Cooked Rolls", "Ebi Tempura Roll with Truffle");
		menuPerKategori.put("Cooked Rolls", "Chicken Teriyaki Roll");
		menuPerKategori.put("Cooked Rolls", "Sake Ten Roll");
		menuPerKategori.put("Cooked Rolls", "Phily Roll");
		menuPerKategori.put("Cooked Rolls", "Jungle Roll");
		menuPerKategori.put("Cooked Rolls", "Tempura Sake Maki Roll");
		menuPerKategori.put("Cooked Rolls", "Dragon Roll");
		menuPerKategori.put("Cooked Rolls", "Tokyo Drift Roll");
		menuPerKategori.put("Cooked Rolls", "Special Salmon Roll");
		menuPerKategori.put("Cooked Rolls", "Shrimp Bomb Roll");
		menuPerKategori.put("Set Menu", "Tempura Shrimp Plate ");
		menuPerKategori.put("Set Menu", "ABC Sushi Moriawase ");
		menuPerKategori.put("Set Menu", "California Dream ");
		menuPerKategori.put("Set Menu", "Sushi Queen");
		menuPerKategori.put("Set Menu", "Sushi King");
		menuPerKategori.put("Set Menu", "Salmon Lovers ");
		menuPerKategori.put("Set Menu", "Hot Sushi Plate ");
		menuPerKategori.put("Set Menu", "Sushi Prince 1 ");
		menuPerKategori.put("Set Menu", "Sushi Prince 2");//
		menuPerKategori.put("Bento Menu", "Bento Menu 1");
		menuPerKategori.put("Bento Menu", "Bento Menu 2");
		menuPerKategori.put("Bento Menu", "Bento Menu 3");
		menuPerKategori.put("Bento Menu", "Bento Menu 4");
		menuPerKategori.put("Bento Menu", "Bento Menu 5");
		menuPerKategori.put("Bento Menu", "Bento Menu 6");
		menuPerKategori.put("Bento Menu", "Bento Menu Vegjetariane");
		menuPerKategori.put("Bento Menu", "Kids Bento");//
		menuPerKategori.put("Sushi Roll", "Kappa Roll");
		menuPerKategori.put("Sushi Roll", "Maguro Roll ");
		menuPerKategori.put("Sushi Roll", "Tofu Takuan Roll");
		menuPerKategori.put("Sushi Roll", "Ebi Roll");
		menuPerKategori.put("Sushi Roll", "Kani Roll");
		menuPerKategori.put("Sushi Roll", "Sake Roll");
		menuPerKategori.put("Sushi Roll", "Unagi Roll");
		menuPerKategori.put("Sushi Roll", "Avocado Ebi Roll");
		menuPerKategori.put("Sushi Roll", "Avocado Sake Roll");
		menuPerKategori.put("Sushi Roll", "Unagi Avicado Roll");
		menuPerKategori.put("Sushi Roll", "Quinoa Sake Roll");
		menuPerKategori.put("Sushi Roll", "Quinoa California Roll");
		menuPerKategori.put("Salcat", "Ginger");
		menuPerKategori.put("Salcat", "Sweet Sour Sauce");
		menuPerKategori.put("Salcat", "Wasabi");
		menuPerKategori.put("Salcat", "Sriracha");
		menuPerKategori.put("Salcat", "Teriyaka Sauce");
		menuPerKategori.put("Salcat", "Samurai Sauce");
		menuPerKategori.put("Salcat", "Sweet Chili Sos");
		menuPerKategori.put("Salcat", "Hoisin Sauce");
		menuPerKategori.put("Salcat", "Plum Sauce");
		menuPerKategori.put("Salcat", "Pancake");
		menuPerKategori.put("Salcat", "Chinese Hot Sauce");
		menuPerKategori.put("Salcat", "Truffle Mayonnaise");
		menuPerKategori.put("Desert", "BUN'utella ");
		menuPerKategori.put("Desert", "Akullore e Fërguar");
		menuPerKategori.put("Desert", "Ananas i fërguar me Kanellë");
		menuPerKategori.put("Desert", "Akullore e Fërguar me Bajame");
		menuPerKategori.put("Desert", "Arra të Karamelizuara");
		menuPerKategori.put("Birrë", "Asahi Birrë");
		menuPerKategori.put("Birrë", "Corona");
		menuPerKategori.put("Birrë", "Tuborg");
		menuPerKategori.put("Sake & Wine", "Sake 0.75");
		menuPerKategori.put("Sake & Wine", "Sake 0.18");
		menuPerKategori.put("Pijet e Ftohta", "Coca - Cola");
		menuPerKategori.put("Pijet e Ftohta", "Coca - Cola Zero");
		menuPerKategori.put("Pijet e Ftohta", "Fanta");
		menuPerKategori.put("Pijet e Ftohta", "Sprite");
		menuPerKategori.put("Pijet e Ftohta", "Schweppes");
		menuPerKategori.put("Pijet e Ftohta", "RedBull");
		menuPerKategori.put("Pijet e Ftohta", "Acqua Panna - 0.25ml");
		menuPerKategori.put("Pijet e Ftohta", "Acqua Panna - 0.75ml");
		menuPerKategori.put("Pijet e Ftohta", "San Pellegrino - 0.25ml");
		menuPerKategori.put("Pijet e Ftohta", "San Pellegrino");

		Set<Map.Entry<String, String>> set = menuPerKategori.entrySet();
		for (Map.Entry<String, String> vl : set) {
			System.out.print(vl.getValue() + " --> ");
			System.out.println(vl.getKey());
		}
		System.out.println();
		return menuPerKategori;
	}

	public String getDishName() {
		afishoEmerMenu();
		return dishName;
	}

	private TreeMap<String, String> afishoPershkrimMenu() {
		System.out.println("Ingredientet apo Pershkrimet perkatese per çdo menu");
		TreeMap<String, String> ingredientMenu = new TreeMap<String, String>();
		ingredientMenu.put("(ska pershkrim)", "Kimchi");
		ingredientMenu.put("(ska pershkrim)", "Salmon Tataki");
		ingredientMenu.put("(ska pershkrim)", "Tuna Tataki");
		ingredientMenu.put("(ska pershkrim)", "Pulë Kaarage me Parmesan");
		ingredientMenu.put("(ska pershkrim)", "Misër Tempura");
		ingredientMenu.put("(ska pershkrim)", "Edamame");
		ingredientMenu.put("(ska pershkrim)", "Edamame me Hudher Djegese");
		ingredientMenu.put("(ska pershkrim)", "Baby Kalamari Tempura");
		ingredientMenu.put("(ska pershkrim)", "Karkalecë Deti Crispy");
		ingredientMenu.put("(ska pershkrim)", "Fish & Chips");
		ingredientMenu.put("(ska pershkrim)", "Tartar Salmoni me Tartuf");
		ingredientMenu.put("8 copë", "Pulë Crispy Appetizer");
		ingredientMenu.put("8 copë", "Qofte me Mish Pule");
		ingredientMenu.put("6 copë", "Qofte me Karkalecë Deti");
		ingredientMenu.put("(ska pershkrim)", "Shrimp Bomb");
		ingredientMenu.put("(ska pershkrim)", "Salmon Carpaccio");
		ingredientMenu.put("(ska pershkrim)", "Salmon & Suzuki Carpaccio");
		ingredientMenu.put("Karkalecë të detit,Kallamari,Bishtaja Crispy", "Tempura Mix");
		ingredientMenu.put("Perime të Brumosura,tempura të fërguara", "Tempura Perimesh");
		ingredientMenu.put("4 cope", "Wonton Korean");
		ingredientMenu.put("2 cope", "Spring Roll");
		ingredientMenu.put("5 cope", "Dumplings Viçi ne Avull");
		ingredientMenu.put("4 cope", "Wonton Crispy");
		ingredientMenu.put("(ska pershkrim)", "Spring Roll me Mish Pate");
		ingredientMenu.put("4 cope", "Gyoza me Perime");
		ingredientMenu.put("Bun", "Bun Vici");
		ingredientMenu.put("Bun", "Bun Pule");
		ingredientMenu.put("Bun", "Bun(Kuleçë) me mish te Patës");
		ingredientMenu.put("Supë me Karkaleca Deti", "Tom Yum");
		ingredientMenu.put("ska pershkrim", "Supë me Fruta Deti");
		ingredientMenu.put("ska pershkrim", "Wonton Supë");
		ingredientMenu.put("ska pershkrim", "Supë Djegëse dhe e thartë");
		ingredientMenu.put("ska pershkrim", "Supë Pule dhe Misri me Shparguj");
		ingredientMenu.put("(ska pershkrim)", "Miso Supë");
		ingredientMenu.put("Supë me Karkaleca Deti", "Pad Thai");
		ingredientMenu.put("(ska pershkrim)", "Ramen me Mish Pule");
		ingredientMenu.put("(ska pershkrim)", "Ramen me Mish Viçi");
		ingredientMenu.put("(ska pershkrim)", "Ramen - Karkalec");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Aziatike");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Aziatike me Karkaleca Deti Crispy");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Lakre Djegëse");
		ingredientMenu.put("(ska pershkrim)", "Sallatë SushiCO Wakame");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Kani dhe Tranguj");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Sashimi");
		ingredientMenu.put("(ska pershkrim)", "Sallatë me fruta të Detit");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Quinoa me Edamame");
		ingredientMenu.put("(ska pershkrim)", "Sallatë Quinoa me Salmon");
		ingredientMenu.put("(ska pershkrim)", "Donburi me ngjalë");
		ingredientMenu.put("(ska pershkrim)", "Donburi me Mish të Patës");
		ingredientMenu.put("(ska pershkrim)", "Salmon Donburi");
		ingredientMenu.put("(ska pershkrim)", "Udon Bulgogi Korean Mish Viçi");
		ingredientMenu.put("(ska pershkrim)", "Udon Bulgogi Korean Pulë");
		ingredientMenu.put("(ska pershkrim)", "Noodles të thjeshta");
		ingredientMenu.put("(ska pershkrim)", "Noodles me Perime");
		ingredientMenu.put("(ska pershkrim)", "Noodles me Pulë");
		ingredientMenu.put("(ska pershkrim)", "Noodles me Mish Viçi");
		ingredientMenu.put("(ska pershkrim)", "Noodles me Karkalecë Deti");
		ingredientMenu.put("(ska pershkrim)", "Singapore Noodles me salcë Këri");
		ingredientMenu.put("(ska pershkrim)", "Udon me Perime dhe Salcë të Hudhrës së Zezë");
		ingredientMenu.put("(ska pershkrim)", "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë");
		ingredientMenu.put("(ska pershkrim)", "Udon me Karkalecë");
		ingredientMenu.put("(ska pershkrim)", "Noodles të Stilit Tajlandez me mish Pule");
		ingredientMenu.put("(ska pershkrim)", "Noodles të Stilit Tajlandez me Karkalecë Deti");
		ingredientMenu.put("(ska pershkrim)", "Noodles të Stilit Tajlandez me Mish Noodles të Stilit japonez");
		ingredientMenu.put("150 gr", "Oriz në Avull");
		ingredientMenu.put("300 gr", "Oriz në Avull");
		ingredientMenu.put("(ska pershkrim)", "Oriz me Perime");
		ingredientMenu.put("(ska pershkrim)", "Oriz me Vezë të fërguara");
		ingredientMenu.put("(ska pershkrim)", "Oriz me Pulë");
		ingredientMenu.put("(ska pershkrim)", "Oriz me Këri dhe Mish Viçi");
		ingredientMenu.put("ska pershkrim", "Oriz me Mish Viçi");
		ingredientMenu.put("ska pershkrim", "Oriz i Stilit Tajladez me Ananas");
		ingredientMenu.put("ska pershkrim", "Oriz me Karkalecë Deti");
		ingredientMenu.put("ska pershkrim", "Perime të Përzier të Skuqura");
		ingredientMenu.put("(ska pershkrim)", "Perime të Përzier të Skuqura Djegëse");
		ingredientMenu.put("(ska pershkrim)", "Brokoli dhe karrote me salcë Hudhre");
		ingredientMenu.put("(ska pershkrim)", "Salmon Poke Bowl");
		ingredientMenu.put("(ska pershkrim)", "Salmon & Maguro Poke Bowl");
		ingredientMenu.put("Shërbehet me Oriz", "Pulë me Keri të Kuq");
		ingredientMenu.put("Shërbehet me Oriz", "Bulgogi Pulë në Stilin Korean");
		ingredientMenu.put("(ska pershkrim)", "Pulë me Perime");
		ingredientMenu.put("(ska pershkrim)", "Pulë Crispy");
		ingredientMenu.put("(ska pershkrim)", "Pulë Sweet&Sour");
		ingredientMenu.put("(ska pershkrim)", "Pulë me salcë Djegëse");
		ingredientMenu.put("(ska pershkrim)", "Pulë Manc hurian");
		ingredientMenu.put("(ska pershkrim)", "Pulë Crispy me Xhenxherfil");
		ingredientMenu.put("(ska pershkrim)", "Pulë General Tso");
		ingredientMenu.put("(ska pershkrim)", "Pulë Tajlandeze me Arra Indiane");
		ingredientMenu.put("(ska pershkrim)", "Salmon Tajlandez me Curry");
		ingredientMenu.put("(ska pershkrim)", "Salmon në Avull");
		ingredientMenu.put("(ska pershkrim)", "Salmon në Skarë me Salcë Teriyaki");
		ingredientMenu.put("(ska pershkrim)", "Kalamari Djegëse me Arra Indiane");
		ingredientMenu.put("(ska pershkrim)", "Karkalecë Deti me Tempura");
		ingredientMenu.put("(ska pershkrim)", "Oktapod djegës me Perime");
		ingredientMenu.put("(ska pershkrim)", "Kalamarë Deti me Arra Indiane");
		ingredientMenu.put("Sherbehet me Oriz", "Bulgogi Koreane me Mish Viçi");
		ingredientMenu.put("(ska pershkrim)", "Mish Viçi, Djegëse dhe Kërpudha");
		ingredientMenu.put("(ska pershkrim)", "Mish Viçi me Perime");
		ingredientMenu.put("(ska pershkrim)", "Mish Viçi me Speca të gjelbërta te pra hollë");
		ingredientMenu.put("(ska pershkrim)", "Mish Viçi me Hudhër të Zezë");
		ingredientMenu.put("(ska pershkrim)", "Mish Viçi i Stilit Tajlandez me Chilli dhe Borzilok");
		ingredientMenu.put("Serviret gjysem_Patë", "Patë Crispy_1");
		ingredientMenu.put("Serviret Çerek_Pate", "Patë Crispy_2");
		ingredientMenu.put("(ska pershkrim)", "Donburi me Mish Pate");
		ingredientMenu.put("Omletet", "Tamago");
		ingredientMenu.put("Tuna", "Maguro");
		ingredientMenu.put("Shrimp", "Karkalecë Deti");
		ingredientMenu.put("Levrek", "Suzuki");
		ingredientMenu.put("Salmon", "Sake");
		ingredientMenu.put("Sakmon dhe Avocado", "Sake Avocado");
		ingredientMenu.put("Ngjale", "Unagi");
		ingredientMenu.put("Karkalece Crispy", "Ebi Tempura");
		ingredientMenu.put("7 cope", "Nigiri Mix_I");
		ingredientMenu.put("9 cope", "Nigiri Mix_II");
		ingredientMenu.put("11 cope", "Nigiri Mix_III");
		ingredientMenu.put("Salmon-12 fetë", "Set Sake");
		ingredientMenu.put("Tuna-12 fetë", "Maguro");
		ingredientMenu.put("12-cope", "Sashimi Mix");
		ingredientMenu.put("12 cope", "Sake & Maguro");
		ingredientMenu.put("13-cope", "Deluxe Set");
		ingredientMenu.put("8 cope;Kastravec/Mb⌂shtjellë me Salmon,Salcë Yuzu,Miso,Gjethe Krokante,Lakër Jeshile",
				"Forest Roll");
		ingredientMenu.put("8 cope;Katravec,Avocado/Sallatë Kani,Onion Rings,Salcë Djegëse", "Kani Salad Roll");
		ingredientMenu.put("(ska pershkrim)", "Smoked Salmon Truffle Roll");
		ingredientMenu.put("Salmon i Tymosur,Krem Djathë,Kastravec/Mbështjellë me Salmon të Tymosur dhe Kaperi",
				"Smoked Salmon Roll");
		ingredientMenu.put(
				"6 cope;Avocado,Krem Djathë,Sallatë Jeshile/Mbështjellë me Salmon,majonez djegës,Micro Greens",
				"Fire Salmon");
		ingredientMenu.put("8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbeshtjellë me Susam",
				"Spicy Philadelphia Roll");
		ingredientMenu.put("6 copë;Salmon,Avocado,Tranguj/Mbështjellë me Masago", "San Diego Roll");
		ingredientMenu.put("8 copë;Kani,Avocado,Cucumber,Majoneze Lattuce/Mbeshtjelle me Tobikko Sushi",
				"Spicy California Roll");
		ingredientMenu.put("(ska pershkrim)", "Ebi California Roll");
		ingredientMenu.put("6 cope;Kani,Tranguj/Mbeshtjelle me Salmon", "Canadian Roll");
		ingredientMenu.put("8 copë;Karkalecë Deti,Avocado,Tranguj,Majonezë,Sallatë e Gjelbërt/Mbështjellë me Susam",
				"Sesame Maki Roll");
		ingredientMenu.put("8 cope;Kani,Avocado,Tranguj,Majonezë,Sallatë jeshile/Mbështjellë me Tobikko",
				"California Roll");
		ingredientMenu.put("6 copë;Kani,Tranguj/Mbështjellë me Salmon ,Levrek,Tuna dhe Avocado", "Rainbow Roll");
		ingredientMenu.put(
				"6 copë;Quinoa,Goma Wakame(alga Deti me Susam),Shparguj,Karrotë,Arra të Pjekura/Mbështjellur me Avocado,",
				"Quinoa Avocado Roll");
		ingredientMenu.put(
				"5 copë;Salmon,Tranguj,Krem Djathi/Mbështjellur me Salmon të Tymosur,Salcë Ponzu,Salcë Teriyaki & Salcë Sriracha",
				"Two Way Salmon Roll");
		ingredientMenu.put("8 copë;Sallatë e gjelbërt,Tranguj,Salmon,Krem Djathi/Mbështjellur me Susam",
				"Philadelphia Roll");
		ingredientMenu.put("5 copë;Ngjalë,Avocado,Tranguj,Krem Djathi,Salcë Djegëse/Mbështjellur me Karkalec♪7 Deti",
				"Tiger Roll");
		ingredientMenu.put("6 copë;Tuna ,Tartar/Mbështjellur me Avocado", "Spicy Maguro Avocado");
		ingredientMenu.put("8 copë;Avocado,Karrota,Kastravec,Shparguj,Sallate Jeshile/Mbështjellë me Susam",
				"Veggie Roll");
		ingredientMenu.put("5 copë;Sallatë Kani,Tamago,Tranguj,Majoneze,Therrime/Mbështjellë me Tobikko",
				"Crunchy Roll");//
		ingredientMenu.put("8 copë , Kani,Avocado,Krem Djathë/Mbështjellë me Salmon Djegës", "Crazy Philly Roll");
		ingredientMenu.put("(ska pershkrim)", "Kyoto Roll");
		ingredientMenu.put("(ska pershkrim)", "Yuzu Special Roll");
		ingredientMenu.put(
				"5 copë;Karkalecë,Tempura , Avocado,Majonezë,Tranguj,Masago/Mbështjellë me Salmon Crispy dhe Salcë Teriyaki",
				"SuchiCo Roll");
		ingredientMenu.put(
				"Levrek i fërguar,Patate të fërguara,tranguj,Majonez me Tartuf/Mbështjellur me Avocado dhe Patate të Fërguara,Salcë Terijaki",
				"Fish&Chips Roll");
		ingredientMenu.put("5 copë;Karkalecë,Tempura , Avocado,Majonezë,Masago/Mbështjellë me Susam", "Ebi Ten Roll");
		ingredientMenu.put("8 copë;Karkalecë Tempura,Avocado,Sallatë e Gjelbërt/Mbështjellë me Susam dhe Massago",
				"Samuria Roll");
		ingredientMenu.put("Karkalecë i skuqur,Shparguj/Mbështjellë me Salmon ,Wasabi,Delight Salcë,Kaperi",
				"Salmon Aburi Roll");
		ingredientMenu.put(
				"8 copë,Karkalec Deti Crispy,Avocado,Tranguj/Mbështjellur me Majonezë Tartufi,Patate Crispy,Salcë Teriyaki,Susam i Bardhë dhe i Zi",
				"Ebi Tempura Roll with Truffle");
		ingredientMenu.put("Pulë Tempura,Majonezë,Lakër e Bardhë/Mbështjellur me Susam,Qepë Crispy & Salcë Teryaki",
				"Chicken Teriyaki Roll");
		ingredientMenu.put("6 copë;Salmon Tempura,Avocado,Tranguj,Majonez,Sallatë e Gjelbërt/Mbështjellur me Massago",
				"Sake Ten Roll");
		ingredientMenu.put("8 copë;Kani,Avocado,Krem Djathi,Pjesa e jashtme e fërguar ne Brum dhe Salcë Teriyaki",
				"Phily Roll");
		ingredientMenu.put("8 copë;Ngjalë,Avocado,Shparguj,Krem Djathi/Mbështjellur me Goma Wakame(alga Deti me Susam)",
				"Jungle Roll");
		ingredientMenu.put("(ska Pershkrim)", "Tempura Sake Maki Roll");
		ingredientMenu.put("6 copë;Avocado,Tranguj/Mbështjellur me Ngjalë dhe Salcë Teriyaki", "Dragon Roll");
		ingredientMenu.put("8 copë;Salmon Tempura,Avocado,Tranguj/Mbështjellur me Masago,Patate Crispy",
				"Tokyo Drift Roll");
		ingredientMenu.put("8 copë;Kani,Avocado,Tranguj,Majonezë,Sallatë e Gjelbërt/Mbështjellur me Tobikko",
				"Special Salmon Roll");
		ingredientMenu.put("8 copë;Tranguj,Takuan,Avocado/Mbështjellur me Karkalecë+ Deti", "Shrimp Bomb Roll");
		ingredientMenu.put("21 copë;Ebi Ten Roll 5,Samurai Roll8,Salmon Aburi 8", "Tempura Shrimp Plate ");
		ingredientMenu.put("15 copë + Epadame,Kappa Roll 6-cope,Kani Roll 6-cope,California Roll 3-cope",
				"ABC Sushi Moriawase ");
		ingredientMenu.put(
				"16 copë;California Roll 4-cope,Spicy California Roll 4-copë,Sesame California 4-copë,Black Sesame California Roll 4-copë",
				"California Dream ");
		ingredientMenu.put(
				"11 copë +Epadame, Sake Roll 3-cope,Kani Roll 3-cope,Maguro 1-cp,Ebi 1(N/A),Sake 1,Suzuki 1,Kani 1",
				"Sushi Queen");
		ingredientMenu.put(
				"15 copë;Sake Roll 3,Kani Roll 2,California Roll 3,Maguro 1,Suzuki 1,Sake 1, Ebi 1,Saba 1,Kani 1",
				"Sushi King");
		ingredientMenu.put("20 copë,San Diego Roll 6,Philadelphia Roll 6,Sake Roll 6,Sake Nigiri 2", "Salmon Lovers ");
		ingredientMenu.put("19 copë,Philly Roll 8, Baby Kalamar Roll 5,Sake Ten Roll 6", "Hot Sushi Plate ");
		ingredientMenu.put(
				"25 cope;California Roll 3,Sakel Roll 3,Kappa Roll 3,Crunchy Roll 5,Sake Nigiri 2,Kani Nigiri 2,Ebi Nigiri 2,SushiCo Wakame Salad",
				"Sushi Prince 1 ");
		ingredientMenu.put(
				"24 cope;Sesame Maki Roll 6,Manhattan Roll 5,Spicy California Roll 3,Sake Roll 3,Kani Roll 3,Maguro Nigiri 2,Sake Avocado Nigiri 2",
				"Sushi Prince 2");//
		ingredientMenu.put(
				"Spring Roll(1 copë),Mish Viçi me Perime, Oriz me Perime,Sallatë Lakre,Spec djegës, 1 kanaçe Coca-Cola",
				"Bento Menu 1");
		ingredientMenu.put(
				"Wonton Crispy(2 copë),Pulë Crispy me xhenxherfil,Noodless me Perime,Sallatë Lakre Djegesë,1 kanaçe Coca-Cola",
				"Bento Menu 2");
		ingredientMenu.put("Edamame Maki Roll me Susam(6 copë),Sake Roll(6 copë), 1 kanace Coca-Cola", "Bento Menu 3");
		ingredientMenu.put(
				"Qofte Pule(4 copë),Noodles me Perime,Ebi Ten Roll(5 copë),Sake Ten Roll(3 copë),1 Kanaçe Coca-Cola",
				"Bento Menu 4");
		ingredientMenu.put(
				"California Roll(6 copë),Philadelphia Roll(6 copë),Kappa Roll(6 copë),Sallatë SushiCo Wakame(alga deti me susam), 1 kanaçe Coca-Cola",
				"Bento Menu 5");
		ingredientMenu.put("Wonton Crispy(2 copë),Pulë Sweet&Sour,Oriz me Perime,Edamame, 1 kanace Coca-Cola",
				"Bento Menu 6");
		ingredientMenu.put(
				"Edamame,Perime të Përziera të skuqura,Oriz me Perime,Kappa Roll(3 copë),Avocado Roll(3 copë), 1 Coca Cola",
				"Bento Menu Vegjetariane");
		ingredientMenu.put("2 Wonton Crispy,6 qofte me Mish Pule,Noodles me Perime,2 Banane te skuqura,Leng frutash",
				"Kids Bento");//
		ingredientMenu.put("(ska pershkrim)", "Kappa Roll");
		ingredientMenu.put("Tuna", "Maguro Roll ");
		ingredientMenu.put("Tofu,Takuan/Mbështjellur me Nori", "Tofu Takuan Roll");
		ingredientMenu.put("Karkalecë", "Ebi Roll");
		ingredientMenu.put("Surimi", "Kani Roll");
		ingredientMenu.put("Salmon", "Sake Roll");
		ingredientMenu.put("Ngjalë", "Unagi Roll");
		ingredientMenu.put("Karkalecë me Avocado", "Avocado Ebi Roll");
		ingredientMenu.put("Salmon dhe Avocado", "Avocado Sake Roll");
		ingredientMenu.put("Ngjalë dhe Avocado", "Unagi Avicado Roll");
		ingredientMenu.put("Salmon,Avocado,Tranguj,Quinoa", "Quinoa Sake Roll");
		ingredientMenu.put("8 copë Quinoa,Kani,Avocado,Tranguj,Majonezë,Tobikko/Mbështjellur me Nori",
				"Quinoa California Roll");
		ingredientMenu.put("(ska pershkrim)", "Ginger");
		ingredientMenu.put("Salcat", "Sweet Sour Sauce");
		ingredientMenu.put("(ska pershkrim)", "Wasabi");
		ingredientMenu.put("(ska pershkrim)", "Sriracha");
		ingredientMenu.put("(ska pershkrim)", "Teriyaka Sauce");
		ingredientMenu.put("(ska pershkrim)", "Samurai Sauce");
		ingredientMenu.put("(ska pershkrim)", "Sweet Chili Sos");
		ingredientMenu.put("(ska pershkrim)", "Hoisin Sauce");
		ingredientMenu.put("(ska pershkrim)", "Plum Sauce");
		ingredientMenu.put("7 copë", "Pancake");
		ingredientMenu.put("(ska pershkrim)", "Chinese Hot Sauce");
		ingredientMenu.put("(ska pershkrim)", "Truffle Mayonnaise");
		ingredientMenu.put("(ska pershkrim)", "BUN'utella ");
		ingredientMenu.put("Vanilla/Chocolate", "Akullore e Fërguar");
		ingredientMenu.put("(ska pershkrim)", "Ananas i fërguar me Kanellë");
		ingredientMenu.put("(ska pershkrim)", "Akullore e Fërguar me Bajame");
		ingredientMenu.put("(ska pershkrim)", "Arra të Karamelizuara");
		ingredientMenu.put("Birrë e importuar Japoneze", "Asahi Birrë");
		ingredientMenu.put("(ska pershkrim)", "Corona");
		ingredientMenu.put("(ska pershkrim)", "Tuborg");
		ingredientMenu.put("(ska pershkrim)", "Sake 0.75");
		ingredientMenu.put("(ska pershkrim)", "Sake 0.18");
		ingredientMenu.put("kanace", "Coca - Cola");
		ingredientMenu.put("kanace", "Coca - Cola Zero");
		ingredientMenu.put("kanace", "Fanta");
		ingredientMenu.put("kanace", "Sprite");
		ingredientMenu.put("kanace", "Schweppes");
		ingredientMenu.put("kanace", "RedBull");
		ingredientMenu.put("(ska pershkrim)", "Acqua Panna - 0.25ml");
		ingredientMenu.put("(ska pershkrim)", "Acqua Panna - 0.75ml");
		ingredientMenu.put("(ska pershkrim)", "San Pellegrino - 0.25ml");
		ingredientMenu.put("(ska pershkrim)", "San Pellegrino - 0.75 ml");

		Set<Map.Entry<String, String>> set = ingredientMenu.entrySet();
		for (Map.Entry<String, String> v : set) {
			System.out.print(v.getValue() + "  ");
			System.out.println(v.getKey());
		}
		System.out.println();
		return ingredientMenu;
	}

	public String getDishDescription() {
		afishoPershkrimMenu();
		return dishDescription;
	}

	private TreeMap<String, Double> afishoCmimiMenu() {
		System.out.println("Kosto në LEK për çdo Menu");
		TreeMap<String, Double> cmimiMenu = new TreeMap<String, Double>();
		cmimiMenu.put("Kimchi", 690.00);
		cmimiMenu.put("Salmon Tataki", 960.00);
		cmimiMenu.put("Tuna Tataki", 900.00);
		cmimiMenu.put("Pulë Kaarage me Parmesan", 760.00);
		cmimiMenu.put("Misër Tempura", 690.00);
		cmimiMenu.put("Edamame me Hudher djegese", 480.00);
		cmimiMenu.put("Edamame", 420.00);
		cmimiMenu.put("Baby Kalamari Tempura", 960.00);
		cmimiMenu.put("Karkalecë Deti Crispy", 960.00);
		cmimiMenu.put("Fish & Chips", 900.00);
		cmimiMenu.put("Tartar Salmoni me Tartuf", 1240.00);
		cmimiMenu.put("Pulë Crispy Appetizer", 480.00);
		cmimiMenu.put("Qofte me Mish Pule", 480.00);
		cmimiMenu.put("Qofte me Karkalecë Deti", 760.00);
		cmimiMenu.put("Shrimp Bomb", 880.00);
		cmimiMenu.put("Salmon Carpaccio", 1170.00);
		cmimiMenu.put("Salmon & Suzuki Carpaccio", 1100.00);
		cmimiMenu.put("Tempura Mix", 1450.00);
		cmimiMenu.put("Tempura Perimesh", 760.00);
		cmimiMenu.put("Wonton Korean", 690.00);
		cmimiMenu.put("Spring Roll", 550.00);
		cmimiMenu.put("Dumplings Viçi ne Avull", 620.00);
		cmimiMenu.put("Wonton Crispy", 550.00);
		cmimiMenu.put("Spring Roll me Mish Pate", 690.00);
		cmimiMenu.put("Gyoza me Perime", 480.00);
		cmimiMenu.put("Bun Vici", 620.00);
		cmimiMenu.put("Bun Pule", 550.00);
		cmimiMenu.put("Bun(Kuleçë) me mish te Patës", 690.00);
		cmimiMenu.put("Tom Yum", 780.00);
		cmimiMenu.put("Supë me Fruta Deti", 820.00);
		cmimiMenu.put("Wonton Supë", 480.00);
		cmimiMenu.put("Supë Djegëse dhe e thartë", 530.00);
		cmimiMenu.put("Supë Pule dhe Misri me Shparguj", 520.00);
		cmimiMenu.put("Miso Supë", 550.00);
		cmimiMenu.put("Pad Thai", 830.00);
		cmimiMenu.put("Ramen me Mish Pule", 1000.00);
		cmimiMenu.put("Ramen me Mish Viçi", 1150.00);
		cmimiMenu.put("Ramen - Karkalec", 1290.00);
		cmimiMenu.put("Sallatë Aziatike", 700.00);
		cmimiMenu.put("Sallatë Aziatike me Karkaleca Deti Crispy", 1240.00);
		cmimiMenu.put("Sallatë Lakre Djegëse", 410.00);
		cmimiMenu.put("Sallatë SushiCO Wakame", 690.00);
		cmimiMenu.put("Sallatë Kani dhe Tranguj", 830.00);
		cmimiMenu.put("Sallatë Sashimi", 1100.00);
		cmimiMenu.put("Sallatë me fruta të Detit", 1240.00);
		cmimiMenu.put("Sallatë Quinoa me Edamame", 690.00);
		cmimiMenu.put("Sallatë Quinoa me Salmon", 1240.00);
		cmimiMenu.put("Donburi me ngjalë", 1380.00);
		cmimiMenu.put("Donburi me Mish të Patës", 1240.00);
		cmimiMenu.put("Salmon Donburi", 1240.00);
		cmimiMenu.put("Udon Bulgogi Korean Mish Viçi", 1050.00);
		cmimiMenu.put("Udon Bulgogi Korean Pulë", 930.00);
		cmimiMenu.put("Noodles të thjeshta", 480.00);
		cmimiMenu.put("Noodles me Perime", 620.00);
		cmimiMenu.put("Noodles me Pulë", 760.00);
		cmimiMenu.put("Noodles me Mish Viçi", 960.00);
		cmimiMenu.put("Noodles me Karkalecë Deti", 1030.00);
		cmimiMenu.put("Singapore Noodles me salcë Këri", 1100.00);
		cmimiMenu.put("Udon me Perime dhe Salcë të Hudhrës së Zezë", 830.00);
		cmimiMenu.put("Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë", 1100.00);
		cmimiMenu.put("Udon me Karkalecë", 1230.00);
		cmimiMenu.put("Noodles të Stilit Tajlandez me mish Pule", 1100.00);
		cmimiMenu.put("Noodles të Stilit Tajlandez me Karkalecë Deti", 1240.00);
		cmimiMenu.put("Noodles të Stilit Tajlandez me Mish Noodles të Stilit japonez", 1380.00);
		cmimiMenu.put("Oriz në Avull", 280.00);
		cmimiMenu.put("Oriz në Avull", 410.00);
		cmimiMenu.put("Oriz me Perime", 620.00);
		cmimiMenu.put("Oriz me Vezë të fërguara", 690.00);
		cmimiMenu.put("Oriz me Pulë", 830.00);
		cmimiMenu.put("Oriz me Këri dhe Mish Viçi", 900.00);
		cmimiMenu.put("Oriz me Mish Viçi", 900.00);
		cmimiMenu.put("Oriz i Stilit Tajladez me Ananas", 830.00);
		cmimiMenu.put("Oriz me Karkalecë Deti", 960.00);
		cmimiMenu.put("Perime të Përzier të Skuqura", 620.00);
		cmimiMenu.put("Perime të Përzier të Skuqura Djegëse", 620.00);
		cmimiMenu.put("Brokoli dhe karrote me salcë Hudhre", 690.00);
		cmimiMenu.put("Salmon Poke Bowl", 1380.00);
		cmimiMenu.put("Salmon & Maguro Poke Bowl", 1380.00);
		cmimiMenu.put("Pulë me Keri të Kuq", 1080.00);
		cmimiMenu.put("Bulgogi Pulë në Stilin Korean", 1020.00);
		cmimiMenu.put("Pulë me Perime", 840.00);
		cmimiMenu.put("Pulë Crispy", 960.00);
		cmimiMenu.put("Pulë Sweet&Sour", 960.00);
		cmimiMenu.put("Pulë me salcë Djegëse", 960.00);
		cmimiMenu.put("Pulë Manc hurian", 1030.00);
		cmimiMenu.put("Pulë Crispy me Xhenxherfil", 1130.00);
		cmimiMenu.put("Pulë General Tso", 1180.00);
		cmimiMenu.put("Pulë Tajlandeze me Arra Indiane", 1120.00);
		cmimiMenu.put("Salmon Tajlandez me Curry", 1420.00);
		cmimiMenu.put("Salmon në Avull", 1450.00);
		cmimiMenu.put("Salmon në Skarë me Salcë Teriyaki", 1580.00);
		cmimiMenu.put("Kalamari Djegëse me Arra Indiane", 1450.00);
		cmimiMenu.put("Karkalecë Deti me Tempura", 1580.00);
		cmimiMenu.put("Oktapod djegës me Perime", 1540.00);
		cmimiMenu.put("Kalamarë Deti me Arra Indiane", 1460.00);
		cmimiMenu.put("Bulgogi Koreane me Mish Viçi", 1280.00);
		cmimiMenu.put("Mish Viçi Djegëse dhe Kërpudha", 1200.00);
		cmimiMenu.put("Mish Viçi me Perime", 1240.00);
		cmimiMenu.put("Mish Viçi me Speca të gjelbërta te pra hollë", 1240.00);
		cmimiMenu.put("Mish Viçi me Hudhër të Zezë", 1280.00);
		cmimiMenu.put("Mish Viçi i Stilit Tajlandez me Chilli dhe Borzilok", 1380.00);
		cmimiMenu.put("Patë Crispy_1", 2890.00);
		cmimiMenu.put("Patë Crispy_2", 1520.00);
		cmimiMenu.put("Donburi me Mish Pate", 1240.00);
		cmimiMenu.put("Tamago ", 140.00);
		cmimiMenu.put("Maguro ", 280.00);
		cmimiMenu.put("Karkalecë Deti", 280.00);
		cmimiMenu.put("Suzuki ", 280.00);
		cmimiMenu.put("Sake", 280.00);
		cmimiMenu.put("Sake Avocado", 280.00);
		cmimiMenu.put("Unagi", 410.00);
		cmimiMenu.put("Ebi Tempura", 410.00);
		cmimiMenu.put("Nigiri Mix_I", 1650.00);
		cmimiMenu.put("Nigiri Mix_II", 2140.00);
		cmimiMenu.put("Nigiri Mix_III", 2550.00);
		cmimiMenu.put("Set Sake", 1240.00);
		cmimiMenu.put("Maguro", 1240.00);
		cmimiMenu.put("Sashimi Mix", 1240.00);
		cmimiMenu.put("Sake & Maguro", 1240.00);
		cmimiMenu.put("Deluxe Set", 1720.00);
		cmimiMenu.put("Forest Roll", 1030.00);
		cmimiMenu.put("Kani Salad Roll", 1030.00);
		cmimiMenu.put("Smoked Salmon Truffle Roll", 1620.00);
		cmimiMenu.put("Smoked Salmon Roll", 1240.00);
		cmimiMenu.put("Fire Salmon", 1360.00);
		cmimiMenu.put("Spicy Philadelphia Roll", 1030.00);
		cmimiMenu.put("San Diego Roll", 1030.00);
		cmimiMenu.put("Spicy California Roll", 1030.00);
		cmimiMenu.put("Ebi California Roll", 1030.00);
		cmimiMenu.put("Canadian Roll", 1030.00);
		cmimiMenu.put("Sesame Maki Roll", 1030.00);
		cmimiMenu.put("California Roll", 1030.00);
		cmimiMenu.put("Rainbow Roll", 1030.00);
		cmimiMenu.put("Quinoa Avocado Roll", 760.00);
		cmimiMenu.put("Two Way Salmon Roll", 1030.00);
		cmimiMenu.put("Philadelphia Roll", 1030.00);
		cmimiMenu.put("Tiger Roll", 1030.00);
		cmimiMenu.put("Spicy Maguro Avocado", 1030.00);
		cmimiMenu.put("Veggie Roll", 960.00);
		cmimiMenu.put("Crunchy Roll", 1030.00);
		cmimiMenu.put("Crazy Philly Roll", 1560.00);
		cmimiMenu.put("Kyoto Roll", 1260.00);
		cmimiMenu.put("Yuzu Special Roll", 1340.00);
		cmimiMenu.put("SuchiCo Roll", 1130.00);
		cmimiMenu.put("Fish&Chips Roll", 1170.00);
		cmimiMenu.put("Ebi Ten Roll", 1080.00);
		cmimiMenu.put("Samuria Roll", 1130.00);
		cmimiMenu.put("Salmon Aburi Roll", 1240.00);
		cmimiMenu.put("Ebi Tempura Roll with Truffle", 1280.00);
		cmimiMenu.put("Chicken Teriyaki Roll", 1170.00);
		cmimiMenu.put("Sake Ten Roll", 1120.00);
		cmimiMenu.put("Phily Roll", 1030.00);
		cmimiMenu.put("Jungle Roll", 1100.00);
		cmimiMenu.put("Tempura Sake Maki Roll", 1240.00);
		cmimiMenu.put("Dragon Roll", 1120.00);
		cmimiMenu.put("Tokyo Drift Roll", 1100.00);
		cmimiMenu.put("Special Salmon Roll", 1260.00);
		cmimiMenu.put("Shrimp Bomb Roll", 1260.00);
		cmimiMenu.put("Tempura Shrimp Plate ", 3130.00);
		cmimiMenu.put("ABC Sushi Moriawase ", 1750.00);
		cmimiMenu.put("California Dream ", 2170.00);
		cmimiMenu.put("Sushi Queen", 2580.00);
		cmimiMenu.put("Sushi King", 3130.00);
		cmimiMenu.put("Salmon Lovers ", 2990.00);
		cmimiMenu.put("Hot Sushi Plate ", 3130.00);
		cmimiMenu.put("Sushi Prince 1 ", 3820.00);
		cmimiMenu.put("Sushi Prince 2", 3820.00);
		cmimiMenu.put("Bento Menu 1", 1430.00);
		cmimiMenu.put("Bento Menu 2", 1360.00);
		cmimiMenu.put("Bento Menu 3", 1700.00);
		cmimiMenu.put("Bento Menu 4", 1840.00);
		cmimiMenu.put("Bento Menu 5", 2120.00);
		cmimiMenu.put("Bento Menu 6", 1360.00);
		cmimiMenu.put("Bento Menu Vegjetariane", 1360.00);
		cmimiMenu.put("Kids Bento", 1130.00);
		cmimiMenu.put("Kappa Roll", 420.00);
		cmimiMenu.put("Maguro Roll ", 690.00);
		cmimiMenu.put("Tofu Takuan Roll", 720.00);
		cmimiMenu.put("Ebi Roll", 690.00);
		cmimiMenu.put("Kani Roll", 620.00);
		cmimiMenu.put("Sake Roll", 690.00);
		cmimiMenu.put("Unagi Roll", 960.00);
		cmimiMenu.put("Avocado Ebi Roll", 870.00);
		cmimiMenu.put("Avocado Sake Roll", 780.00);
		cmimiMenu.put("Unagi Avicado Roll", 1080.00);
		cmimiMenu.put("Quinoa Sake Roll", 720.00);
		cmimiMenu.put("Quinoa California Roll", 900.00);
		cmimiMenu.put("Ginger", 500.00);
		cmimiMenu.put("Sweet Sour Sauce", 500.00);
		cmimiMenu.put("Wasabi", 500.00);
		cmimiMenu.put("Sriracha", 500.00);
		cmimiMenu.put("Teriyaka Sauce", 500.00);
		cmimiMenu.put("Samurai Sauce", 500.00);
		cmimiMenu.put("Sweet Chili Sos", 500.00);
		cmimiMenu.put("Hoisin Sauce", 500.00);
		cmimiMenu.put("Plum Sauce", 500.00);
		cmimiMenu.put("Pancake", 2000.00);
		cmimiMenu.put("Chinese Hot Sauce", 500.00);
		cmimiMenu.put("Truffle Mayonnaise", 500.00);
		cmimiMenu.put("BUN'utella ", 690.00);
		cmimiMenu.put("Akullore e Fërguar", 480.00);
		cmimiMenu.put("Ananas i fërguar me Kanellë", 480.00);
		cmimiMenu.put("Akullore e Fërguar me Bajame", 550.00);
		cmimiMenu.put("Arra të Karamelizuara", 480.00);
		cmimiMenu.put("Asahi Birrë", 420.00);
		cmimiMenu.put("Corona", 370.00);
		cmimiMenu.put("Tuborg", 300.00);
		cmimiMenu.put("Sake 0.75", 3600.00);
		cmimiMenu.put("Sake 0.18", 1200.00);
		cmimiMenu.put("Coca - Cola", 220.00);
		cmimiMenu.put("Coca - Cola Zero", 220.00);
		cmimiMenu.put("Fanta", 220.00);
		cmimiMenu.put("Sprite", 220.00);
		cmimiMenu.put("Schweppes", 220.00);
		cmimiMenu.put("RedBull", 300.00);
		cmimiMenu.put("Acqua Panna - 0.25ml", 180.00);
		cmimiMenu.put("Acqua Panna - 0.75ml", 370.00);
		cmimiMenu.put("San Pellegrino - 0.25ml", 180.00);
		cmimiMenu.put("San Pellegrino", 370.00);
		Set<Map.Entry<String, Double>> st = cmimiMenu.entrySet();
		for (Map.Entry<String, Double> value : st) {
			System.out.print(value.getKey() + "    ");
			System.out.println(value.getValue());
		}
		System.out.println();
		return cmimiMenu;
	}

	public double getDishPrize() {
		afishoCmimiMenu();
		return dishPrize;
	}

	private TreeMap<Integer, String> afishoIdMenu() {
		System.out.println("Id perkatese e cdo menuje ne bazen e te dhenave:");
		TreeMap<Integer, String> Idmenu = new TreeMap<Integer, String>();
		Idmenu.put(101, "Kimchi");
		Idmenu.put(102, "Salmon Tataki");
		Idmenu.put(103, "Tuna Tataki");
		Idmenu.put(104, "Pulë Kaarage me Parmesan");
		Idmenu.put(105, "Misër Tempura");
		Idmenu.put(106, "Edamame");
		Idmenu.put(107, "Edamame me Hudhë Djegëse");
		Idmenu.put(108, "Baby Kalamari Tempura");
		Idmenu.put(109, "Karkalecë Deti Crispy");
		Idmenu.put(110, "Fish & Chips");
		Idmenu.put(111, "Tartar Salmoni me Tartuf");
		Idmenu.put(112, "Pulë Crispy Appetizer");
		Idmenu.put(113, "Qofte me Mish Pule");
		Idmenu.put(114, "Qofte me Karkalecë Deti");
		Idmenu.put(115, "Shrimp Bomb");
		Idmenu.put(116, "Salmon Carpaccio");
		Idmenu.put(117, "Salmon & Suzuki Carpaccio");
		Idmenu.put(118, "Tempura Mix");
		Idmenu.put(119, "Tempura Perimesh");
		Idmenu.put(201, "Wonton Korean");
		Idmenu.put(202, "Spring Roll");
		Idmenu.put(203, "Dumplings Viçi ne Avull");
		Idmenu.put(204, "Wonton Crispy");
		Idmenu.put(205, "Spring Roll me Mish Pate");
		Idmenu.put(206, "Gyoza me Perime");
		Idmenu.put(301, "Bun Vici");
		Idmenu.put(302, "Bun Pule");
		Idmenu.put(303, "Bun(Kuleçë) me mish te Patës");
		Idmenu.put(401, "Tom Yum");
		Idmenu.put(402, "Supë me Fruta Deti");
		Idmenu.put(403, "Wonton Supë");
		Idmenu.put(404, "Supë Djegëse dhe e thartë");
		Idmenu.put(405, "Supë Pule dhe Misri me Shparguj");
		Idmenu.put(406, "Miso Supë");
		Idmenu.put(407, "Pad Thai");
		Idmenu.put(501, "Ramen me Mish Pule");
		Idmenu.put(502, "Ramen me Mish Viçi");
		Idmenu.put(503, "Ramen - Karkalec");
		Idmenu.put(601, "Sallatë Aziatike");
		Idmenu.put(602, "Sallatë Aziatike me Karkaleca Deti Crispy");
		Idmenu.put(603, "Sallatë Lakre Djegëse");
		Idmenu.put(604, "Sallatë SushiCO Wakame");
		Idmenu.put(605, "Sallatë Kani dhe Tranguj");
		Idmenu.put(606, "Sallatë Sashimi");
		Idmenu.put(607, "Sallatë me fruta të Detit");
		Idmenu.put(608, "Sallatë Quinoa me Edamame");
		Idmenu.put(609, "Sallatë Quinoa me Salmon");
		Idmenu.put(701, "Donburi me ngjalë");
		Idmenu.put(702, "Donburi me Mish të Patës");
		Idmenu.put(703, "Salmon Donburi");
		Idmenu.put(801, "Udon Bulgogi Korean Mish Viçi");
		Idmenu.put(802, "Udon Bulgogi Korean Pulë");
		Idmenu.put(803, "Noodles të thjeshta");
		Idmenu.put(804, "Noodles me Perime");
		Idmenu.put(805, "Noodles me Pulë");
		Idmenu.put(806, "Noodles me Mish Viçi");
		Idmenu.put(807, "Noodles me Karkalecë Deti");
		Idmenu.put(808, "Singapore Noodles me salcë Këri");
		Idmenu.put(809, "Udon me Perime dhe Salcë të Hudhrës së Zezë");
		Idmenu.put(810, "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë");
		Idmenu.put(811, "Udon me Karkalecë");
		Idmenu.put(812, "Noodles të Stilit Tajlandez me mish Pule");
		Idmenu.put(813, "Noodles të Stilit Tajlandez me Karkalecë Deti");
		Idmenu.put(814, "Noodles të Stilit Tajlandez me Mish Noodles të Stilit Japonez");
		Idmenu.put(901, "Oriz në Avull");
		Idmenu.put(902, "Oriz në Avull");
		Idmenu.put(903, "Oriz me Perime");
		Idmenu.put(904, "Oriz me Vezë të fërguara");
		Idmenu.put(905, "Oriz me Pulë");
		Idmenu.put(906, "Oriz me Këri dhe Mish Viçi");
		Idmenu.put(907, "Oriz me Mish Viçi");
		Idmenu.put(908, "Oriz i Stilit Tajladez me Ananas");
		Idmenu.put(909, "Oriz me Karkalecë Deti");
		Idmenu.put(1001, "Perime të Përzier të Skuqura");
		Idmenu.put(1002, "Perime të Përzier të Skuqura Djegëse");
		Idmenu.put(1003, "Brokoli dhe karrote me salcë Hudhre");
		Idmenu.put(1101, "Salmon Poke Bowl");
		Idmenu.put(1102, "Salmon & Maguro Poke Bowl");
		Idmenu.put(1201, "Pulë me Keri të Kuq");
		Idmenu.put(1202, "Bulgogi Pulë në Stilin Korean");
		Idmenu.put(1203, "Pulë me Perime");
		Idmenu.put(1204, "Pulë Crispy");
		Idmenu.put(1205, "Pulë Sweet&Sour");
		Idmenu.put(1206, "Pulë me salcë Djegëse");
		Idmenu.put(1207, "Pulë Manc hurian");
		Idmenu.put(1208, "Pulë Crispy me Xhenxherfil");
		Idmenu.put(1209, "Pulë General Tso");
		Idmenu.put(1210, "Pulë Tajlandeze me Arra Indiane");
		Idmenu.put(1301, "Salmon Tajlandez me Curry");
		Idmenu.put(1302, "Salmon në Avull");
		Idmenu.put(1303, "Salmon në Skarë me Salcë Teriyaki");
		Idmenu.put(1304, "Kalamari Djegëse me Arra Indiane");
		Idmenu.put(1305, "Karkalecë Deti me Tempura");
		Idmenu.put(1306, "Oktapod djegës me Perime");
		Idmenu.put(1307, "Kalamarë Deti me Arra Indiane");
		Idmenu.put(1401, "Bulgogi Koreane me Mish Viçi");
		Idmenu.put(1402, "Mish Viçi Djegëse dhe Kërpudha");
		Idmenu.put(1403, "Mish Viçi me Perime");
		Idmenu.put(1404, "Mish Viçi me Speca të gjelbërta te pra hollë");
		Idmenu.put(1405, "Mish Viçi me Hudhër të Zezë");
		Idmenu.put(1406, "Mish Viçi i Stilit Tajlandez me Chilli dhe Borzilok");
		Idmenu.put(1501, "Patë Crispy_1");
		Idmenu.put(1502, "Patë Crispy_2");
		Idmenu.put(1503, "Donburi me Mish Pate");
		Idmenu.put(1601, "Tamago Omlet");
		Idmenu.put(1602, "Maguro - Tuna");
		Idmenu.put(1603, "Karkalecë Deti-Shprimp");
		Idmenu.put(1604, "Suzuki Levrek");
		Idmenu.put(1605, "Sake");
		Idmenu.put(1606, "Sake Avocado");
		Idmenu.put(1607, "Unagi");
		Idmenu.put(1608, "Ebi Tempura");
		Idmenu.put(1609, "Nigiri Mix_I");
		Idmenu.put(1610, "Nigiri Mix_II");
		Idmenu.put(1611, "Nigiri Mix_III");
		Idmenu.put(1701, "Set Sake");
		Idmenu.put(1702, "Maguro");
		Idmenu.put(1703, "Sashimi Mix");
		Idmenu.put(1704, "Sake & Maguro");
		Idmenu.put(1705, "Deluxe Set");
		Idmenu.put(1801, "Forest Roll");
		Idmenu.put(1802, "Kani Salad Roll");
		Idmenu.put(1803, "Smoked Salmon Truffle Roll");
		Idmenu.put(1804, "Smoked Salmon Roll");
		Idmenu.put(1805, "Fire Salmon");
		Idmenu.put(1806, "Spicy Philadelphia Roll");
		Idmenu.put(1807, "San Diego Roll");
		Idmenu.put(1808, "Spicy California Roll");
		Idmenu.put(1809, "Ebi California Roll");
		Idmenu.put(1810, "Canadian Roll");
		Idmenu.put(1811, "Sesame Maki Roll");
		Idmenu.put(1812, "California Roll");
		Idmenu.put(1813, "Rainbow Roll");
		Idmenu.put(1814, "Quinoa Avocado Roll");
		Idmenu.put(1815, "Two Way Salmon Roll");
		Idmenu.put(1816, "Philadelphia Roll");
		Idmenu.put(1817, "Tiger Roll");
		Idmenu.put(1818, "Spicy Maguro Avocado");
		Idmenu.put(1819, "Veggie Roll");
		Idmenu.put(1820, "Crunchy Roll");//
		Idmenu.put(1901, "Crazy Philly Roll");
		Idmenu.put(1902, "Kyoto Roll");
		Idmenu.put(1903, "Yuzu Special Roll");
		Idmenu.put(1904, "SuchiCo Roll");
		Idmenu.put(1905, "Fish&Chips Roll");
		Idmenu.put(1906, "Ebi Ten Roll");
		Idmenu.put(1907, "Samuria Roll");
		Idmenu.put(1908, "Salmon Aburi Roll");
		Idmenu.put(1909, "Ebi Tempura Roll with Truffle");
		Idmenu.put(1910, "Chicken Teriyaki Roll");
		Idmenu.put(1911, "Sake Ten Roll");
		Idmenu.put(1912, "Phily Roll");
		Idmenu.put(1913, "Jungle Roll");
		Idmenu.put(1914, "Tempura Sake Maki Roll");
		Idmenu.put(1915, "Dragon Roll");
		Idmenu.put(1916, "Tokyo Drift Roll");
		Idmenu.put(1917, "Special Salmon Roll");
		Idmenu.put(1918, "Shrimp Bomb Roll");
		Idmenu.put(2001, "Tempura Shrimp Plate ");
		Idmenu.put(2002, "ABC Sushi Moriawase ");
		Idmenu.put(2003, "California Dream ");
		Idmenu.put(2004, "Sushi Queen");
		Idmenu.put(2005, "Sushi King");
		Idmenu.put(2006, "Salmon Lovers ");
		Idmenu.put(2007, "Hot Sushi Plate ");
		Idmenu.put(2008, "Sushi Prince 1 ");
		Idmenu.put(2009, "Sushi Prince 2");//
		Idmenu.put(2101, "Bento Menu 1");
		Idmenu.put(2102, "Bento Menu 2");
		Idmenu.put(2103, "Bento Menu 3");
		Idmenu.put(2104, "Bento Menu 4");
		Idmenu.put(2105, "Bento Menu 5");
		Idmenu.put(2106, "Bento Menu 6");
		Idmenu.put(2107, "Bento Menu Vegjetariane");
		Idmenu.put(2108, "Kids Bento");//
		Idmenu.put(2201, "Kappa Roll");
		Idmenu.put(2202, "Maguro Roll ");
		Idmenu.put(2203, "Tofu Takuan Roll");
		Idmenu.put(2204, "Ebi Roll");
		Idmenu.put(2205, "Kani Roll");
		Idmenu.put(2206, "Sake Roll");
		Idmenu.put(2207, "Unagi Roll");
		Idmenu.put(2208, "Avocado Ebi Roll");
		Idmenu.put(2209, "Avocado Sake Roll");
		Idmenu.put(2210, "Unagi Avicado Roll");
		Idmenu.put(2211, "Quinoa Sake Roll");
		Idmenu.put(2212, "Quinoa California Roll");
		Idmenu.put(2301, "Ginger");
		Idmenu.put(2302, "Sweet Sour Sauce");
		Idmenu.put(2303, "Wasabi");
		Idmenu.put(2304, "Sriracha");
		Idmenu.put(2305, "Teriyaka Sauce");
		Idmenu.put(2306, "Samurai Sauce");
		Idmenu.put(2307, "Sweet Chili Sos");
		Idmenu.put(2308, "Hoisin Sauce");
		Idmenu.put(2309, "Plum Sauce");
		Idmenu.put(2310, "Pancake");
		Idmenu.put(2311, "Chinese Hot Sauce");
		Idmenu.put(2312, "Truffle Mayonnaise");
		Idmenu.put(2401, "BUN'utella ");
		Idmenu.put(2402, "Akullore e Fërguar");
		Idmenu.put(2403, "Ananas i fërguar me Kanellë");
		Idmenu.put(2404, "Akullore e Fërguar me Bajame");
		Idmenu.put(2405, "Arra të Karamelizuara");
		Idmenu.put(2501, "Asahi Birrë");
		Idmenu.put(2502, "Corona");
		Idmenu.put(2503, "Tuborg");
		Idmenu.put(2601, "Sake 0.75");
		Idmenu.put(2602, "Sake 0.18");
		Idmenu.put(2701, "Coca - Cola");
		Idmenu.put(2702, "Coca - Cola Zero");
		Idmenu.put(2703, "Fanta");
		Idmenu.put(2704, "Sprite");
		Idmenu.put(2705, "Schweppes");
		Idmenu.put(2706, "RedBull");
		Idmenu.put(2707, "Acqua Panna - 0.25ml");
		Idmenu.put(2708, "Acqua Panna - 0.75ml");
		Idmenu.put(2709, "San Pellegrino - 0.25ml");
		Idmenu.put(2710, "San Pellegrino");

		Set<Map.Entry<Integer, String>> set = Idmenu.entrySet();
		for (Map.Entry<Integer, String> vl : set) {
			System.out.print(vl.getKey() + "   ");
			System.out.println(vl.getValue());
		}
		System.out.println();
		return Idmenu;
	}

	public int getDishId() {
		afishoIdMenu();
		return dishId;

	}

	private TreeMap<String, Integer> afishoNrMenuKategori() {
		System.out.println("Për çdo kategori --- numri i menuve");
		TreeMap<String, Integer> menuPerKategori = new TreeMap<String, Integer>();
		menuPerKategori.put("Appetizer", 18);
		menuPerKategori.put("Dim Sum", 6);
		menuPerKategori.put("Bun", 3);
		menuPerKategori.put("Supat", 7);
		menuPerKategori.put("Ramen", 3);
		menuPerKategori.put("Sallatat", 9);
		menuPerKategori.put("Donburi", 3);
		menuPerKategori.put("Noodles", 14);
		menuPerKategori.put("Oriz", 9);
		menuPerKategori.put("Perimet", 3);
		menuPerKategori.put("Poke Bowl", 2);
		menuPerKategori.put("Pulë", 10);
		menuPerKategori.put("Ushqimi i Detit", 7);
		menuPerKategori.put("Mishi i Viçit", 6);
		menuPerKategori.put("Patë", 3);
		menuPerKategori.put("Nigiri", 11);
		menuPerKategori.put("Sashimi Set", 5);
		menuPerKategori.put("Special Rolls", 20);
		menuPerKategori.put("Cooked Rolls", 18);
		menuPerKategori.put("Set Menu", 9);
		menuPerKategori.put("Bento Menu", 8);
		menuPerKategori.put("Sushi Roll", 11);
		menuPerKategori.put("Salcat", 12);
		menuPerKategori.put("Desert", 5);
		menuPerKategori.put("Birrë", 3);
		menuPerKategori.put("Sake & Wine", 2);
		menuPerKategori.put("Pijet e Ftohta", 10);

		Set<Map.Entry<String, Integer>> set = menuPerKategori.entrySet();
		for (Map.Entry<String, Integer> i : set) {
			System.out.print(i.getKey() + "  ");
			System.out.println(i.getValue());
		}
		System.out.println();
		return menuPerKategori;
	}

	public int getDishItemsPerType() {
		afishoNrMenuKategori();
		return dishItemsPerType;
	}

	public void porositOnline() {
	}
}