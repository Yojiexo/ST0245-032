import java.lang.IndexOutOfBoundsException; // Usar esto cuando se 
                                            //salga el índice
/**
 * @title LinkedListMauricio.java
 * @autor Mauricio Toro
 * @date 2018
 * @version 1
 * @availability https://github.com/mauriciotoro/ST0245-Eafit/blob/
 * master/talleres/taller07/java/LinkedListMauricio.java
 */
public class LinkedListJ {
    private Node first;
    private int size;
    public LinkedListJ()
    {
	size = 0;
	first = null;
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
	if (index >= 0 && index < size) {
	    Node temp = first;
	    for (int i = 0; i < index; i++) {
		temp = temp.next;
	    }
	    return temp;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }//T(n) = O(n)
    

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
	Node temp = null;
	try {
	    temp = getNode(index);
	} catch (IndexOutOfBoundsException e) {
	    e.printStackTrace();
	    System.exit(0);
	}

	return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
	return this.size;
    }
    
    /**
     * @autor Jefferson Villa Cortes
     * @version 0.1.0
     *
     * Inserta nuevo nodo en la posicion index
     */
    private void insertAt(int data, int index) 
	throws IndexOutOfBoundsException{
	if(size == 0 && index == 0){ //Lista vacia && Index == 0
	    //System.out.println("Insertando en lista vacia");
	    Node newnode = new Node(data);
	    newnode.next = this.first;
	    this.first = newnode;
	    this.size+= 1;
	    System.out.println(first.data);
	}else{
	    if(0 <= index && index <= size){ //Lista con elementos
		Node newnode = new Node(data);
		if(index == 0){ //Index == 0
		    newnode.next = this.first;
		    this.first = newnode;
		    this.size += 1;
		}else{ //Index != 0
		    Node tmp = this.first;
		    int i = 0;
		    while(i < index - 1){
			tmp = tmp.next;
			i++;
		    }
		    newnode.next = tmp.next;
		    tmp.next = newnode;
		    this.size += 1;
		}
	    }else{
		throw new IndexOutOfBoundsException();
	    }
	}
    } //T(n) = O(n)

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
	try{
	    insertAt(data, index); //
	}catch(IndexOutOfBoundsException e){
	    e.printStackTrace(); //O(?)
	    System.exit(0);
	}

    }

    // Borra el dato en la posición index
    public void remove(int index) 
    {
	if(0 <= index && index < this.size && size != 0){
	    if(index == 0){ //Index == 0
		this.first = this.first.next;
		this.size -= 1;
	    }else{ //Index != 0
		Node node = this.first;
		int i = 0;
		//recorro hasta llegar al nodo anterior a index
		while(i < index - 1){ //C1*n
		    node = node.next; //C2*n
		    i++; //C3*n
		}
		node.next = (node.next).next;
		this.size -= 1;
	    }
	}else{ throw new IndexOutOfBoundsException();}
    } //C1*n + C2*n
    //T(n) = O((C1 + C2)*n)
    //T(n) = O(n)

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
	Node node = this.first; //C1
	for(int i = 0; i < this.size; i++){ //C2*n
	    if(node.data == data) //C3*n
		return true; //C3*n
	    node = node.next; //C4*n
	}
	return false; //C5
    } //C1 + C2*n + C3*n + C4*n + C5
    //T(n) = (C2 + C3 + c4)*n + (C1 + C5)
    //T(n) es O( (C2 + C3 + c4)*n + (C1 + C5) ) 
    //T(n) es O( (C2 + C3 + c4)*n ) regla de la suma
    //T(n) es O(n) regla del producto

}