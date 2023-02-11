public class Employee {
    private final String name;
    private int salary;
    private final int department;
    private int id;
    private static int counter = 1;


    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = checkDepartment(department);
        this.id = counter++;
    }
    public int checkDepartment(int department) {
        if (department >= 1 && department <= 5) {
            return department;
        } else {
            throw new IllegalArgumentException("Ошибка при написании отдела");
        }
    }

    public String toString() {
        return "Работник" + " " + this.name + " работает в отделе " + this.department + " и получает ЗП " + this.salary + " рублей";
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }
}
