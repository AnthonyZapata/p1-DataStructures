package setIntersectionFinders;

import interfaces.IntersectionFinder;

public abstract class AbstractIntersectionFinder<E> 
implements IntersectionFinder<E> {
	private String name;   // to identify the strategy
	public AbstractIntersectionFinder(String name) {
		this.name = name; 
	}

	public String getName() { 
		return name; 
	}
	
	public class p1p2{
		
	}
	public class p3{
		
	}
	public class p4{
		
	}
	
}
