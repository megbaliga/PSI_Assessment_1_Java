// Java program to find the k largest elements in a given array. Elements in the array can
//be in any order.
import java.util.Scanner; //Importing library to take in input from user
public class probstat5 {
	static void findklargest(int k, int n, int arr[]) { //Method to find the k largest elements
		int swapp;
		for (int i = 0; i<=n-2; i++) { //Sorting the elements in ascending order
			for(int j = i+1; j<=n-1; j++) { 
				if (arr[i]>arr[j]) { // swapping if it is not in ascending order
					swapp = arr[i];
					arr[i] = arr[j];
					arr[j] = swapp;
				}
			}
		}
		System.out.println("The " + k + " largest elements in the array of " + n + " elements are: "); //Printing the elements
		/* ASCENDING ORDER
		for(int i = (n-k); i <n; i++)
			System.out.println(arr[i]);*/
			
		//To print in descending order as per the question sample output
		for(int i = n-1; i>=(n-k); i--)
			System.out.println(arr[i]);
			
	}
	public static void main(String [] args) {
		//int arr[]= {};	//you always have to specify the exact number of elements in the array. 
		//you'll get out of bounds if you do like this. Call it as an object with n elements and do.
		
		Scanner x = new Scanner(System.in); // object x of Scanner class
		System.out.println("Enter the number of elements in the array");
		int n = x.nextInt(); //Taking in input from user
		int [] arr = new int[n]; //defining array of length n
		// OR int arr[] = new int[n];
		System.out.println("Enter the number of largest elements to be printed");
		int k = x.nextInt(); //taking k value
		System.out.println("Enter the elements of the array");// taking elements of the array from the user
		for(int i = 0 ; i<n; i++)
			arr[i] = x.nextInt();
			
		findklargest(k,n,arr); //calling function findklargest
	}
}
