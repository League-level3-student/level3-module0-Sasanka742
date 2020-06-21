package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] words = {"one","two","three","four","five" }; 
		StringPrint(words);
		System.out.println("");
		StringReverse(words);
		System.out.println("");
		StringOdd(words);
		System.out.println("");
		StringRand(words);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void StringPrint(String words[]) {
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]+" ");
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.

	static void StringReverse(String words[]) {
		for(int i=words.length-1;i>=0;i--) {
			System.out.println(words[i]+" ");
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void StringOdd(String words[]) {
		for(int i=0;i<words.length;i++) {
			if(i%2!=0)
			System.out.println(words[i]+" ");
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void StringRand(String words[]) {
		int[] rands = new int[5];
		for(int i=0;i<words.length;i++) {
			int rand = new Random().nextInt(words.length);
			rands[i] = rand;
		}
		for(int i=0;i<rands.length;i++) {
			for(int k=rands.length;k<0;k++) {
				if(rands[i]==rands[k]) {
					rands[i] = new Random().nextInt(words.length);
				}else {
					System.out.println(words[i]);
				}
			}
		}
	}
	
}
