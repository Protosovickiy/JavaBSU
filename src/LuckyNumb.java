import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите своё имя");
        String name = scanner.nextLine();
        System.out.println("Приветствую Вас " + name);

        System.out.println("Введите последовательность цифр");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.println("Ваша обратная последовательность " + mirror);

        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i + " ");
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Введите пароль");
        String password1 = scanner.next();
        String password2 = "12345";
        if (password1.equals(password2)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль не верный");
        }

        System.out.println("Введите целые числа");
        int val = scanner.nextInt();
        int val1 = val;
        int summ = 0;
        int com = 1;
        while (val != 0) {
            summ = summ + val % 10;
            val = val / 10;
        }
        System.out.println("Сумма введённых чисел = " + summ);
        while (val1 != 0) {
            com = com * val1 % 10;
            val1 = val1 / 10;
        }
        System.out.println("Произведение введённых чисел = " + com);



        System.out.println("Сколько целых чисел вы собираетесь ввести?");
        int size = scanner.nextInt();
        int[] sourceNumbers = new int [size];
        System.out.println("Введите числа через пробел");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = scanner.nextInt();
        }

        int a = 0, b = 0, c = 0;
        for (int j = 0; j < size; j++)
            if ((sourceNumbers[j] > 99) && (sourceNumbers[j] < 1000)) {
                a = sourceNumbers[j] / 10 / 10;
                b = sourceNumbers[j] / 10 % 10;
                c = sourceNumbers[j] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + sourceNumbers[j]);
            }
    }
}
