public class EmployeeSalary {
    //create method that accepts annual salary of permanent employee
    public static double calculateSalary(double annualSalary) {
        //return the annual salary
        return annualSalary;
    }
    //create method that accepts employee hourly rate and hours worked
    public static double calculateSalary(double hourlyRate, int hoursWorked) {
        //calculate emplyeee's gross weekly salary and return
        double weeklySalary = hourlyRate * hoursWorked;
        return weeklySalary;
    }
    //create method that accepts the number of assignments completed by a consultant
    //and the fee paid for each assignment
    public static double calculateSalary(int completedAssignments, double feePerAssignment) {
        //calculate and return the consultants total pay
        double totalPay = completedAssignments * feePerAssignment;
        return  totalPay;
    }
    public static void main(String[] args) {
        //create an object of the EmployeeSalary class
        EmployeeSalary pay = new EmployeeSalary();
        //call the overload methods
        double permanentEmployee = calculateSalary(65000.00);
        double hourlyPay = calculateSalary(25.50, 40);
        double consultant = calculateSalary(5, 350.00);
        //display
        System.out.println("Permanent Employee Earnings: " + permanentEmployee);
        System.out.println("Hourly Employee Earnings: " + hourlyPay);
        System.out.println("Consultant Earnings: " + consultant);
    }
}
