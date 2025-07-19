public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name, String department, double salary) {
        super(id, name, department, salary);
    }

    // Override if needed
    @Override
    public double calculateTax() {
        return 0.12 * getSalary(); // permanent employees have 12% tax
    }
}