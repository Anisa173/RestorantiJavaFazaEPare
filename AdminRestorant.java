package menaxhim.Restoranti;

import java.util.*;

public class AdminRestorant {
	private String username;
	private String password;
	private LinkedList<CustomerLoyalty> clo;
	private ArrayList<Orders> ord;
	private LinkedList<Dish> d;

    public AdminRestorant() {
	username = "username";
    password = "password";
    }
	public AdminRestorant(String username,String password,LinkedList<CustomerLoyalty> clo,ArrayList<Orders> ord,LinkedList<Dish> d) {
    	this.username = username;
		this.password = password;
		this.setClo(clo);
		this.setOrd(ord);
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
	/**
	 * @return the clo
	 */
	public LinkedList<CustomerLoyalty> getClo() {
		return clo;
	}
	/**
	 * @param clo the clo to set
	 */
	public void setClo(LinkedList<CustomerLoyalty> clo) {
		this.clo = clo;
	}
	/**
	 * @return the ord
	 */
	public ArrayList<Orders> getOrd() {
		return ord;
	}
	/**
	 * @param ord the ord to set
	 */
	public void setOrd(ArrayList<Orders> ord) {
		this.ord = ord;
	}
	/**
	 * @return the d
	 */
	public LinkedList<Dish> getD() {
		return d;
	}
	/**
	 * @param d the d to set
	 */
	public void setD(LinkedList<Dish> d) {
		this.d = d;
	}
}
