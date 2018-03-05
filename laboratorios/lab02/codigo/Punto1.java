import java.util.Arrays;

/**
 * 
 * @autor Jefferso Villa, Gustavo ojeda
 * @version 1
 *
 * This class contains the methods of 
 * the point 1.1 of the second Laboratory
 * 
 * All the methods, except main, use recursion.
 */
public class Punto1{

    /**
     * @return int: Sum of the elements in the input
     * @param a: array of integers
     *
     * This method return the sum of the elements in the array.
     */
    public static int arraySum(int[] a){
	/*for(int x: a) System.out.print(" "+x);
	  System.out.print("\n");*/
	return((a.length<=1)?(a[0]):
	     (arraySum(Arrays.copyOfRange(a, 0, (a.length)/2)) 
	      +arraySum(Arrays.copyOfRange(a,((a.length)/2),a.length))));
	//T(n) = T(n/2) + T(n/2) + c = 2T(n/2) + c = 2n-1 
	//T(n) = O(n)
    }
    
    /**
     * @return int: Greatest element in the array
     * @param a: array of integers
     *
     * This method return the greatest element in the array.
     */
    public static int arrayMax(int[] a){
	/*for(int x: a) System.out.print(" "+x);
	  System.out.print("\n");*/
	if(a.length <= 1) return a[0];
	// T(n/2)
	int izq = arrayMax(Arrays.copyOfRange(a, 0, (a.length)/2));  
	//T(n/2)
	int der = arrayMax(Arrays.copyOfRange(a,(a.length)/2, a.length));
	return(izq >= der)? izq: der;
	
	//T(n/2) + T(n/2) = 2T(n/2) = 2n-1 = O(n)
	//T(n) = O(n)
    }

    /**
     * @return int: n-esimo element of the fibonacci serie
     * @param n: position of the number in the serie fibonacci
     *
     * This method return the n-esimo number of the fibonacci serie.
     */
    public static int fibo(int n){
	if(n<=0){
	    System.out.println("El " + n+ " no existe en fibonacci");
	    return 0;
	}
	if(n == 1) return 0;
	if(n == 2) return 1;
	return fibo(n-1) + fibo(n-2); //T(n-1) + T(n-2)
	//T(n) = O(2^n)
    }
    

    /**
     * This method contains the unit tests for arraySum
     */
    public static void testArraySum(){
	System.out.println("-----------arraySum----------");
	
	int[] a = {0}; int s = 0;
	System.out.print("{");
	for(int x: a) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tSum(a, s));
	
	int[] b = {5}; int t = 5;
	System.out.print("{");
	for(int x: b) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tSum(b, t));
	
	int[] c = {0, 2}; int w = 2;
	System.out.print("{");
	for(int x: c) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tSum(c, w));
	
	int[] d = {2, 3, 5}; int x = 10;
	System.out.print("{");
	for(int y: d) System.out.print(y+", ");
	System.out.println("}");
	System.out.println(tSum(d, x));
	
	int[] e = {1, 2, 3, 5}; int y = 11;
	System.out.print("{");
	for(int z: e) System.out.print(z+", ");
	System.out.println("}");
	System.out.println(tSum(e, y));
    }

    /**
     * This method contains the unit tests for arrayMax 
     */
    public static void testArrayMax(){
	System.out.println("-----------arrayMax----------");

	int[] a = {0}; int s = 0;
	System.out.print("{");
	for(int x: a) System.out.print(x+", ");
	System.out.println("}");	
	System.out.println(tMax(a, s));
	
	int[] b = {5}; int t = 5;
	System.out.print("{");
	for(int x: b) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tMax(b, t));
	
	int[] c = {0, 2}; int w = 2;
	System.out.print("{");
	for(int x: c) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tMax(c, w));
	
	int[] f = {2, 0}; int z = 2;
	System.out.print("{");
	for(int x: f) System.out.print(x+", ");
	System.out.println("}");
	System.out.println(tMax(f, z));
	
	int[] d = {2, 5, 3}; int x = 5;
	System.out.print("{");
	for(int y: d) System.out.print(y+", ");
	System.out.println("}");
	System.out.println(tMax(d, x));
	
	int[] e = {8, 7, 6, 5}; int y =8;
	System.out.print("{");
	for(int l: e) System.out.print(l+", ");
	System.out.println("}");
	System.out.println(tMax(e, y));
    }

    /**
     * This method contain the unit tests for fibo
     */
    public static void testFibo(){
	System.out.println("-------------------fibo-----------------");
	System.out.println("0-1-1-2-3-5-8-13-21-34-55-89-144-225-369");
	int[] fib = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};	
	for(int i = 1; i <=15; i++){
	    int f = fibo(i);
	    int g = fib[i-1];
	    //System.out.println(f);
	    //System.out.println(g);
	    System.out.println(tFib(f, g));
	}
    }
    
    
    /**
     * @param a: The array we're going to sum the elements
     * @param expected: Expected sum in the unit tests
     * @return String: message depending on the result of arraySum
     *
     * Checks that te result is the expected in the unit test
     */
    private static String tSum(int[] a, int expected){
	int out = arraySum(a);
	return (out == expected)? 
	    "Correcto "+out+" == "+expected:
	    "Incorrecto "+out+" != "+expected;
    }    
    
    /**
     * @param a: The array where we are going to search the maximum
     * @param expected: Expected sum in the unit tests
     * @return String: message depending on the result of arrayMax
     *
     * Checks that te result is the expected in the unit test
     */	
    private static String tMax(int[] a, int expected){
	int out = arrayMax(a);
	return (out == expected)? 
	    "Correcto "+out+" == "+expected: 
	    "Incorrecto "+out+" != "+expected;
    }

    
    /**
     * @param n: result of fibo for the n-esimo number of the serie
     * @param fib: value of the n-esimo number in the unit test
     * @return String: message dependent of the comparison
     *
     * Checks that the result of fibo is equals as the expected
     */
    private static String tFib(int n, int fib){
	return (fib == n)? 
	    "Correcto es "+n: 
	    "Incorrecto no es "+n;
    }
    
    /**
     * Test: arraySum, arrayMax, fibo.
     */
    public static void main(String[] args){

	//Test ArraySum
	testArraySum();
	
	//Test ArrayMax
	testArrayMax();
	
	//Test fibo
	testFibo();
    }

}