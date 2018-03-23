package setIntersectionFinders;

import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

public class GenerateDataSets {

	Object[][][] rawData;
	
	public GenerateDataSets(Object[][][] rawData){
		this.rawData = rawData;
	}
	
	public MySet[] generateSets(int mySet) {
		MySet[] T = new MySet[rawData.length];
		for(int i = 0; i < rawData.length; i++) {
			if(mySet == 1)
				T[i] = new Set1();
			else
				T[i] = new Set2();
			for(int j = 0; j < rawData[i].length; j++) {
				for(int k = 0; k < rawData[i][j].length; k++) {
					T[i].add(rawData[i][j][k]);
				}
			}
		}
		return T;
	}
	
}