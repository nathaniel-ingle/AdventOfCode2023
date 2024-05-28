import java.io.*;
import java.util.*;

class Trebuchet {
	public static void main(String[] args) {
		try {
			File myFile = new File("input.txt");
			Scanner myReader = new Scanner(myFile);
			int mySum = 0;
			Map<String, String> overlappingNumbers = Map.of(
					"eightwo", "eighttwo", 
					"oneight", "oneeight",
					"eighthree", "eightthree",
					"fiveight", "fiveeight",
					"nineight", "nineeight",
					"sevenine", "sevennine",
					"twone", "twoone"
					);
			String[] numbers = { "zero", "one", "two", "three",
				"four", "five", "six", "seven", "eight", "nine" };
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			        for (Map.Entry<String, String> me :
						overlappingNumbers.entrySet()) {
					data = data.replace(me.getKey(), me.getValue());
				}
				for (int i = 1; i < 10; i++) {
					data = data.replace(numbers[i], String.valueOf(i));
				}
				System.out.println(data);
				char firstNum = 0;
				char secondNum = 0;
				boolean firstNumSeen = false;
				for (int i = 0; i < data.length(); i++) {
					char myChar = data.charAt(i);
					if (Character.isDigit(myChar) && !firstNumSeen){
						firstNum = myChar;
						secondNum = myChar;
						firstNumSeen = true;
						System.out.println("firstNum: " + myChar);
					} else if (Character.isDigit(myChar)) {
						secondNum = myChar;
						System.out.println("secondNum: " + myChar);
					}
					

				}
				int extractedNum = Integer.parseInt(new String(new char[] { firstNum, secondNum }));
				System.out.println(extractedNum);
				mySum += extractedNum;
				System.out.println();
			}
			System.out.println(mySum);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
