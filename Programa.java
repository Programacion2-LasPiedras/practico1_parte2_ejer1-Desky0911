import java.util.Scanner;

public class Programa {
	
	 //Definición de las variables para cargar los datos
	 
	 Scanner entrada=new Scanner(System.in);
	String apellido;
	int edad;
	double altura;
	String unidad;
	long cedula;
	 void iniciar(){
				
		cargar();
		imprimir();
	
	}
//Escribir aquí el método cargar
//Este método deberá cargar desde el teclado los datos necesarios
void cargar(){
System.out.println("ingrese su apellido: ");
	apellido = entrada.nextLine();
System.out.println("Ingrese su edad: ");
	edad = entrada.nextInt();
System.out.println("Ingrese su Cedula (Sin puntos ni guiones Ej. 12345678: ");
	cedula = entrada.nextLong();	
System.out.println("Ingrese su altura: ");
	altura = entrada.nextDouble();
		if (altura <5) {
				unidad = "metros";
			}
		else unidad = "cemtimetros"; 	
}

//Escribir aquí el método imprimir
//Este método deberá mostrar en pantalla  los datos cargados
void imprimir(){
System.out.println("Su apellido es: " + apellido + " tiene " + edad + " años, su cedula de identidad es: " +       cedula + " y mide " + altura + " " + unidad);
}


}