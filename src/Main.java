import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input;
        System.out.println("Добро пожаловать в игру 'Угадайка'!");
        System.out.println("Задайте диапзон в котором я загадаю число:");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите два числа через пробел и нажмите enter");
            input = sc.nextLine();
        }
        String[] numbers = input.split("\\s");
        int i[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            i[j] = Integer.valueOf(numbers[j]);
        }
        System.out.println(Arrays.toString(i));

        int result = (int) (i[0] + Math.random() * ((i[1] - i[0]) + 1));
        System.out.println(r);

    }
}