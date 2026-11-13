// a simple calculator program
public class Calculator {
    //create add method that accepts two int parameters
    public static int add(int num1, int num2) {
        //calculate and return the sum
        return num1 + num2;
    }
    //create add method that accepts 3 int parameters
    public static int add(int num1, int num2, int num3) {
        //calculate and return sum
        return num1 + num2 + num3;
    }
    //create add method that accepts 2 double parameters
    public static double add(double num1, double num2) {
        return num1 + num2;
        //calculate and return sum
    }
    public static void main(String[] args) {
        //create and object of Calculator class
        Calculator calc = new Calculator();
        //call the overloaded methods
        int res1 = add(10, 20);
        int res2 = add(10,20, 30);
        double res3 = add(10.5, 20.5);
        //display the results
        System.out.println("Sum of two integers: " + res1);
        System.out.println("Sum of three integers: " + res2);
        System.out.println("Sum of two decimals: " + res3);
    }
}
