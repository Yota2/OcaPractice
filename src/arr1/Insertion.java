package arr1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Insertion {
    /*
    How to Insert an element at a specific position in an Array in Java
    by getting the array data  and the array index from the user.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much array length do you need to make?");
        int lengthOfAray = scan.nextInt();
        System.out.println("length of the array is " + lengthOfAray);
        int [] arrayInp = new int [lengthOfAray];

        for(int i=0; i<lengthOfAray;i++){
            System.out.println("Give the " + (i+1) + " input");
            arrayInp[i]= scan.nextInt();
        }
        System.out.println("----------------Show the given arrays----------------------");
        for(int i = 0; i<lengthOfAray;i++){
            System.out.println("The "+ (i+1)+ " Array input is   " + arrayInp[i]  );
        }
        System.out.println("Which number will you like to add?");
        int numberAdded = scan.nextInt();
        System.out.println("In which position will you like to add the number it must between the arrays not above "+ " ' "+ lengthOfAray+ " ' ");
        int position = scan.nextInt();
        System.out.println("At Position "+ position +  " If the length is enough then . "+ numberAdded + " will be inserted now wait ...");

        int newAray [] = new int [lengthOfAray+1];
        newAray[position]= numberAdded;

        /*for(int i = 0 ; i< position;i++){
        newAray[i]= arrayInp[i];
        }
         */

        for(int i = position+1; i<newAray.length;i++ ){
            newAray[i] = arrayInp[i-1];
            System.out.println(numberAdded +" This is the new add array values at position "+ position  );
        }
        arrayInp = newAray;
         for(int i = 0; i<newAray.length;i++){
             System.out.println(newAray[i]);
         }
    }


        /*
        Suppose we have an original array arr and we want to insert the element x at position pos
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

