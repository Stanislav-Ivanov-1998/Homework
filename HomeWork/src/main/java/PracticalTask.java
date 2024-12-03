public class PracticalTask {
    /*
      Задание 1
      Метод printThreeWords(), который при вызове должен отпечатать в столбец 3 слова : Orange , Banana , Apple.
      */
    void printThreeWords() {
        System.out.print("Orange\n" + "Banana\n" + "Apple\n");// метод который выведет 3 слова в стобец> \n с новой строки

    }

    /*
    Задание 2
    Метод который должен суммировать две переменные a и b, и если их сумма больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”, если меньше 0 - “Сумма отрицательная”;
     */
    public void checkSumSign() {
        int a = 5; // созданны 2 переменные с абсолютно рандомными числами которые пришли в голову
        int b = 17;
        int sum = a + b;// сумма 2-ух переменных
        if (sum >= 0) { //если сумма меньше 0 то выведет "...отрицательная", если 0 или больше "...положительная"
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    /*
    Задание 3
    Если value меньше 0 то в консоль выведет “Красный”
    Если лежит в пределах от 0  до 100 “Желтый”
    Если больше 100  - “Зеленый”;
     */
    public void printColor() {
        int value = 76;// создана переменная value с абсолютно рандомным числом 76 должен вывести желтый  т.к. по условию лежит в пределах 100
        if (value <= 0) {// если value меньше 0 выведет красный
            System.out.println("Красный");
        } else if ((1 <= value) && (value <= 100)) {// если лежит в пределах от 0 до 100
            System.out.println("Желтый");
        } else if (value > 100) { // если больше 100
            System.out.println("Зелёный");
        }

    }

    /*
    Задание 4
    Если a больше или равно b, то выводит в консоль сообщение “a >= b”, в противном случае “a < b”;
     */
    public void compareNumbers() {
        int a = 56;//переменные с рандомными числами
        int b = 5;
        if (a >= b) {
            System.out.println(" a >= b");//если а больше либо равно выведет это
        } else System.out.println(" a < b");//если а будет меньше , выведет это
    }

    /*
    Задание 5
    Метод проверяет, что сумма 2-х чисел( переменных)  лежит в пределах от 10 до 20
    если да–true, если нет–false.
     */
    public boolean chek(int a, int b) { // две переменные и числа на входе
        return (10 <= a + b) && (a + b <= 20); //интервал от сих до сих
    }

    /*
     Задание 6
     Метод проверяет и пишет в консоль положительное  число передали или отрицательное.
     Ноль должен считаться положительным числом
     */
    public void evaluator(int a) { //положителная переменная
        if (a >= 0) {
            System.out.println("Число положительное");//если больше больше ноля
        } else {
            System.out.println("Число отрицательное");//если меньше ноля
        }
    }

    /*
    Задание 7
    Метод отдает true, если число отрицательное, отдает false если положительное.
    Ноль должен считаться положительным числом
     */
    public boolean cheking(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }

    }

    /*
    Задание 8
    Метод выводит в консоль указанную строку, указанное количество раз
     */
    public void printing(String a, int b) { //строка и число раз которое ее выведет через указанную переменную
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }

    /*
     Задание 9
     Метод определяет, является ли год високосным,  boolean (високосный-true, не високосный-false).
     Каждый 4-й год  високосный, кроме каждого 100, при этом каждый 400 – високосный.
     */
    public boolean chek2(int a) {
        if (a % 400 == 0 || a % 100 == 0 || a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     Задание 10
     Целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 0, 0, 1, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public void сhange() {
        int[] array = {1, 1, 0, 0, 0, 0, 1, 0};//задаем массив
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Задание 11
   Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполняет его значениями 1 2 3 4 5 6 7 8 до 100;
     */
    public void fill() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;//переменная каждый раз увеличивает последующее число на 1
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Задание 12
     Массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2
     */
    public void multiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*
    Задание 13
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     */
    public void diagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = array[i].length - 1; j < array[i].length; j++, k--) {
                if (i == j || k == i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }

    /*
    Задание 14
    Метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */
    public void array(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }


    }
}