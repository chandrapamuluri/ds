package com.ds.sortsearch;

public class HeapSortNonRecursive {

    public void heapSortRecursive(int[] a, int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
        for(int i=n-1;i>=0;i--){
            swap(a,0,i);
            heapify(a,i,0);
        }
    }
    void heapify(int[] a, int n, int p){
            int max = p;
            int l = p*2+1;
            int r = l+1;
            if(l<n && a[l]>a[max])
                max=l;
            if(r<n && a[r]>a[max])
                max=r;
            if(max!=p){
                swap(a,max,p);
                heapify(a,n,max);
            }
    }

     public static void main(String []args){
        int[] a ={0,7,13,4,15,18,20,23,26,29};
        HeapSortNonRecursive h = new HeapSortNonRecursive();
        //h.maxHeap(a,10);
        System.out.println(" "+a[0]+" Done.");
        //h.heapSortRecursive(a,10);
        h.sortNoRecursive(a,10);
        for(int i=0;i<a.length;i++)
            System.out.println(" "+a[i]);
     }
     
     void sortNoRecursive(int[] a, int n){
         maxHeap1(a,n);
         for(int i=n-1;i>0;i--){
             swap(a,i,0);
             int parent=0, child;
             do{
                 child = 2*parent+1;
                 //System.out.println("p="+parent+" c="+child);
                 if(child+1<i && a[child] < a[child+1])
                    child++;
                if(child<i && a[parent]<a[child] )
                    swap(a,parent,child);
                parent = child;
             }while(parent<i);
         }
     }
    
    void maxHeap1(int[] a, int n)
    {
         int child, parent;
         for(int i=1;i<n;i++){
             child = i;
             parent = (child-1)/2;
             if(a[child]>a[parent]){
                 while(a[child]>a[parent]){
                     swap(a,child,parent);
                     child = parent;
                     parent = (child-1)/2;
                 }
             }
         }
     }
     void swap(int[] a, int i, int j){
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
     }
     
}
