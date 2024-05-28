import java.io.*;
import java.util.*;

class CubeConundrum {

	private static final int MAX_RED = 12;
	private static final int MAX_GREEN = 13;
	private static final int MAX_BLUE = 14;

	public static void main(String[] args) {

		List<CubeGame> games = new LinkedList<CubeGame>();

		try {
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				List<Integer> blues = new LinkedList<Integer>();
				List<Integer> reds = new LinkedList<Integer>();
				List<Integer> greens = new LinkedList<Integer>();

				String line = myReader.nextLine();
				String cleanLine = line.replaceAll(",", "").replaceAll(";", "").replaceAll(":", "");
				String[] elements = cleanLine.split(" ");

				for (int i = 1; i < elements.length / 2; i++) {
					int num = Integer.valueOf(elements[i*2]);
					String color = elements[(i*2)+1];

					if (color.equals("blue")) {
						blues.add(num);
					} else if (color.equals("red")) {
						reds.add(num);
					} else if (color.equals("green")) {	
						greens.add(num);
					}

				}
				CubeGame myGame = new CubeGame(Integer.valueOf(elements[1]), blues, reds, greens);
				games.add(myGame);

			}

			myReader.close();
			
			List<Integer> possibleGames = new LinkedList<Integer>();
			List<Integer> gamePowers = new LinkedList<Integer>();
			for (CubeGame game : games) {
				if (!(game.highestBlue() > MAX_BLUE || game.highestRed() > MAX_RED || game.highestGreen() > MAX_GREEN)) {
					possibleGames.add(game.getGameID());
				}
				gamePowers.add(game.highestBlue() * game.highestRed() * game.highestGreen()); 
			}

			int gameIDSum = 0;
			int powerSum = 0;

			for (int gameID : possibleGames) {
				gameIDSum += gameID;
			}
			for (int gamePower : gamePowers) {
				powerSum += gamePower;
			}

			System.out.println("Part 1: " + gameIDSum);
			System.out.println("Part 2: " + powerSum);


		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
