import java.util.*;

interface Employee {
    void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    private long empId;

    public Developer(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void showEmployeeDetails() {
        System.out.println(empId + ": " + name);
    }
}

class Manager implements Employee {
    private String name;
    private long empId;

    public Manager(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void showEmployeeDetails() {
        System.out.println(empId + ": " + name);
    }
}

class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }
}
