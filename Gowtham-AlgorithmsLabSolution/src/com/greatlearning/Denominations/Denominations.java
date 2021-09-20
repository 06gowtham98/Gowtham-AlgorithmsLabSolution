package com.greatlearning.Denominations;
import java.util.*;

public class Denominations{

	public static void count()
	{
		int i=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations : ");
		int n = sc.nextInt();
		int tx[] = new int[n];
		System.out.println("Enter the values :");
		for(i=0;i<n;i++) {
			tx[i]=sc.nextInt();
		}
		MergeSort.sort(tx);
		System.out.println("Enter the amount you want to pay :");
		int amount = sc.nextInt();
		int[] noteCounter = new int[n];


		for (i = 0; i < n; i++) {
			if (amount >= tx[i]) {
				noteCounter[i] = amount / tx[i];
				amount = amount - noteCounter[i] * tx[i];
			}
		}

		System.out.println("Currency Count ->");
		for (i = 0; i < n; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(tx[i] + ":" + noteCounter[i]);
			}
		}
		sc.close();
	}


	public static void main(String argc[]){
		count();


	}

}