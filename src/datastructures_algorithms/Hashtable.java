package datastructures_algorithms;

public class Hashtable {

    public static void main(String[] args){

        java.util.Hashtable<Integer, String> table1 = new java.util.Hashtable<>(10);

        table1.put(100, "Spongebob");
        table1.put(123, "Patrick");
        table1.put(321, "Sandy");
        table1.put(555, "Squidward");
        table1.put(777, "Gary");

//        System.out.println(table.get(100));

        System.out.println("table 1");
        System.out.println("hashCode " + "key" + "\t" + "value");
        for(Integer key: table1.keySet()){
            System.out.println(key.hashCode() + "\t" + key + "\t" + table1.get(key));
        }

        java.util.Hashtable<String, String> table2 = new java.util.Hashtable<>();

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");
        System.out.println("\n\ntable 2");
        System.out.println("hashCode " + "key" + "\t" + "value");
        for(String key: table2.keySet()){
            System.out.println(key.hashCode() + "\t" + key + "\t" + table2.get(key));
        }

    }
}
