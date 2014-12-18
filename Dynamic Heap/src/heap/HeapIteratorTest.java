package heap;

import java.util.Iterator;
import junit.framework.TestCase;

public class HeapIteratorTest extends TestCase {
	DynamicHeap minHeap1,minHeap2;
	Iterator<String> iterator1,iterator2;
	
	protected void setUp() throws Exception {
		minHeap1 = new DynamicHeap(new MinHeap());
		minHeap2 = new DynamicHeap(new MinHeap());
		minHeap1.add("swim");
		minHeap1.add("run");
		minHeap1.add("winning");
		minHeap1.add("blurt");
		iterator1 = minHeap1.iterator();
		iterator2 = minHeap2.iterator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testHasNext() {
		assertEquals(true, iterator1.hasNext());
		assertEquals(false, iterator2.hasNext());//No elements in MinHeap2
	}

	public final void testNext() {
		assertEquals("swim", iterator1.next());
		assertEquals("run", iterator1.next());
	}

}
