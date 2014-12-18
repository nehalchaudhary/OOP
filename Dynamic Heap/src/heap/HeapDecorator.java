package heap;

import java.util.Collection;
import java.util.Iterator;

public abstract class HeapDecorator implements Collection<String>{
	public abstract String toString() ;
	public abstract Object[] toArray();
	public abstract Iterator<String> iterator();
}
