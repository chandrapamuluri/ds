package com.ds.sortsearch;

public class MergeSort {

	
	
	public void mergeSort(int[] arr) {
		if(arr == null) {
			return;
		}
		//int l = arr.length;
		if(arr.length > 1) {
			int mid = arr.length/2;
			int[] left = new int[mid];
			for(int i=0; i< mid ; i++) {
				left[i] = arr[i];
			}
			int[] right = new int[arr.length-mid];
			for(int j=mid; j< arr.length ; j++) {
				right[j-mid] = arr[j];
			}
			mergeSort(left);
			mergeSort(right);
			int i = 0, j =0, k =0;
			System.out.println("Left:"+left.length+" Right:"+right.length);
			//i = left.length; j = right.length;
			while(i < left.length && j<right.length) {
				if(left[i] < right[j]) {
					arr[k] = left[i];
					System.out.println("Adding:"+arr[k]);
					i++;
				}
				else
				{
					arr[k] = right[j];
					System.out.println("Adding:"+arr[k]);
					j++;
				}
				k++;
			}
			while(i <left.length) {
				arr[k] = left[i]; 
				System.out.println("Adding:"+arr[k]);
				i++;k++;
				//System.out.println("Adding:"+arr[k]);
			}
			while(j < right.length) {
				arr[k] = right[j]; 
				System.out.println("Adding:"+arr[k]);
				j++; k++;
			}
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,2,1,4,9,8,0,6};
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr);
		System.out.println("After sort:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		int[] arr1 = {5,2,1,4,9,8,0,6};
		ms.mergeSort2(arr1);
		System.out.println("After sort:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(" "+arr1[i]);
		}
		int[] arr3 = {5,2,1,4,9,8,0,6};
		ms.mergeSort3(arr3);
		System.out.println("After sort:");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(" "+arr3[i]);
		}
	}
	
	
	public static void mergeSort3(int[] arr) {
		if(arr == null) return;
		if(arr.length > 1) {
			int mid = arr.length/2;
			int[] left = new int[mid];
			int[] right = new int[arr.length-mid];
			for(int i=0; i<mid; i++) {
				left[i] = arr[i];
			}
			for(int i=mid; i<arr.length; i++) {
				right[i-mid] = arr[i];
			}
			mergeSort3(left);mergeSort3(right);
			int i=0,j=0,k=0;
			while(i < left.length && j < right.length) {
				if(left[i] < right[j]) {
					arr[k] = left[i]; i++;
				}else {
					arr[k] = right[j]; j++;
				}
				k++;
			}
			while(i < left.length) {
				arr[k] = left[i];k++;i++;
			}
			while(j<right.length) {
				arr[k] = right[j];k++;j++;
			}
		}
	}
	
	
	 public static void mergeSort2(int[] array) 
	    { 
	        if(array == null) 
	        { 
	            return; 
	        } 
	  
	        if(array.length > 1) 
	        { 
	            int mid = array.length / 2; 
	  
	            // Split left part 
	            int[] left = new int[mid]; 
	            for(int i = 0; i < mid; i++) 
	            { 
	                left[i] = array[i]; 
	            } 
	              
	            // Split right part 
	            int[] right = new int[array.length - mid]; 
	            for(int i = mid; i < array.length; i++) 
	            { 
	                right[i - mid] = array[i]; 
	            } 
	            mergeSort2(left); 
	            mergeSort2(right); 
	  
	            int i = 0; 
	            int j = 0; 
	            int k = 0; 
	  
	            // Merge left and right arrays 
	            while(i < left.length && j < right.length) 
	            { 
	                if(left[i] < right[j]) 
	                { 
	                    array[k] = left[i]; 
	                    i++; 
	                } 
	                else
	                { 
	                    array[k] = right[j]; 
	                    j++; 
	                } 
	                k++; 
	            } 
	            // Collect remaining elements 
	            while(i < left.length) 
	            { 
	                array[k] = left[i]; 
	                i++; 
	                k++; 
	            } 
	            while(j < right.length) 
	            { 
	                array[k] = right[j]; 
	                j++; 
	                k++; 
	            } 
	        } 
	    } 

}
