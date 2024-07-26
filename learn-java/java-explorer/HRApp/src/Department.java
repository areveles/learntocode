public class Department {
    private String name;
    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return name;
    }

    public void setDepartmentName(String departmentName) {
        this.name = departmentName;
    }

    @Override
    public String toString() {
        return "Department Name: " + getDepartmentName();
    }

    public void addEmployee(Employee anEmployee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee findEmployee(int empId) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getID() == (empId)) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double calculateTotalSalary() {
        double totalSalary = 0.0;

        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double calculateAverageSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return calculateTotalSalary() / (lastAddedEmployeeIndex + 1);
        }

        return 0.0;
    }

}