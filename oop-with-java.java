// Object oriented programming in java:

// 1. Write a Java program to read and print elements of array.
// Ans: 
public class PrintArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
// output: 
// Elements of given array: 
// 1 2 3 4 5 

// 2. Write a Java program to print all negative elements in an array.
// ans:
public class NegativeArrayItems {
	
	public static void main(String[] args) {
		int j = 0;
		int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		
		
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		while(j < Neg_arr.length) 
		{
			if(Neg_arr[j] < 0) {
				System.out.format("%d ", Neg_arr[j]);
			}
			j++;
		}
	}
}
// output:
// List of Negative Numbers in NEG Array : -40 -4 -8 -13 -11 -99 -60

// 3.Write a Java program to find sum of all array elements. 
// Ans:
public class SumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
} 
// output:
// Sum of all the elements of an array: 15

// 4. Write a Java program to find maximum and minimum element in an array. 
// Ans:
public class main {
  public static void main(String[] args) {
    // Declare and initialize array with elements
    int[] arr = {3, 4, 5, 9, 1, 4, 6, 7, 2};

    // Initialize variable to hold the maximum and minimum values
    int max = arr[0];
    int min = arr[0];

    // Loop the array
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
  }
}

/*
  Output is: 
  Maximum element: 9
  Minimum element: 1
*/
