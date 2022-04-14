public class RecursionProject {
	public static boolean isAnagram(String word1, String word2) {
		if(!(word1.length() == word2.length()))
			return false;
		if(word1.length() == 0 && word2.length() == 0) {
			return true;
		} else {
			if(word2.contains(word1.substring(word1.length() - 1))) {
				int index = word2.indexOf(word1.substring(word1.length() - 1));
				return isAnagram(word1.substring(0, word1.length() - 1), word2.substring(0,index) + word2.substring(index + 1));
			} else {
				return false;
			}
		}
	}
	
	public static boolean canFlowOffMap(int[][] map, int row, int col) {
		int value = map[row][col];
		if(row == 0 || col == 0 || row == map.length-1 || col == map[0].length-1) {
			return true;
		}
		if(map[row - 1][col] < value) {
			return canFlowOffMap(map, row - 1, col);
		}
		if(map[row][col - 1] < value) {
			return canFlowOffMap(map, row, col - 1);
		}
		if(map[row][col + 1] < value) {
			return canFlowOffMap(map, row, col + 1);
		}
		if(map[row + 1][col] < value) {
			return canFlowOffMap(map, row + 1, col);
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("hellos", "hello"));
		System.out.println(isAnagram("hello", "hellos"));
		System.out.println(isAnagram("listen", "silent"));
		System.out.println();
		int[][] mountain = {{100, 99, 200, 200, 200, 200, 200, 200, 200, 200},
				{200, 98, 200, 200, 200, 200, 200, 200, 200, 200},
				{200, 97, 96, 200, 200, 200, 200, 200, 200, 200},
				{200, 200, 95, 200, 200, 200, 85, 84, 83, 200},
				{200, 200, 94, 93, 92, 200, 86, 200, 82, 200},
				{200, 150, 200, 200, 91, 200, 87, 200, 81, 200},
				{200, 200, 200, 200, 90, 89, 88, 200, 80, 200},
				{200, 150, 100, 200, 200, 200, 200, 200, 79, 200},
				{200, 200, 200, 200, 200, 200, 200, 200, 78, 77},
				{200, 200, 200, 200, 200, 200, 200, 200, 200, 76}};
		System.out.println(canFlowOffMap(mountain, 1, 0));
		System.out.println(canFlowOffMap(mountain, 6, 5));
		System.out.println(canFlowOffMap(mountain, 5, 2));
		System.out.println(canFlowOffMap(mountain, 6, 7));
		System.out.println(canFlowOffMap(mountain, 7, 3));
		System.out.println(canFlowOffMap(mountain, 8, 6));
	}
}
