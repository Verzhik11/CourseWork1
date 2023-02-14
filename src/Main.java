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
        }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static int countTotalSalary () {
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

}