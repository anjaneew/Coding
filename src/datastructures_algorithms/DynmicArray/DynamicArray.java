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

    public void delete(Object data){

    }

    public int search(Object data){
        return -1;
    }

    private void grow(){

    }

    private void shrink(int size, int capacity){

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
