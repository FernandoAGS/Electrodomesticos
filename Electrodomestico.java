package domestico;

public class Electrodomestico {
	public final static int PRECIO_BASE =100;
	public final static String COLOR ="blanco";
	public final static char CONSU_ENE ='F';
	public final static int PESO =5;
	private double precio_base;
	private String color;
	private char consu_ene;
	private int peso;
	public double preciofinal;
	
	public Electrodomestico() {
		this(PRECIO_BASE, COLOR,CONSU_ENE,PESO);
		
	}
	public Electrodomestico( int _precio_base, int _peso) {
		this.peso = _peso;
		this.precio_base = _precio_base;
		this.color = "blanco";
		this.consu_ene ='F';	
	}
	public Electrodomestico( int _precio_base,String _color,  char _consu_ene, int _peso) {
		this.peso = _peso;
		this.precio_base = _precio_base;
		comprobarColor(_color);
		this.color = _color;
		comprobarConsumoEnergetico(_consu_ene);
		this.consu_ene =_consu_ene;	
		
	}
	/**Metodo encargado de comparar las letras que podrian ser ingresadas en el constructor del objeto, en caso de  que ocurriera
	 * un error, por defecto el valor sera F
	 * 
	 */
	public  void comprobarConsumoEnergetico(char letra) {
		if( letra=='A' ||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
			this.consu_ene = letra;
		}else {
			this.consu_ene ='F';
		}
	}
	/**
	 * Metodo encargado de compara el color ingresado con los colores definidos en el metodo, ignorando 
	 * si es mayuscula o minuscola, por defecto sera blanco el color principal
	 * @param colors
	 */
	public  void comprobarColor(String colors) {
		if ( colors.equalsIgnoreCase("blanco")||colors.equalsIgnoreCase("negro")||colors.equalsIgnoreCase("rojo")
				||colors.equalsIgnoreCase("azul")||colors.equalsIgnoreCase("gris")) {
			this.color = colors;
		}else {
			this.color = "blanco";
		}
	}
	/**
	 * Metodo Encargado de definir los valores finales que tendran el producto segun el consumo energetico y peso
	 */
	public void precioFinal() {
		switch(consu_ene) {
		case'A':
			if (0<peso && peso<=19) {
				preciofinal =(precio_base + 100 + 10);
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 100 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 100 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 100 + 100);
			}
			break;
		case'B':
			if (0<peso && peso<=19) {
				preciofinal =(precio_base + 80 + 10);
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 80 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 80 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 80 + 100);
			}
			break;
		case'C':
			if (0<peso && peso<=19) {
				preciofinal =(precio_base + 60 + 10);
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 60 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 60 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 60 + 100);
			}
			break;
		case'D':
			if (0<peso && peso<=19) {
				preciofinal =(precio_base + 50 + 10);
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 50 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 50 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 50 + 100);
			}
			break;
		case'E':
			if (0<peso && peso<=19) {
				preciofinal =(precio_base + 30 + 10);
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 30 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 30 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 30 + 100);
			}
			break;
		case'F':
			if (0<peso && peso<=19) {
				//int lele=;
				preciofinal =precio_base + 10 + 10;
			}
			else if (20<=peso && peso<=49) {
				preciofinal =(precio_base + 10 + 50);
			}
			else if (50<=peso && peso<=79) {
				preciofinal =(precio_base + 10 + 80);
			}
			else if (peso>80) {
				preciofinal =(precio_base + 10 + 100);
			}
			break;
		default:
			System.out.println("error");
		}
	}
	/**Getters setter
	 * 
	 * @return
	 */
	public double getPrecio_base() {
		return precio_base;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsu_ene() {
		return consu_ene;
	}
	
	public int getPeso() {
		return peso;
	}

	public double getPreciofinal() {
		return preciofinal;
	}
	public void SumaPrecioFinalLavadora(int preciocarga) {
		this.preciofinal = precio_base+ preciocarga;
	}
	public void Preciotelecontodo() {
		this.preciofinal = (this.precio_base*0.3)+50+precio_base;
	}
	public void precioTelepulgada() {
		this.preciofinal = (this.precio_base*03)+this.preciofinal+precio_base;
	}
	public void precioTeleSinto() {
		this.preciofinal = this.preciofinal+50+precio_base;
	}
	
	

	public void mostrar() {
		System.out.println(toString());
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consu_ene=" + consu_ene
				+ ", peso=" + peso + ", preciofinal=" + preciofinal + "]";
	}	
	
}
