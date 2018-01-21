package com.sort;

public class SelectionSorting {
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1;i++){ //start from the first element
            int index = i;
            for(int j = i+1; j < arr.length;j++){ //elements behind ith element
                if(arr[j] < arr[index]) { //find the smallest element behind ith element in array
                    index = j;
                }
            }
            if(index != i){ //if we found a smallest element behind the ith element, swap them
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] a = {1, 5, 2, 7, 3, 0};
        System.out.println("Before ");
        for(int num: a){
            System.out.print(num + "\t");
        }
        System.out.println("\n" + "After");
        selectionSort(a);
        for(int num:a){
            System.out.print(num + "\t");
        }
    }
}
