package HomeWork_5;

public class Staff {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee(1,"Иванов Иван Иванович", "Директор", "ivanov@mail.ru", "912-548-12-45", 250000, 42);
        employeesArray[1] = new Employee(2,"Петров Петр Петрович", "Бухгалтер", "petrov@mail.ru", "945-879-25-36", 120000, 48);
        employeesArray[2] = new Employee(3,"Александров Александр Александрович", "Технолог", "alexandrov@mail.ru", "985-272-55-55", 90000, 39);
        employeesArray[3] = new Employee(4,"Алексеев Алексей Алексеевич", "Инженер", "alexeev@mail.ru", "978-879-88-77", 150000, 33);
        employeesArray[4] = new Employee(5,"Сергеев Сергей Сергеевич", "Менеджер", "sergeev@mail.ru", "922-123-45-67", 70000, 28);
        for (Employee employee : employeesArray) if (employee.age > 40) employee.print();
    }
}
