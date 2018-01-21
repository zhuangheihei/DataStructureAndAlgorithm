package com.sort;

public class QuickSorting {

    static void quickSort(int[] arr, int low, int high){

        if(low > high) return;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i <= j){
            while(arr[i] < pivot) { //skip the element in right order
                i++;
            }
            while(arr[j] > pivot) { //skip the element in right order
                j--;
            }
            if(i <= j){ //we found elements we want to swap!
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j){
            quickSort(arr, low, j); //sort the left side of pivot using recursive call
        }
        if(high > i) {
            quickSort(arr, i, high); // sort the right side of pivot using recursive call
        }
    }

    public static void main(String[] args){
        int[] a = {1, 5, 2, 7, 3, 6, 0, 4};
        System.out.println("Before ");
        for(int num: a){
            System.out.print(num + "\t");
        }
        System.out.println("\n" + "After");
        quickSort(a, 0, a.length-1);
        for(int num:a){
            System.out.print(num + "\t");
        }
    }

}
