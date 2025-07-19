public class ContractEmployee extends Employee {
    private int ContractDurationMonths;

    public ContractEmployee(int id, String name, String department, double salary, int duration) {
        super(id, name, department, salary);
        this.ContractDurationMonths = duration;
    }

    // Override tax calculation method
    @Override
    public double calculateTax() {
        return 0.05 * getSalary(); // 5% tax for contract employees
    }

    // Override display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Contract Duration: " + ContractDurationMonths + " months");
    }
}