package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {
    public static void main (String[] args){
        ArrayList<Integer> lst = new ArrayList<>(List.of(2, 76, 4, 8, 55, 4, 34, 7, 2, 22, 55, 4, 98));
        Collections.sort(lst);
        // Iterator<Integer> lstIter = lst.iterator();
        // System.out.println(lst);
        // int count = 0;
        int first = 0;
        int last = lst.size() - 1;
        int middle = 0;
        int numberToFind = 9;


        while (first <= last) {
            middle = (last + first) / 2;
            int midValue = lst.get(middle);
            if(midValue==numberToFind){
                System.out.println(numberToFind + " found.");
                break;
            } else if (midValue < numberToFind){
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        // while(lstIter.hasNext()){
        //     if(lstIter.next() == numberToFind){
        //         count++;
        //         if(count == 2){
        //             break;
        //         }
        //     }
        // }

        // System.out.println(numberToFind + " löytyi " + count + " kappaletta.");
    }
}
