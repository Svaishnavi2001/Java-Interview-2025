package com.concepts.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Map {
    public static void main(String[] args) {

        HashMap< String ,Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("America", 400);
        map.put("USA", 2000);
        map.put("NewYork",5000);


        System.out.println(map);

        // fetching entries
        Set<Entry<String,Integer>> entrySet = map.entrySet();
        for(Entry<String ,Integer> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        LinkedHashMap< String, Integer> map1 = new LinkedHashMap<>();
        map1.put("India", 100);
        map1.put("America", 400);
        map1.put("USA", 2000);
        map1.put("NewYork",5000);

        System.out.println(map1);

        Set<Entry<String ,Integer>> entrySet1 = map1.entrySet();
        for(Entry<String,Integer> entry: entrySet1){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


        TreeMap<String ,Integer> map2 = new TreeMap<>(map);
        System.out.println(map2);

        Set<Entry<String,Integer>> entrySet2 = map2.entrySet();
        for(Entry<String ,Integer> entry: entrySet2){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }





    }

}
