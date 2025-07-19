public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Static variable to track number of employees
    private static int employeeCount = 0;

    // Default constructor
    public Employee() {
        this(0, "Unknown", "General", 0.0); // constructor chaining
    }

    // Parameterized constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        employeeCount++;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    // Method to display info
    public void displayInfo() {
        System.out.println("ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nSalary: " + salary);
        
    }

    // Method to calculate tax (can be overridden)
    public double calculateTax() {
        return 0.10 * salary; // default 10% tax
    }

    // Static method to get employee count
    public static int getEmployeeCount() {
        return employeeCount;
    }
}