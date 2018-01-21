package com.search;

public class linearSearch {

    public static void main(String[] args) {
        DataSet data = new DataSet(100000);
        int target = 100700;
        boolean isFound = false;
        for(int i = 0; i < data.getSize();i++){
            data.NumberTry++;
            if(data.data[i] == target){
                System.out.println("Target is found after "+ data.NumberTry + " tries.");
                isFound = true;
                break;
            }
        }
        if(isFound == false){
            System.out.println("Target is not found.");
        }
    }
}
