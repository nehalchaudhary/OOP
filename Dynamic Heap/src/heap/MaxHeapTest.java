package heap;

import junit.framework.TestCase;

public class MaxHeapTest extends TestCase {

	DynamicHeap maxHeap;
	protected void setUp() throws Exception {
		maxHeap = new DynamicHeap(new MaxHeap());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testAdd() {
		assertEquals(true, maxHeap.add("swim"));
		assertEquals(false, maxHeap.add(""));
	}

}
