package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Rotta");
        list.add("eiRotta");
        list.add("ehkäRotta");

        System.out.println("List contains:: " + list);
        list.remove("eiRotta");

        System.out.println("List contains:: " + list);

        String lookup = "Rotta";
        System.out.println(list.contains(lookup) ? lookup + " loytyy listalta." : lookup + " ei loydy listalta.");

        // HashSet<String> hSet = new HashSet<>();

        // LinkedList<String> lList = new LinkedList<>();
        // lList.add("Rotta");
        // lList.add("Rotta vaa");

        // Iterator<String> linkedIterator = lList.iterator();
        // while (linkedIterator.hasNext()) {
        // System.out.println(linkedIterator.next());
        // }

        // isEmpty(hSet);

        // hSet.add("pippuri");
        // hSet.add(null);
        // hSet.add("opel");

        // isEmpty(hSet);

        // hSet.remove(null);

        // System.out.println(hSet.contains("rotta"));
        // System.out.println(hSet.contains("pippuri"));

        // Iterator<String> itr = hSet.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
    }

    public static void isEmpty(HashSet<String> setInput) {
        // boolean check onko lista tyhjä ternaryn kanssa.
        System.out.println(setInput.isEmpty() ? "The list is empty" : "The list is not empty");
    }
}
