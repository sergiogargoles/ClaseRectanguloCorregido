package src;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	private double cambiarValorDouble(String prueba) {
		String valor = "";
		do {
			Pantalla.escribirString("Indica el nuevo valor (no puede ser 0 ni una letra): ");
			valor = Teclado.leerString();
			
			if (!valor.isEmpty()) {
			
				try {
					this.altura = Double.parseDouble(valor);
				} catch (NumberFormatException e) {
					valor = "-1";
				}
			} else if (valor.isEmpty()) {
				switch(prueba){
				case ("altura"):
					return this.altura;
				case ("base"):
					return this.base;
				}
				
			}
		} while (Double.parseDouble(valor) < 0.0);
		return Double.parseDouble(valor);
		
	}
	
	
	private int cambiarValorInt(String prueba) {
		String valor = "";
		do {
			Pantalla.escribirString("Indica el nuevo valor (no puede ser 0 ni una letra): ");
			valor = Teclado.leerString();
			
			if (!valor.isEmpty()) {
			
				try {
					this.color = Integer.parseInt(valor);
				} catch (NumberFormatException e) {
					valor = "-1";
				}
			} else if (valor.isEmpty()) {
				switch(prueba){
				case ("color"):
					return this.color;
				case ("x"):
					return this.centro.getX();
				case ("y"):
					return this.centro.getY();
			}
		}
		} while (Double.parseDouble(valor) < 0.0);
		return Integer.parseInt(valor);
		
	}
	
	
	public void cambiarDatos() {
		String prueba = "";
		
		System.out.println("A continuación, se procederá a cambiar la altura");
		prueba = "altura";
		this.altura = cambiarValorDouble(prueba);

		System.out.println("A continuación, se procederá a cambiar la base");
		prueba = "base";
		this.base = cambiarValorDouble(prueba);
		
		System.out.println("A continuación, se procederá a cambiar el color");
		prueba = "color";
		this.color = cambiarValorInt(prueba);
		System.out.println("A continuación, se procederá a cambiar la X");
		prueba = "x";
		this.centro.setX(cambiarValorInt(prueba));
		System.out.println("A continuación, se procederá a cambiar la Y");
		prueba = "y";
		this.centro.setY(cambiarValorInt(prueba));

		//Double.isNaN(Double.valueOf(alturaNueva));
		
		
	}
	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
