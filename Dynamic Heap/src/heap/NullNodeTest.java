package heap;

import junit.framework.TestCase;

public class NullNodeTest extends TestCase {
	
	NullNode nullNode;
	
	protected void setUp() throws Exception {
		nullNode = new NullNode();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testCalculateHeight() {
		assertEquals(-1, nullNode.calculateHeight());
	}

	public final void testIsNull() {
		assertEquals(true, nullNode.isNull());
	}

}
