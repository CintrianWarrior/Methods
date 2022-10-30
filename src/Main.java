import java.time.LocalDate;

public class Main {
    public static void defineTheLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineOSApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear<currentYear) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1&& clientDeviceYear==currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS==1&&clientDeviceYear < currentYear){
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2020;
        defineTheLeapYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2022;
        defineOSApp(clientOS,clientDeviceYear);
    }
}