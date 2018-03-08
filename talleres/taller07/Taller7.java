/**
 * @autor Jefferson Villa
 */
public class Taller7{

    /**
     * @param list: lista enlazada sobre la que se va a operar
     * @param start: limite izquierdo del rango de busqueda
     * @param end: limite derecho del rango de busqueda
     * @return int: valor del elemento maximo en la lista
     *
     * Calcula el maximo valor de los elementos de una lista enlazada
     */
    public static int maxLinked(LinkedListJ list, int start, int end){
	if(end - start == 0) return list.get(start); //C1
	int left = maxLinked(list, start, (start+end)/2); //C2*T(n/2)
	int right = maxLinked(list, ((start+end)/2)+1, end); //C3*T(n/2)
	return (left > right)? left : right; //C4
    }//C1 + C2*T(n/2) + C3*T(n/2) + C4

    /**
     * @param l1: lista 1
     * @param l2: lista 2
     * @return boolean: true = son iguales, false = son diferentes
     *
     * Compara dos listas
     */
    public static boolean compara(LinkedListJ l1, LinkedListJ l2){
	if(l1.size() != l2.size()) return false;
	if(l1.size() == 0) return true;	
	for(int i = 0; i < l1.size(); i++)
	    if(l1.get(i) != l2.get(i))
		return false;
	return true;
    }//O(n³)
    
}