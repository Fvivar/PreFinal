package Figuras;

import java.util.Scanner;

public class FabricaFiguras {

	public static void main(String[] args) {
		String[] q="HoLa".split("");
		boolean exit=false;
		while(exit==false)
		{
			System.out.println("Escoga alguna de las siguientes opciones para fabricar la figura o salir del programa \n"
					+ "1. Cuadrado \n"
					+ "2. Rectangulo \n"
					+ "3. Triangulo Equilatero \n"
					+ "4. Triangulo Isoceles \n"
					+ "5. Pentagono \n"
					+ "6. Hexagono \n"
					+ "7. Octagono \n"
					+ "8. Salir del programa");
			System.out.print("");
			Scanner scan = new Scanner(System.in);
			
			int f = scan.nextInt();
	        switch (f) {
	            case 1:  
	            	System.out.println("Ingrese el lado del cuadrado");
	            	double cLado=Double.parseDouble(scan.next());
	            	Cuadrado c = new Cuadrado(cLado);
	            	c.area();
	            	c.perimetro();
	            	System.out.println("Area: "+c.getArea()+"\n Perimetro: "+c.getPerimetro());
	            	
	                     break;
	            case 2:  
	            	System.out.println("Ingrese la base del rectangulo");
	        	    double rBase=Double.parseDouble(scan.next());
	        	    System.out.println("Ingrese la altura del rectangulo");
	        	    double rAlt=Double.parseDouble(scan.next());
	        	    Rectangulo r = new Rectangulo(rBase, rAlt);
	        	    r.area();
	        	    r.perimetro();
	        	    System.out.println("Area: "+r.getArea()+"\n Perimetro: "+r.getPerimetro());
	                     break;
	            case 3:  
	            	System.out.println("Ingrese alguno de los lados del triangulo");
	        	    double tlado=Double.parseDouble(scan.next());
	        	    TrianguloEquilatero tEquilatero = new TrianguloEquilatero(tlado);
	        	    tEquilatero.area();
	        	    tEquilatero.perimetro();
	        	    System.out.println("Area: "+tEquilatero.getArea()+"\n Perimetro: "+tEquilatero.getPerimetro());
	                     break;
	            case 4:  
	            	System.out.println("Ingrese alguno de los lados iguales del triangulo");
	        	    double tlados=Double.parseDouble(scan.next());
	        	    System.out.println("Ingrese el lado restante del triangulo");
	        	    double tlado2=Double.parseDouble(scan.next());
	        	    TrianguloIsoceles tI = new TrianguloIsoceles(tlados,tlado2);
	        	    tI.area();
	        	    tI.perimetro();
	        	    System.out.println("Area: "+tI.getArea()+"\n Perimetro: "+tI.getPerimetro());
	                     break;
	            case 5:  
	            	System.out.println("Ingrese alguno de los lados del Pentagono");
	        	    double lPent=Double.parseDouble(scan.next());
	        	    System.out.println("Ingrese el apotema del Pentagono");
	        	    double aPent=Double.parseDouble(scan.next());
	        	    Pentagono p=new Pentagono(lPent,aPent);
	        	    p.area();
	        	    p.perimetro();
	        	    System.out.println("Area: "+p.getArea()+"\n Perimetro: "+p.getPerimetro());
	                     break;
	            case 6:
	        	    System.out.println("Ingrese alguno de los lados del Hexagono");
	        	    double lHex=Double.parseDouble(scan.next());
	        	    System.out.println("Ingrese el apotema del Hexagono");
	        	    double aHex=Double.parseDouble(scan.next());
	        	    Hexagono hex=new Hexagono(lHex,aHex);
	        	    hex.area();
	        	    hex.perimetro();
	        	    System.out.println("Area: "+hex.getArea()+"\n Perimetro: "+hex.getPerimetro());
	                     break;
	            case 7:  
	            	System.out.println("Ingrese alguno de los lados del Octagono");
	        	    double lOct=Double.parseDouble(scan.next());
	        	    System.out.println("Ingrese el apotema del Octagono");
	        	    double aOct=Double.parseDouble(scan.next());
	        	    Octagono o=new Octagono(lOct,aOct);
	        	    o.area();
	        	    o.perimetro();
	        	    System.out.println("Area: "+o.getArea()+"\n Perimetro: "+o.getPerimetro());
	                     break;
	            case 8:
	            	exit=true;
	            	System.exit(0);
	            default: System.out.println("Invalid operation");
	                     break;
	        }
		}
	}

}
