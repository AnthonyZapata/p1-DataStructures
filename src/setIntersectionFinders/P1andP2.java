package setIntersectionFinders;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import p1MainClasses.Part1Main;
public class P1andP2<E> extends AbstractIntersectionFinder<E> implements IntersectionFinder<E>{
	Part1Main main = new Part1Main();

	public P1andP2(String name) {
		super(name);		
		// TODO Auto-generated constructor stub
	}
	
	public String p1method() throws FileNotFoundException {
			Set1<Integer> etr = (Set1<Integer>) intersectSets((MySet<E>) Part1Main.createMegaSet());
			
			
			
			
			
			
			
			
			
			
//		for(int x=0; x<Part1Main.jFileToArray(0).size();x++ ) {
//			int counter=1;
//			for(int j=1; j<Part1Main.m; j++) {
//			
//				if(Part1Main.jFileToArray(j).contains(Part1Main.jFileToArray(0).get(x))) {
//					counter++;
//				}
//				else {
//					break;
//				}
//				
//				if(counter == Part1Main.m) {
//					etr.add(Part1Main.jFileToArray(0).(x));
//				}
//			}
//			
//		}
//		
		
		
		return etr.toString();
	}
	
	
	public String p2method(Integer[][][] data) {
		
		return null;
	}
	
	

//	public Set1<Integer> intersectSets(Set1<Integer> t) throws FileNotFoundException {
//		
//		Set1<Integer> megaSet = (Set1<Integer>)t;
//		for(int x = 0; x < t.size(); x++) {
//			for(int j = 0; j<Part1Main.m; j++) {
//				if(!(Part1Main.jFileToSet(j).contains((Integer) megaSet.toArray()[x]))){
//					megaSet.remove(x);
//				}
//			}
//		}
//		
//		return megaSet;
//	}

	
//	public MySet<E> intersectSets(MySet<E> t) throws FileNotFoundException {
//		MySet<E> megaSet = t;
//		for(int x = 0; x < t.size(); x++) {
//			
//			for(int j= 0; j < Part1Main.m;j++) {
//				Set1<Integer> dummyArr = Part1Main.jFileToSet(j);
//				for(int y = 0; y < dummyArr.size(); y++) {
//					if(!(dummyArr.toArray()[y].equals(t.toArray()[x]))) {
//						megaSet.remove((E)t.toArray()[x]);
//					}
//				}
//			}
//		}
		// TODO Auto-generated method stub
		return (MySet<E>) megaSet;
	}

}
