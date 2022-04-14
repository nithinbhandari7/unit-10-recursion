import java.util.Arrays;

public class SearchingLab {
	public static void main(String[] args) {
		int[] arr = {4, 7, 2, 9, 8, 1, 6, 5, 12, 10};
		//bubble(arr);
		//System.out.println(Arrays.toString(arr));
		//selection(arr);
		//System.out.println(Arrays.toString(arr));
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int[] ar) {
		int maxIndex = ar.length - 1;
		for(int j = 0; j < ar.length - 1; j++) {
			for(int i = 1; i <= maxIndex; i++) {
				if(ar[i] < ar[i - 1]) {
					int temp = ar[i];
					ar[i] = ar[i - 1];
					ar[i - 1] = temp;
				}
			}
			if(maxIndex != 1) {
				maxIndex -= 1;
			}
		}
	}
	
	public static void selection(int[] ar) {
		int capIndex = ar.length - 1;
		for(int j = 0; j < ar.length - 1; j++) {
			int maxIndex = 0;
			for(int i = 0; i <= capIndex; i++) {
				if(ar[i] > ar[maxIndex]) {
					maxIndex = i;
				}
			}
			System.out.println(maxIndex);
			int temp = ar[capIndex];
			ar[capIndex] = ar[maxIndex];
			ar[maxIndex] = temp;
			if(capIndex != 1) {
				capIndex -= 1;
			}
			System.out.println(Arrays.toString(ar));
		}
	}
	
	public void insert(int[] ar) {
		int value = ar[ar.length - 1];
		int moreIndex = 0;
		int lessIndex = 0;
		for(int i = 0; i < ar.length - 1; i++) {
			if(ar[i] < value){
				lessIndex = i;
			} else if (value < ar[i]) {
				moreIndex = i;
				ar[ar.length - 1]  = value;
			}
		}
	}
	
	public static void insertion(int[] ar) {
		for(int i = 1; i < ar.length; i++) {
			for(int j = i; j > 0; j--) {
				if(ar[j] < ar[j-1]) {
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
	}
}
