import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    @Test
	public void testInsert() {
	LinkedListJ list = new LinkedListJ();
	list.insert(5, 0);
	list.insert(4, 0);
	list.insert(3, 0);
	list.insert(2, 0);
	list.insert(1, 0);
	list.insert(8, 4);
	list.insert(9, 6);
	for (int i = 0; i < list.size(); i++){	    
	    assertEquals(list.get(0),1);
	    assertEquals(list.get(1),2);
	    assertEquals(list.get(2),3);
	    assertEquals(list.get(3),4);
	    assertEquals(list.get(4),8);
	    assertEquals(list.get(5),5);
	    assertEquals(list.get(6),9);
	}
    }

    @Test
	public void testRemove() {
	LinkedListJ list = new LinkedListJ();
	list.insert(5, 0);
	list.insert(4, 0);
	list.insert(3, 0);
	list.insert(2, 0);
	list.insert(1, 0);
	assertTrue(list.contains(3));
	list.remove(2);
	assertFalse(list.contains(3));
	list.remove(0);
	assertFalse(list.contains(1));
    }

    @Test
	public void testContains() {
	LinkedListJ list = new LinkedListJ();
	list.insert(5, 0);
	list.insert(4, 0);
	list.insert(3, 0);
	list.insert(2, 0);
	list.insert(1, 0);
	assertTrue(list.contains(3));
	assertFalse(list.contains(10));
    }

}