package p1MainClasses;

import dataGenerator.DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1Main {
	
	
	public static int n;
	public static int m;
	static Integer[][][] data;

	public static void main(String[] args) throws FileNotFoundException{
		
		
		
	
		Scanner parameters = new Scanner(new File("inputFiles" , "parameters.txt")); 
		// the values of n and m shall be read from file: "inputFiles/parameters.txt". 
		n = parameters.nextInt(); 
		m = parameters.nextInt();
		parameters.close();
		
		//Generates files FIJ
		
		FilesGeneratorMain.main(args);
	
		//reads data from files fij
		
		DataReader dataReader = new DataReader();
		data = (Integer[][][]) dataReader.readDataFiles();
		
		printArray((Integer[])data[1][1]);
		
	}
	
	public Integer[] getDataElement(int i, int j){
		return ((Integer[]) data[i][j]);
	}
	
	
	
	public static void printArray(Integer[] numbers) {
		for (int i=0; i<numbers.length; i++) 
			System.out.print(numbers[i] + "  "); 
		System.out.println(); 
	}
	
	public Integer[][] p1p2Tester(Integer[] data){
//		Integer[] set = new Integer[m][n];
		Integer[][] set = new Integer[m][n];
		for(int j=0; j<m; j++){
			for(int i=0; i<n; i++){
				set[j][i] = getDataElement(i,j);
			}
		}
		
//		for(int j=0; j<m;j++){
//			for(int i=0; i<n; i++){
//				
//			}
//		}
		
		
	}
	
	
}
