
/**
 * Write a description of class Taller__5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller__5
{
    ///ArrayMax
    public static int arrayMax(int[] array, int n) {
        int i, max, temp;
        max = array[n];
        if (n != 0) {
            temp = arrayMax(array, n-1);
            if (temp > max){
                max = temp;
            }
           
          }
        
         return max;
    }
    
    //groupSum
    //public static boolean groupSum(int start, int[] nums, int target) {
        //...
    //}
    
    
    //fibonacci
    //public static long fibonacci(int n) { 
        //... 
    //}
}
