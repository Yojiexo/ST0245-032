public class Taller2 {
    
    //Ejercicio 1   Algoritmo de Euclides
    public static int gcd(int p, int q){
       if(p % q == 0) return q;
    return gcd(q, p % q);
    }
    
    //Ejercicio 2   SumaGrupo   
    public static boolean SumaGrupo(int start, int[] nums, int target) {
       return (start >= nums.length) ? target == 0 : SumaGrupo(start + 1, nums, target - nums[start]) || SumaGrupo(start + 1, nums, target);        
    }    
    
    //Ejercicio 3   Combinaciones de letras de una cadena
    public static void combinations(String s) { 
        combinationsAux("", s); 
    }
        
		private static void combinationsAux(String prefix, String s) {  
			if (s.length() <= 0){System.out.print(prefix + ", "); return;}
  		combinationsAux(prefix + s.substring(0, 1), s.substring(1, s.length()));
  	  combinationsAux(prefix, s.substring(1, s.length()));
		}

}
