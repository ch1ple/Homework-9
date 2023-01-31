public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int payments = 0;
        for (int i = 0; i < arr.length; i++) {
            payments = payments + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + payments + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int theSmallestPayment = 300_000;
        int theBiggestPayment = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < theSmallestPayment) {
                theSmallestPayment = arr[i];
            } if (arr[i] > theBiggestPayment) {
                theBiggestPayment = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + theSmallestPayment + " рублей. Максимальная сумма трат за день составила " + theBiggestPayment + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        int countOfDays = 30;
        float allPayments = 0;
        for (int i = 0; i < arr.length; i++) {
            allPayments = allPayments + arr[i];
        }
        double paymentsAvg = allPayments / countOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + paymentsAvg + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i = i - 1) {
            System.out.print(reverseFullName[i]);
        }
    }
}