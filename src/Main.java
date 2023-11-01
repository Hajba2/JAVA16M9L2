import myhashmap.MyHashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.clear();


        Map<String, Integer> map = new HashMap<>();
        map.put("Vova", 25);
        map.get("a");


        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("abc1", 1);
        myHashMap.put("abc2", 2);
        myHashMap.put("abc3", 3);
        myHashMap.put("abc4", 4);
        myHashMap.put("abc5", 5);
        myHashMap.put("abc6", 6);
        myHashMap.put("abc7", 7);
        myHashMap.put("abc8", 8);
        myHashMap.put("abc9", 9);
        myHashMap.put("abc10", 10);
        myHashMap.put("abc11", 11);

        System.out.println("myHashMap.get(\"abc9\") = " + myHashMap.get("abc9"));
        System.out.println("myHashMap.get(\"abc1\") = " + myHashMap.get("abc1"));
        System.out.println("myHashMap.get(\"abc11\") = " + myHashMap.get("abc11"));
        System.out.println("myHashMap.get(\"abc99\") = " + myHashMap.get("abc99"));


        Set<Object> objects = Collections.emptySet();
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        List<Object> objects1 = Collections.emptyList();
        getPets().size();
    }

    public static Set<String> getPets() {
        return Collections.emptySet();
    }
}