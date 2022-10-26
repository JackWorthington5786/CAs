package CA_1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Q1 ----------");
        int[][] A = {{1, 0}, {0, 1}};
        int[][] B = {{1, 2}, {3, 4}};
        addTwoMatrices(A, B);
        System.out.println("\n");
        int[][] C = {{1, 0}, {0, 1}};
        int[][] D = {{5, 6, 8}, {1, 2, 3}, {4, 5, 6}};
        addTwoMatrices(C, D);
        System.out.println("\n");
        System.out.println("Q3 ----------");
        int[][] E = {{1, 2}, {3, 4}};
        int[][] F = {{5, 6}, {7, 8}};
        multiplyTwoMatrices(E, F);
        System.out.println("\n");
        int[][] G = {{1, 2}, {3, 4}};
        int[][] H = {{5, 6, 7}, {8, 9, 10}};
        multiplyTwoMatrices(G, H);
        System.out.println("\n");
        int[][] I = {{1, 2}, {3, 4}};
        int[][] J = {{5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
        multiplyTwoMatrices(I, J);
        System.out.println("\n");
    }

    public static void addTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int Columns_A = matrix1[1].length;
        int Columns_B = matrix2[1].length;
        int Row_A = matrix1.length;
        int Row_B = matrix2.length;

        int[][] C = new int[Row_A][Columns_A];

        for(int i=0;i<Columns_A;i++){
            for(int j=0;j<Row_A;j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" + ");
        for(int i=0;i<Columns_B;i++){
            for(int j=0;j<Row_B;j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" =");

        if (Columns_A == Columns_B && Row_A == Row_B) {
            for (int i = 0; i < Columns_A; i++) {
                for (int j = 0; j < Row_A; j++) {
                    C[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(C[i][j] + " ");
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("Not Possible Size does not match.");
        }
    }

    public static void multiplyTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int Columns_A = matrix1[0].length;
        int Columns_B = matrix2[0].length;
        int Row_A = matrix1.length;
        int Row_B = matrix2.length;

        //System.out.println(Columns_A + " " + Row_A  + " " + Columns_B + " " + Row_B);

        int[][] C = new int[Row_A][Columns_B];

        for(int i=0;i<Row_A;i++){
            for(int j=0;j<Columns_A;j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" x ");
        for(int i=0;i<Row_B;i++){
            for(int j=0;j<Columns_B;j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" =");
        if (Columns_A == Row_B) {
            for(int i=0;i<Row_A;i++){
                for(int j=0;j<Columns_B;j++){
                    C[i][j]=0;
                    for(int k=0;k<Columns_A;k++)
                    {
                        C[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Not Possible");
        }
    }

}
