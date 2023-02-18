import java.util.Random;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Максим Ласточкин", 54000, 2);
        employees[1] = new Employee("Олег Иванов", 75890, 1);
        employees[2] = new Employee("Корней Свиридов", 125350, 3);
        employees[3] = new Employee("Леонид Семенов", 84100, 1);
        employees[4] = new Employee("Матвей Ерохов", 158000, 4);
        employees[5] = new Employee("Игнат Шалимов", 58900, 2);
        employees[6] = new Employee("Арсений Климов", 245000, 5);
        employees[7] = new Employee("Евгения Румянцева", 95000, 3);
        employees[8] = new Employee("Кристина Солженицына", 69800, 1);
        employees[9] = new Employee("Алина Костарева", 49000, 2);
        printEmployees();
        System.out.println("Общие затраты на ЗП составляют " + countTotalSalary() + " рублей");
        System.out.println(findEmployeerMaxSalary() + " (сотрудник с максимальной ЗП)");
        System.out.println(findEmployeerMinSalary() + " (сотрудник с минимальной ЗП)");
        System.out.println("Средняя ЗП составляет " + countAverageSalary() + " рублей");
        printNameWithId();
        wageIndexation();
        printEmployees();
        int department = 1;
        System.out.println("Сотрудник из отдела " + department + " с самой низкой ЗП: " + findEmployeerMinSalary(department));
        System.out.println("Сотрудник из отдела " + department + " с самой высокой ЗП: " + findEmployeerMaxSalary(department));
        System.out.println("Общие затраты на ЗП по отделу " + department + " равны " + countTotalSalary(department) + " рублей");
        System.out.println("Средняя ЗП на отдел " + department + " равна " + countAverageSalary(department) + " рублей");
        wageIndexationPersent(1.01, department);
        printEmployeesExceptDepartment();
        Random random = new Random();
        int start = employees[0].getSalary();
        int end = employees[6].getSalary();
        int count = start + random.nextInt(end - start);
        System.out.println("Случайное число ЗП равно " + count);
        findEmployeeWithSalaryLessCount(count);
        findEmployeeWithSalaryMoreCount(count);





    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int countTotalSalary() {
        int totalSalary = 0;
        for (Employee i : employees) {
            totalSalary = totalSalary + i.getSalary();
        }
        return totalSalary;
    }

    public static Employee findEmployeerMinSalary() {
        double minSalary = 1.0 / 0;
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public static Employee findEmployeerMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee i : employees) {
            if (i.getSalary() > maxSalary) {
                maxSalary = i.getSalary();
                employee = i;
            }
        }
        return employee;
    }

    public static int countAverageSalary() {
        int totalSalary = countTotalSalary();
        int averageSalary = totalSalary / employees.length;
        return averageSalary;

    }

    public static void printNameWithId() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + " " + employees[i].getName());

        }
    }

    //Повышенная сложность
    //1.

    public static void wageIndexation() {
        System.out.println("Повышенная сложность");
        double k = 1.2;
        int a = 0;
        for (int i = 0; i < employees.length; i++) {
            a = (int)(employees[i].getSalary() * k);
            employees[i].setSalary(a);

        }
    }
    //2.a

    public static Employee findEmployeerMinSalary(int department) {
        int maxSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee i : employees) {
            if (i.getSalary() < maxSalary && i.getDepartment() == department) {
                maxSalary = i.getSalary();
                employee = i;
            }
        }
        return employee;

    }
    //2.b

    public static Employee findEmployeerMaxSalary(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee i : employees) {
            if (i.getSalary() > maxSalary && i.getDepartment() == department) {
                maxSalary = i.getSalary();
                employee = i;
            }
        }
        return employee;
    }
    //2.c

    public static int countTotalSalary(int department) {
        int totalSalary = 0;
        for (Employee i : employees) {
            if (i.getDepartment() == department) {
                totalSalary = totalSalary + i.getSalary();

            }
        }
        return totalSalary;
    }
    //2.d
    public static int countAverageSalary(int department) {
        int totalSalary = countTotalSalary(department);
        int count = 0;
        for (Employee i : employees) {
            if (i.getDepartment() == department) {
                count++;
            }
        }
        int averageSalary = totalSalary / count;
        return averageSalary;

    }
    //2.e
    public static void wageIndexationPersent(double k, int department) {
        k = 1.01;
        int a = 0;
        for (Employee i : employees) {
            if (i.getDepartment() == department) {
                a = (int) (i.getSalary() * k);
                i.setSalary(a);
            }
        }
    }
    //2.f
    public static void printEmployeesExceptDepartment() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + " " + employees[i].getName() + " "  + employees[i].getSalary());
        }
    }

    public static void findEmployeeWithSalaryLessCount(int count) {
        System.out.println("ЗП меньше числа:");
        for (Employee i : employees) {
            if (i.getSalary() < count) {
                System.out.println(i.getId() + " " + i.getName() + " " + i.getSalary());
            }
        }
    }
    public static void findEmployeeWithSalaryMoreCount(int count) {
        System.out.println("ЗП больше числа:");
        for (Employee i : employees) {
            if (i.getSalary() > count) {
                System.out.println(i.getId() + " " + i.getName() + " " + i.getSalary());
            }
        }
    }

}