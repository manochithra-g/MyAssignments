package week1.day1;

public class FibonacciSeries {
//     Goal: To find Fibonacci Series for a given range
//     input(range): 8
//     output: 0, 1, 1, 2, 3, 5, 8, 13
//     Shortcuts:
//     1) Print : type: syso, followed by: ctrl + space + enter
//     2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter     *
//     What are my learnings from this code? 1) 2) 3)
//What is the Fibonacci series in Java?
//    A Fibonacci series in Java is a sequence of numbers such that every third number
//    is equal to the sum of the previous two numbers.
//    For Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//    Here, the next number is found by adding up the two numbers before it.
    public static void main(String[] args) {
        // initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
        // Print first number
        // Iterate from 1 to the range
        // add first and second number assign to sum
        // Assign second number to the first number
        // Assign sum to the second number
        // print sum
        int n = 8, firstNum  = 0, secNum  = 1;
        System.out.println("Fibonacci Series of " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum  +  "  , ");
            // compute the next term
            int sum = firstNum + secNum;
            firstNum = secNum;
            secNum = sum;
        }
        System.out.println("!");
    }
}
