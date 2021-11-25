# BubbleSort

##### Explanation
##Abstract:
We will compare and swap each element under certain condition using nested for loops.
For this reason it will be handy to implement a swap function, but since it's 3 lines,
I will keep it inside the body of the if statement.

That way - the largest number will always go at the end of the array during the inner for loop
phase. Then when the variable j grows, we will pick the next and keep swapping until
we have a sorted array.

## Implementation and details
This line prevents us from accessing an unexisting element, since we have certain
amount of elements:

`        int arrayLength = arrayToSort.length - 1;
`

But we are checking for the next using this if statement:

`if(arrayToSort[i] > arrayToSort[i + 1])
`

And when we hit the last element there is no next element
However we certainly know that the last element is sorted at the first phase, so there
is no point to swap it. That way our code is safe and it does what it's supposed to do.

