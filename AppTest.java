package menaxhim.Restoranti;

public class AppTest {
	static Dish d = new Dish();
	static Orders o = new Orders();
	static Customer c = new Customer();
	static CustomerLoyalty clo = new CustomerLoyalty();
	static Restorant r = new Restorant();
	static AdminRestorant aR = new AdminRestorant();
	static AppR app = new AppR();

	public static void main(String[] args) {
		r.setEmerR("SushiCO Albania");
		r.getEmerR();
		r.setIdRestorant("M11623013S");
		r.getIdRestorant();
		r.setFusheAktiviteti(
				"Ne fushen e prodhimit dhe furnizimit te ushqimit,shperndarje te ushqimeve me porosi, katering, bar-kafe,sushi, aktivitete holding, tregetim te produkteve te ndryshme industriale me pakice. Transporti rrugor i produkteve te veta.Import-Eksport.");
		r.getFusheAktiviteti();
		r.setOrariSherbimit("11:30 - 23:30");
		r.getOrariSherbimit();
		r.setNrTelefoni("+355 69 70 333 99");
		r.getNrTelefoni();
		r.setVendodhjeR("Rruga Nikolla Tupe, Nd nr 2 , Tirana 1001");
		r.getVendodhjeR();
		r.getFormëPagese();
		r.getZonaSherbimi();

		app.setIdApp("String idApp");
		app.getIdApp();
		app.setEmerApp("SushiCO Albania");
		app.getIdApp();

		aR.setUsername("atdhe.lena@gmail.com");
		aR.getUsername();
		aR.setPassword("tp1AL3@&");
		aR.getPassword();
		aR.getD();
		aR.getCl();
		aR.getOrder();
		aR.getPorosiKlienti();

		d.getDishName();
		d.getDishDescription();
		d.getDishPrize();
		d.getDishId();
		d.getDishItemsPerType();

		o.getOrderItems();
		o.getOrderPrize();
		o.getOrderId();
		o.getOrder_status();
		o.getOrderTimeC();
		o.getOrderProcessed();

		c.getEmerMb();
		c.getNid();
		c.getCustomerId();
		c.getNrCel();
		c.getUsername();
		c.getPassword();
		c.getAdresa();
		c.getCardId();

		clo.getCustomerCode();

	}

}
