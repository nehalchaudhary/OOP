package heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IngDecorator extends HeapDecorator{
	
	DynamicHeap heap;
	
	IngDecorator(DynamicHeap heap)
	{
		this.heap = heap;
	}
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new IngFilter(heap.iterator());
	}

	@Override
	public Object[] toArray() {
		List<String> heapArray = new ArrayList<String>();
		Iterator<String> iterator = this.iterator();
		while (iterator.hasNext()) {
			heapArray.add(iterator.next());
		}
		return heapArray.toArray();
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
	    result.append("[");
	    Iterator<String> iterator = this.iterator();
	      while(iterator.hasNext()) {
	    	  result.append(iterator.next());
	    	  result.append(", ");
	      }	      
	    result.deleteCharAt(result.lastIndexOf(","));
	    result.deleteCharAt(result.lastIndexOf(" "));
	    result.append("]");

	    return result.toString();
	}

	@Override
	public boolean add(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return this.toArray().length;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
