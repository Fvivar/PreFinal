package Figuras;

public class TrianguloIsoceles extends Triangulo {
	private double lados;
    private double base;
	private double area;
	private double perimetro;
	
	/**
	 * Crea la figura con el dato de alguno de los lados
	 * de igual valor y el lado restante 
	 * Calcula el area y el perimetro de la figura
	 * @param l Alguno de los lados iguales del Triangulo Isoceles
	 * @param b Lado restante del Triangulo Isoceles
	 */
	public TrianguloIsoceles(double l, double b)
	{
		this.lados=l;
		this.base=b;
	}
	public double getLados()
	{
		return lados;
	}
	public double getBase()
	{
		return base;
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
		area=base*(Math.sqrt((lados*lados)-((base*base)/4)));
		area=area/2;
	}

	@Override
	public void perimetro() {
		perimetro=(2*lados)+base;
	}
}
