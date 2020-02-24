package domestico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;





public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Electrodomestico> Listeilor  = new ArrayList<Electrodomestico>();
		int contador=0;
		Scanner lector = new Scanner(System.in);
		String opcion = "";
		while(opcion!="d") {
			opcion=JOptionPane.showInputDialog("Ingresa una de las opciones: \na.Agregar Electrodomestico \nb.Mostrar electrodomestico \nc.Resumen \nd.Salir");
			
			if (opcion.equals("a")) {
				String tipoelectro= "";
				tipoelectro = JOptionPane.showInputDialog("Ingresa el tipo de electrodomestico : \na.Tele \nb.lavadora \nc.Generico");
				if(tipoelectro.equals("a")) {
					Television temp;
					temp = new Television(Integer.parseInt(JOptionPane.showInputDialog("Resolucion"))
							,lector.hasNextInt());
					//temp = new AnimalTerrestre("pepe","china","02-23-20",4,"dog show",12);
					Listeilor.add(temp);
					contador++;
					
				}
				else if(tipoelectro.equals("b")) {
					Lavadora temp1;
					temp1 = new Lavadora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese carga")));
					//temp = new AnimalTerrestre("pepe","china","02-23-20",4,"dog show",12);
					Listeilor.add(temp1);
					contador++;
			    }
				else if(tipoelectro.equals("c")) {
					Electrodomestico temp2;
					temp2 = new Electrodomestico();
							
					Listeilor.add(temp2);
					contador++;
			    }

			}
		
				
				
			else if (opcion.equals("c")) {
				for (int i = 0; i < contador; i++) {
					Listeilor.get(i).precioFinal();;
					System.out.println(Listeilor.get(i));
					
				}
			}
			else if (opcion.equals("d")){
				opcion ="d";
			}
			
			}
		}
		
	
	

}