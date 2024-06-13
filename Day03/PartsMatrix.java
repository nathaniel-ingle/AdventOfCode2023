package Day03;

import java.util.*;

public class PartsMatrix {
	private String contents;
	private char blankSpace;
	private int width;
	private int length;
	private ArrayList<Parts> partsList = new ArrayList<Parts>();
	

	public PartsMatrix(String contents, char blankSpace, int width, int length) {
		this.contents = contents;
		this.blankSpace = blankSpace;
		this.width = width;
		this.length = length;
	}

	public char getAt(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= length) {
			return blankSpace;
		} else {
			return contents.charAt((x * width) + y);
		}
	}
}
