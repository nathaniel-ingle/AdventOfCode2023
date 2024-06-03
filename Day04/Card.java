package Day04;
import java.util.*;
import java.lang.Math;

public class Card {
	private ArrayList<Integer> winningNumbers;
	private ArrayList<Integer> cardNumbers;
	private int cardID;
	private int copies = 1;

	public Card(ArrayList<Integer> winningNumbers, ArrayList<Integer> cardNumbers, int cardID) {
		this.winningNumbers = winningNumbers;
		this.cardNumbers = cardNumbers;
		this.cardID = cardID;
	}

	public Card() {
		this.copies = 0;
	}

	public int getCardID() {
		return this.cardID;
	}

	public int score() {
		int matches = this.matches();		
		return (int) Math.pow(2, (matches - 1));
	}

	public int matches() {
		int numMatches = 0;

		for (Integer n : cardNumbers) {
			for (Integer m : winningNumbers) {
				if (n == m) {
					numMatches++;
				}
			}
		}

		return numMatches;
	}

	public void addCopies(int copies) {
		this.copies += copies;
	}

	public int getCopies() {
		return this.copies;
	}
}

