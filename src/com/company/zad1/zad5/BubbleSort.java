package com.company.zad1.zad5;

public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void bSort(int []opt, int[] real, int[] pes){
        System.out.println("BUBBLE SORT");
        BubbleSort toSort=new BubbleSort();
        long tStart=System.currentTimeMillis();
        toSort.bubbleSort(opt);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: OPTIMISTIC, time: "+elapsedSeconds+" s");

        toSort=new BubbleSort();
        tStart=System.currentTimeMillis();
        toSort.bubbleSort(real);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: REALISTIC, time: "+elapsedSeconds+" s");

        toSort=new BubbleSort();
        tStart=System.currentTimeMillis();
        toSort.bubbleSort(pes);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: PESSIMISTIC, time: "+elapsedSeconds+" s");
    }
}


