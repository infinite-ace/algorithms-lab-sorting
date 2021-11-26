
package com.tap.algos.InsertionSort;

public class InsertionSortMain {

    public static int[] insertionSort(int[] arrayToSort) {
        int length = arrayToSort.length;

        for (int i = 1; i < length ; ++i) {
            int temp = arrayToSort[i];
            int j = i - 1;

            for (; j >= 0 && arrayToSort[j] > temp ; j--) {
                arrayToSort[j + 1] = arrayToSort[j];
            }

            if (arrayToSort[j+1] > temp)
                arrayToSort[j + 1] = temp;
        }

        return arrayToSort;
    }

    public static void main(String[] args) {

        // For own testing purposes
        int[] testArray = new int[12];
        testArray[0] = 7;
        testArray[1] = 3;
        testArray[2] = 1;
        testArray[3] = 8;
        testArray[4] = 9;
        testArray[5] = 42;
        testArray[6] = 99;
        testArray[7] = 70;
        testArray[8] = 11;
        testArray[9] = 22;
        testArray[10] = 34;
        testArray[11] = 745;

        System.out.println("Before : ");
        for (int i : testArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("After : ");
        for (int i : InsertionSortMain.insertionSort(testArray)) {
            System.out.print(i + " ");
        }

    }
}
