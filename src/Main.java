public class Main {
    public static void defineTheLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2020;
        defineTheLeapYear(year);
    }
}