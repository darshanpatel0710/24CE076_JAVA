public class ManagementSystem{
    public static void main(String[] args) 
    {
        // Create employee objects
        Employee emp1 = new Employee(76, "Darshan", "CE", 50000);
        PermanentEmployee emp2 = new PermanentEmployee(86, "Krishiv", "HR", 60000);
        ContractEmployee emp3 = new ContractEmployee(75, "Akshar", "Finance", 40000, 24);

        // Display info and tax
        emp1.displayInfo();
        System.out.println("Tax: " + emp1.calculateTax());
        System.out.println("======================================================");

        emp2.displayInfo();
        System.out.println("Tax: " + emp2.calculateTax());
        System.out.println("======================================================");

        emp3.displayInfo();
        System.out.println("Tax: " + emp3.calculateTax());
        System.out.println("======================================================");


        // Show total number of employees created
        System.out.println("\nTotal Employees Created: " + Employee.getEmployeeCount());
    }
}