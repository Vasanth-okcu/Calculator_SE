//Author : Vasanth - B00116672

public class Calculator {

    private int result;

    public Calculator() {
        result = 0;
    }//Default Constructor

    //Addition

    public int addition(int number_1, int number_2) {
        return result += (number_1 + number_2);
    }//end of Addition

    //Subtraction

    public int subtraction(int number_1, int number_2) {
        return result -= (number_1 - number_2);
    }//end of Subtraction

    //Multiplication

    public int multiplication(int number_1, int number_2) {
        return result = number_1 * number_2;
    }//end of Multiplication

    //Division

    public int division(int number_1, int number_2) {
        return result = number_1 / number_2;
    }//end of Division

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {

        int num_1 = 20, num_2 = 30;

        Calculator myCalculator = new Calculator();

        System.out.println("Name  : Vasanth & B-No : B00116672");

        myCalculator.addition(num_1, num_2);
        System.out.println("Addition: " + myCalculator.getResult());

        myCalculator.subtraction(num_1, num_2);
        System.out.println("Subtraction: " + myCalculator.getResult());

        myCalculator.multiplication(num_1, num_2);
        System.out.println("Multiplication: " + myCalculator.getResult());

        myCalculator.division(num_1, num_2);
        System.out.println("Division: " + myCalculator.getResult());
    }
}
