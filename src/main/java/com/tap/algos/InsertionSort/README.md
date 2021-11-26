# Insertion Sort Algorithm

##Explanation

Since Insertion sort is considered O(n^2) algorithm, I will be using
two nested for loops. One will traverse the array, starting from 1. The other loop
will be traversing backwards under certain condition:

`            for (; j >= 0 && arrayToSort[j] > temp ; j--) { ...
`

Before that I will store the current element in a temporary variable:

`            int temp = arrayToSort[i];
`

During execution, variable
`int j = i - 1;
`
will start from 0 in our case, and will reach the length of the array.

The condition:
`if (arrayToSort[j+1] > temp)` will verify that the program is inserting
elements in the correct order. So if the condition is met, it will assign 
the temporary variable to the j+1 element in our array.
`                arrayToSort[j + 1] = temp;
`