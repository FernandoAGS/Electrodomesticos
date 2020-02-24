package domestico;

public class Television extends Electrodomestico {
	
	private final static int RESOLUCION =20;
	private final static boolean SINTONIZADOR = false;
	public int resolucion;
	public boolean sintonizador;
	
	public Television() {
		this(RESOLUCION,SINTONIZADOR);			
	}
	public Television (int _precio_base, int _peso) {
		super(_precio_base,_peso);
		
	}
	public Television(int _resolucion,boolean _sintonizador) {
		super();
		this.resolucion = _resolucion;
		this.sintonizador = _sintonizador;
	}
	public void precioFinal() {
		super.precioFinal();
		if(sintonizador = true && resolucion >40) {
			this.Preciotelecontodo();
		}
		else if (resolucion > 40) {
			this.precioTelepulgada();
		}
		else if ( sintonizador = true) {
			this.precioTeleSinto();
		}
	}
	
}
