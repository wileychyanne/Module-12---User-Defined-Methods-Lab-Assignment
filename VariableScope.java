public class VariableScope {
    public static void main(String[] args) {
        int number = 10;
        //declare and initialize result outside of the if block so it can be accessed later.
        int result = 0;
        if (number > 5) {
            result = number * 2;
        }
        //display results
        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }
}
