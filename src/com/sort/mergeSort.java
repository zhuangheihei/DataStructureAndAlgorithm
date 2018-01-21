package com.sort;

public class mergeSort {

    int[] array; //array for store element
    int[] TempArray; //combine

    public static void main(String[] args){
        int[] a = {1, 5, 2, 7, 3, 6, 0, 4};
        System.out.println("Before ");
        for(int num: a){
            System.out.print(num + "\t");
        }
        new mergeSort().prepareForSort(a);
        System.out.println("\n" + "After");
        for(int num:a)
            System.out.print(num + "\t");
        }

    void prepareForSort(int[] arr){
        // prepare for sort
        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0,arr.length-1); //ex.(1-10)
    }

    //divide array into small sub arrays
    void doMergeSort(int low, int high){

        if(low < high){
            int mid = low + (high - low)/2; //avoid overflowing
            doMergeSort(low, mid); //ex.(1-5)
            doMergeSort(mid + 1, high); //ex.(6,10)
            mergePart(low, mid, high);
        }
    }

    //merge and sort each element in small sub array
    void mergePart(int low, int mid, int high) {
        for(int i = low; i <= high; i++){
            TempArray[i] = array[i];    //ex. TempArray = (1-5)
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while(i <= mid && j <= high){
            if( TempArray[i] <= TempArray[j]){
                array[k] = TempArray[i];
                i++;
            }else {
                array[k] = TempArray[j];
                j++;
            }
            k++;
        }
        //when i or j already reaches the end
        while(i <= mid){
            array[k] = TempArray[i];
            i++;
            k++;
        }

        while(j <= high){
            array[k] = TempArray[j];
            j++;
            k++;
        }
    }
}




