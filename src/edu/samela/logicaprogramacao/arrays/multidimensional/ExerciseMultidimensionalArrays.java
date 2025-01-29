package edu.samela.logicaprogramacao.arrays.multidimensional;

public class ExerciseMultidimensionalArrays {
    public static void main(String[] args) {
        int[][] arraysMulti = new int[3][3];
        arraysMulti[0][0] = 1;
        arraysMulti[0][1] = 2;
        arraysMulti[0][2] = 3;
        arraysMulti[1][0] = 4;
        arraysMulti[1][1] = 5;
        arraysMulti[1][2] = 6;
        arraysMulti[2][0] = 7;
        arraysMulti[2][1] = 8;
        arraysMulti[2][2] = 9;
        int multiplier = 1;
        for (int i = 0; i < arraysMulti.length; i++) {
            for (int j = 0; j < arraysMulti[i].length; j++) {
                if (i==j){
                    multiplier = multiplier * arraysMulti[i][j];
                }
            }
        }
        System.out.println("the multiplication of the main diagonal is " + multiplier);
    }
}
