import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Scanner clientOSScan = new Scanner(System.in);
        System.out.println("Введите, какая у вас операционная система (0 — iOS, 1 — Android): ");
        byte clientOS = clientOSScan.nextByte();
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Такого варианта ответа нет.");
        }

        System.out.println("Задание 2");
        Scanner clientDeviceYearScan = new Scanner(System.in);
        System.out.println("Введите год выпуска вашей модели: ");
        short clientDeviceYear = clientDeviceYearScan.nextShort();
        boolean android = clientOS == 1;
        boolean iOS = clientOS == 0;
        if (clientDeviceYear < 2015) {
            if (android) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else if (iOS) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (android) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

        System.out.println("Задание 3");
        Scanner yearScan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = yearScan.nextInt();
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задание 4");
        byte deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            byte daysDelivery = 1;
            System.out.println("Потребуется дней:  " + daysDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            byte daysDelivery = 2;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            byte daysDelivery = 3;
            System.out.println("Потребуется дней: " + daysDelivery);
        } else {
            System.out.println("Свыше 100км доставки нет.");
        }

        System.out.println("Задание 5");
        byte monthNumber = 12;
        if (monthNumber > 0 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println(monthNumber + " месяц относится к сезону зима.");
                    break;
                case 2:
                    System.out.println(monthNumber + " месяц относится к сезону зима.");
                    break;
                case 3:
                    System.out.println(monthNumber + " месяц относится к сезону весна.");
                    break;
                case 4:
                    System.out.println(monthNumber + " месяц относится к сезону весна.");
                    break;
                case 5:
                    System.out.println(monthNumber + " месяц относится к сезону весна.");
                    break;
                case 6:
                    System.out.println(monthNumber + " месяц относится к сезону лето.");
                    break;
                case 7:
                    System.out.println(monthNumber + " месяц относится к сезону лето.");
                    break;
                case 8:
                    System.out.println(monthNumber + " месяц относится к сезону лето.");
                    break;
                case 9:
                    System.out.println(monthNumber + " месяц относится к сезону осень.");
                    break;
                case 10:
                    System.out.println(monthNumber + " месяц относится к сезону осень.");
                    break;
                case 11:
                    System.out.println(monthNumber + " месяц относится к сезону осень.");
                    break;
                case 12:
                    System.out.println(monthNumber + " месяц относится к сезону зима.");
                    break;
                default:
                    System.out.println("Такого месяца не существует!");
            }
        } else {
            System.out.println("Такого месяца не существует!");
        }
    }
}