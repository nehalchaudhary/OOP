
/*
 * Name             :- Nehal Chaudhary
 * OOP Assignment 1 :- Implement Min-Heap(Test cases)
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AssignmentHeapTest {
	AssignmentHeap heap;
	
	@Before
	public void setUp() throws Exception {
		heap = new AssignmentHeap();
	}

	@Test
	public final void testAddNode() {
		Boolean returnvalue = heap.addNode("nehal");
		assertTrue(returnvalue);
		heap.addNode("ping");
		assertTrue(returnvalue);
		heap.addNode("ing");
		assertTrue(returnvalue);
		returnvalue = heap.addNode("1");
		assertTrue(returnvalue);
		returnvalue = heap.addNode("");
		assertFalse(returnvalue);
	}

	@Test
	public final void testCalculateHeight() {
		Integer height = heap.calculateHeight(null);
		assertEquals(height,-1);
	}

}
