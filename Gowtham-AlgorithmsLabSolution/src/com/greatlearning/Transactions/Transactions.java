package com.greatlearning.Transactions;
import java.util.Scanner;

public class Transactions {
	public static void main(String[] args){
		int i=0,sum=0;
		System.out.println("Enter number of transcations : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tx[] = new int[n];
		System.out.println("Enter the values :");
		for(i=0;i<n;i++) {
			tx[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target = sc.nextInt();
		for(int k=0;k<target;k++) {
			System.out.println("Enter the value of target");
			int value = sc.nextInt();

			for(i=0;i<n;i++) {
				sum=sum+tx[i];
				if(sum>value) 
				{
					System.out.println("Target achieved after "+ (i+1) +" transactions");
					break;
				}
			}
			if(sum<value) 
				System.out.println("Given target is not achieved");
		}
	}
}