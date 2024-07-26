public class HRApp {
    public static void main(String[] args) throws Exception {
        System.out.println("HRApp Starts");

        Employee emp1 = new Employee(1, "Ash", 95_000.00);
        

        Department department = new Department("ITDepartment");

        department.addEmployee(emp1);
        department.addEmployee(new Employee(2, "Misty", 85_000.00));
        department.addEmployee(new Employee(3, "Brock", 100_000.00));

        Employee[] emps = department.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp: " + emp);

        }

        System.out.println("Total " + department.calculateTotalSalary());
        System.out.println("Average " + department.calculateAverageSalary());
        System.out.println(department.findEmployee(2122));
    }
}
