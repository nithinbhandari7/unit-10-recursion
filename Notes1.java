import java.util.ArrayList;
import java.util.Scanner;

public class Notes1 {
	public static void main(String[] args) {
		toBinary(924);
	}
	
	public static void toBinary(int base10) {
		if(base10 == 0) {
			System.out.print("0");
		} else {
			toBinary(base10/2);
			if(base10 % 2 == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);
			}
		}
	}
	
	public static void stackWords(Scanner sc) {
		String temp = sc.next();
		if(temp.equals(".")) //base case
			System.out.println("Printing words in reverse order...");
		else { //non-base case
			stackWords(sc);
			System.out.println(temp);
		}
	}
	
	public static void printTriangle(int n) {
		if(n <= 0) //base case
			System.out.println("That's all folks!");
		else { //non-base case
			for(int i = 0; i < n; i++)
				System.out.println("* ");
			System.out.println();
			printTriangle(n - 1);
		}
	}
	
	public static int summationISquared(int n) {
		if(n == 1) //base case
			return 1;
		else
			return n*n + summationISquared(n - 1);
	}
	
	public static int summation(int n) {
		if(n == 1) //base case
			return 4;
		else
			return 2 + (2 * n) + summation(n - 1);
	}
	
	public int factorial(int n) {
		if(n == 0) 
			return 1;
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
	
	public int factorailRecursion(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorailRecursion(n-1);
		}
	}
	
	public int rec(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return rec(n-1) + rec(n-2);
		}
	}
	
	public static int fibinachi(int n) {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		sum.add(1);
		sum.add(1);
		for(int i = 2; i <= n; i++) {
			sum.add(sum.get(i-1) + sum.get(i-2));
		}
		return sum.get(sum.size() - 1);
	}
	
	public boolean palindrome(String str) {
		if(str.length() == 1) {
			return true;
		} else if(str.length() == 2) {
			return str.charAt(0) == (str.charAt(1));
		} else {
			return palindrome(str.substring(0,1) + str.substring(str.length() - 1));
		}
	}
}

/*

1) b
2) a
3) a
4) 
5) b
6) c
7) 
8) e
9) d
10) e
11) 
12) 

*/