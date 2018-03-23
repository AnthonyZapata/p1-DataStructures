package setIntersectionFinders;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import p1MainClasses.Part1Main;


@SuppressWarnings("hiding")
public class P1andP2<E> extends AbstractIntersectionFinder<Integer> implements IntersectionFinder<Integer>{
	Part1Main main = new Part1Main();

	public P1andP2(String name) {
		super(name);		
		// TODO Auto-generated constructor stub
	}
	
	public String p1method() throws FileNotFoundException {
		Part1Main.setType=1;
			MySet<Integer> etr = intersectSets(Part1Main.mySetArrayCreator());	
		return etr.toString();
	}
	
	public String p2method() throws FileNotFoundException {
		Part1Main.setType=2;
		   MySet<Integer> etr = intersectSets(Part1Main.mySetArrayCreator());	
		return etr.toString();
	}
	


	@Override
	public MySet<Integer> intersectSets(MySet<Integer>[] t) throws FileNotFoundException {
		
			MySet<Integer> megaSet = Part1Main.createMegaSet();

			for(int x = 0; x < t.length; x++) {
				for(int j = 0; j<Part1Main.m; j++) {
					if(!(t[x].contains((Integer) megaSet.toArray()[j]))) {
						megaSet.remove(x);
					}
				}
			}

			return megaSet;

		}

	
		

	

	
	
	
}
