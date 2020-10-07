package lesson5;

public class Person {
    String name;
    String role;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String name, String role, String email, String phone, int salary, int age) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("Сотрудник %s %s %s %s %d %d\n", name, role, email, phone, salary, age);
    }

    public int getAge(){
        return age;
    }
}






