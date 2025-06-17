package datastructures_algorithms.search;

public class LinearSearch {
    //linear search = Iterate through a collection one element at a time

    public static void main(String[] args){

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 14);

        if(index != -1){
            System.out.println("The value found at index: " + index);
        }
        else{
            System.out.println("value not found.");
        }

    }

    private static int linearSearch(int[] array, int value) {
        for(int i =  0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
