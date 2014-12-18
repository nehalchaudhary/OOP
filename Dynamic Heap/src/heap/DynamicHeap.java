package heap;

import java.util.*;

public class DynamicHeap implements Collection<String> {

	AbstractNode root;
	private Algorithm algorithm;

	public DynamicHeap(Algorithm algorithm) {
		root = new NullNode();
		this.algorithm = algorithm;
	}

	@Override
	public boolean add(String dataToAdd) {
		root = algorithm.add(root, dataToAdd);
		if (root.isNull())
			return false;
		else
			return true;
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
	public Iterator<String> iterator() {
		return new HeapIterator(root);
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
		while (iterator.hasNext()) {
			result.append(iterator.next());
			result.append(", ");
		}
		result.deleteCharAt(result.lastIndexOf(","));
		result.deleteCharAt(result.lastIndexOf(" "));
		result.append("]");

		return result.toString();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
