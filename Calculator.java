// Author: Vasanth - B00116672

public class Calculator {

    private int result;

    public Calculator() {
        result = 0;
    } // Default Constructor

    // Addition
    public int addition(int number_1, int number_2) {
        result = (number_1 + number_2);
        return result;
    } // end of Addition

    // Subtraction
    public int subtraction(int number_1, int number_2) {
        result = (number_1 - number_2);
        return result;
    } // end of Subtraction

    // Multiplication
    public int multiplication(int number_1, int number_2) {
        result = number_1 * number_2;
        return result;
    } // end of Multiplication

    // Division
    public int division(int number_1, int number_2) {
        // Check for division by zero
        if (number_2 != 0) {
            result = number_1 / number_2;
        } else {
            System.out.println("Error: Division by zero is undefined.");
        }
        return result;
    } // end of Division

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        int num_1 = 20, num_2 = 10;

        Calculator myCalculator = new Calculator();

        System.out.println("Name  : Vasanth & B-No : B00116672");

        System.out.println("The First Number is " + num_1);

        System.out.println("The Second Number is " + num_2);

        // Addition
        myCalculator.addition(num_1, num_2);
        System.out.format("The Sum of %d and %d is %d%n", num_1, num_2, myCalculator.getResult());

        // Subtraction
        myCalculator.subtraction(num_1, num_2);
        System.out.format("The difference of %d and %d is %d%n", num_1, num_2, myCalculator.getResult());

        // Multiplication
        myCalculator.multiplication(num_1, num_2);
        System.out.format("The product of %d and %d is %d%n", num_1, num_2, myCalculator.getResult());

        // Division
        myCalculator.division(num_1, num_2);
        System.out.format("The Division of %d and %d is %d%n", num_1, num_2, myCalculator.getResult());
    }
}
