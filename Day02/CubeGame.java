import java.util.*;

public class CubeGame {
	private List<Integer> blues;
	private List<Integer> reds;
	private List<Integer> greens;
	private int gameID;
	private int highestBlue = -1;
	private int highestRed = -1;
	private int highestGreen = -1;

	public CubeGame(int gameID, List<Integer> blues, List<Integer> reds, List<Integer> greens) {
		this.gameID = gameID;
		this.blues = blues;
		this.reds = reds;
		this.greens = greens;
	}

	public int highestBlue() {
		if (highestBlue < 0) {
			highestBlue = Collections.max(blues);
			return highestBlue;
		} else {
			return highestBlue;
		}
	}

	public int highestRed() {
		if (highestRed < 0) {
			highestRed = Collections.max(reds);
			return highestRed;
		} else {
			return highestRed;
		}
	}

	public int highestGreen() {
		if (highestGreen < 0) {
			highestGreen = Collections.max(greens);
			return highestGreen;
		} else {
			return highestGreen;
		}
	}

	public int getGameID() {
		return gameID;
	}

}
