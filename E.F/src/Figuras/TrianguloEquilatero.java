package Figuras;

public class TrianguloEquilatero extends Triangulo {

	private double lados;
	private double area;
	private double perimetro;
	
	/**
	 * Crea la figura con el dato del lado
	 * Calcula el area y el perimetro de la figura
	 * @param l Alguno de los lados del Triangulo Equilatero
	 */
	public TrianguloEquilatero(double l)
	{
		this.lados=l;
	}
	public double getLados()
	{
		return lados;
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
		area=(Math.sqrt(3))/4;
		area=area*(lados*lados);
	}

	@Override
	public void perimetro() {
		perimetro=3*lados;
	}
}
