package Figuras;

public class Octagono implements Poligono {

	private double area;
	private double perimetro;
	private double lado;
	private double apotema;
	
	/**
	 * Crea la figura con el dato del lado y el apotema
	 * Calcula el area y el perimetro de la figura
	 * @param l Alguno de los lados del Octagono
	 * @param ap Apotema del octagono
	 */
	public Octagono(double l, double ap)
	{
		this.lado=l;
		this.apotema=ap;
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
		area=4*lado*apotema;
	}

	@Override
	public void perimetro() {
		perimetro=8*lado;
	}


}
