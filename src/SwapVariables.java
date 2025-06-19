public class SwapVariables {

    public static void main(String[] args){

        String x = "water";
        String y = "Kool-Aid";
        String temp = null; //or String temp;

        System.out.println("X: " +  x + "  Y: "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("X: " +  x + "  Y: "+ y);

        String cup1 = "white";
        String cup2 = "red";
        String tempCup = null;

        System.out.println("cup1: " +  cup1 + "  cup2: "+ cup2);

        tempCup = cup1;
        cup1 = cup2;
        cup2 = tempCup;

        System.out.println("cup1: " +  cup1 + "  cup2: "+ cup2);
    }

}
