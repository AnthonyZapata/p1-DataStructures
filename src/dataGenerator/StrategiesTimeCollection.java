package dataGenerator;

import java.io.FileNotFoundException;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Map;

import setIntersectionFinders.AbstractIntersectionFinder;
import setIntersectionFinders.GenerateDataSets;

public class StrategiesTimeCollection<E> extends ArrayList<Map.Entry<Integer, Float>> {
	
	public float sum, avgTime;
	private AbstractIntersectionFinder<E> strategy;
//	private int initialSize, finalSize, repetitionsPerSize, n, m, incrementsOfSize;
//	private StrategiesTimeCollection<Integer>[] resultsPerStrategy;
	AbstractMap.SimpleEntry<Integer, Float> simpleEntry;
	public static ArrayList<SimpleEntry<Integer,Float>> outPutArray = new ArrayList<>();
	
	public StrategiesTimeCollection(AbstractIntersectionFinder<E> strategy) {
		this.strategy = strategy;
	}
	
	public String getStrategyName() {
		return strategy.getName();
	}
	
	public static Integer[][][] generateData(int tc, int ce, int size) {
		DataGenerator dg = new DataGenerator(tc, ce, size);
		Integer[][][] data = (Integer[][][]) dg.generateData();  

		return data;
	}
	
	public void resetSum() {
		sum = 0.0f;
	}
	
//	public void add(SimpleEntry<Integer, Float> simpleEntry) {
//		outPutArray.add(simpleEntry);
//	}
	
	public float getSum() {
		return sum;
	}
	
	public void incSum(int estimatedTime) {
		sum += (float) estimatedTime;
	}
	
	public void runTrial(Integer[][][] dataSet) throws NumberFormatException, FileNotFoundException {
		GenerateDataSets ds = new GenerateDataSets(dataSet);
		strategy.intersectSets(ds.generateSets(Integer.parseInt(strategy.getName())));
	}
	
	public float computeAvgTime(int rps){
		avgTime = sum/((float) rps);
		return avgTime;
	}
}