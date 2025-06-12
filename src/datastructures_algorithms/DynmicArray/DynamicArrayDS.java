package datastructures_algorithms.DynmicArray;

public class DynamicArrayDS {

    public static void main(String[] args){

        //in Java use prebuilt ArrayList
        //ArrayList<String> myArrayList = new ArrayList<String>();
        //it has default capacity = 10, or initial capacity
        //size to keep track when to shift the static array contents to a new

        DynamicArray dynamicArray = new DynamicArray(7);



        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");



        System.out.println("Dynamic Array: " + dynamicArray.toString());
        System.out.println("Dynamic Array get : 1 " + dynamicArray.get(1) );
        dynamicArray.insert(4, "X");
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty? " + dynamicArray.isEmpty());
        System.out.println("Dynamic Array: " + dynamicArray.toString());
        dynamicArray.delete( "X");
        System.out.println("Dynamic Array: " + dynamicArray.toString());
        System.out.println(dynamicArray.search("C"));

        System.out.println("Dynamic Array: " + dynamicArray.toString());
        dynamicArray.delete("E");
        dynamicArray.delete("F");
        dynamicArray.delete("G");
        dynamicArray.delete("H");

        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("Dynamic Array: " + dynamicArray.toString());



    }
}
