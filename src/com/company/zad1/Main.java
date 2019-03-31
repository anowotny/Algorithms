package com.company.zad1; //3.5


public class Main {

    public static void main(String[] args) {
	// write your code here


        Matrix m1=new Matrix(3,3);
        Matrix m2=new Matrix(3,3);
        Matrix m3=new Matrix(3,4);
        m1.fillMatrix();
        m2.fillMatrix();
        m3.fillMatrix();
        System.out.println("MATRIX: M1");
        m1.showMatrix();
        System.out.println("MATRIX: M2");
        m2.showMatrix();
        System.out.println(" ");
        System.out.println("ADDING M1+M2");
        m1.addMatrix(m2);
        System.out.println("MATRIX: M1");
        m1.showMatrix();
        System.out.println("MATRIX: M2");
        m2.showMatrix();
        System.out.println();
        System.out.println("ADDING M1+M3");
        System.out.println();
        m1.addMatrix(m3);

    }
}
