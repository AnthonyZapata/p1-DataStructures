package setIntersectionFinders;

import java.util.ArrayList;
import java.util.Collections;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import p1MainClasses.Part1Main;

public class P3 extends AbstractIntersectionFinder implements IntersectionFinder{

	public P3(String name) {
		super("P3");
		// TODO Auto-generated constructor stub
	}
	
	public static MySet<Integer> createMegaSetP3(){
		MySet t = new Set2();
		
		for(int i = 0; i<Part1Main.data.length;i++) {

			for(int j = 0; j<Part1Main.data[i].length;j++) {
				for(int k = 0; k<Part1Main.data[i][j].length; k++) {
					t.add(Part1Main.data[i][j][k]);
				}
			}
			
		}
		
		return t;
		
		
	}
	

	@Override
	public MySet intersectSets(MySet[] t) {
		 MySet<Integer> megaSet = createMegaSetP3();
		 ArrayList<Integer> mega = new ArrayList<Integer>();
		 mega = (ArrayList<Integer>) createMegaSetP3(); 
		 Collections.sort(mega);
		 int c = 1;
		 Collections.sort((Arraylist[])megaSet.toArray());
		 
		 
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
