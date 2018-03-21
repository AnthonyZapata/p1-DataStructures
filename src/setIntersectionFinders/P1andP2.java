package setIntersectionFinders;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import p1MainClasses.Part1Main;
public class P1andP2 extends AbstractIntersectionFinder implements IntersectionFinder{
	Part1Main main = new Part1Main();

	public P1andP2(String name) {
		super(name);		
		// TODO Auto-generated constructor stub
	}
	
	public String p1method(Integer[][][] data ) {
		Set1<Integer[][][]> set1 = new Set1<Integer[][][]>();
		set1.add(data);
		for(int i = 0; i<=main.m;i++) {
			
			
		}
		
		
		
		return null;
	}
	public String p2method(Integer[][][] data) {
		
		return null;
	}
	
	

	@Override
	public MySet intersectSets(MySet[] t) {
		// TODO Auto-generated method stub
		return null;
	}

}
