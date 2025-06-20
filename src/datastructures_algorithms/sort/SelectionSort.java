package datastructures_algorithms.sort;

public class SelectionSort {
    public static void main(String[] args){

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        for(int i : array){
            System.out.print(i);
        }

        System.out.println("\nsorted array:");

        selectionSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i < array.length -1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = array[j];

                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}
