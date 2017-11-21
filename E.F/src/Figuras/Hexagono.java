package Figuras;

public class Hexagono implements Poligono {

	 private double lado;
	 private double apotema;
	 private double area;
	 private double perimetro;
	/**
	 * Crea la figura con el dato del lado y el apotema
	 * Calcula el area y el perimetro de la figura
	 * @param l Alguno de los lados del hexagono
	 * @param ap Apotema del hexagono
	 */
	public Hexagono(double l, double ap)
	{
	this.lado=l;
	this.apotema=ap;
	}
	public double getLado()
	{
		return lado;
	}
	public double getApotema()
	{
		return apotema;
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
		area=3*lado*apotema;
	}

	@Override
	public void perimetro() {
		perimetro=6*lado;
	}


}
