package heap;


public class MinHeap implements Algorithm{

	@Override
	public AbstractNode add(AbstractNode heapRoot,String dataToAdd){
		dataToAdd.trim(); 
		if(dataToAdd.isEmpty()) 
		{
			return new NullNode();
		}
		RealNode newNode = new RealNode(dataToAdd); 
		if(heapRoot.isNull())//if root is null, new Node becomes the root
		{
			heapRoot = newNode;
			return heapRoot;
		}
		else
		{
			AbstractNode traversingPointer = heapRoot;
			Integer leftHeight,rightHeight; 
			String swapNodeData = ""; 
			while(true)
			{
				// calculate the left and the right height of the current node
				leftHeight = traversingPointer.leftChild.calculateHeight();				
				rightHeight = traversingPointer.rightChild.calculateHeight();  
				// lexicographical comparison to determine which is the smaller of the two
				if(newNode.nodeData.compareToIgnoreCase(traversingPointer.nodeData) > 0)
				{
					// if the left height is smaller than go to the left child of the current node
					if(leftHeight > rightHeight) 
					{
						if(traversingPointer.rightChild.isNull()) 
						{	
							traversingPointer.rightChild = newNode;
							return heapRoot;
						}
						else 
						{
							traversingPointer = traversingPointer.rightChild;
						}
					}
					// if the right height is smaller than go to the right child of the current node
					else
					{
						if(traversingPointer.leftChild.isNull())
						{
							traversingPointer.leftChild = newNode;
							return heapRoot;
						}
						else 
						{
							traversingPointer = traversingPointer.leftChild;
						}
					}
				}
				else // if data to be added is smaller than the current node, swap the data of the two nodes
				{
					swapNodeData = newNode.nodeData;
					newNode.nodeData = traversingPointer.nodeData;
					traversingPointer.nodeData = swapNodeData;
				}
			}
		}
	}

	
}
