import java.io.File;
import java.util.ArrayList;

public class Searching {
	public static void main(String[] args) {
		
	}
	
	public static int sequentialSearch(int[] list, int target) {
		for(int i = 0; i < list.length; i++)
			if(list[i] == target)
				return i;
		return -1;
	}
	
	public static int binarySearch(int[] list, int target, int start, int end) {
		if(end < start)
			return -1;
		int mid = (start + end) / 2;
		if(list[mid] == target)
			return mid;
		else {
			if(list[mid] > target)
				return binarySearch(list, target, start, mid - 1);
			else
				return binarySearch(list, target, mid + 1, end);
		}
	}
}
