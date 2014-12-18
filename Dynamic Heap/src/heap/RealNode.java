package heap;

import static java.lang.Math.max;

public class RealNode extends AbstractNode{

	public RealNode(String nodeData) 
	{
		leftChild = new NullNode();
		rightChild = new NullNode();
		this.nodeData = nodeData;
	}
	
	public int calculateHeight() 
	{
		return (max(this.leftChild.calculateHeight(),this.rightChild.calculateHeight()) + 1);
	}
	
	public boolean isNull()
	{
		return false;
	}
	
}
