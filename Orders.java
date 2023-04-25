package menaxhim.Restoranti;

import java.util.*;

public class Orders extends Dish {

	private int OrderId;
	private double OrderPrize;
	private String Order_status;
	private int orderItems;

	public Orders() {
		OrderId = 211466;
		OrderPrize = 3660.55;
		orderItems = 6;
		Order_status = "Processed";
	}

	public Orders(int OrderId, double OrderPrize, String Order_status, int orderItems, int dishId, String dishType,
			String dishName, String dishDescription, double dishPrize, int dishItemsPerType) {
		super();
		this.OrderId = OrderId;
		this.OrderPrize = OrderPrize;
		this.Order_status = Order_status;
		this.orderItems = orderItems;
	}

	private TreeMap<Integer, String> afishoNoItemsPerOrder() {
		System.out.println("Artikujt per çdo porosi  gjate nje intervali te caktuar kohor jane:");
		TreeMap<Integer, String> orders = new TreeMap<Integer, String>();
		orders.put(5, "Karkalecë Deti Crispy");
		orders.put(3, "Salmon & Suzuki Carpaccio");
		orders.put(6, "Pulë Kaarage me Parmesan");
		orders.put(5, "Tempura Perimesh");
		orders.put(10, "Bun Vici");
		orders.put(2, "Pad Thai");
		orders.put(5, "Bun(Kuleçë) me mish te Patës");
		orders.put(12, "Tartar Salmoni me Tartuf");
		orders.put(7, "Spring Roll me Mish Pate");
		orders.put(15, "Sallatë Aziatike");
		orders.put(10, "Ramen - Karkalec");
		orders.put(10, "Sallatë Kani dhe Tranguj");
		orders.put(5, "Sallatë Sashimi");
		orders.put(3, "Sallatë Aziatike me Karkaleca Deti Crispy");
		orders.put(4, "Sallatë Quinoa me Salmon");
		orders.put(3, "Sallatë me fruta të Detit");
		orders.put(8, "Singapore Noodles me salcë Këri");
		orders.put(5, "Donburi me ngjalë");
		orders.put(20, "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë");
		orders.put(5, "Udon Bulgogi Korean Mish Viçi");
		orders.put(5, "Noodles të Stilit Tajlandez me Karkalecë Deti");
		orders.put(2, "Oriz i Stilit Tajladez me Ananas");
		orders.put(2, "Oriz me Vezë të fërguara");
		orders.put(2, "Tempura Mix");
		orders.put(50, "Salmon Tajlandez me Curry");
		orders.put(5, "Canadian Roll");
		orders.put(2, "Bento Menu 5");
		orders.put(4, "Bento Menu 1");
		orders.put(5, "Philadelphia Roll");
		orders.put(3, "Kids Bento");
		orders.put(5, "Sushi King");
		orders.put(5, "Hot Sushi Plate ");
		orders.put(5, "Sushi Prince 2");
		orders.put(6, "Bento Menu 2 ");
		orders.put(5, "Fish&Crips Roll");
		orders.put(3, "Chinese Hot Sauce");
		orders.put(4, "Coca - Cola Zero");
		orders.put(6, "Akullore e Fërguar me Bajame");
		orders.put(6, "Sake 0.18");
		orders.put(3, "Sprite");
		orders.put(3, "Acqua Panna - 0.75ml");
		orders.put(4, "Truffle Mayonnaise");
		orders.put(2, "BUN'utella ");
		orders.put(3, "Sweet Chili Sos");
		orders.put(6, "Tofu Takuan Roll ");
		orders.put(2, "ABC Sushi Moriawase ");
		orders.put(3, "Yuzu Special Roll");
		orders.put(2, "Nigiri Mix_III");
		orders.put(5, "Mish Viçi Djegëse dhe Kërpudha");
		orders.put(5, "Salmon në Skarë me Salcë Teriyaki");
		orders.put(5, "Bulgogi Pulë në Stilin Korean");
		orders.put(2, "Oriz me Perime");
		orders.put(4, "Oriz me Këri dhe Mish Viçi");
		orders.put(3, "Donburi me mish te Pates ");
		orders.put(4, "Supë me Fruta Deti");
		orders.put(3, "Tartar Salmoni me Tartuf");
		orders.put(3, "Sallatë Aziatike");
		orders.put(5, "Sallatë Aziatike me Karkaleca Deti Crispy");
		orders.put(4, "Wonton Korean");
		orders.put(2, "Qofte me Karkalecë Deti");
		orders.put(6, "Noodles të Stilit Tajlandez me Karkalecë Deti");
		orders.put(4, "Bulgogi Pulë në Stilin Korean");
		orders.put(8, "Oktapod djegës me Perime");
		orders.put(4, "Sushi Queen");
		
		Set<Map.Entry<Integer, String>> set = orders.entrySet();
		for (Map.Entry<Integer, String> value : set) {
			System.out.println(value.getKey() + " | " + value.getValue());

		}
		return orders;
	}

