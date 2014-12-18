package heap;

public abstract class AbstractNode {
	AbstractNode leftChild; 
	AbstractNode rightChild; 
	String nodeData;
	
	public abstract int calculateHeight();
	public abstract boolean isNull();
}
