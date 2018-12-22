package com.ds.sortsearch;
import java.math.*;

public class HeapSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0,j=90;i<arr.length;i++) {
			arr[i] = j;j--;
		}
		HeapSort2 hs = new HeapSort2();
		hs.display(arr);
		//hs.mergeSort(arr);
		hs.heapSort(arr, arr.length);
		hs.display(arr);
	}
	void heapSort(int[] arr, int n) {
		for(int i=n/2 - 1; i >= 0; i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1; i>= 0 ; i--) {
			swap(arr,0,i);
			heapify(arr,i,0);
		}
	}

	void display(int[] a) {
		System.out.println("Display elements:");
		for(int i=0;i<a.length;i++) {
			System.out.print("  "+a[i]);
		}
	}
	void heapify(int[] a, int n, int p) {
		int l = p*2 +1;
		int r = l+1;
		int large = p;
		if(l < n && a[l] > a[large])
			large = l;
		if(r < n && a[r] > a[large])
			large = r;
		if(large != p) {
			swap(a,large, p);
			heapify(a,n,large);
		}
	}
	void swap(int[] a, int x, int y) {
		int temp = a[x]; a[x] = a[y]; a[y] = temp;
	}
	void mergeSort(int[] a) {
		if(a.length > 1) {
			int mid = a.length/2;
			int[] left = new int[mid];
			int[] right = new int[a.length-mid];
			for(int i=0; i<mid; i++) {
				left[i] = a[i];
			}
			for(int i=mid; i<a.length ; i++) {
				right[i-mid] = a[i];
			}
			mergeSort(left);
			mergeSort(right);
			int i=0,j=0,k=0;
			while(i<left.length && j<right.length) {
				if(left[i] < right[j]) {
					a[k] = left[i];i++;
				}else {
					a[k] = right[j]; j++;
				}
				k++;
			}
			while(i<left.length) {
				a[k] = left[i];i++;k++;
			}
			while(j<right.length) {
				a[k] = right[j];j++;
			}
		}
	}
}