	public int getOrderItems() {
		afishoNoItemsPerOrder();
		return orderItems;
	}

	private HashMap<Double, String> afishoOrderCost() {
		System.out.println("Kostot per çdo Porosi");
		HashMap<Double, String> orderPrize = new HashMap<Double, String>();
		orderPrize.put(4800.00, "Karkalecë Deti Crispy  5 x 960.00");
		orderPrize.put(3300.00, "Salmon & Suzuki Carpaccio  3 x 1100");
		orderPrize.put(4560.00, "Pulë Kaarage me Parmesan  6 x 760.00");
		orderPrize.put(3800.00, "Tempura Perimesh  5 x 760.00");
		orderPrize.put(6200.00, "Bun Vici  10 x 620.00");
		orderPrize.put(1660.00, "Pad Thai  2 x 830.00");
		orderPrize.put(3450.00, "Bun(Kuleçë) me mish te Patës  5 x 690.00");
		orderPrize.put(14880.00, "Tartar Salmoni me Tartuf  12 x 1240.00");
		orderPrize.put(4830.00, "Spring Roll me Mish Pate  7 x 690.00");
		orderPrize.put(10500.00, "Sallatë Aziatike  15 x 700.00");
		orderPrize.put(12900.00, "Ramen - Karkalec  10 x 1290.00");
		orderPrize.put(8300.00, "Sallatë Kani dhe Tranguj  10 x 830.00");
		orderPrize.put(5500.00, "Sallatë Sashimi  5 x 1100.00");
		orderPrize.put(3720.00, "Sallatë Aziatike me Karkaleca Deti Crispy  3 x 1240.00");
		orderPrize.put(4960.00, "Sallatë Quinoa me Salmon  4 x 1240.00");
		orderPrize.put(3720.00, "Sallatë me fruta të Detit  3 x 1240.00");
		orderPrize.put(8800.00, "Singapore Noodles me salcë Këri   8 x 1100.00");
		orderPrize.put(6900.00, "Donburi me ngjalë  5 x 1380.00");
		orderPrize.put(2200.00, "Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë  20 x 1100.00");
		orderPrize.put(5250.00, "Udon Bulgogi Korean Mish Viçi  5 x 1050.00");
		orderPrize.put(6900.00, "Noodles të Stilit Tajlandez me Karkalecë Deti  5 x 1380.00");
		orderPrize.put(1660.00, "Oriz i Stilit Tajladez me Ananas  2 x 830.00");
		orderPrize.put(1380.00, "Oriz me Vezë të fërguara  2 x 690.00 ");
		orderPrize.put(2900.00, "Tempura Mix  2 x 1450.00 ");
		orderPrize.put(71000.00, "Salmon Tajlandez me Curry  50 x 1420.00");
		orderPrize.put(5150.00, "Canadian Roll  5 x 1030.00");
		orderPrize.put(4242.00, "Bento Menu 5   2 x 2120.00");
		orderPrize.put(5720.00, "Bento Menu 1  4 x 1430.00");
		orderPrize.put(5150.00, "Philadelphia Roll  5 x 1030.00");
		orderPrize.put(3390.00, "Kids Bento  3 x 1130.00");
		orderPrize.put(15650.00, "Sushi King  5 x 3130.00");
		orderPrize.put(15650.00, "Hot Sushi Plate  5 x 3130.00");
		orderPrize.put(19100.00, "Sushi Prince 2  5 x 3820.00");
		orderPrize.put(8160.00, "Bento Menu 2  6 x 1360.00");
		orderPrize.put(5850.00, "Fish&Crips Roll  5 x 1170.00");
		orderPrize.put(1500.00, "Chinese Hot Sauce  3 x 500.00");
		orderPrize.put(880.00, "Coca - Cola Zero  4 x 220.00");
		orderPrize.put(3300.00, "Akullore e Fërguar me Bajame  6 x 550.00");
		orderPrize.put(7200.00, "Sake 0.18  6 x 1200.00");
		orderPrize.put(660.00, "Sprite  3 x 220.00");
		orderPrize.put(1110.00, "Acqua Panna - 0.75ml 3 x 370.00");
		orderPrize.put(2000.00, "Truffle Mayonnaise 4 x 500.00");
		orderPrize.put(1380.00, "BUN'utella  2 x 690.00");
		orderPrize.put(1500.00, "Sweet Chili Sos  3 x 500.00");
		orderPrize.put(4320.00, "Tofu Takuan Roll 6 x 720.00");
		orderPrize.put(3500.00, "ABC Sushi Moriawase  2 x 1750.00");
		orderPrize.put(4020.00, "Yuzu Special Roll  3 x 1340.00");
		orderPrize.put(5100.00, "Nigiri Mix_III  2 x 2550.00");
		orderPrize.put(6000.00, "Mish Viçi Djegëse dhe Kërpudha  5 x 1200.00");
		orderPrize.put(7900.00, "Salmon në Skarë me Salcë Teriyaki 5 x 1580.00");
		orderPrize.put(5100.00, "Bulgogi Pulë në Stilin Korean  5 x 1020.00");
		orderPrize.put(1240.00, "Oriz me Perime   2 x 620.00");
		orderPrize.put(3600.00, "Oriz me Këri dhe Mish Viçi  4 x 900.00");
		orderPrize.put(3720.00, "Donburi me mish te Pates  3 x 1240.00");
		orderPrize.put(3280.00, "Supë me Fruta Deti  4 x 820.00");
		orderPrize.put(3720.00, "Tartar Salmoni me Tartuf  3 x 1240.00");
		orderPrize.put(2100.00, "Sallatë Aziatike   3 x 700.00");
		orderPrize.put(6200.00, "Sallatë Aziatike me Karkaleca Deti Crispy  5 x 1240.00");
		orderPrize.put(2760.00, "Wonton Korean  4 x 690.00");
		orderPrize.put(1520.00, "Qofte me Karkalecë Deti  2 x 760.00");
		orderPrize.put(8280.00, "Noodles të Stilit Tajlandez me Karkalecë Deti  6 x 1380.00");
		orderPrize.put(4080.00, "Bulgogi Pulë në Stilin Korean  4 x 1020.00");
		orderPrize.put(12320.00, "Oktapod djegës me Perime  8 x 1540.00");
		orderPrize.put(10320.00, "Sushi Queen   4 x 2580.00");

		Set<Map.Entry<Double, String>> set = orderPrize.entrySet();
		for (Map.Entry<Double, String> i : set) {
			System.out.print(i.getValue() + " -- ");
			System.out.println(i.getKey());
		}
		System.out.println();
		return orderPrize;
	}

