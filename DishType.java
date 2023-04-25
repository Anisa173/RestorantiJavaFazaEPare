package menaxhim.Restoranti;

import java.util.*;

public abstract class DishType {

	protected String dishType;

	public DishType() {
    dishType = "dishType";
	}

	public DishType(String dishType) {
		this.dishType = dishType;

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

	public abstract void porositOnline();// selecto menune ose menute e preferuara
}
