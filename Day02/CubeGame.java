import java.util.*;

public class CubeGame {
	private List<Integer> blues;
	private List<Integer> reds;
	private List<Integer> greens;
	private int gameID;

	public CubeGame(int gameID, List<Integer> blues, List<Integer> reds, List<Integer> greens) {
		this.gameID = gameID;
		this.blues = blues;
		this.reds = reds;
		this.greens = greens;
	}

	public int highestBlue() {
		return Collections.max(blues);
	}

	public int highestRed() {
		return Collections.max(reds);
	}

	public int highestGreen() {
		return Collections.max(greens);
	}

	public int getGameID() {
		return gameID;
	}

}
