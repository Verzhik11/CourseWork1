public class Employee {
    private final String name;
    private int salary;
    private final int department;
    private int id;


    public Employee(String name, int salary, int department, int id) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = id;
        id = idCounter++;
    }
    public static int idCounter = 0;


    public int checkDepartment() {
        if (department >= 1 && department <= 5) {
            return department;
        } else {
            throw new IllegalArgumentException("Ошибка при написании отдела");

        }
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

}
