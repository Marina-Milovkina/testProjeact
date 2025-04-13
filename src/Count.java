import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt(); // Читаем первое число

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt(); // Читаем второе число

        int sum = number1 + number2; // Складываем числа

        System.out.println("Сумма чисел: " + sum);

        scanner.close(); // Закрываем сканнер


        // вывод четных чисел от 1 до 10 через цикл
        System.out.println("Четные числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // проверка на четность
                System.out.println(i);
            }
        }
    }
}
