/*
Реализовал метод в отдельном классе
 */

public class GroupEmployee {
    public void joinGoup() { //этот метод для создания отдельного массива:/
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Tony", "Stark", "Iron Man",
                "PlayBoy69@gmail.com", "+1739853447", 100000000, 53);

        employees[1] = new Employee("James", "Hatfield", "Musician",
                "MasterofPapets1983@gmail.com", "+165437865", 500000, 61);

        employees[2] = new Employee("Albus", "Dambuldore", "Wizard",
                "HogwartsMagic1881@gmail.com", "+4465432214", 5000, 115);

        employees[3] = new Employee("Bruse", "Waniyn", "Batman",
                "ImBatman@gmail.com", "+1765432893", 0, 40);

        employees[4] = new Employee("John", "Sina", "Rasler",
                "Tachdayn777@gmail.com", "+167598436", 1000000, 47);
                /*
                Метод для проверки массива
                */
        for (Employee employee : employees) {
            System.out.println("\n" + employee);
        }
    }
}
