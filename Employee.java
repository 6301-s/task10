public class Employee {
    
    private String name;
    private double salary;
    private int employeeId;

    
    public Employee(String name, double salary, int employeeId) {
        this.name = name;
        this.setSalary(salary); 
        this.employeeId = employeeId;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be set to a negative value.");
        }
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: rupees" + salary);
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("sreenu", 50000.0, 1001);
        Employee emp2 = new Employee("sridhar", -30000.0, 1002); 

        
        emp1.displayEmployeeInfo();
        System.out.println(); 
        emp2.displayEmployeeInfo(); 
    }
}
