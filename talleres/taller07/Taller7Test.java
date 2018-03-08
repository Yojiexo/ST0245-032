import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Taller7Test{
    
    @Test
	public void max(){
	LinkedListJ list = new LinkedListJ();
	list.insert(5, 0);
	list.insert(4, 0);
	list.insert(3, 0);
	list.insert(2, 0);
	list.insert(1, 0);
	list.insert(8, 4);
	list.insert(9, 6);
	assertEquals(9, Taller7.maxLinked(list, 0, list.size()- 1));
	list.insert(11, 0);
	assertEquals(11, Taller7.maxLinked(list, 0, list.size()- 1));
	list.insert(15, 8);
	assertEquals(15, Taller7.maxLinked(list, 0, list.size()- 1));
	list.insert(20, 4);
	assertEquals(20, Taller7.maxLinked(list, 0, list.size()- 1));
    }
    
    @Test
	public void compara(){
	LinkedListJ l1 = new LinkedListJ();
	l1.insert(5, 0);
	l1.insert(4, 0);
	l1.insert(3, 0);
	l1.insert(2, 0);
	l1.insert(1, 0);
	l1.insert(8, 4);
	l1.insert(9, 6);
	LinkedListJ l2 = new LinkedListJ();
	l2.insert(5, 0);
	l2.insert(4, 0);
	l2.insert(3, 0);
	l2.insert(2, 0);
	l2.insert(1, 0);
	l2.insert(8, 4);
	l2.insert(9, 6);
	assertTrue(Taller7.compara(l1, l2));
	l2.insert(590, 3);
	assertFalse(Taller7.compara(l1, l2));
	LinkedListJ v1 = new LinkedListJ();
	LinkedListJ v2 = new LinkedListJ();
	assertTrue(Taller7.compara(v1, v2));
	v1.insert(3, 0);
	assertFalse(Taller7.compara(v1, v2));
    }
}