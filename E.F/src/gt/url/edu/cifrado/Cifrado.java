package gt.url.edu.cifrado;

public class Cifrado {
/**
 * Metodo que cifra por 'Cifrado Cesar' la cadena ingresada como parametro
 * @param frase Cadena a cifrar
 * @param d Numero de posiciones delante por la cual reemplazada la letra 
 * @return
 */
	public String[] cifrar(String frase,int d)
	{
		String[] abcMayus = { "A", "B", "C", "D", "E","F","G","H","I","J","K",
				"L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            String[] abcMinus = { "a", "b", "c", "d", "e","f","g","h","i","j","k",
				"l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
            
		String[] f=frase.split("");
		int i = 0;
        int j = -1;
        int r = 0;
        
        
        while ((i != f.length)&&(j<28))
        {
        	char firstChar = frase.charAt(i);
            if (firstChar >= 'a' && firstChar <= 'z') {
               r=1;
            }
            j++;
            switch (r)
            {
                case 1:
                    if (f[i] == abcMinus[j])
                    {
                        if (f[i] == " ")
                        {
                            f[i] = f[i];
                        }
                        if ((j + d) >= 27)
                        {
                            f[i] = abcMinus[(j + d) % 27];
                            j = -1;
                            i++;
                        }
                        else
                        {
                            f[i] = abcMinus[j + d];
                            j = -1;
                            i++;
                        }
                    }
                    r = 0;
                    break;
                case 0:
                    if (f[i] == abcMayus[j])
                    {
                        if (f[i] == " ")
                        {
                            f[i] = f[i];
                        }
                        if ((j + d) >= 27)
                        {
                            f[i] = abcMayus[(j + d) % 27];
                            j = -1;
                            i++;
                        }
                        else
                        {
                            f[i] = abcMayus[j + d];
                            j = -1;
                            i++;
                        }
                    }
                    r = 0;
                    break;
            }
        }
		return f;
	}
	/**
	 * Metodo que cifra por 'Cifrado Cesar' la cadena ingresada como parametro
	 * @param frase Cadena a cifrar
	 * @param dist Numero de posiciones delante por la cual reemplazada la letra 
	 * @param abcI Alfabeto que se usara para cifrar la cadena ingresada
	 * @return
	 */
	public String[] cifrarCesar(String frase, int dist, String abcI)
	{
		String[] abc = abc.Split("");
		String[] f=frase.split("");
		int i = 0;
        int j = -1;
        int r = 0;
        
        
        while ((i != f.length)&&(j<(abc.length)+1))
        {
        	char firstChar = frase.charAt(i);
            if (firstChar >= 'a' && firstChar <= 'z') {
               r=1;
            }
            j++;
            switch (r)
            {
                case 1:
                    if (f[i] == abcMinus[j])
                    {
                        if (f[i] == " ")
                        {
                            f[i] = f[i];
                        }
                        if ((j + d) >= (abc.length))
                        {
                            f[i] = abcMinus[(j + d) % (abc.length)];
                            j = -1;
                            i++;
                        }
                        else
                        {
                            f[i] = abcMinus[j + d];
                            j = -1;
                            i++;
                        }
                    }
                    r = 0;
                    break;
                case 0:
                    if (f[i] == abcMayus[j])
                    {
                        if (f[i] == " ")
                        {
                            f[i] = f[i];
                        }
                        if ((j + d) >= (abc.length))
                        {
                            f[i] = abcMayus[(j + d) % (abc.length)];
                            j = -1;
                            i++;
                        }
                        else
                        {
                            f[i] = abcMayus[j + d];
                            j = -1;
                            i++;
                        }
                    }
                    r = 0;
                    break;
            }
        }
		return f;
	}

}

