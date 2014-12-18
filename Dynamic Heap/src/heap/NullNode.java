package heap;


public class NullNode extends AbstractNode{
	

	public NullNode() 
	{
		
	}
	
	public int calculateHeight() 
	{
		return -1;//leaf nodes have height 1, hence null nodes have height -1
	}
	
	public boolean isNull()
	{
		return true;
	}

}
