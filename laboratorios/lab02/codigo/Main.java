import java.util.Random;

/**  
 * @autor Jefferson Villa
 * @version 0.1.0
 *
 * This class tests the methods of Punto1 and Punto1_2 
 * with large amount of data
 */
public class Main{

    /**
     * @title Cómo generar arreglos con valores aleatorios en Java
     * @autor Mauricio Toro
     * @date 2018
     * @version 1
     * @availability http://interactiva.eafit.edu.co
     *
     *
     * @param n: size of the array to generate
     * @return int[]: array with random data
     * 
     * Generates an array of size n with random data
     */
    private static int[] newArray(int n){	
	int max = 5000;
	int[] array = new int[n];
	Random generator = new Random();
	for (int i =0; i<n; i++)
	    array[i] = generator.nextInt(max);
	return array;
    }
    
    /**
     * @title Cómo calcular el tiempo que toma un código 
     * en ejecutarse en Java
     * @autor Mauricio Toro
     * @date 2018
     * @version 1
     * @availability http://interactiva.eafit.edu.co
     *
     * @param n: array size
     * @return long: time
     *
     * returns the run time for arraySum with diferent array sizes
     */
    private static long timeArraySum(int n){
	int[] array = newArray(n);
	long startTime = System.currentTimeMillis();
	//System.out.println("start: "+startTime);
	int sum = Punto1.arraySum(array);
	long endTime = System.currentTimeMillis();
	//System.out.println("End: "+endTime);
	//System.out.println("Sum: "+sum);
	return endTime - startTime;		
    }
/**
     * @title Cómo calcular el tiempo que toma un código 
     * en ejecutarse en Java
     * @autor Mauricio Toro
     * @date 2018
     * @version 1
     * @availability http://interactiva.eafit.edu.co
     *
     * @param n: array size
     * @return long: time
     *
     * returns the run time for arrayMax with diferent array sizes
     */
    private static long timeArrayMax(int n){
	int[] array = newArray(n);
	long startTime = System.currentTimeMillis();
	//System.out.println("start: "+startTime);
	int sum = Punto1.arrayMax(array);
	long endTime = System.currentTimeMillis();
	//System.out.println("End: "+endTime);
	//System.out.println("Sum: "+sum);
	return endTime - startTime;		
    }

    /**
     *@title Cómo calcular el tiempo que toma un código 
     * en ejecutarse en Java
     * @autor Mauricio Toro
     * @date 2018
     * @version 1
     * @availability http://interactiva.eafit.edu.co
     *
     * @param n: array size
     * @return long: time
     *
     * returns the run time for fibo with diferent array sizes
     */
    private static long timeFibo(int n){
	long startTime = System.currentTimeMillis();
	//System.out.println("start: "+startTime);
	int sum = Punto1.fibo(n);
	long endTime = System.currentTimeMillis();
	//System.out.println("End: "+endTime);
	//System.out.println("Sum: "+sum);
	return endTime - startTime;		
    }

    public static void main(String args[]){
	/*System.out.println("ArraySum");
	System.out.println("Time: "+ timeArraySum(100000));
	System.out.println("Time: "+ timeArraySum(1000000));
	System.out.println("Time: "+ timeArraySum(10000000));
	System.out.println("Time: "+ timeArraySum(100000000));*/
	System.out.println("ArrayMax");
	System.out.println("Time: "+ timeArrayMax(100000));
	System.out.println("Time: "+ timeArrayMax(1000000));
	System.out.println("Time: "+ timeArrayMax(10000000));
	System.out.println("Time: "+ timeArrayMax(100000000));
	/*System.out.println("Fibonacci");
	System.out.println("Time: "+ timeFibo(20));
	System.out.println("Time: "+ timeFibo(30));
	System.out.println("Time: "+ timeFibo(40));
	System.out.println("Time: "+ timeFibo(50));*/
	
    }
}