	public double getOrderPrize() {
		afishoOrderCost();
		return OrderPrize;
	}

	private TreeMap<Integer, String> afishoidPorosi() {
		System.out.println("Id-të e çdo Porosie të kryer");
		TreeMap<Integer, String> orderId = new TreeMap<Integer, String>();
		orderId.put(5109, " 5  Karkalecë Deti Crispy     4800.00");
		orderId.put(3117, " 3  Salmon & Suzuki Carpaccio      3300.00");
		orderId.put(6104, " 6  Pulë Kaarage me Parmesan      4560.00");
		orderId.put(5119, " 5  Tempura Perimesh      3800.00");
		orderId.put(10301, "  10 Bun Vici      6200.00");
		orderId.put(2407, " 2  Pad Thai      1660.00");
		orderId.put(5303, " 5  Bun(Kuleçë) me mish te Patës     3450.00");
		orderId.put(12111, " 12  Tartar Salmoni me Tartuf     14880.00");
		orderId.put(7205, " 7  Spring Roll me Mish Pate    4830.00");
		orderId.put(15601, " 15 Sallatë Aziatike    10500.00");
		orderId.put(10503, " 10  Ramen - Karkalec   12900.00");
		orderId.put(10605, " 10  Sallatë Kani dhe Tranguj     8300.00");
		orderId.put(5606, " 5  Sallatë Sashimi     5500.00");
		orderId.put(3602, " 3  Sallatë Aziatike me Karkaleca Deti Crispy    3720.00");
		orderId.put(4609, " 4  Sallatë Quinoa me Salmon    4960.00");
		orderId.put(3607, " 3  Sallatë me fruta të Detit    3720.00");
		orderId.put(8808, " 8  Singapore Noodles me salcë Këri     8800.00");
		orderId.put(5701, " 5  Donburi me ngjalë     6900.00");
		orderId.put(20809, " 20  Udon me Mish Viçi dhe Salcë të Hudhrës së Zezë     2200.00");
		orderId.put(5801, " 5  Udon Bulgogi Korean Mish Viçi      5250.00");
		orderId.put(5813, " 5  Noodles të Stilit Tajlandez me Karkalecë Deti     6900.00");
		orderId.put(2908, " 2  Oriz i Stilit Tajladez me Ananas     1660.00");
		orderId.put(2904, " 2  Oriz me Vezë të fërguara      1380.00 ");
		orderId.put(2118, " 2  Tempura Mix     2900.00");
		orderId.put(501301, " 50  Salmon Tajlandez me Curry     71000.00");
		orderId.put(51810, " 5  Canadian Roll      5150.00");
		orderId.put(22105, " 2  Bento Menu 5     4242.00");
		orderId.put(42101, " 4  Bento Menu 1     5720.00");
		orderId.put(51816, " 5  Philadelphia Roll      5150.00");
		orderId.put(32108, " 3  Kids Bento     3390.00");
		orderId.put(52005, " 5  Sushi King     15650.00");
		orderId.put(52007, " 5  Hot Sushi Plate     15650.00");
		orderId.put(52009, " 5  Sushi Prince 2     19100.00");
		orderId.put(62102, " 6  Bento Menu 2      8160.00");
		orderId.put(51905, " 5  Fish&Crips Roll     5850.00");
		orderId.put(32311, " 3  Chinese Hot Sauce     1500.00");
		orderId.put(42702, " 4  Coca - Cola Zero      880.00");
		orderId.put(62404, " 6  Akullore e Fërguar me Bajame      3300.00");
		orderId.put(62602, " 6  Sake 0.18      7200.00");
		orderId.put(32704, " 3  Sprite      660.00");
		orderId.put(32708, " 3  Acqua Panna - 0.75ml      1110.00");
		orderId.put(42312, " 4  Truffle Mayonnaise      2000.00");
		orderId.put(22401, " 2  BUN'utella      1380.00");
		orderId.put(32307, " 3  Sweet Chili Sos      1500.00");
		orderId.put(62203, " 6  Tofu Takuan Roll      4320.00");
		orderId.put(22002, " 2  ABC Sushi Moriawase      3500.00");
		orderId.put(31903, " 3  Yuzu Special Roll      4020.00");
		orderId.put(21611, " 2  Nigiri Mix_III      5100.00");
		orderId.put(51402, " 5  Mish Viçi Djegëse dhe Kërpudha      6000.00");
		orderId.put(51303, " 5  Salmon në Skarë me Salcë Teriyaki     7900.00");
		orderId.put(51202, " 5  Bulgogi Pulë në Stilin Korean      5100.00");
		orderId.put(2903, " 2  Oriz me Perime      1240.00");
		orderId.put(4906, " 4  Oriz me Këri dhe Mish Viçi      3600.00");
		orderId.put(3702, " 3  Donburi me mish te Pates      3720.00");
		orderId.put(4402, " 4  Supë me Fruta Deti      3280.00");
		orderId.put(3111, " 3  Tartar Salmoni me Tartuf      3720.00");
		orderId.put(3601, " 3  Sallatë Aziatike      2100.00");
		orderId.put(5602, " 5  Sallatë Aziatike me Karkaleca Deti Crispy      6200.00");
		orderId.put(4201, " 4  Wonton Korean      2760.00");
		orderId.put(2114, " 2  Qofte me Karkalecë Deti      1520.00");
		orderId.put(6813, " 6  Noodles të Stilit Tajlandez me Karkalecë Deti      8280.00");
		orderId.put(41202, " 4  Bulgogi Pulë në Stilin Korean       4080.00");
		orderId.put(81306, " 8  Oktapod djegës me Perime      12320.00");
		orderId.put(42004, " 4  Sushi Queen      10320.00");

		Set<Map.Entry<Integer, String>> set = orderId.entrySet();
		for (Map.Entry<Integer, String> i : set) {
			System.out.print(i.getValue() + " -- ");
			System.out.println(i.getKey());
		}
		System.out.println();

		return orderId;
	}

