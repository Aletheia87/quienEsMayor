package quienEsMayor;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String fecha1, fecha2;
		int dia1, mes1, ano1;
		int dia2, mes2, ano2;
		int mayor;
		
		System.out.println("Ingrese la primera fecha DD/MM/AAAA:");
		fecha1 = sc.nextLine();
		System.out.println("Ingrese la segunda fecha DD/MM/AAAA:");
		fecha2 = sc.nextLine();
		
		dia1=Integer.parseInt(fecha1.substring(0, 2));
		mes1=Integer.parseInt(fecha1.substring(3, 5));
		ano1=Integer.parseInt(fecha1.substring(6, 10));
				
		dia2=Integer.parseInt(fecha2.substring(0, 2));
		mes2=Integer.parseInt(fecha2.substring(3, 5));
		ano2=Integer.parseInt(fecha2.substring(6, 10));
		
		if(ano1 < ano2) {
			mayor=1;
		}
		else if(ano2 < ano1) {
			mayor=2;
		}else 
		{
			mayor=0;
			if(mes1 < mes2) {
				mayor=1;
			}
			else if(mes2 < mes1) {
				mayor=2;
			}else {
				mayor=0;
				if(dia1 < dia2) {
					mayor=1;
				}
				else if(dia2 < dia1) {
					mayor=2;
				}else {
					mayor=0;
				}
			}
			
			
		}
		
		
		if(mayor == 0) System.out.println("Tienen la misma edad");
		if(mayor == 1) System.out.println("Persona 1 es mayor");
		if(mayor == 2) System.out.println("Persona 2 es mayor");
		
		
	sc.close();
	}

}
