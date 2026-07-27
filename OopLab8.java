// ====================
// Lab 8
// Stanley Nguyen (N01570766)
// Humber College
// CPAN-131-RNA
// Ronak Sheth
// August 3, 2026
// --------------------
// This program demonstrates java exception through try, catch and finally
// ====================
public class OopLab8 {
    // Assignment requirement: In your main method 
    public static void main(String[] args) {
        // Assignment requirement: create an array with 3 elements
        int[] numberArray = {1, 2, 3};

        // Assignment requirement: try checking the index 5 and catch appropriate exception using catch.
        try {
            System.out.println(numberArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: This index does not exist.");
        }

        // Assignment requirement: Now choose any number from array and try dividing by zero and catch appropriate exception 
        try {
            int divideAnswer = numberArray[2] / 0;
            System.out.println(divideAnswer);
        } catch (ArithmeticException e) {
            System.out.println("Error: This index cannot be divided by zero.");
        } finally {
            // Assignment requirement: You must also have finally block
            System.out.println("This is a finally block.");
        }
    }
}
