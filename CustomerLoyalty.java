package menaxhim.Restoranti;

public class CustomerLoyalty extends Customer {
	private int CustomerId;

	public CustomerLoyalty() {

	}

	public CustomerLoyalty(String username, String password, String nid, String emer, String mbiemer, String nrCel,
			String adresa, String cardId, int CustomerId) {
		super();
		this.CustomerId = CustomerId;
	}





@Override
	public void kryejBlerjeApp() {
		System.out.println("Klienti tashme i besuar ka krijuar llogari dhe vijon te kryeje blerje ne App.");
	}
}


