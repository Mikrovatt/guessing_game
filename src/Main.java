import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input;
        // Приветствие
        System.out.println("Добро пожаловать в игру 'Угадайка'!");
        System.out.println("Задайте диапзон в котором я загадаю число:");

        Scanner sc = new Scanner(System.in); // Инициализирую сканер для ввода данных
        String[] numbers;
        while (true) {
            System.out.println("(Введите два числа через пробел и нажмите enter)");
            input = sc.nextLine(); // Получаю текст для диапазона

            // расчет диапазона чисел для игры
            input = input.trim().replaceAll(" +", " "); // убрать лишние пробелы
            numbers = input.split("\\s");
            if (numbers.length == 2) {
                break;
            } else if (numbers.length > 2) {
                System.out.println("Не могу выбрать диапазон, слишком много чисел!");
            } else if (numbers.length < 2 && numbers.length > 0) {
                System.out.println("Не могу выбрать диапазон, слишком мало чисел!");
            }
        }
        int i[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            i[j] = Integer.valueOf(numbers[j]); // Перевожу текст в int, получаю диапазон для игры
        }
        // System.out.println(Arrays.toString(i)); // Вывод диапазона для проверки

        int result = (int) (i[0] + Math.random() * ((i[1] - i[0]) + 1)); // Выбираю случайное число в заданом диапазоне
        // System.out.println(result); // Вывод загаданного числа дляпроверки

        // Начало игры, запрос числа от пользователя
        System.out.println("Я загадал число в диапазоне от " + i[0] + " до " + i[1] + ", попробуй угадай!!!");

        int numb = -1; // Получаю текст
        // numb = sc.nextInt(); // Получаю число пользователя
        while (result != numb) { // сравниваю загаданное число с числом пользователя
            // сравниваю загаданное число с числом пользователя

            int numb; // Инициализирую переменную для ввода числа пользователем
            while (true) { // сравниваю загаданное число с числом пользователя
                System.out.println("Введите ваше число:");
                numb = sc.nextInt(); // Получаю число от пользвателя
                // Сравнение + подсказки
                if (numb == result) {
                    System.out.println("Поздравляю, вы угадали!");
                    break;
                } else if (numb > result) {
                    System.out.println("Ваше число больше загаданного!");
                } else if (numb < result) {
                    System.out.println("Ваше число меньше загаданного!");
                }
            }
            sc.close(); // Звкрываю сканер
        }
    }
}