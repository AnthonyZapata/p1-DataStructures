package setIntersectionFinders;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set2;
import p1MainClasses.Part1Main;

public class P4 extends AbstractIntersectionFinder implements IntersectionFinder{

	public P4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String p4method() throws FileNotFoundException {
		MySet etr = intersectSets(createMegaSetP4());	
		return etr.toString();
	}
	
	public static MySet[] createMegaSetP4(){
		MySet<Integer>[] t = new MySet[Part1Main.m];
		for(int j = 0; j<Part1Main.m;j++) {
			MySet set = new Set2();
			for(int i = 0; i<Part1Main.n;i++) {
				for(int k = 0; k<Part1Main.data[i][j].length; k++) {
					set.add(Part1Main.data[i][j][k]);
				}
			}
			t[j]=set;
		}
		return t;
	}
	

	@Override
	public MySet intersectSets(MySet[] t) {
		
		ArrayList globalSet = new ArrayList();
		for(int j =0; j<Part1Main.m;j++) {
			Object[] tArray = t[j].toArray();
			for(int i=0;i<tArray.length;i++) {
				globalSet.add((Integer) tArray[i]);
			}
		}
		Collections.sort(globalSet);
		
		ArrayList<Integer> globalIntegerSet = globalSet;
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		for (Integer e : globalIntegerSet) { 
		     Integer c = map.getOrDefault(e, 0); 
		     map.put(e, c+1); 
		}
		MySet A = new Set2<>(); 
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == Part1Main.m) 
				A.add(entry.getKey()); 

		}
		    
		// TODO Auto-generated method stub
		return A;
	}

}
