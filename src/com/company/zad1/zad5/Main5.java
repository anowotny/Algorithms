package com.company.zad1.zad5;

import java.util.Random;

public class Main5  {


    public static void main(String[] args) {
        // write your code here
        Random r=new Random();
        int [] opt=new int[10000];
        int []real=new int[10000];
        int []pes=new int[10000];
        int n=opt.length;
        for(int i=0;i<n;i++){
            opt[i]=i;
            real[i]=r.nextInt(1000);
            pes[i]=n-i;
        }
        System.out.println("UNSORTED ARRAY");
        for(int j=0;j<10000;++j){
            System.out.print(real[j]+"\t");
            if(j%9==0&&j!=0)
                System.out.println();
        }
        System.out.println();
        //BubbleSort.bSort(opt,real,pes);
        //InsertSort.insSort(opt,real,pes);
        //QuickSort.qSort(opt,real,pes);
        ShellSort.shellSort(opt,real,pes);


    }
}
