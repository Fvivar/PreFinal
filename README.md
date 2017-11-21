# PreFinal
Añadiendo solución a los sig. problemas
  1. En criptografía, el cifrado César, también conocido como cifrado por desplazamiento, código
  de César o desplazamiento de César, es una de las técnicas de cifrado más simples y más usadas. Es un
  tipo de cifrado por sustitución en el que una letra en el texto original es reemplazada por otra letra que se
  encuentra un número fijo de posiciones más adelante en el alfabeto. Por ejemplo, con un desplazamiento
  de 3, la A sería sustituida por la D (situada 3 lugares a la derecha de la A), la B sería reemplazada por
  la E, etc. Este método debe su nombre a Julio César, que lo usaba para comunicarse con sus generales.
  Escriba una clase en Java que incluya los siguientes métodos:
  ->String cifrarCesar(String frase, int distancia) el cual permite cifrar una frase aleatoria
  utilizando el alfabeto en idioma español, distinguiendo mayúsculas de minúsculas.
  ->String cifrarCesar(String frase, String alfabeto, int distancia) el cual permite cifrar
  una frase aleatoria utilizando el alfabeto proporcionado por el usuario.
  //Solución:
  Para el primer método cifrar se reciben 2 parámetros siendo estos una cadena que es la que se cifrará y un entero para el numero de posiciones a intercambiar.
  Como paso inicial se convierte la cadena ingresada a un arreglo de strings para luego poder recorrer dicho arreglo he ir cifrandolo
  Adicionalmente se crea un arreglo de strings con el alfabeto para poder realizar el cifrado.
  
   Para el segundo método cifrar se reciben 3 parámetros siendo estos una cadena que es la que se cifrará, un entero para el numero de    posiciones a intercambiar y una cadena con el albatedo deseado para intercambiar
  Como paso inicial se convierte la cadena ingresada a un arreglo de strings para luego poder recorrer dicho arreglo he ir cifrandolo
  Adicionalmente se crea un arreglo de strings con el alfabeto ingresado como tercer parámetro para poder realizar el cifrado.
  
  
  2.Defina una interfaz Poligono con los metodos area() y perimetro(). Luego, implemente
  las clases Triangulo, Cuadrilatero, Pentagono, Hexagono y Octagono que implementan esta
  interfaz con las implementaciones correctas de cada método.
  Adicionalmente implemente las clases TrianguloIsoceles, TrianguloEquilatero, Rectangulo y
  Cuadrado con sus correspondientes relaciones de herencia.
  Finalmente escriba una clase denominada FabricaFiguras que permita al usuario crear todos los tipos
  de polígono, proporcionando sus dimensiones geométricas y al ser fabricado informe el área y perímetro.
  //Solución:
  Nos encontramos ante un problema que requiere el uso de interfaces, clases y herencia. Por lo tanto procedemos a crear un interfaz llamada "Poligono" con los metodos Area y Perimetro. Luego creamos las clases requeridas realizando la implementación correcta de los metodos Área y perimetro correspondientes a cada clase segun sea la figura.
