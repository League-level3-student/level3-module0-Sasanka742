package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] listWord = {"one","two","three","four","five"};
		 ArrayList<String> words = new ArrayList<String>();
		 for(int i=0;i<4;i++) {
			 words.add(listWord[i]);
		 }
		 
		//2. print the third element in the array
		 System.out.println(words.get(2));
		//3. set the third element to a different value
		 words.add(2, "notThree");
		//4. print the third element again
		System.out.println(words.get(2));
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0;i<words.size();i++) {
			words.set(i, "zero");
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<words.size();i++) {
			 System.out.println(words.get(i));
		}
		//7. make an array of 50 integers
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 
		//8. use a for loop to make every value of the integer array a random number
		 for(int i=0;i<50;i++) {
				numbers.add(i,new Random().nextInt(10));
			}
		//9. without printing the entire array, print only the smallest number on the array
		 int least = numbers.get(0); 
		 for(int i=0;i<numbers.size()-1;i++) {
				if(least>numbers.get(i)) {
					least = numbers.get(i);
				}
		 }
		 System.out.println("Least:"+least);
		//10 print the entire array to see if step 8 was correct
		 for(int i=0;i<numbers.size();i++) {
			 System.out.print(numbers.get(i));
		 }
		//11. print the largest number in the array.
		 int greatest = numbers.get(0);
		 for(int i=0;i<numbers.size()-1;i++) {
				if(greatest<numbers.get(i)) {
					greatest = numbers.get(i);
				}
		 }
		 System.out.println("");
		 System.out.println("Greatest:"+greatest);
		//12. print only the last element in the array
		 System.out.println(numbers.get(numbers.size()-1));
	}
}
