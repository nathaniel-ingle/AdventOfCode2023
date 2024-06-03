package Day04;

import java.io.*;
import java.util.*;

public class Scratchcards {
	public static void main (String[] args) {
		File input = new File("Day04/input.txt");
		ArrayList<Card> cardArray = new ArrayList<Card>();
		try {
			Scanner scnr = new Scanner(input);
			while (scnr.hasNextLine()) {
				String[] lineParts = scnr.nextLine().split("\\|");
				String[] idWithWinningNumbers = lineParts[0].split(":");
				String unparsedCardID = idWithWinningNumbers[0];
				String winningNumbers = idWithWinningNumbers[1];
				int cardID;
				Scanner idScnr = new Scanner(unparsedCardID);
				idScnr.next(); // discard unused "Card" label
				cardID = idScnr.nextInt();
				String cardNumbers = lineParts[1];
				ArrayList<Integer> winningList = new ArrayList<Integer>();
				Scanner winningScnr = new Scanner(winningNumbers);
				while (winningScnr.hasNextInt()) {
					winningList.add(winningScnr.nextInt());
				}
				ArrayList<Integer> cardList = new ArrayList<Integer>();
				Scanner cardScnr = new Scanner(cardNumbers);
				while (cardScnr.hasNextInt()) {
					cardList.add(cardScnr.nextInt());
				}
				idScnr.close();
				winningScnr.close();
				cardScnr.close();
				cardArray.add(new Card(winningList, cardList, cardID));

			}
			scnr.close();

			int totalScore = 0;
			int totalCards = 0;
			for (Card card : cardArray) {
				totalScore += card.score();

				int cardCopies = card.getCopies();
				totalCards += cardCopies;
				int additional = card.matches();

				int startIndex = card.getCardID();
				for (int i = startIndex; i < startIndex + additional; i++) {
					cardArray.get(i).addCopies(cardCopies);
				}
			}
			
			System.out.println("Part 1: " + totalScore);
			System.out.println("Part 2: " + totalCards);

		}
		catch (FileNotFoundException e) {
			System.out.println("Your file is in another castle.");
		}
	}
}
