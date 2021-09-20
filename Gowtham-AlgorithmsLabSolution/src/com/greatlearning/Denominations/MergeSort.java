package com.greatlearning.Denominations;

public class MergeSort {

	public static void sort(int[] a){

		int []tempArray = new int[a.length];
		mergeSort(a,tempArray,0,a.length-1);
	}

	public static void mergeSort(int[] a,int []tempArray,int lowerIndex,int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else{
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(a,tempArray, lowerIndex, mid);
			mergeSort(a,tempArray, mid+1, upperIndex);
			merge(a,tempArray,lowerIndex,mid+1,upperIndex);
		}
	}

	public static void merge(int[] a,int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higerIndex <= upperIndex){
			if(a[lowerIndex] > a[higerIndex]){
				tempArray[tempIndex++] = a[lowerIndex++];
			}else{
				tempArray[tempIndex++] = a[higerIndex++];
			}
		}

		while(lowerIndex <= midIndex){
			tempArray[tempIndex++] = a[lowerIndex++];
		}

		while(higerIndex <= upperIndex){
			tempArray[tempIndex++] = a[higerIndex++];
		}

		for(int i=0;i<totalItems;i++){
			a[lowerIndexCursor+i] = tempArray[i];
		}
	} 

}
