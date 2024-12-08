/*
создал класс сотрудника с заданными полями в задании
 */

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /*
     Приравниваем поля к аргументам
     */
    public Employee(String personFirstName, String personLastName, String personPosition,
                    String personEmail, String personPhone, int personSalary, int personAge) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
        this.position = personPosition;
        this.email = personEmail;
        this.phone = personPhone;
        this.salary = personSalary;
        this.age = personAge;
    }

    /*
        Через toString т.к. выводимые объекты мы преобразуем в строки
     */
    public String toString() {
        return ("FirstName: " + this.firstName
                + "\nLastName: " + this.lastName
                + "\nPosition: " + this.position
                + "\nEmail: " + this.email
                + "\nPhone: " + this.phone
                + "\nSalary: " + this.salary
                + "\nAge: " + this.age);
    }
}
