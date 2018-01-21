package com.search;

public class BinarySearch {

    public static void main(String[] args){
        DataSet data = new DataSet(100000);
        int target = 1000;
        boolean isFound = false;
        int start = 0;
        int end = data.getSize()-1;
        int mid = 0;

        while(start < end){
            mid = start + ((end - start)/2);
            data.NumberTry++;
            // you will always want to check if start and end is the target we want to find
            if(data.data[mid] == target || data.data[start] == target || data.data[end] == target) {
                System.out.println("Target is found after " + data.NumberTry + " tries.");
                isFound = true;
                break;
            }
            if(data.data[mid] < target){
                start = mid + 1; //avoid deadlock
            }
            if(data.data[mid] > target){
                end = mid - 1; //avoid deadlock
            }
        }

        if(isFound == false){
            System.out.println("Target is not found.");
        }

    }
}
