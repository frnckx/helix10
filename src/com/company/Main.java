package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        SacramentoUtil sacramentoUtil = new SacramentoUtil();
        sacramentoUtil.readSacramentoCSV();

/*
        ArrayList<Integer> listOfNumbers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(i);
        }
       System.out.println(listOfNumbers.get(0));


        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println(listOfNumbers.get(i));

        }

        //Collections.

        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Béla");
        nameList.add("Józsi");
        nameList.add ("Gréta");
        nameList.add(1,"Klára");
         for (String s : nameList){
             System.out.println(s);
         }
        System.out.println(nameList.indexOf("Gréta"));


        HashSet<Character> chars = new HashSet<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('a');

        for (Character c: chars){
            System.out.println(c);
        }


// kulcs egyedi, de felülírja
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Béla");
        users.put(2, "Józsi");

        for(Map.Entry<Integer, String>  entry : users.entrySet() ){
            System.out.println("KEY: " + entry.getKey() + " VALUE: "+ entry.getValue());
        }
*/
     String s = ""; //1 immutable
     s += "a"; //2
     s+= "b"; // 3
     // s = ab


       StringBuilder sb = new StringBuilder(); // mutable - megváltoztatható
       sb.append("a");
       sb.append("B");
       sb.append("c"); //1
       // sb.toString() = abc;
    }
}
