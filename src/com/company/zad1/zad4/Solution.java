package com.company.zad1.zad4;



public class Solution {
    int []solution(float[]arr, float target) throws NoSolution{

        int[] sol=new int[2];
        sol=null;
        for (int i=0, j=arr.length;i<j;i++) {
            if(arr[i]+arr[j]==target) { //array[i+}
                sol[0] =  i;
                sol[1] =  j;
            }
            else if(arr[i]+arr[j]>target)
                j--;
            else i++;

        }

        if(sol==null)
            throw new NoSolution("no solution found");
        return sol;
    }
}
