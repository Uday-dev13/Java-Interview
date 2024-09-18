package Oops.Encapsulation;

public class get_set {
    public static void main(String[] args) {

        // Creating an instance of Employee
        Employee emp = new Employee();

        // Setting values using setter methods
        emp.setName("Allu");
        emp.setDepartment("ECE");
        emp.setNumber(1);
        emp.setSalary(100000);

        //Accessing values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Department: " + emp.getDepartment());
        System.out.println("Employee Number: " +emp.getNumber());
        System.out.println("Employee Salary: " +emp.getSalary());

    }
}
