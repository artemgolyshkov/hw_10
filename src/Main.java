public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println(" «Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxPay = 1;
        int minPay = 250_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPay) {
                maxPay = arr[i];
            }
        }
        for (int q = 0; q < arr.length; q++) {
            if (arr[q] < minPay) {
                minPay = arr[q];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minPay + " рублей. Максимальная сумма трат за месяц составила " + maxPay + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        double averagesum = sum / 30;
        System.out.println(" «Средняя сумма трат за месяц составила " + averagesum + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
