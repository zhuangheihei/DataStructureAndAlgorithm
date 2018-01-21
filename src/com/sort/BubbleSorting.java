package com.sort;

public class BubbleSorting {
    static void bubbleSort(int[] a){
        int n = a.length;
        //int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){ // use j<(n-i) could reduce some time compexity
                if(a[j - 1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
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
        bubbleSort(a);
        for(int num:a){
            System.out.print(num + "\t");
        }
    }
}
