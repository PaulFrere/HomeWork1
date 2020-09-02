package HomeWork_5;

public class Employee {
    protected int id;
    protected String position;
    protected String name;
    protected String email;
    protected String phone;
    protected int salary;
    protected int age;

    public Employee (int id, String name, String position,  String email, String phone, int salary, int age){
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    @Override
    public String toString(){
        return String.format("Id: %d \n Имя: %s \tДолжность: %s \nEmail: %s \t Телефон: %s \n Зарплата: %d \t Возраст: %d \n", id, name, position, email, phone, salary, age);
    }
    public void print(){
        System.out.println(this);
    }
}
