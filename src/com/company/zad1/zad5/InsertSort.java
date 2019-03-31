package com.company.zad1.zad5;

public class InsertSort {

    void insertSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void insSort(int []opt, int[] real, int[] pes){
        System.out.println("INSERT SORT");
        InsertSort toSort=new InsertSort();
        long tStart=System.currentTimeMillis();
        toSort.insertSort(opt);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: OPTIMISTIC, time: "+elapsedSeconds+" s");

        toSort=new InsertSort();
        tStart=System.currentTimeMillis();
        toSort.insertSort(real);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: REALISTIC, time: "+elapsedSeconds+" s");

        toSort=new InsertSort();
        tStart=System.currentTimeMillis();
        toSort.insertSort(pes);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: PESSIMISTIC, time: "+elapsedSeconds+" s");
    }


}
