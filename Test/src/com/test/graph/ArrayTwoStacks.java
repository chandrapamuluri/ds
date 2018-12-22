package com.test.graph;

public class ArrayTwoStacks {
	int[] array;
	int top1,top2;
	int size;
	ArrayTwoStacks(int size){
		this.size = size;
		array = new int[size];
		top1 = -1;
		top2 = size;
	}
	
	void push1(int val) {
		if(top1 < top2 -1) {
			top1++; array[top1] = val;
		}
		else
			System.out.println("Stack overflow.");
	}
	void push2(int val) {
		if(top1 < top2 -1) {
			top2--; array[top2] = val;
		}
		else
			System.out.println("Stack overflow.");
	}
	void pop1() {
		if(top1 < 0) {
			System.out.println("Stack1 empty.");
		}
		else {
			array[top1] = 0;
			top1--;
		}
	}
	void pop2() {
		if(top2 > size-1) {
			System.out.println("Stack1 empty.");
		}
		else {
			array[top1] = 0;
			top1--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTwoStacks s = new ArrayTwoStacks(3);
		s.push1(10);
		s.push2(20);
		s.push1(11);
		//s.push1(12);
	}

}
