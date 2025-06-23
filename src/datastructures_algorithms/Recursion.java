package datastructures_algorithms;

public class Recursion {

    public static void main(String[] args){
        walkItiritively(5);
        walkRecursively(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    //iterative approach - repetition of an internal process
    private static void walkItiritively(int steps) {

        for(int i = 0; i < steps; i++){ //what we do when we like to continue
            System.out.println("walk itiritively");
        }
    }

    //recursion = repetition of a procedure
    private static void walkRecursively(int steps) {
        //base case - what we do when we like to stop
        if(steps < 1) return;

        System.out.println("walk recursively");
        walkRecursively(steps - 1);//recursive case -
        // what we do when we like to continue
    }

    //LIFO
    private static int factorial(int num) {
        if(num < 1) return 1; //base case
        return num * factorial(num - 1);//recursive case
    }

    private static int power(int base, int exponent) {
      if(exponent < 1) return 1; //base case
      return base * power(base, exponent -1);//recursive case
    }

}
