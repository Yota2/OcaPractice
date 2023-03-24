package arr1;

public class ArraySquare {
    // Print  arrays index and make them
    public static void main(String[] args) {
        int arrays[] = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i * i;
        }
        for (int i = 0; i <arrays.length; i++) {
            System.out.println("The Square root of  " + i  + " is " + arrays[i] );
        }
    }
}
