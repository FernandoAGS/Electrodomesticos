package domestico;

public class Lavadora extends Electrodomestico {
	private static int CARGA=5;
	private int carga;
	
	public Lavadora() {
		this(CARGA);
	}
	public Lavadora(int _precio_base, int _peso) {
		super(_precio_base,_peso);
		this.carga = 5;
	}
	public Lavadora(int _carga) {
		super();
		this.carga =_carga;
	}
	/**
	 * getter setter
	 * @return
	 */
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {

		this.carga = carga;
	}

	public void precioFinal() {
		super.precioFinal();
		if(carga>=30) {
			this.SumaPrecioFinalLavadora(50);
			
		}
	}
}
