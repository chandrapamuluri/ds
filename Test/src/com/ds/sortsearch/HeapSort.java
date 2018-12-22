package com.ds.sortsearch;
/**
 * HeapSort
 * @author cr186014
 * Problem: Sort the given array using the Heap sort.
 * Heap - is tree ds with Shape and Heap (max or min) property.
 * Covert given array into Heap ds, then make it max heap, remove head, and then repeat it.
 */
public class HeapSort {

	void heapSort(int[] arr) {
		
		int n = arr.length;
		for(int i = n/2-1; i>=0; i--) {
			System.out.println("In For i="+i);
			heapify(arr,n, i);
		}
		for(int i=n-1; i>=0; i--) {
			swap(arr,i,0);
			System.out.println("In Second For i="+i);
			heapify(arr,i,0);
		}
		
	}
	
	private void heapify(int[] a, int n, int p) {
		System.out.println("in heapify, n="+n+" p="+p);
		int l = p*2 + 1;
		int r = l + 1;
		int large = p;
		System.out.println("in heapify, l="+l+" r="+r);
		if(l < n && a[large] < a[l])
			large = l;
		if(r < n && a[large] < a[r])
			large = r;
		if(large != p) {
			swap(a,large,p);
			heapify(a,n,large);
		}
		
	}
	private void swap(int[] a, int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,2,7,8,23,11,0,4,5,60};
		
		HeapSort hs = new HeapSort();
		System.out.println("Elements:\n");
		for(int i=0 ; i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
		hs.heapSort(arr);
		System.out.println("Elements:\n");
		for(int i=0 ; i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
	}

}
