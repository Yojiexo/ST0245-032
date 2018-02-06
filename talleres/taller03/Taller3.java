
/**
 * Write a description of class Taller3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller3
{
  //Ejercicio 1 
    
    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 1, 2, 3);
    }
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
        if(n==1)
          System.out.println("mover de " + origen + "  a " + destino);
        else  { 
        torresDeHannoiAux(n-1, origen, intermedio, destino);
        System.out.println("mover de"+ origen + " a " + destino);
        torresDeHannoiAux(n-1, origen, intermedio, destino);
       }
    }
    //Ejercicio 2
     public static void combinations(String s) { 
        combinationsAux("", s); 
    }
        
    private static void combinationsAux(String prefix, String s) {  
        if (s.length() <= 0){System.out.print(prefix + ", "); return;}
        combinationsAux(prefix + s.substring(0, 1), s.substring(1, s.length()));
 	    combinationsAux(prefix, s.substring(1, s.length()));
		}
		//Ejercicio 3
		public static void permutation(String str) {
		permutation("", str); 
	}
	
	private static void permutation(String prefix, String str) {
		 if (str.length() <= 0){System.out.print(prefix + ", "); return;}
        permutation(prefix + str.substring(0, 1), str.substring(1, str.length()));
 	    permutation(prefix, str.substring(1, str.length()));
	}
		}
