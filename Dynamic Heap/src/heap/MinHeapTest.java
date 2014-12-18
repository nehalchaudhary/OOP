package heap;

import junit.framework.TestCase;

public class MinHeapTest extends TestCase {
	
	DynamicHeap minHeap;
	
	protected void setUp() throws Exception {
		minHeap = new DynamicHeap(new MinHeap());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testAdd() {
		assertEquals(true, minHeap.add("swim"));
		assertEquals(false, minHeap.add(""));
	}

}
