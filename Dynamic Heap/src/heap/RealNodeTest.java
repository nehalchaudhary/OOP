package heap;

import junit.framework.TestCase;

public class RealNodeTest extends TestCase {
	
	RealNode realNode1,realNode2,realNode3;
	
	protected void setUp() throws Exception {
		realNode1 = new RealNode("Swim");
		realNode2 = new RealNode("Win");
		realNode3 = new RealNode("Swimming");
		realNode1.leftChild = realNode2;
		realNode2.leftChild = realNode3;
	}

	protected void tearDown() throws Exception {
	}

	public void testCalculateHeight() {
		assertEquals(2, realNode1.calculateHeight());
		assertEquals(1, realNode2.calculateHeight());
		assertEquals(0, realNode3.calculateHeight());
	}

	public final void testIsNull() {
		System.out.println(realNode1.isNull());
		assertEquals(false, realNode1.isNull());
		assertEquals(false, realNode2.isNull());
		assertEquals(false, realNode3.isNull());
	}

}
