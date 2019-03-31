package com.company.zad1.zad5;

public class ShellSort {
    int sort(int arr[])
    {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        return 0;
    }


    public static void shellSort(int[] opt, int[] real, int[] pes)
    {
        System.out.println("SHELL SORT");
        ShellSort ob = new ShellSort();
        long tStart=System.currentTimeMillis();
        ob.sort(opt);

        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: OPTIMISTIC, time: "+elapsedSeconds+" s");

        ob=new ShellSort();
        tStart=System.currentTimeMillis();
        ob.sort(real);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: REALISTIC, time: "+elapsedSeconds+" s");

        ob=new ShellSort();
        tStart=System.currentTimeMillis();
        ob.sort(pes);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: PESSIMISTIC, time: "+elapsedSeconds+" s");


    }
}


