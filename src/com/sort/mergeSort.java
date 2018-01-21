package com.sort;

public class mergeSort {

    int[] array; //array for store element
    int[] TempArray; //combine

    void prepareForSort(int[] arr){
        // prepare for sort
        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0,arr.length-1);
    }

    //merge two halfs of array
    void doMergeSort(int low, int high){

        if(low < high){
            int mid = low + (high - low)/2; //avoid overflowing
            doMergeSort(low, mid); //ex.(1-5)
            doMergeSort(mid + 1, high); //ex.(6,10)
            mergePart(low, mid, high);
        }
    }

    void mergePart(int low, int middle, int high) {
        
    }
}
//    public static void main(String[] args){
//        int[] a = {1, 5, 2, 7, 3, 6, 0, 4};
//        System.out.println("Before ");
//        for(int num: a){
//            System.out.print(num + "\t");
//        }
//        System.out.println("\n" + "After");
//        mergeSort(a, 0, a.length-1);
//        for(int num:a){
//            System.out.print(num + "\t");
//        }


