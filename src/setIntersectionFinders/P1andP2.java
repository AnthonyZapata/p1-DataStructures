package setIntersectionFinders;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import p1MainClasses.Part1Main;
public class P1andP2 extends AbstractIntersectionFinder implements IntersectionFinder{

	public P1andP2(String name) {
		super(name);
		Part1Main part1Main;
		Set1<Integer> set = new Set1<Integer>();
		for(int i=0; i<part1Main.n; i++){
			for(int j=0; j<part1Main.m; j++){
				set.add(part1Main.getDataElement(i, j));
			}
		}
	
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public MySet intersectSets(MySet[] t) {
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
