package menaxhim.Restoranti;

public class AppR extends Restorant {
    private String idApp;
	private String emerApp;
    
	public AppR() {
	
	}
	/**
	 * @return the idApp
	 */
	public AppR(String idApp,String emerApp,String emerR, String FusheAktiviteti, String idRestorant, String vendodhjeR, String zonaSherbimi,
			String orariSherbimit, String nrTelefoni, String formaPagese) {
	super(emerR,FusheAktiviteti, idRestorant, vendodhjeR, zonaSherbimi,
			orariSherbimit, nrTelefoni, formaPagese);
	this.idApp = idApp;
	this.emerApp = emerApp;
	}
	public String getIdApp() {
		return idApp;
	}
	
	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}
	
	public String getEmerApp() {
		return emerApp;
	}
	
	public void setEmerApp(String emerApp) {
		this.emerApp = emerApp;
	}

}
