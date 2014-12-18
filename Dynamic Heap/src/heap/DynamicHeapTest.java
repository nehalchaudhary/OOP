package heap;

import junit.framework.TestCase;

public class DynamicHeapTest extends TestCase {
	
	DynamicHeap minHeap,maxHeap;
	
	protected void setUp() throws Exception {
		minHeap = new DynamicHeap(new MinHeap());
		maxHeap = new DynamicHeap(new MaxHeap());
		minHeap.add("swim");
		minHeap.add("run");
		minHeap.add("winning");
		minHeap.add("blurt");
		minHeap.add("swimming");
		maxHeap.add("swim");
		maxHeap.add("run");
		maxHeap.add("winning");
		maxHeap.add("blurt");
		maxHeap.add("swimming");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testAdd() {
		assertEquals(true,minHeap.add("bug"));
		assertEquals(false,minHeap.add(""));
		assertEquals(true,maxHeap.add("bug"));
		assertEquals(false,maxHeap.add(""));
	}

	public final void testSize() {
		assertEquals(5, minHeap.size());
	}

	public final void testToString() {
		assertEquals("[swim, run, blurt, winning, swimming]",minHeap.toString());
		assertEquals("[blurt, run, winning, swim, swimming]",maxHeap.toString());
	}

}
