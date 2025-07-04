package datastructures_algorithms.DynmicArray;

public class DynamicArray {

    //members
    int size;
    int capacity = 10;
    Object[] array;

    //overloading constructors
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    //overloading constructors incase user wants own capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //Methods
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size>= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

//    public void delete(Object data){
//
//        for(int i = 0; i < size; i++) {
//            if (array[i] == data) {
//                for (int j = 0; j < (size - i - 1); j++) {
//                    array[i + j] = array[i + j + 1];
//                }
//                array[size - 1] = null;
//                size--;
//                if (size <= (int) (capacity / 3)) {
//                    shrink();
//                }
//                break;
//            }
//        }
//    }

    //my version YAY
    public void delete(Object data){

        int indexToDelete = search(data);
        if(indexToDelete != -1){
            for(int i = indexToDelete; i < size -1; i++) {
                array[i] = array [i + 1];


            }
            array[size -1] = null;

            size--;
        }
        if (size <= (int) (capacity / 3)) {
                    shrink();
                }
        return;
    }

    public int search(Object data){
        for(int i = 0; i < size; i++){
            if( array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public Object get(int index){
        return array[index];
    }

    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){

        String string = "";

        for(int i = 0; i < capacity ; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "["+ string.substring(0, string.length() - 2) + "]";
        }
        else{
            string = "[]";
        }
        return string;

    }


}
