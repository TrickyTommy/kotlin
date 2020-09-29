import java.io.*;
import java.util.*;
class sorting {
    public static void main(String[] args) {
        int[] array1 = { 4, 9, 7, 5, 8, 9, 3};
        bubbleSort(array1);
    }

    public static void bubbleSort(int[] array2)
    {
        // Display the array's contents.
        System.out.println("Original order: ");
        for (int element : array2)
            System.out.print(element + " ");
        System.out.println(" ");


        int index;
        int temp;
        int count = 0;
        int count2 = 0;
        boolean swapped = true;


        while (swapped == true)
        {
            swapped = false;

            for (index = 0; index < array2.length - 1; index++)
            {
                count2++;
                // Compare an element with its neighbor.

                if (array2[index] > array2[index + 1])
                {
                    count++;
                    // Swap the two elements.
                    temp = array2[index];
                    array2[index] = array2[index + 1];
                    array2[index + 1] = temp;

                    swapped = true;
                    System.out.print("["+ array2[index]+","+temp+"]"+"->");
                    for (int element : array2)
                        System.out.print(element + " ");
                    System.out.println(" ");

                }


            }
        }



        System.out.println("\nSorted order: ");
        for (int element : array2)
            System.out.print(element + " ");

        System.out.print("\n Swaps:" + count);

    }
}