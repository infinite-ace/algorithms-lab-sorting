package com.tap.algos.BubbleSort;

public class BubbleSortMain {

    public static int[] bubbleSort(int[] arrayToSort) {

        int arrayLength = arrayToSort.length - 1;

        for(int j = 0 ; j < arrayLength ; j++) {
            for(int i = 0 ; i < arrayLength ; i++) {
                if(arrayToSort[i] > arrayToSort[i + 1]) {
                    int swapHelper = arrayToSort[i+1];
                    arrayToSort[i+1] = arrayToSort[i];
                    arrayToSort[i] = swapHelper;
                }
            }
        }

        return arrayToSort;
    }

    public static void main(String[] args) {

        // For own testing purposes
        int[] testArray = new int[5];
        testArray[0] = 7;
        testArray[1] = 3;
        testArray[2] = 1;
        testArray[3] = 8;
        testArray[4] = 9;

        System.out.println("Before : ");
        for (int i : testArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("After : ");
        for (int i : BubbleSortMain.bubbleSort(testArray)) {
            System.out.print(i + " ");
        }
    }
}
