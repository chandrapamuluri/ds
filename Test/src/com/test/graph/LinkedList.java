package com.test.graph;




public class LinkedList{
    class Node{
    int ele;
    Node next;
        Node(int value){
            ele = value;
        }
    }
    Node head;
    public void rotate( int count){
        if(count == 0 || count < 0)
            return;
        //1-2-3-4-5-6-7
        //4-5-6-7-1-2-3
        int rotate = 1;
        Node current = head;
        while(rotate < count && current.next != null){
            current = current.next; rotate++;
        }
        System.out.println("Current 1:"+current.ele);
        Node kth = current;
        while(current.next != null)
            current = current.next;
        System.out.println("Current 2:"+current.ele+" current.next:"+current.next);
        current.next = head;
        System.out.println("Current 3:"+current.ele+" current.next.ele:"+current.next.ele);
        head = kth.next;
        System.out.println("head:"+head.ele);
        kth.next = null;
        print();
    }
    public void deleteLast(){
    		if(head == null) {
    			return;
    		}
    		if(head.next == null) {
    			head = null;
    		}
    		Node secondLast = head;
    		Node current = head.next;
    		while(current.next!=null) {
    			secondLast = current;
    			current = current.next;
    		}
    		secondLast.next=null;
    }
    public void push(int val){
        Node n = new Node(val);
        if(head == null)
            head = n;
        else{
            n.next = head;
            head = n;
        }
    }
    public void print(){
        Node current = head;
        System.out.println("Elements:");
        while(current != null){
            System.out.print(" "+current.ele);
            current = current.next;
        }
            
    }
    public static void main(String[] arg){
        LinkedList l = new LinkedList();
        l.push(7);l.push(6);l.push(5);l.push(4);l.push(3);l.push(2);l.push(1);
        l.print();
        l.rotate(2);
        System.out.println("After Roate");
        l.print();
        l.deleteLast();
        System.out.println("After delete:");
        l.print();
    }
    
}