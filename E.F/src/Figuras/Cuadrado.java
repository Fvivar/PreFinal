package Figuras;

public class Cuadrado extends Cuadrilatero{

	private double lado;
	private double area;
	private double perimetro;
	/**
	 * Crea la figura con el dato del lado
	 * Calcula el area y el perimetro de la figura
	 * @param l Alguno de los lados del cuadrado
	 */
	public Cuadrado(double l) {
		this.lado=l;
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	@Override
	public void area() {
		area=lado*lado;
	}

	@Override
	public void perimetro() {
		perimetro=4*lado;
	}

}
