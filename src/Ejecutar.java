package src;

import daw.com.Pantalla;

public class Ejecutar {

	public static void main(String[] args) {
		
		Rectangulo prueba = new Rectangulo(4, new Punto(5,7), 5.0, 3.0);
		
		prueba.mostrarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		
		prueba.cambiarDatos();
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		prueba.mostrarDatos();
	}

}