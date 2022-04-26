import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input;
        System.out.println("Добро пожаловать в игру 'Угадайка'!");
        System.out.println("Задайте диапзон в котором я загадаю число:");
        Scanner sc = new Scanner(System.in);
        System.out.println("(Введите два числа через пробел и нажмите enter)");
        input = sc.nextLine(); // Получаю текст

        String[] numbers = input.split("\\s");
        // Сделать проверку на ввод цифр и пробелов более 1
        int i[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            i[j] = Integer.valueOf(numbers[j]); // Перевожу текст в int, получаю диапазон для игы
        }
        System.out.println(Arrays.toString(i));

        int result = (int) (i[0] + Math.random() * ((i[1] - i[0]) + 1)); // Выбираю случайное число в заданом диапазоне
        System.out.println(result);
        System.out.println("Я загадал число в диапазоне от " + i[0] + " до " + i[1] + " попробуй угадай!!!");

        int numb = -1; // Получаю текст
        // numb = sc.nextInt(); // Получаю число пользователя
        while (result != numb) { // сравниваю загаданное число с числом пользовател
            // сравниваю загаданное число с числом пользователя
            System.out.println("Введите ваше число:");
            numb = sc.nextInt(); // Получаю новое число
            if (numb == result) {
                System.out.println("Поздравляю, вы угадали!");
            } else if (numb > result) {
                System.out.println("Ваше число больше загаданного!");
            } else if (numb < result) {
                System.out.println("Ваше число меньше загаданного!");
            }
        sc.close();
        }
    }
}