package p1MainClasses;

import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import setIntersectionFinders.P1andP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1Main {
	
	
	public static int n;
	public static int m;
	static Object[][][] data;
	public static int setType;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		
		
	
		Scanner parameters = new Scanner(new File("inputFiles" , "parameters.txt")); 
		// the values of n and m shall be read from file: "inputFiles/parameters.txt". 
		n = parameters.nextInt(); 
		m = parameters.nextInt();
		parameters.close();
		
		//Generates files FIJ
		//p1();
		FilesGeneratorMain.main(args);
		type(args);
	
		//reads data from files fij
		
		DataReader dataReader = new DataReader();
		data = dataReader.readDataFiles();
		System.out.println(p1());
		System.out.println(p2());
		
		//System.out.println(jFileToArray(1));
		
		
		
	}
	
	public static int type(String[] args) {
		
		if(args.toString() == "1") {
			setType =1;
		}
		else {
			setType = 2;
		}
		return setType;
	}
	
	public Integer[] getDataElement(int i, int j){
		return ((Integer[]) data[i][j]);
	}
	
	
	
	public static void printArray(Integer[] numbers) {
		for (int i=0; i<numbers.length; i++) 
			System.out.print(numbers[i] + "  "); 
		System.out.println(); 
	}
	
	public static String p1() throws FileNotFoundException{
		P1andP2<Integer> p1p2 = new P1andP2<Integer>("1");
		
		
		return p1p2.p1method();
	}
	
	public static String p2() throws FileNotFoundException {
		P1andP2<Integer> p1p2 = new P1andP2<Integer>("2");
		
		return p1p2.p2method();
	}
	
	public static void createJFiles() throws FileNotFoundException {
		for(int j = 0; j<m; j++) {
			//crea J files
			String fileName = "J_" + j +".txt"; 	
			PrintWriter out = new PrintWriter(new File("ArrayHolder", fileName));
			//para cada J file, add todas las k en i
			for(int i = 0; i<n; i++) {	
				for (int k=0; k<data[i][j].length; k++)
					out.println(data[i][j][k]);
			}
			out.close();
		}
	}
	

	public static MySet<Integer>[] mySetArrayCreator() throws FileNotFoundException {
		MySet[] t = new MySet[data.length];
	
		for(int i = 0; i<data.length;i++) {
			if(setType==1) {
				t[i] = new Set1();
				
			}
			else {
				t[i]= new Set2();
			}
			for(int j = 0; j<data[i].length;j++) {
				for(int k = 0; k<data[i][j].length; k++) {
					t[i].add(data[i][j][k]);
				}
			}
			
		}
		
		return t;
		
		
		
//		MySet<Integer>[] etr = new MySet<Integer>[m];
//		for(int j = 0; j<m; j++) {
//			String filename = "J_" + j + ".txt"; 
//			Scanner inputFile = new Scanner(new File("ArrayHolder", filename)); 
//			MySet<Integer> fileContent = new Set1<Integer>(); 
//			while (inputFile.hasNext())
//				fileContent.add(inputFile.nextInt());
//			inputFile.close();
//			etr[j]=fileContent;
//		}
//		
	
	}
	//changed to MySet for testing
	
	public static MySet<Integer> createMegaSet() throws FileNotFoundException {
		MySet<Integer> fileContent;
		
		if(setType == 1) {
			fileContent = new Set1();
			
		}
		else {
			fileContent = new Set2();
		}
		
		for(int j = 0; j<m;j++) {
			String filename = "J_" + j + ".txt"; 
			Scanner inputFile = new Scanner(new File("ArrayHolder", filename)); 
			
			while (inputFile.hasNext())
				fileContent.add(inputFile.nextInt());
			
			inputFile.close();
		}
	//	MySet<Integer>[] file = (MySet<Integer>[]) fileContent.toArray();
		return fileContent;
	}

		
	
	
	
}
