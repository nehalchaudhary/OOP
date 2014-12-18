package heap;

import junit.framework.TestCase;

public class IngDecoratorTest extends TestCase {
	
	DynamicHeap heap;
	IngDecorator ingDecorator;
	
	protected void setUp() throws Exception {
		heap = new DynamicHeap(new MinHeap());
		heap.add("swim");
		heap.add("run");
		heap.add("winning");
		heap.add("blurt");
		heap.add("swimming");
		ingDecorator = new IngDecorator(heap);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testToString() {
		System.out.println(ingDecorator.toString());
		assertEquals("[winning, swimming]", ingDecorator.toString());
	}

	public final void testSize() {
		assertEquals(2, ingDecorator.size());
	}

}
