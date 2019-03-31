package com.company.zad1.zad2;

import com.company.zad1.Main;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> myList=new LinkedList<>();
        Random r=new Random();
        for(Integer i=0;i<10;i++){
            myList.add(r.nextInt(15));
        }
        ((LinkedList<Integer>) myList).peek();
        Solution one= new Solution();
        System.out.println("My list: ");
        System.out.println(Arrays.toString(myList.toArray()));
        System.out.println("Solution: "+one.solution(myList));
    }


    }

