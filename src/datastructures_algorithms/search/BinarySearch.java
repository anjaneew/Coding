package datastructures_algorithms.search;

import java.util.Arrays;


public class BinarySearch {

    public static void main(String[] args){

        int array[] = new int[100];
        int target = 42;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //built in binary search method
//        int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if(index != -1){
            System.out.println(target + " found at index: " + index);
        }
        else{
            System.out.println("Target not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;

        while(low <= high){

            int middle = low + (high -low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if(value < target){
                low = middle + 1;
            }
            else if (value > target){
                high = middle - 1;
            }
            else return middle; //target found

        }


        return -1; //target not found
    }
}
