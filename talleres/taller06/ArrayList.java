package taller6;
import java.util.Arrays;
/** 
 *
 * @autor Jefferson Villa, Gustavo Ojeda
 */

public class ArrayListInt{
    
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];
    
    /*Inicializa los atributos size en cero y elements como un arreglo de
     * tamaño DEFAULT_CAPACITY.
     */
    public ArrayListInt(){
	this.size = 0;
	this.elements = new int[DEFAULT_CAPACITY];
    }
    
    //Retorna el tamaño de la lista
    public int size(){
	return size;
    }
    
    //Agrega un elemento e a la ultima posicion de la lista
    public void add(int e){
        if(elements.length == size){
            int b[] = new int[DEFAULT_CAPACITY * 2];
            for(int i = 0; i < elements.length ; i++)
                b[i] = elements[i];
            elements = b;
        }
        elements[size+1] = e;
    }
    
    //Retorna el elemento que se encuentra en la posicion i de la lista
    public int get(int i){
	if(i < 0 || i > size)
            throw new Exception("out of bounds");

	return this.elements[i];
    }

    //Agrega un elemento e en la posicion index de la lista
    public void add(int index, int n){
	if(index < 0 || index > size)
	    throw new Exception("out of bounds");	
	if(elements.length == size){
	    int b[] = new int[DEFAULT_CAPACITY * 2];
	    for(int i = 0; i < elements.length ; i++)
		b[i] = elements[i];
	    elements = b;
	}
	for(int i = elements.length; i > index; i--)
	    elements[i] = elements[i-1];
	elements[index] = n;
   
    }
}
