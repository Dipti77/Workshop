package bridgelabz;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int n;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		n = sc.nextInt();

		int array[] = new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0; i<n; i++)  
		{ 
			array[i]=sc.nextInt();  
		}  

		System.out.println("Element divisible by 5: ");
		
		for (int i=0; i<n-1; i++){
			if (array[i] % 5 == 0){
				System.out.println(array[i]);
			}
		}

	}
}