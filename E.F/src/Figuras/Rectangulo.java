package Figuras;

public class Rectangulo extends Cuadrilatero {

	private double base;
	private double altura;
	private double area;
	private double perimetro;
	/**
	 * Crea la figura con el dato del lado y la altura
	 * Calcula el area y el perimetro de la figura
	 * @param b Base del Rectangulo
	 * @param h Altura del Rectangulo 
	 */
	public Rectangulo(double b, double h) {
		this.base=b;
		this.altura=h;
	}
	public double getArea()
	{
		return area;
	}
	public double getPerimetro()
	{
		return perimetro;
	}
	@Override
	public void area() {
		area=base*altura;
	}

	@Override
	public void perimetro() {
		perimetro=2*(base+altura);
	}

}
