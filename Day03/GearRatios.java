package Day03;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class GearRatios {
	public static void main(String[] args) {
		try {
			String inputString = new String(Files.readAllBytes(Paths.get("Day03/input.txt")));
			PartsMatrix partsMatrix = new PartsMatrix(inputString.replace("\n", ""), '.', 140, 140);
			for (int j = 0; j < 140; j++) {
				for (int k = 0; k < 140; k++) {
					System.out.println(partsMatrix.getAt(j, k));
				}
			}
		} catch (IOException e) {
			System.out.println("Your file is in another castle.");
		}
/*
		File inputFile = new File("Day03/input.txt");
		ArrayList<ArrayList<Character>> characterMatrix = new ArrayList<ArrayList<Character>>();
		try{
			Scanner scnr = new Scanner(inputFile);
			int currLine = 0;
			while (scnr.hasNext()) {
				String nextLine = scnr.nextLine();

				for (int i = 0; i < nextLine.length(); i++) {
					char currChar = nextLine.charAt(i);
					if (Character.isDigit(currChar)) { 
						numbers.add(new Integer[] {currLine, i, currChar - '0'});
					} else if (currChar != '.') {
						symbols.add(new Integer[] {currLine, i});
					}
				}
				currLine++;
			}

			scnr.close();

			System.out.println(Arrays.deepToString(numbers.toArray()));
			System.out.println(Arrays.deepToString(symbols.toArray()));
		} catch (FileNotFoundException e) {
			System.out.println("Your file is in another castle.");
		}
		*/
		System.out.println("Hello, world!");
	}
}
