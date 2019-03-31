package com.company.zad1;

import java.util.Iterator;
import java.util.Random;

public class Matrix {

    int rows;
    int columns;
    int[][] mat = new int[rows][columns];


    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        mat = new int[rows][columns];

    }
    protected void fillMatrix(){
        Random r = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                mat[i][j] = r.nextInt(10);
    }
    protected void showMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("ROW: "+i+" COLUMN: "+j+ "; "+mat[i][j]);
            }

        }

    }



    //NSHOW DO OSOBNEJ, popraw for
    protected void addMatrix(Matrix a) {

        if (rows == a.rows && columns == a.columns) {

            for (int i = 0; i < rows; i++) {
                for (int j=0; j < columns; j++) {
                    mat[i][j] += a.mat[i][j];
                }
            }

        }
        else System.err.println("rows and columns are not equal");
    }
}


