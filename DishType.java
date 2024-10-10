package menaxhim.Restoranti;

import java.util.*;

public abstract class DishType {

	protected String dishType;
	protected int dishItemsPerType;
	public DishType() {
		dishType = "dishType";
	}

	public DishType(String dishType,int dishItemsPerType) {
		this.dishType = dishType;
        this.dishItemsPerType = dishItemsPerType;
	}

	private Map<Integer, String> afishoMenu() {
		Map<Integer, String> dishType = new TreeMap<Integer, String>();
		System.out.println("Lista e llojeve te menuve per restorantin 'SushiCo Albania' ");
		dishType.put(1, "Appetizer");
		dishType.put(2, "Dim Sum");
		dishType.put(3, "Bun");
		dishType.put(4, "Supat");
		dishType.put(5, "Ramen");
		dishType.put(6, "Sallatat");
		dishType.put(7, "Donburi");
		dishType.put(8, "Noodles");
		dishType.put(9, "Oriz");
		dishType.put(10, "Perimet");
		dishType.put(11, "Poke Bowl");
		dishType.put(12, "Ushqimi i Detit");
		dishType.put(13, "Pule");
		dishType.put(14, "Mishi i Viçit");
		dishType.put(15, "Pate");
		dishType.put(15, "Nigiri");
		dishType.put(16, "Sashimi Set");
		dishType.put(17, "Special Rolls");
		dishType.put(18, "Coocked Rolls");
		dishType.put(19, "Set Menu");
		dishType.put(20, "Bento Menu");
		dishType.put(21, "Sushi Roll");
		dishType.put(22, "Desert");
		dishType.put(23, "Sauce");
		dishType.put(24, "Birrë");
		dishType.put(25, "Sake & Vine");
		dishType.put(26, "Pijet e ftohta");

		Set<Map.Entry<Integer, String>> st = dishType.entrySet();
		for (Map.Entry<Integer, String> v : st) {
			System.out.print(v.getKey() + " -");
			System.out.println(v.getValue());
		}
		System.out.println("Numri i llojeve te menuve:");
		System.out.println(dishType.size());

		return dishType;
	}

	public String getDishType() {
		afishoMenu();
		return dishType;
	}
	private TreeMap<String, Integer> afishoNrMenuKategori() {
		System.out.println("Për çdo kategori --- numri i menuve");
		TreeMap<String, Integer> menuPerKategori = new TreeMap<String, Integer>();
		menuPerKategori.put("Appetizer", 19);
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
			System.out.print("Kategoria e menuse:"+i.getKey() + "  ");
			System.out.println("Numri i menuve:"+i.getValue());
		}
		System.out.println();
		return menuPerKategori;
	}

	public int getDishItemsPerType() {
		afishoNrMenuKategori();
		return dishItemsPerType;
	}

	
	public abstract void porositOnline();// selecto menune ose menute e preferuara
}
