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
        countTotalSalary();
        printMaxSalary();
        printMinSalary();
        printNameWithId();
        }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static void countTotalSalary () {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        System.out.println("Общая сумма выплаты ЗП сотрудникам равна " + totalSalary + " рублей");
        System.out.println("Средняя ЗП составляет " + totalSalary / employees.length + " рублей");
    }

    public static void printMinSalary() {
        double minSalary = 1.0 / 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная ЗП среди сотрудников составляет " + minSalary + " рублей" );
    }
    public static void printMaxSalary() {
        int maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная ЗП среди сотрудников составляет " + maxSalary + " рублей" );
    }

    public static void printNameWithId() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + " " + employees[i].getName());

        }
    }

}