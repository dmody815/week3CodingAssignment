package com.deshonnmody.week3;

public class deshonnWeek3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1.
		int[] ages = {3,9,23,64,2,8,28,93,69}; 
//		Subtract 1st element from last element
//		1st element = 3 or ages[0]		last element = [length of ages - 1]
//		As more ages are added to the array, subtract 1 from array length for correct element number 
		
		int last = (ages.length - 1);
		System.out.println("1st Element = " + ages[0]);
		System.out.println("last Element = " + ages[last]);
		System.out.println("Last Element - 1st Element = " + (ages[last] - ages[0]));
		
//		Use a loop to iterate through the array and calculate the average age
//		Average = total of ages / ages.length
//		First i want to create a place holder for my total sum of ages
//		My loop will add each age to the total place holder until it iterates to the last element in the array 
		
		int total = 0;
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];
		}
		System.out.println("Total sum of ages = " + total);
		
		int avg = (total / ages.length);
		System.out.println("Average age = " + avg);
		
//2.	
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
// 		Use a loop to iterate through and calculate the average # of letters per name
//		Avg = Total # of characters / # of names in array
//		Need another place holder for total # of characters
		
		int charCount = 0;
		
// 		For each name in names[] add the amount of characters to charCount
		
		for (String name : names) {
			charCount += name.length();
			System.out.println(name +" : "+ name.length());
		}
	
		
		System.out.println("Total amount of characters in names: " + charCount);
		System.out.println("Avg # of characters per name : " + (charCount / names.length));
		
		
		String joinedString = String.join(" ", names);
		System.out.println(joinedString);
		
//3. How do you access the last element of an array?
//		array.length will always return total amount of elements in an array
//		[array.length - 1] will always return the last element in the array since the array starts at[0]
		
		int lastElement = (names.length - 1);
		System.out.println("The last element is: " + names[lastElement]); 
		
//4. How do you access the first element of any array?
//		The  first element of any array will always be set as array[0]
		
		System.out.println("The first element is : " + names[0]);
		
//5. Create a new array of int called NameLengths
//		The amount of elements for this array to be dynamic and change with the previous array
//		place holder size will hold the size of the previous array.
		
		int size = (names.length);
		int[] nameLengths = new int[size]; {
		for (int i = 0; i < size; i++){
			nameLengths[i] = names[i].length();
			
			System.out.println("The length of name in index " + i + " is: " + nameLengths[i]);
		}
		}

//6. Write a loop to iterate over the nameLengths array and calculate the sum of the elements
		
		int sumOfNames = 0;
		for (int i : nameLengths) 
			sumOfNames += i;
			System.out.println("The sum of the names in the array is : " + sumOfNames);
			
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		
		System.out.println(multiplyString("Hello", 3));	
		
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name		
			
		System.out.println("Hi, my name is " + returnFullName("DeShonn","Mody"));
		
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
	
		int sumOfNums = 0;
	int[] nums = {25,25,25,25,1};
		
		for (int num : nums) 
			sumOfNums += num;
	System.out.println("The sum is greater than 100 : " + ifSumIsGreater(nums));
	
//10. Write a method that takes an array of double and returns the average of all the elements in the array.	
		
		double[] digits = {5.5,10.5,15.5,20.5,25.5,30.9};
		System.out.println("The average of the numbers in array digits is : " + averageOfElements(digits));
		
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.		
		
		double[] digits2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The average of the numbers in array digits2 is : " + averageOfElements(digits2));
		System.out.println("The average of digits is greater than the average of digits2 : " + ifAverageIsGreater(digits,digits2));
		
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		
		
		int temp = 105;
		double wallet = 13.5;
		boolean isHotOutside = (temp > 99);
		System.out.println(willBuyDrink(isHotOutside ,wallet));

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		double[] linesCleaned = {8,6,9,2,4};
		System.out.println(averageLines(linesCleaned));
// This method takes the amount of lines cleaned per day and gives the average amount of lines cleaned total.
// I created this for my job where I am always finding the average amount of accounts I have cleaned for the day, week, and month. This would greatly speed up the process.		
		
	}//Methods Below Here:
//7.	
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result; 
	}
//8. 
	public static String returnFullName(String firstName, String lastName) {
	return firstName + " " + lastName; 
	}	
//9.
	public static boolean ifSumIsGreater(int[]  numbers) {
		int sum = 0; 
		for (int number : numbers) {
			sum += number;
		}
		if (sum > 100) return true;
		return false;
	}
//10.
	public static double averageOfElements(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length; 
	}
//11.
	public static boolean ifAverageIsGreater(double[] numbers, double[] numbers2) {
		double sum = 0;
		double sum2 = 0;
		for (double number : numbers) {
			sum += number;
		}
		for (double number : numbers2) {
			sum2 += number;
		}
		if (sum > sum2) return true;
		return false;
	}
//12.
	public static boolean willBuyDrink(boolean a, double b) {
		double moneyInPocket = 10.50;
		
		if ((a == true) && (b > moneyInPocket)) return true;
			return false;
	}
//13.
	public static double averageLines(double[] a) {
		double sum = 0;
		for (double number : a) {
			sum += number;
		}
		return sum / a.length; 
	}
	
}//No Code Below Here
