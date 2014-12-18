package heap;

import java.util.Iterator;
import java.util.Stack;

public class HeapIterator implements Iterator<String> {
	
	Stack<AbstractNode> heapStack;

	HeapIterator(AbstractNode root) {
		AbstractNode currentPointer;
		heapStack = new Stack<AbstractNode>();
		currentPointer = root;
		//push elements upto leftmost node onto the stack
		while (!currentPointer.isNull()) {
			heapStack.push(currentPointer);
			currentPointer = currentPointer.leftChild;
		}
	}

	public boolean hasNext() {
		if (heapStack.isEmpty())
			return false;
		else
			return true;
	}

	@Override
	public String next() {
		AbstractNode currentPointer;
		AbstractNode toReturn = new NullNode();
		toReturn = heapStack.pop();			
		currentPointer = toReturn;
		//push the right child of the popped element onto the stack
		//then push all elements upto the leftmost child of this right child
		if (!currentPointer.rightChild.isNull()) {
			currentPointer = currentPointer.rightChild;
			heapStack.push(currentPointer);

			while (!currentPointer.leftChild.isNull()) {
				heapStack.push(currentPointer.leftChild);
				currentPointer = currentPointer.leftChild;
			}
		}
		return toReturn.nodeData;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
