class Employee {

    void displayName() {
        System.out.println("Company : Ethnotech");
    }
}

class Employer extends Employee {

    void displayEmp() {
        System.out.println("Employee : Sai Dinesh");
    }
}
class Role extends Employer {

    void displayRole() {
        System.out.println("Role : DEV Engineer");
    }
}

class Employee2 extends Employee {

    void displayEmp() {
        System.out.println("Employee : Ganesh");
    }

    void displayRole() {
        System.out.println("Role : Tester");
    }

    void displaySalary() {
        System.out.println("Salary : 70,000/-");
    }
}

class Salary extends Role {

    void displaySalary() {
        System.out.println("Salary : 90,000/-");
    }
}

public class Main {

    public static void main(String[] args) {

        Salary s = new Salary();

        s.displayName();
        s.displayEmp();
        s.displayRole();
        s.displaySalary();
        System.out.println();
        Employee2 e2 = new Employee2();

        e2.displayName();
        e2.displayEmp();
        e2.displayRole();
        e2.displaySalary();
    }
}