public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение последней версии для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение последней версии для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }





    }

}