	public int getOrderId() {
		afishoidPorosi();
		return OrderId;
	}

	private TreeMap<String, String> afishoPorosistatus() {
		System.out.println("Statusi i çdo Porosie të Gjeneruar");// porosi te gjeneruara gjate nje intervali kohe 'te
																	// shkurter' prej disa ore 'delivery' , hasim te
																	// tria statuset
																	// 'processed';'pending';'cancelled'~reagimi ne nje
																	// interval te shkurter kohe nga klienti
		TreeMap<String, String> orderStatus = new TreeMap<String, String>();
		orderStatus.put(" 1 5109", " Processed ");
		orderStatus.put(" 2 3117", " Processed ");
		orderStatus.put(" 3 6104", " Processed ");
		orderStatus.put(" 4 5119", " Processed ");
		orderStatus.put(" 5 10301", " Processed ");
		orderStatus.put(" 6 2407", " Processed ");
		orderStatus.put(" 7 5303", " Processed ");
		orderStatus.put(" 8 12111", " Processed ");
		orderStatus.put(" 9 7205", " Processed ");
		orderStatus.put(" 10 15601", " Processed ");
		orderStatus.put(" 11 10503", " Processed ");
		orderStatus.put(" 12 10605", " Processed ");
		orderStatus.put(" 13 5606", " Processed ");
		orderStatus.put(" 14 3602", " Processed ");
		orderStatus.put(" 15 4609", " Processed ");
		orderStatus.put(" 16 3607", " Processed ");
		orderStatus.put(" 17 8808", " Processed ");
		orderStatus.put(" 18 5701", " Processed ");
		orderStatus.put(" 19 20809", " Processed ");
		orderStatus.put(" 20 5801", " Processed ");
		orderStatus.put(" 21 5813", " Processed ");
		orderStatus.put(" 22 2908", " Processed ");
		orderStatus.put(" 23 2904", " Processed ");
		orderStatus.put(" 24 2118", " Processed ");
		orderStatus.put(" 25 501301", " Processed ");
		orderStatus.put(" 26 51810", " Processed ");
		orderStatus.put(" 27 22105", " Processed ");
		orderStatus.put(" 28 42101", " Processed ");
		orderStatus.put(" 29 51816", " Processed ");
		orderStatus.put(" 30 32108", " Processed ");
		orderStatus.put(" 31 52005", " Processed ");
		orderStatus.put(" 32 52007", " Processed ");
		orderStatus.put(" 33 52009", " Processed ");
		orderStatus.put(" 34 62102", " Processed ");
		orderStatus.put(" 35 51905", " Processed ");
		orderStatus.put(" 36 32311", " Processed ");
		orderStatus.put(" 37 42702", " Processed ");
		orderStatus.put(" 38 62404", " Processed ");
		orderStatus.put(" 39 62602", " Processed ");
		orderStatus.put(" 40 32704", " Processed ");
		orderStatus.put(" 41 32708", " Processed ");
		orderStatus.put(" 42 42312", " Processed ");
		orderStatus.put(" 43 22401", " Processed ");
		orderStatus.put(" 44 32307", " Processed ");
		orderStatus.put(" 45 62203", " Processed ");
		orderStatus.put(" 46 22002", " Processed ");
		orderStatus.put(" 47 31903", " Processed ");
		orderStatus.put(" 48 21611", " Processed ");
		orderStatus.put(" 49 51402", " Processed ");
		orderStatus.put(" 50 51303", " Processed ");
		orderStatus.put(" 51 51202", " Processed ");
		orderStatus.put(" 52 2903", " Processed ");
		orderStatus.put(" 53 4906", " Processed ");
		orderStatus.put(" 54 3702", " Processed ");
		orderStatus.put(" 55 4402", " Processed ");
		orderStatus.put(" 56 3111", " Processed ");
		orderStatus.put(" 57 3601", " Processed ");
		orderStatus.put(" 58 5602", " Processed ");
		orderStatus.put(" 59 4201", " Processed ");
		orderStatus.put(" 60 2114", " Processed ");
		orderStatus.put(" 61 6813", " Processed ");
		orderStatus.put(" 62 41202", " Processed ");
		orderStatus.put(" 63 81306", " Processed ");
		orderStatus.put(" 64 42004", " Processed ");

		Set<Map.Entry<String, String>> set = orderStatus.entrySet();
		for (Map.Entry<String, String> f : set) {
			System.out.println(f.getKey() + "  -  " + f.getValue());
		}
		System.out.println();
		return orderStatus;
	}

	public String getOrder_status() {
		afishoPorosistatus();
		return Order_status;
	}

	public void porositOnline() {
		System.out.println(
				"Klienti mund te porosise menu sa njesi deshiron , nga te gjitha kategorite e menuve duke paguar me cash ose me karte.");
	}
}
