package heap;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class IngFilter implements Iterator<String>{

	Queue<String> ingFilter;
	
	IngFilter(Iterator<String> ingIterator)
	{ 
		ingFilter = new LinkedList<String>();
		String nextElement;
        while(ingIterator.hasNext())
        {
        	nextElement = ingIterator.next();
        	if(nextElement.endsWith("ing"))
        		ingFilter.add(nextElement);
        }
	}
	
	@Override
	public boolean hasNext() {
		if(ingFilter.isEmpty())
			return false;
		else
			return true;
	}

	@Override
	public String next() {
		String toReturn = ingFilter.poll();
		return toReturn;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
