package com.tap.algos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.tap.algos.BubbleSort.BubbleSortMain;
import com.tap.algos.InsertionSort.InsertionSortMain;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void insertionSort(){
        int[] result = InsertionSortMain.insertionSort(new int[]{2, 1, 3, 4, 5});
        int[] test = {1,2,3,4,5};

        for (int i=0;i<result.length;i++) {
            assertEquals(result[i], test[i]);
        }
    }

    @Test
    public void bubbleSort(){
        int[] result = BubbleSortMain.bubbleSort(new int[]{2, 1, 3, 4, 5});
        int[] test = {1,2,3,4,5};

        for (int i=0;i<result.length;i++) {
            assertEquals(result[i], test[i]);
        }
    }

}
