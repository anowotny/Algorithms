package com.company.zad1.zad5;

public class QuickSort {
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    // Driver program
    public static void qSort(int[] opt, int[] real, int[] pes)
    {
        System.out.println("QUICK SORT");
        int n = opt.length;
        QuickSort ob = new QuickSort();
        long tStart=System.currentTimeMillis();
        ob.sort(opt, 0, n-1);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: OPTIMISTIC, time: "+elapsedSeconds+" s");

        ob = new QuickSort();
        tStart=System.currentTimeMillis();
        ob.sort(real, 0, n-1);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
         elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: REALISTIC, time: "+elapsedSeconds+" s");

        ob = new QuickSort();
        tStart=System.currentTimeMillis();
        ob.sort(pes, 0, n-1);
         tEnd = System.currentTimeMillis();
         tDelta = tEnd - tStart;
         elapsedSeconds = tDelta / 1000.0;
        System.out.println("CASE: PESSIMISTIC, time: "+elapsedSeconds+" s");

    }
}


