package menaxhim.Restoranti;

import java.util.*;

public class CustomerLoyalty extends Customer {
	private String CustomerCode;

	public CustomerLoyalty() {
		CustomerCode = "11111";
	}

	public CustomerLoyalty(String nid, String emerMb, String nrCel, String adresa, String cardId, String username,
			String password, int CustomerId, String CustomerCode) {
		super();
		this.CustomerCode = CustomerCode;

	}

	public TreeMap<String, String> shfaqCustomerCode() {
		System.out.println("Klientët e besuar të restorantit jane:" + '\n');
		TreeMap<String, String> custCode = new TreeMap<String, String>();
		custCode.put("170120260520", "Anisa  Osmani");
		custCode.put("030418090918", "Entela Çelaj");
		custCode.put("020221120721", "Ermal Ormeni");
		custCode.put("030219060619", "Greta  Huda");
		custCode.put("300516121016", "Enea  Gramo");
		custCode.put("141119050320", "Vjollca Lacka");
		custCode.put("150722131222", "Migena  Musollari");
		custCode.put("060912210113", "Megi  Proda");
		custCode.put("180820160121", "Adela  Zaka");
		custCode.put("040422190922", "Ksanthipi  Koleka");
		custCode.put("081015260316", "Alma  Kastrati");
		custCode.put("240520220920", "Elisabeta  Dervishi");
		custCode.put("210718061218", "Enisa  Dervishi");
		custCode.put("070317210817", "Bejana  Oshafi");
		custCode.put("221016150317", "Xhuljana Shkëmbi");
		custCode.put("250221030721", "Eugen  Kellezi");
		custCode.put("160622141122", "Erinda  Shehu");
		custCode.put("270819270120", "Maria  Agaçi");
		custCode.put("240415260915", "Gazmend  Paja");
		custCode.put("290620221120", "Anjeza  Lacka");
		custCode.put("040110280611", "Erinda  Oshafi");
		custCode.put("130816080117", "Eduart  Ndoci");
		custCode.put("020118240618", "Ilia  Prifti");
		custCode.put("180512301012", "Sindi  Manushi");
		custCode.put("220209260709", "Pjerina  Voda");
		custCode.put("281016220317", "Anisa  Sallaku");
		custCode.put("291013250313", "Joni  Shalsi");
		custCode.put("050314110814", "Julia  Gjoka");
		custCode.put("061114120414", "Erda  Koroveshi");
		custCode.put("070720301220", "Erina  Grabocka");
		custCode.put("290319310819", "Redi  Banushi");

		Set<Map.Entry<String, String>> sets = custCode.entrySet();
		for (Map.Entry<String, String> ij : sets) {
			System.out.println("CustomerCode :" + ij.getKey() + " | " + "Klienti :" + ij.getValue());
		}
		System.out.println();
		return custCode;
	}

	public String getCustomerCode() {
		shfaqCustomerCode();
		return CustomerCode;
	}

	@Override
	public void kryejBlerjeApp() {
		System.out.println(
				"Klientet jane te 'besuarit' e restorantit , pasi kane tejkaluar limitin e porosive(20) brenda intervalit kohor 6 muaj");
	}
}
