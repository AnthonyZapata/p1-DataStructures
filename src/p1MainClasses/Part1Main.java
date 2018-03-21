package p1MainClasses;

import dataGenerator.DataReader;
import mySetImplementations.Set1;
import setIntersectionFinders.P1andP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
		//p1();
		FilesGeneratorMain.main(args);
		
	
		//reads data from files fij
		
		DataReader dataReader = new DataReader();
		data = (Integer[][][]) dataReader.readDataFiles();
		System.out.println(p1());
		
		
		//System.out.println(jFileToArray(1));
		
		
		
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
		P1andP2<Integer> p1p2 = new P1andP2<Integer>("Metodo1");
		
		
		return p1p2.p1method();
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
	

	public static Set1<Integer> jFileToSet(int j) throws FileNotFoundException {
		
		
		String filename = "J_" + j + ".txt"; 
		Scanner inputFile = new Scanner(new File("ArrayHolder", filename)); 
		Set1<Integer> fileContent = new Set1<>(); 
		while (inputFile.hasNext())
			fileContent.add(inputFile.nextInt());
		inputFile.close();
		
		return fileContent;
	}
	
	public static Set1<Integer> createMegaSet() throws FileNotFoundException {
		Set1<Integer> fileContent = new Set1<>(); 
		for(int j = 0; j<m;j++) {
			String filename = "J_" + j + ".txt"; 
			Scanner inputFile = new Scanner(new File("ArrayHolder", filename)); 
			
			while (inputFile.hasNext())
				fileContent.add(inputFile.nextInt());
			
			inputFile.close();
		
		}
		
		
		
		return fileContent;
	}

		
	
	
	
}
