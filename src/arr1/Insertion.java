package arr1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Insertion {
    /*
    How to Insert an element at a specific position in an Array in Java
    by getting the array data  and the array index from the user.

     */
    public static void main(String[] args) {

//asking the user how much array index he likes to add

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many array size will you like to add");
        int arrayLength = keyboard.nextInt();
        int inputArray[] = new int[arrayLength];

        System.out.println("Pls enter the array values...");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = keyboard.nextInt();
            System.out.println("Array value " + inputArray[i]);
        }
        System.out.println("What is  the number you want to keep in the array  ");
        int newNumber = keyboard.nextInt();

int index;
        while (true) {
            System.out.print("Enter an index between 0 and " + (inputArray.length-1) + "  :   ");
             index= keyboard.nextInt();
            try {
                int value = inputArray[index];
                System.out.println("The value at index " + index + " is " + value);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input, please try again.");
            }
        }

        int newArray[] = new int[arrayLength + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = inputArray[i];
        }
        newArray[index] = newNumber;

        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = inputArray[i - 1];
        }
        System.out.println("This is the new added array values");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }




        /*
        Suppose we have an original array arr, and we want to insert the element x at position pos
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int pos = 2;

// Create a new array with one more element than the original array
        int[] newArr = new int[arr.length + 1];

// Copy all the elements from the original array up to the position where we want to insert the new element into the new array
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

// Insert the new element at the desired position in the new array
        newArr[pos] = x;

// Copy the remaining elements from the original array to the new array
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }

// Set the original array to be equal to the new array
        arr = newArr;
*/
    }
}